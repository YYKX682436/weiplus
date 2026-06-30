package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_C563/URS_EE53;", "", "()V", "UR_00FB", "", "key", "", "defValue", "UR_48DE", "", "UR_EB40", "UR_F127", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class URS_EE53 {
    public static final urgen.ur_C563.URS_EE53 INSTANCE = new urgen.ur_C563.URS_EE53();

    private URS_EE53() {
    }

    public static final boolean UR_00FB(java.lang.String key, boolean defValue) {
        kotlin.jvm.internal.o.g(key, "key");
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(key, defValue ? 1 : 0) != 0;
    }

    public static final int UR_48DE(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key);
        if (d17 == null) {
            return 0;
        }
        try {
            jz5.x d18 = r26.q0.d(d17, 16);
            if (d18 != null) {
                return (int) d18.f302852d;
            }
            r26.h0.g(d17);
            throw null;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("DynamicConfigJavaStatic", "failed to parse hexValue for key : ".concat(key));
            return 0;
        }
    }

    public static final java.lang.String UR_EB40(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key);
        return d17 == null ? "" : d17;
    }

    public static final int UR_F127(java.lang.String key, int defValue) {
        kotlin.jvm.internal.o.g(key, "key");
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(key, defValue);
    }
}
