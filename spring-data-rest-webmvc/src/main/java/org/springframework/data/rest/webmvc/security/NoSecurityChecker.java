package org.springframework.data.rest.webmvc.security;

public class NoSecurityChecker implements SecurityChecker {

	@Override
	public boolean secured() {
		return false;
	}
}