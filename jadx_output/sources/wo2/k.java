package wo2;

@j95.b
/* loaded from: classes2.dex */
public final class k extends l85.m1 implements ws5.g {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.l1 f448087g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f448088h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f448089i;

    public k() {
        super("PluginFinderNearby");
        this.f448087g = new androidx.lifecycle.l1();
        this.f448088h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f448089i = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    public c50.m0 Ai(android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView, java.util.List feedList, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager == null || staggeredGridLayoutManager.f11920d != 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLiveCardAutoPlayMgr: wrong layout manager, ");
            sb6.append(staggeredGridLayoutManager);
            sb6.append(", spanCount=");
            sb6.append(staggeredGridLayoutManager != null ? staggeredGridLayoutManager.f11920d : -1);
            com.tencent.mars.xlog.Log.w("FinderNearbyFeatureService", sb6.toString());
            return null;
        }
        mn0.d0 d0Var = mn0.d0.f329713i;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
            str = "";
        }
        return new gp2.l0(context, recyclerView, feedList, false, 0, false, false, false, adapter, d0Var, 5, str, 0, false, null, null, 61680, null);
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveMoreUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterNearbyLiveMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterNearbyLiveMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean Di(com.tencent.mm.ui.MMActivity finder) {
        kotlin.jvm.internal.o.g(finder, "finder");
        int i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finder).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
        java.util.regex.Pattern pattern = zy2.v.f477590a;
        if (!(i17 == 76 || i17 == 77 || i17 == 80) && !finder.containUIC(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class)) {
            ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).getClass();
            if (!(i17 / 100000 == 94) && !(finder instanceof com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI)) {
                return false;
            }
        }
        return true;
    }

    public void Ni(long j17) {
        rq2.u.f398889a.b(j17);
    }

    @Override // l85.m1, androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f448087g;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }
}
