package wu;

/* loaded from: classes9.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str) {
        super(1);
        this.f449647d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView it = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        gk0.k kVar = new gk0.k(it.getWidth(), it.getHeight());
        kVar.f272433d = 0.5f;
        java.nio.charset.Charset charset = r26.c.f368865a;
        java.lang.String str = this.f449647d;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String d17 = uk.k.d(bytes);
        if (d17 == null) {
            d17 = java.lang.String.valueOf(str.hashCode());
        }
        y01.a aVar = new y01.a(d17);
        aVar.d(str);
        java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, aVar);
        i95.m c17 = i95.n0.c(gk0.n0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        g75.z x66 = gk0.n0.x6((gk0.n0) c17, wi6, kVar, it, null, 8, null);
        x66.l("KeyCdnParams", aVar);
        gk0.j.b(((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).Ai(), x66, null, 2, null);
        return jz5.f0.f302826a;
    }
}
