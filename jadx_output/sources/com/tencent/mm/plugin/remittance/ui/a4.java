package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class a4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RemittanceRefuseEvent f157631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.AnonymousClass2 f157632e;

    public a4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.AnonymousClass2 anonymousClass2, com.tencent.mm.autogen.events.RemittanceRefuseEvent remittanceRefuseEvent) {
        this.f157632e = anonymousClass2;
        this.f157631d = remittanceRefuseEvent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.Map map;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.AnonymousClass2 anonymousClass2 = this.f157632e;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this;
        boolean z17 = remittanceDetailUI.J1;
        com.tencent.mm.autogen.events.RemittanceRefuseEvent remittanceRefuseEvent = this.f157631d;
        if (z17) {
            am.sq sqVar = remittanceRefuseEvent.f54677g;
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this.doSceneProgress(new com.tencent.mm.plugin.remittance.model.k1(sqVar.f7926a, sqVar.f7927b, com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this.E1, 2, "", ""));
            return;
        }
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = remittanceDetailUI.f157344e2;
        if (h3Var != null) {
            h3Var.getClass();
            map = com.tencent.mm.plugin.remittance.ui.h3.f157734u;
        } else {
            map = null;
        }
        java.util.Map map2 = map;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI2 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this;
        java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this.Z1).get(remittanceDetailUI2.h7(remittanceDetailUI2.X1, remittanceDetailUI2.Y1));
        if (l17 == null) {
            l17 = 0L;
        }
        am.sq sqVar2 = remittanceRefuseEvent.f54677g;
        java.lang.String str = sqVar2.f7926a;
        java.lang.String str2 = sqVar2.f7927b;
        int i18 = sqVar2.f7928c;
        java.lang.String str3 = sqVar2.f7929d;
        sqVar2.getClass();
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI3 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this;
        java.lang.String str4 = remittanceDetailUI3.E1;
        int i19 = remittanceDetailUI3.X1;
        java.lang.String str5 = remittanceDetailUI3.Y1;
        long longValue = l17.longValue();
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI4 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this;
        com.tencent.mm.plugin.remittance.model.n0 n0Var = new com.tencent.mm.plugin.remittance.model.n0(str, str2, i18, "refuse", str3, 0, str4, i19, str5, map2, longValue, remittanceDetailUI4.C1, remittanceDetailUI4.I1);
        n0Var.setProcessName("RemittanceProcess");
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.this.doSceneProgress(n0Var);
    }
}
