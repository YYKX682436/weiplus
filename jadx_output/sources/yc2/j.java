package yc2;

/* loaded from: classes2.dex */
public final class j implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yc2.l f460833a;

    public j(yc2.l lVar) {
        this.f460833a = lVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        yc2.l lVar = this.f460833a;
        xc2.p0 p0Var = lVar.f453162b;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var != null ? p0Var.f453244f : null;
        in5.s0 s0Var = lVar.f453161a;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        if (baseFinderFeed == null || context == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderRecommendCPSComponentEventHandler", "[onBindView], feedId=" + ((java.lang.Object) jz5.x.a(baseFinderFeed.getItemId())) + ", lite app callback, actionName:" + str);
        if (!com.tencent.mm.sdk.platformtools.t8.D0(str, "FinderGameJoinClickAcceptAction")) {
            return false;
        }
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).V6();
        androidx.lifecycle.c1 a18 = uVar.e(zy2.b6.class).a(xc2.k0.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        xc2.k0.f7((xc2.k0) a18, kz5.b0.c(baseFinderFeed.getFeedObject()), V6.getInteger(5), V6, 0, null, null, 56, null);
        return false;
    }
}
