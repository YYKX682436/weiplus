package dx;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dx.a f244417a = new dx.a();

    public final dx.b a(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.util.Set e17 = kz5.p1.e(new ix.b(), new ix.a(), new fx.b(), new gx.e(), new gx.i(), new gx.g(), new gx.b(), new hx.a(), new hx.b(), new ex.a(), new md3.q(), new md3.u(), new md3.l());
        if (kotlin.jvm.internal.o.b(bizName, "MagicAdBrandService")) {
            e17.add(new hx.e());
        }
        kz5.n0.O0(((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni(bizName), e17);
        return new dx.b(e17, kz5.p1.d(((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(763).getClass().getName()));
    }
}
