package com.codigomestre.model.pojo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class UsuarioHomeVO {
	private String nome;
	private BufferedImage img;

	public UsuarioHomeVO(String nome, String url_image) throws IOException {
		this.nome = nome;
		this.img = ImageIO.read(new File(url_image).toURL());
	}

	public Image getImg() {
		int altura = 160, largura = (int) (altura * 0.9000);
		return img.getScaledInstance(largura, altura, 1);
	}

	public String getNome() {
		return nome;
	}

}