package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes9.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f173086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt0.e f173087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI f173088c;

    public o(com.tencent.mm.ui.widget.dialog.u3 u3Var, rt0.e eVar, com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI) {
        this.f173086a = u3Var;
        this.f173087b = eVar;
        this.f173088c = authorizationDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.Map d17;
        java.lang.String str;
        ot0.q v17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f173086a.dismiss();
        int i17 = fVar.f70616b;
        com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI = this.f173088c;
        if (i17 == 0 && fVar.f70615a == 0) {
            rt0.e eVar = this.f173087b;
            if (eVar.f399379d == 3 && (d17 = com.tencent.mm.sdk.platformtools.aa.d(eVar.f399380e, "content", null)) != null && (str = (java.lang.String) d17.get(".content")) != null && (v17 = ot0.q.v(str)) != null) {
                com.tencent.mm.autogen.mmdata.rpt.TeenModeAuthStruct teenModeAuthStruct = new com.tencent.mm.autogen.mmdata.rpt.TeenModeAuthStruct();
                teenModeAuthStruct.f61073d = 2L;
                teenModeAuthStruct.f61074e = 2L;
                teenModeAuthStruct.f61075f = 3L;
                int i18 = com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI.f172796t;
                teenModeAuthStruct.f61076g = teenModeAuthStruct.b("requestID", java.lang.String.valueOf(authorizationDetailUI.U6()), true);
                teenModeAuthStruct.f61077h = teenModeAuthStruct.b("requestResource", v17.f348674k, true);
                teenModeAuthStruct.k();
            }
        } else {
            java.lang.String str2 = fVar.f70617c;
            int i19 = com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI.f172796t;
            android.widget.TextView textView = (android.widget.TextView) authorizationDetailUI.findViewById(com.tencent.mm.R.id.dhj);
            textView.setVisibility(0);
            if (str2 == null) {
                str2 = authorizationDetailUI.getString(com.tencent.mm.R.string.f490390tn);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
            }
            textView.setText(str2);
        }
        return jz5.f0.f302826a;
    }
}
