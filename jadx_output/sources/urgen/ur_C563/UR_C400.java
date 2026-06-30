package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0087 J\u001b\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087 J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087 J\u001b\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087 J\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00142\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00142\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bH\u0087 ¨\u0006\u001e"}, d2 = {"Lurgen/ur_C563/UR_C400;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_FC0E", "UR_AE82", "", "ptr", "", "info", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "platformConfig", "UR_1A5B", "UR_1663", "UR_87F4", "UR_AAF1", "UR_349B", "", "(J)[Lcom/tencent/unit_rc/BaseObjectDef;", "UR_9DE7", "module", "UR_FD6F", "UR_F5FA", "UR_23A4", "", "UR_6C30", "isPositive", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_C400 {
    public static final urgen.ur_C563.UR_C400 INSTANCE = new urgen.ur_C563.UR_C400();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_C400() {
    }

    public static final native boolean UR_1663(long ptr, byte[] info, com.tencent.unit_rc.BaseObjectDef listener);

    public static final native boolean UR_1A5B(long ptr, byte[] info);

    public static final native void UR_23A4(long ptr);

    public static final native com.tencent.unit_rc.BaseObjectDef[] UR_349B(long ptr);

    public static final native void UR_6C30(long ptr, boolean isPositive);

    public static final native boolean UR_87F4(long ptr, byte[] info);

    public static final native boolean UR_9DE7(long ptr, com.tencent.unit_rc.BaseObjectDef module);

    public static final native boolean UR_AAF1(long ptr, byte[] info);

    public static final native boolean UR_AE82(long ptr, byte[] info, com.tencent.unit_rc.BaseObjectDef listener, byte[] platformConfig);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new w71.s1();
    }

    public static final native boolean UR_F5FA(long ptr, com.tencent.unit_rc.BaseObjectDef module);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_FC0E();

    public static final native com.tencent.unit_rc.BaseObjectDef[] UR_FD6F(long ptr);
}
