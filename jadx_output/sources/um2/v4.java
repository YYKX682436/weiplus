package um2;

/* loaded from: classes3.dex */
public final class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428996d;

    public v4(um2.x5 x5Var) {
        this.f428996d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fm2.c cVar;
        um2.x5 x5Var = this.f428996d;
        androidx.appcompat.app.AppCompatActivity activity = x5Var.f19605b;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((pl2.x) pf5.z.f353948a.a(activity).a(pl2.x.class)).f356683f) {
            fm2.c cVar2 = x5Var.f19606c;
            if (cVar2 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = cVar2 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) cVar2 : null;
                if (finderLiveVisitorPluginLayout != null) {
                    finderLiveVisitorPluginLayout.clearForSideBar();
                    return;
                }
                return;
            }
        }
        if (!((mm2.c1) x5Var.c(mm2.c1.class)).N1 || (cVar = x5Var.f19606c) == null) {
            return;
        }
        cVar.onScreenClear(((mm2.c1) x5Var.c(mm2.c1.class)).N1);
    }
}
