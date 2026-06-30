package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0087 ¢\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0087 ¨\u0006\u0012"}, d2 = {"Lurgen/ur_C563/UR_A086;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_EA45", "", "ptr", "", "action", "", "paramsKeys", "", "paramsValues", "(JLjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "UR_90F8", "callback", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UR_A086 {
    public static final urgen.ur_C563.UR_A086 INSTANCE = new urgen.ur_C563.UR_A086();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_A086() {
    }

    public static final native void UR_90F8(long ptr, com.tencent.unit_rc.BaseObjectDef callback);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new w71.h();
    }

    public static final native void UR_EA45(long ptr, java.lang.String action, java.lang.String[] paramsKeys, java.lang.String[] paramsValues);
}
