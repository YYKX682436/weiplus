package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class fl implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.gl f146915a;

    public fl(com.tencent.mm.plugin.luckymoney.ui.gl glVar) {
        this.f146915a = glVar;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result instanceof com.tencent.mm.wallet_core.model.r1;
        com.tencent.mm.plugin.luckymoney.ui.gl glVar = this.f146915a;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) result).f213987a;
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "downloadComplete success，file path: %s", str);
            android.view.View view = glVar.f146959g;
            if (view != null) {
                view.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.el(str, glVar), 150L);
                return;
            } else {
                kotlin.jvm.internal.o.o("pagWidgetLl");
                throw null;
            }
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) result).f213985a));
        android.view.View view2 = glVar.f146957e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("pagLl");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$3", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$3", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
