package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\tH\u0007J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006\u001c"}, d2 = {"Lurgen/ur_0025/UR_6330;", "", "<init>", "()V", "URB_ED05", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "response", "", com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, "URB_0828", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "", "status", "", "URB_FED7", "peakPower", "", "URB_9453", "event", "URB_23E0", "position", "duration", "loudness", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UR_6330 {
    public static final urgen.ur_0025.UR_6330 INSTANCE = new urgen.ur_0025.UR_6330();

    private UR_6330() {
    }

    public static final void URB_0828(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String sessionId, int status) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.d(status != 0 ? status != 1 ? status != 2 ? status != 3 ? status != 4 ? null : bw5.e.AICHAT_STATUS_WAITING : bw5.e.AICHAT_STATUS_SPEAKING : bw5.e.AICHAT_STATUS_THINKING : bw5.e.AICHAT_STATUS_LISTENING : bw5.e.AICHAT_STATUS_IDLE);
    }

    public static final void URB_23E0(com.tencent.unit_rc.BaseObjectDef obj, int position, int duration, double loudness) {
        kotlin.jvm.internal.o.g(obj, "obj");
    }

    public static final void URB_9453(com.tencent.unit_rc.BaseObjectDef obj, int event, byte[] extraData) {
        bw5.d dVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        switch (event) {
            case 0:
                dVar = bw5.d.AICHAT_BIZ_EVENT_UNKNOWN;
                break;
            case 1:
                dVar = bw5.d.AICHAT_BIZ_EVENT_FIRST_SPEAKING;
                break;
            case 2:
                dVar = bw5.d.AICHAT_BIZ_EVENT_LISTENING_STATUS_CHANGED;
                break;
            case 3:
                dVar = bw5.d.AICHAT_BIZ_EVENT_IS_SPEAKING_CHANGED;
                break;
            case 4:
                dVar = bw5.d.AICHAT_BIZ_EVENT_DID_START_RECORDING_CHANGED;
                break;
            case 5:
                dVar = bw5.d.AICHAT_BIZ_EVENT_RECORD_TIME_TOO_SHORT;
                break;
            case 6:
                dVar = bw5.d.AICHAT_BIZ_EVENT_RECORDING_NOT_STARTED;
                break;
            case 7:
                dVar = bw5.d.AICHAT_BIZ_EVENT_DISPLAY_TEXT_UPDATED;
                break;
            case 8:
                dVar = bw5.d.AICHAT_BIZ_EVENT_RESIGN_AUDIO_MODULE;
                break;
            case 9:
                dVar = bw5.d.AICHAT_BIZ_EVENT_TASK_FINISH;
                break;
            case 10:
                dVar = bw5.d.AICHAT_BIZ_EVENT_READY_PLAY_MUSIC;
                break;
            default:
                dVar = null;
                break;
        }
        kotlin.jvm.internal.o.d(dVar);
    }

    public static final void URB_ED05(com.tencent.unit_rc.BaseObjectDef obj, byte[] response, long errorCode, byte[] extraData) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(extraData, "extraData");
    }

    public static final void URB_FED7(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String sessionId, float peakPower) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
    }
}
