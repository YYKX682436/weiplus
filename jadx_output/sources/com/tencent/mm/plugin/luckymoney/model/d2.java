package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class d2 implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f145217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f145218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f145219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f145221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f145222f;

    public d2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, boolean z17, long j17, android.view.View view, r45.wv3 wv3Var, java.util.HashSet hashSet) {
        this.f145217a = listScrollPAGView;
        this.f145218b = z17;
        this.f145219c = j17;
        this.f145220d = view;
        this.f145221e = wv3Var;
        this.f145222f = hashSet;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f145221e;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f145217a;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            int intValue = ((java.lang.Integer) listScrollPAGView.getTag(com.tencent.mm.R.id.qur)).intValue();
            boolean z18 = this.f145218b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue);
            long j17 = this.f145219c;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[setBubbleAtmospherePagView] downloadComplete success，file path: %s, needPlay：%s，status: %s，id:%s", str, valueOf, valueOf2, java.lang.Long.valueOf(j17));
            if (intValue == 1) {
                if (z18) {
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.f(9, str, listScrollPAGView);
                    android.view.View view = this.f145220d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    r45.xv3 xv3Var = wv3Var.f389501g;
                    if (xv3Var != null) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.E, 1, 6);
                    }
                } else if (!this.f145222f.contains(java.lang.Long.valueOf(j17))) {
                    listScrollPAGView.n();
                    listScrollPAGView.setPath(str);
                    listScrollPAGView.setProgress(0.0d);
                    android.view.View view2 = this.f145220d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[setBubbleAtmospherePagView] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
            android.view.View view3 = this.f145220d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.xv3 xv3Var2 = wv3Var.f389501g;
            if (xv3Var2 != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var2.E, 2, 6);
            }
        }
        listScrollPAGView.setTag(com.tencent.mm.R.id.qur, 0);
    }
}
