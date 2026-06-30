package cr2;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f221891e;

    public t(cr2.x xVar, android.content.res.Configuration configuration) {
        this.f221890d = xVar;
        this.f221891e = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cr2.x xVar = this.f221890d;
        java.lang.String str = xVar.f221901g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged post orientation: ");
        sb6.append(this.f221891e.orientation);
        sb6.append(" width: ");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = xVar.f221907m;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        sb6.append(wxRecyclerView.getWidth());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory themeLivingItemConvertFactory = xVar.f221913s;
        if (themeLivingItemConvertFactory != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = xVar.f221907m;
            if (wxRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(wxRecyclerView2.getWidth());
            java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
            themeLivingItemConvertFactory.updateLivingWidth(num != null ? num.intValue() : com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x);
        }
        cr2.a aVar = xVar.f221912r;
        if (aVar != null) {
            aVar.f213717v.clear();
        }
        cr2.a aVar2 = xVar.f221912r;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }
}
