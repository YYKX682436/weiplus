package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class y1 implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f145715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f145716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f145717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f145720f;

    public y1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, long j17, java.util.HashSet hashSet, android.view.View view, android.widget.ImageView imageView, r45.wv3 wv3Var) {
        this.f145715a = listScrollPAGView;
        this.f145716b = j17;
        this.f145717c = hashSet;
        this.f145718d = view;
        this.f145719e = imageView;
        this.f145720f = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f145720f;
        android.widget.ImageView imageView = this.f145719e;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f145715a;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            int intValue = ((java.lang.Integer) listScrollPAGView.getTag(com.tencent.mm.R.id.f485772j10)).intValue();
            long j17 = this.f145716b;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "loadBubblePagView downloadComplete success，id: %s，file path: %s, status：%s，hasplay：%s", java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(intValue), java.lang.Boolean.valueOf(this.f145717c.contains(java.lang.Long.valueOf(j17))));
            if (intValue == 1) {
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.f(0, str, listScrollPAGView);
                android.view.View view = this.f145718d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(8);
                r45.xv3 xv3Var = wv3Var.f389501g;
                if (xv3Var != null) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.f390493w, 1, 1);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
            android.view.View view2 = this.f145718d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            r45.xv3 xv3Var2 = wv3Var.f389501g;
            if (xv3Var2 != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var2.f390493w, 2, 1);
            }
        }
        listScrollPAGView.setTag(com.tencent.mm.R.id.f485772j10, 0);
    }
}
