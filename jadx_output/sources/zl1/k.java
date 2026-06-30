package zl1;

/* loaded from: classes7.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473596d;

    public k(zl1.t tVar) {
        this.f473596d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl1.t tVar = this.f473596d;
        tVar.f(tVar.f473616e.indexOfChild(view));
        zl1.s sVar = tVar.f473623o;
        if (sVar != null) {
            int i17 = tVar.f473622n;
            java.lang.String str = ((zl1.r) tVar.f473620i.get(i17)).f473605a;
            com.tencent.mm.plugin.appbrand.page.c2 c2Var = (com.tencent.mm.plugin.appbrand.page.c2) sVar;
            com.tencent.mm.plugin.appbrand.page.y1 y1Var = c2Var.f86459b;
            if (y1Var.getContainer().v(com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB)) {
                com.tencent.mm.plugin.appbrand.page.i3 container = y1Var.getContainer();
                container.getClass();
                container.c0(new com.tencent.mm.plugin.appbrand.page.o4(container, str, null, null));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("pagePath", str);
                hashMap.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, ((k91.o) c2Var.f86458a.f305689g.get(i17)).f305698b);
                hashMap.put(ya.b.INDEX, java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.appbrand.page.v5 currentPageView = y1Var.getCurrentPageView();
                if (currentPageView != null) {
                    com.tencent.mm.plugin.appbrand.page.i2 i2Var = new com.tencent.mm.plugin.appbrand.page.i2();
                    i2Var.t(hashMap);
                    currentPageView.i(i2Var, null);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMultiplePage", "can not switchTab in current page environment");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
