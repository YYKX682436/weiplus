package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0087 J!\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0087 J)\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0087 J1\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0087 J\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0087 ¨\u0006\u0019"}, d2 = {"Lurgen/ur_E2DE/UR_1344;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_34FC", "", "ptr", "", "logId", "", "logString", "", "UR_CE19", "key", "value", "UR_A921", "extra", "UR_4828", "sampleRate", "UR_AA38", "reportItem", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UR_1344 {
    public static final urgen.ur_E2DE.UR_1344 INSTANCE = new urgen.ur_E2DE.UR_1344();

    private UR_1344() {
    }

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native void UR_34FC(long ptr, int logId, java.lang.String logString);

    public static final native void UR_4828(long ptr, int key, int value, java.lang.String extra, int sampleRate);

    public static final native void UR_A921(long ptr, int key, int value, java.lang.String extra);

    public static final native void UR_AA38(long ptr, byte[] reportItem);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.x0();
    }

    public static final native void UR_CE19(long ptr, int key, int value);
}
