package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lurgen/ur_C563/URS_FAC7;", "", "()V", "UR_0A6A", "", "key", "defValue", "UR_23DB", "", "UR_6F2C", "", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URS_FAC7 {
    public static final urgen.ur_C563.URS_FAC7 INSTANCE = new urgen.ur_C563.URS_FAC7();

    private URS_FAC7() {
    }

    public static final java.lang.String UR_0A6A(java.lang.String key, java.lang.String defValue) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defValue, "defValue");
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(key, defValue);
        return aj6 == null ? defValue : aj6;
    }

    public static final boolean UR_23DB(java.lang.String key, boolean defValue) {
        kotlin.jvm.internal.o.g(key, "key");
        return w71.m.a(key, defValue);
    }

    public static final int UR_6F2C(java.lang.String key, int defValue) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(key, null);
        return aj6 == null ? defValue : java.lang.Integer.parseInt(aj6);
    }
}
