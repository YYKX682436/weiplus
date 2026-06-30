package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes6.dex */
public class StateEvent {

    /* loaded from: classes6.dex */
    public static class ActionValue {
        public static final java.lang.String CAMERA_FOCUS = "need_focus";
        public static final java.lang.String NET_REQ = "network_request";
        public static final java.lang.String OCR_CARD_NOT_FOUND = "card_not_found";
        public static final java.lang.String OCR_MANUAL_ON = "ocr_start_manual_mode";
        public static final java.lang.String OCR_VIID_FINISH = "ocr_viid_finish";
        public static final java.lang.String OCR_VIID_LEFTDOWN = "ocr_viid_leftdown";
        public static final java.lang.String OCR_VIID_NORMAL = "ocr_viid_normal";
        public static final java.lang.String OCR_VIID_RESET = "ocr_viid_reset";
        public static final java.lang.String OCR_VIID_RIGHTUP = "ocr_viid_rightup";
        public static final java.lang.String PROCESS_FIN = "process_finished";
        public static final java.lang.String STAGE_NOTPASS = "not_pass";
        public static final java.lang.String STAGE_PASS = "pass";
        public static final java.lang.String TIMEOUT_COUNTDOWN_BEGIN = "timeout_count_begin";
        public static final java.lang.String UI_NUMBER_UPDATE = "ui_number_update";
    }

    /* loaded from: classes6.dex */
    public static class Name {
        public static final java.lang.String CAMERA_PARAM_CHANGE = "camera_param_change";
        public static final java.lang.String CAMERA_RISK_END = "camera_risk_end";
        public static final java.lang.String CAMERA_RISK_START = "camera_risk_start";
        public static final java.lang.String CMP_MESSAGE = "cmp_message";
        public static final java.lang.String CMP_SCORE = "cmp_score";
        public static final java.lang.String CONSERVATION_VIDEO_MESSAGE = "conservation_video_message";
        public static final java.lang.String COUNTDOWN_TIME = "countdown_time";
        public static final java.lang.String ERROR_CODE = "error_code";
        public static final java.lang.String ERROR_REASON_CODE = "error_reason_code";
        public static final java.lang.String EXTRA_MESSAGE = "extra_message";
        public static final java.lang.String MESSAGE = "message";
        public static final java.lang.String PROCESS_RESULT = "process_action";
        public static final java.lang.String STATE_STATS = "state_stats";
        public static final java.lang.String UI_ACTION = "ui_action";
        public static final java.lang.String UI_EXTRA_TIPS = "ui_extra_tips";
        public static final java.lang.String UI_TIPS = "ui_tips";
        public static final java.lang.String WARNING_TIPS = "version_tips";
    }

    /* loaded from: classes6.dex */
    public static class ProcessResult {
        public static final java.lang.String FAILED = "failed";
        public static final java.lang.String SUCCEED = "succeed";
    }
}
