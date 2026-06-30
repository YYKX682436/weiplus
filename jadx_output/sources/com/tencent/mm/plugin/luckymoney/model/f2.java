package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class f2 implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f145271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f145272f;

    public f2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, long j17, android.view.View view, android.view.View view2, int i17, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, r45.wv3 wv3Var) {
        this.f145267a = j17;
        this.f145268b = view;
        this.f145269c = view2;
        this.f145270d = i17;
        this.f145271e = listScrollPAGView;
        this.f145272f = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        r45.xv3 xv3Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f145267a;
        if (s1Var instanceof com.tencent.mm.wallet_core.model.r1) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] downloadComplete success，file path: %s", str);
            this.f145268b.postDelayed(new com.tencent.mm.plugin.luckymoney.model.e2(this, str, currentTimeMillis), 300L);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = this.f145269c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.wv3 wv3Var = this.f145272f;
        if (wv3Var == null || (xv3Var = wv3Var.f389501g) == null) {
            return;
        }
        int i17 = this.f145270d;
        if (i17 == 11) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.G, 2, 8, java.lang.Long.valueOf(currentTimeMillis));
        } else if (i17 == 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.F, 2, 7, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
