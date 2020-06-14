  provider "aws" {
  region     = "ap-south-1"
  profile    = "sulekhakey"
}




resource "tls_private_key" "key" {
  algorithm = "RSA"
}

  module "key_pair" {

   source = "terraform-aws-modules/key-pair/aws"
    key_name   = "key123"
    public_key = tls_private_key.key.public_key_openssh
}
