package k41;

/* loaded from: classes11.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f304006a = new jt0.j(20);

    public final k41.g0 a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        k41.g0 g0Var = (k41.g0) ((lt0.f) this.f304006a).i(key);
        if (g0Var == null) {
            return null;
        }
        java.lang.String str = g0Var.field_username;
        if (str == null || str.length() == 0) {
            return null;
        }
        return g0Var;
    }
}
