package yl2;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f463001d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.d9 f463002e;

    /* renamed from: f, reason: collision with root package name */
    public final yl2.g1 f463003f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f463004g;

    public g(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f463001d = activity;
        yl2.g1 g1Var = new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) activity, 3, 0L, 4, null);
        this.f463003f = g1Var;
        this.f463004g = kotlinx.coroutines.z0.b();
        this.f463002e = com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, activity, activity.getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.qd((zy2.zb) c17, 1, g1Var.f463009b, g1Var.f463010c, null, 8, null);
    }

    public static final void a(yl2.g gVar) {
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "handleConfirmPostLive");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        yl2.g1 g1Var = gVar.f463003f;
        zy2.zb.qd(zbVar, 4, g1Var.f463009b, g1Var.f463010c, null, 8, null);
        kotlinx.coroutines.l.d(gVar.f463004g, null, null, new yl2.b(gVar, null), 3, null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
