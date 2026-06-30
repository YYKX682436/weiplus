package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0087 J\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0087 J\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0087 J!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0087 J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0087 J\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0087 ¨\u0006\u0017"}, d2 = {"Lurgen/ur_0025/UR_E9A9;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_C382", "", "ptr", "", "transResult", "", "inputId", "", "UR_CB01", "UR_72E8", "UR_6326", "msgId", com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, "UR_1F52", "peakPower", "", "UR_FC39", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UR_E9A9 {
    public static final urgen.ur_0025.UR_E9A9 INSTANCE = new urgen.ur_0025.UR_E9A9();

    private UR_E9A9() {
    }

    public static final native void UR_1F52(long ptr, int msgId, float peakPower);

    public static final native void UR_6326(long ptr, int msgId, int errorCode);

    public static final native void UR_72E8(long ptr, int inputId);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.e6();
    }

    public static final native void UR_C382(long ptr, java.lang.String transResult, int inputId);

    public static final native void UR_CB01(long ptr, int inputId);

    public static final native void UR_FC39(long ptr, int inputId);
}
