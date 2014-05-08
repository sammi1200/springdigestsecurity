package org.baeldung.spring;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.codec.Hex;

public class EncodeTest {

	public static void main(String[] args) {
		String username="user1";
		String realm="BigDogAPI Realm";
		String password="user1Pass";
		String a1 = username + ":" + realm + ":" + password;
		System.out.println(md5Hex(a1));
	}
	
	static String md5Hex(String data) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No MD5 algorithm available!");
        }

        return new String(Hex.encode(digest.digest(data.getBytes())));
    }

}
