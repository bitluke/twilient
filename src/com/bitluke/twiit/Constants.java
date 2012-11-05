package com.bitluke.twiit;

public interface Constants {

	public static final String VERIFY_URL_STRING = "http://api.twitter.com/1.1/account/verify_credentials.json";
	public static final String PUBLIC_TIMELINE_URL_STRING = "http://twitter.com/statuses/public_timeline.json";
	public static final String USER_TIMELINE_URL_STRING = "http://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=twitterapi&count=2";
	public static final String HOME_TIMELINE_URL_STRING = "http://api.twitter.com/1.1/statuses/home_timeline.json";
	public static final String FRIENDS_TIMELINE_URL_STRING = "http://api.twitter.com/1/statuses/friends_timeline.json";
	public static final String STATUSES_URL_STRING = "http://twitter.com/statuses/update.json";
	
	public static final String TWITTER_CONSUMER_KEY = "AswvdvceKYYJwmaiGtg0Q";
	public static final String TWITTER_CONSUMER_SECRET = "4GRJlUsvnN2yumHI5O7LhwmTtsdT3ffrYi5FiXZU";
	
	public static final String TWITTER_REQUEST_TOKEN_URL = "https://api.twitter.com/oauth/request_token";
	public static final String TWITTER_ACCESS_TOKEN_URL = "https://api.twitter.com/oauth/access_token";
	public static final String TWITTER_AUTHORIZE_URL = "https://api.twitter.com/oauth/authorize";
	public static final String TWITTER_STATUS = "http://api.twitter.com/1.1/statuses/update.json";
	
	public static final String USER_TOKEN = "user_token";
	public static final String USER_SECRET = "user_secret";
	public static final String REQUEST_TOKEN = "request_token";
	public static final String REQUEST_SECRET = "request_secret";
	
	
	
}
