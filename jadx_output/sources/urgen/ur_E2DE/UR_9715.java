package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087 J!\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0087 J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0087 ¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0087 ¢\u0006\u0002\u0010\u0015J.\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0087 ¢\u0006\u0002\u0010\u0018J6\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0087 ¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0087 ¨\u0006\u001e"}, d2 = {"Lurgen/ur_E2DE/UR_9715;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_B23A", "", "ptr", "", "cgiPreloadInfo", "", "UR_F4B6", "config", "UR_C423", "", "keys", "", "(J[Ljava/lang/String;)[[B", "UR_4939", "(J[Ljava/lang/String;)V", "UR_D866", "callback", "(J[Ljava/lang/String;Lcom/tencent/unit_rc/BaseObjectDef;)V", "UR_A1FB", "timeoutMs", "", "(J[Ljava/lang/String;ILcom/tencent/unit_rc/BaseObjectDef;)V", "UR_062D", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_9715 {
    public static final urgen.ur_E2DE.UR_9715 INSTANCE = new urgen.ur_E2DE.UR_9715();

    private UR_9715() {
    }

    public static final native void UR_062D(long ptr);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native void UR_4939(long ptr, java.lang.String[] keys);

    public static final native void UR_A1FB(long ptr, java.lang.String[] keys, int timeoutMs, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native void UR_B23A(long ptr, byte[] cgiPreloadInfo);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.r0();
    }

    public static final native byte[][] UR_C423(long ptr, java.lang.String[] keys);

    public static final native void UR_D866(long ptr, java.lang.String[] keys, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native void UR_F4B6(long ptr, byte[] cgiPreloadInfo, byte[] config);
}
