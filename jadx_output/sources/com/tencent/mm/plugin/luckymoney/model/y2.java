package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public final class y2 implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f145723c;

    public y2(long j17, android.view.View view, int i17, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f145721a = view;
        this.f145722b = i17;
        this.f145723c = mMPAGView;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.System.currentTimeMillis();
        if (result instanceof com.tencent.mm.wallet_core.model.r1) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) result).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] downloadComplete success，file path: %s", str);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.x2(this.f145721a, this.f145722b, str, this.f145723c));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) result).f213985a));
        android.view.View view = this.f145721a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
