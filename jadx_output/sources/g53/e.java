package g53;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final g53.e f268905a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f268906b;

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f268907c;

    /* renamed from: d, reason: collision with root package name */
    public static final nf.r f268908d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f268909e;

    /* renamed from: f, reason: collision with root package name */
    public static g53.b f268910f;

    static {
        g53.e eVar = f268905a;
        f268906b = new f06.v[]{kotlin.jvm.internal.i0.c(new kotlin.jvm.internal.s(eVar, g53.e.class, "needPreload", "getNeedPreload()Z", 0)), kotlin.jvm.internal.i0.c(new kotlin.jvm.internal.s(eVar, g53.e.class, "isCgiDone", "isCgiDone()Z", 0))};
        f268905a = new g53.e();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f268907c = new nf.r(bool, "isGameH5CgiNeedPreload");
        f268908d = new nf.r(bool, "isGameH5CgiDone");
        f268909e = jz5.h.a(jz5.i.f302831f, g53.c.f268903d);
    }

    public static final boolean b() {
        return ((java.lang.Boolean) f268907c.b(f268905a, f268906b[0])).booleanValue();
    }

    public static final void c(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f268907c.c(f268905a, f268906b[0], java.lang.Boolean.TRUE);
        d(false);
        m53.f2 f2Var = new m53.f2();
        f2Var.f323675d = url;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgameindexpreload";
        lVar.f70667d = 5089;
        lVar.f70664a = f2Var;
        lVar.f70665b = new m53.g2();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new g53.d(currentTimeMillis), false);
    }

    public static final void d(boolean z17) {
        f268908d.c(f268905a, f268906b[1], java.lang.Boolean.valueOf(z17));
    }

    public final com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel a() {
        return (com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel) f268909e.getValue();
    }
}
