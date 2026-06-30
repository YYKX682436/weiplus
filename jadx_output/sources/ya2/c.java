package ya2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f460459a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public c() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final ya2.b2 a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        ya2.b2 b2Var = (ya2.b2) this.f460459a.get(key);
        if (b2Var != null) {
            return b2Var.t0();
        }
        return null;
    }
}
