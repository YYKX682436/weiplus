package es0;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f256311a;

    public java.lang.Object a() {
        java.lang.Object d17 = d();
        kotlin.jvm.internal.o.g(d17, "<set-?>");
        this.f256311a = d17;
        e();
        return b();
    }

    public final java.lang.Object b() {
        java.lang.Object obj = this.f256311a;
        if (obj != null) {
            return obj;
        }
        kotlin.jvm.internal.o.o("elementConfig");
        throw null;
    }

    public int c(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key), i17);
        }
        ((q90.k) ((r90.m) i95.n0.c(r90.m.class))).getClass();
        return com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getDynamicConfig(key), i17);
    }

    public abstract java.lang.Object d();

    public abstract void e();
}
