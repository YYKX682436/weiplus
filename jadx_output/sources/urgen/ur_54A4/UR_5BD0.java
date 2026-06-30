package urgen.ur_54A4;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0087 J1\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0005H\u0087 J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0005H\u0087 J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0087 J\u0019\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0087 J\u0011\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0019\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0005H\u0087 J\u0019\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0005H\u0087 ¨\u0006 "}, d2 = {"Lurgen/ur_54A4/UR_5BD0;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_040A", "", "ptr", "", "isPreload", "", "ignoreCache", "cleanUpExisting", "callback", "UR_D30A", "feed", "", "params", "commentScene", "", "UR_C1D0", "num", "UR_CB67", "feedId", "", "UR_6582", "UR_F44C", "UR_ABD8", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "UR_C36B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UR_5BD0 {
    public static final urgen.ur_54A4.UR_5BD0 INSTANCE = new urgen.ur_54A4.UR_5BD0();

    private UR_5BD0() {
    }

    public static final native void UR_040A(long ptr, boolean isPreload, boolean ignoreCache, boolean cleanUpExisting, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native boolean UR_6582(long ptr, java.lang.String feedId);

    public static final native void UR_ABD8(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new qg3.w1();
    }

    public static final native void UR_C1D0(long ptr, int num, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native void UR_C36B(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final native byte[] UR_CB67(long ptr, java.lang.String feedId);

    public static final native void UR_D30A(long ptr, byte[] feed, byte[] params, int commentScene, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native void UR_F44C(long ptr);
}
