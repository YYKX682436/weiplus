package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes3.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.BannerActView f148326d;

    public a(com.tencent.mm.plugin.mall.ui.BannerActView bannerActView) {
        this.f148326d = bannerActView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/BannerActView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mall.ui.BannerActView bannerActView = this.f148326d;
        bannerActView.setVisibility(8);
        java.util.List list = bannerActView.f148227d;
        if (list == null || list.size() < 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallLogic", "func[setBannerRedDotClick] actList null or empty");
        } else {
            int i17 = ((bt4.a) list.get(0)).f24466a;
            gm0.j1.i();
            gm0.j1.u().c().w(270342, java.lang.Integer.valueOf(i17));
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
        java.util.List list2 = bannerActView.f148227d;
        if (list2 != null && list2.size() > 0) {
            com.tencent.mm.wallet_core.ui.r1.V(bannerActView.getContext(), ((bt4.a) bannerActView.f148227d.get(0)).f24468c, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/BannerActView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
