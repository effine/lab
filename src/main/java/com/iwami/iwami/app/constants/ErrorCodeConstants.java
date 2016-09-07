package com.iwami.iwami.app.constants;

import java.util.HashMap;
import java.util.Map;

public class ErrorCodeConstants {
	
	public static final String STATUS_KEY = "status";
	public static final String MSG_KEY = "msg";

	public static final int STATUS_OK = 0;
	public static final int STATUS_PARAM_ERROR = 300;
	public static final int STATUS_ERROR = 400;
	
	public static final int STATUS_ERROR_STATUSUPLOAD_TASKID = 100041;
	public static final int STATUS_ERROR_STATUSUPLOAD_TYPE = 100042;
	public static final int STATUS_ERROR_STATUSUPLOAD_USERID = 100043;
	public static final int STATUS_ERROR_STATUSUPLOAD_TIME = 100044;
	
	/* TODO 閿欒鐮侀噸澶�*/
	public static final int STATUS_ERROR_ONSTART_USERID = 100041;
	public static final int STATUS_ERROR_ONSTART_CELLPHONE = 100042;
	public static final int STATUS_ERROR_ONSTART_UUID = 100043;
	public static final int STATUS_ERROR_ONSTART_TYPE = 100044;
	public static final int STATUS_ERROR_ONSTART_TIME = 100045;
	
	public static final int STATUS_ERROR_STRATEGY_DETAIL_ID = 100061;
	public static final int STATUS_ERROR_STRATEGY_DETAIL_START = 100062;
	public static final int STATUS_ERROR_STRATEGY_DETAIL_STEP = 100063;
	public static final int STATUS_ERROR_STRATEGY_DETAIL_START1 = 100064;
	
	public static final int STATUS_ERROR_STRATEGY_RATE_ID = 100071;
	public static final int STATUS_ERROR_STRATEGY_RATE_UUID = 100072;
	public static final int STATUS_ERROR_STRATEGY_RATE_REPEAT = 100073;
	
	public static final int STATUS_ERROR_PRESENT_LIST_START = 100131;
	public static final int STATUS_ERROR_PRESENT_LIST_STEP = 100132;
	
	public static final int STATUS_ERROR_PRESENT_GIFT_USERID = 100141;
	public static final int STATUS_ERROR_PRESENT_GIFT_CELLPHONE = 100142;
	public static final int STATUS_ERROR_PRESENT_GIFT_PRIZE = 100143;
	
	public static final int STATUS_ERROR_GIFT_HISTORY_USERID = 100161;
	
	public static final int STATUS_ERROR_GIFT_EXCHANGE_USERID = 100171;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_GIFT = 100172;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_COUNT = 100173;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_PRIZE = 100174;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_CELLPHONE = 100175;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_ALIACCOUNT = 100176;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_PICKUP_PRIZE = 100177;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_ADDRESS = 100178;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_NAME = 100179;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_BANKNAME = 1001710;
	public static final int STATUS_ERROR_GIFT_EXCHANGE_BANKACCOUNT = 1001711;
	
	public static final int STATUS_ERROR_LUCKY_DRAW_USERID = 100191;
	public static final int STATUS_ERROR_LUCKY_DRAW_PRIZE = 100192;
	public static final int STATUS_ERROR_LUCKY_DRAW_COUNT = 100193;
	
	public static final int STATUS_ERROR_SEND_VERIFY_CODE_CELLPHONE = 100201;
	public static final int STATUS_ERROR_SEND_VERIFY_CODE_EXCEED_LIMIT = 100202;
	
	public static final int STATUS_ERROR_REGISTER_CELLPHONE = 100211;
	public static final int STATUS_ERROR_REGISTER_NAME = 100212;
	public static final int STATUS_ERROR_REGISTER_CODE = 100213;
	public static final int STATUS_ERROR_REGISTER_UUID = 100214;
	
	public static final int STATUS_ERROR_MODIFY_USERINFO_USERID = 100221;
	public static final int STATUS_ERROR_MODIFY_USERINFO_AGE = 100222;
	public static final int STATUS_ERROR_MODIFY_USERINFO_GENDER = 100223;
	public static final int STATUS_ERROR_MODIFY_USERINFO_JOB = 100224;
	public static final int STATUS_ERROR_MODIFY_USERINFO_ADDRESS = 100225;
	
	public static final int STATUS_ERROR_USERINFO_USERID = 100231;
	
	public static Map<Integer, String> ERROR_MSG_MAP = new HashMap<Integer, String>();
}
