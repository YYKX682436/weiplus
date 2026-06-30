package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class aj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI f146715e;

    public aj(java.lang.String str, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI luckyMoneyNewYearStateReceiveUI) {
        this.f146714d = str;
        this.f146715e = luckyMoneyNewYearStateReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI$updateViewRec$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearStateReceiveUI", "click StatusLayout");
        bi4.c1 c1Var = new bi4.c1();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "3";
        j0Var.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList2.add(j0Var);
        c1Var.b(this.f146714d);
        c1Var.f("red_packet_2022@inner");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI luckyMoneyNewYearStateReceiveUI = this.f146715e;
        com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo luckyMoneyNewYearStateInfo = luckyMoneyNewYearStateReceiveUI.f146466z;
        if (luckyMoneyNewYearStateInfo == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        bi4.d1 d1Var = c1Var.f21034a;
        pj4.b0 b0Var = d1Var.f354937d;
        b0Var.f354976h = luckyMoneyNewYearStateInfo.f177564p;
        if (luckyMoneyNewYearStateInfo == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        b0Var.f354978m = luckyMoneyNewYearStateInfo.f177565q;
        if (luckyMoneyNewYearStateInfo == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        b0Var.f354987v = luckyMoneyNewYearStateInfo.f177566r;
        if (luckyMoneyNewYearStateInfo == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        b0Var.f354988w = luckyMoneyNewYearStateInfo.f177567s;
        if (luckyMoneyNewYearStateInfo == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        c1Var.h(luckyMoneyNewYearStateInfo.f177568t);
        com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo luckyMoneyNewYearStateInfo2 = luckyMoneyNewYearStateReceiveUI.f146466z;
        if (luckyMoneyNewYearStateInfo2 == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        c1Var.g(luckyMoneyNewYearStateInfo2.f177563o);
        d1Var.f354937d.f354974f = 2;
        c1Var.c(arrayList2);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(luckyMoneyNewYearStateReceiveUI.getContext(), d1Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msg", "send state and close");
        luckyMoneyNewYearStateReceiveUI.setResult(-1, intent);
        luckyMoneyNewYearStateReceiveUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI$updateViewRec$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
