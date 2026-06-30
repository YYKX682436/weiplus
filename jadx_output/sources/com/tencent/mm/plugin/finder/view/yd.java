package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f133391d;

    public yd(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        this.f133391d = finderLiveShoppingCouponView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView$restrictIcon$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShoppingCouponView", "restrict action clicked too fast!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView$restrictIcon$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("coupon restrict clicked: ");
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f133391d;
        sb6.append(finderLiveShoppingCouponView.f131235u);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCouponView", sb6.toString());
        yz5.l restrictCallback = finderLiveShoppingCouponView.getRestrictCallback();
        if (restrictCallback != null) {
            cm2.k0 k0Var = finderLiveShoppingCouponView.f131235u;
            kotlin.jvm.internal.o.d(k0Var);
            restrictCallback.invoke(k0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView$restrictIcon$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
