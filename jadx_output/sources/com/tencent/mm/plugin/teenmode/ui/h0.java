package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f173018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI f173019b;

    public h0(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI) {
        this.f173018a = u3Var;
        this.f173019b = bindGuardianMsgUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f173018a.dismiss();
        int i17 = fVar.f70616b;
        com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI = this.f173019b;
        if (i17 == 0 && fVar.f70615a == 0) {
            com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct teenModeBindStruct = new com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct();
            teenModeBindStruct.f61079d = 1L;
            teenModeBindStruct.f61080e = 2L;
            teenModeBindStruct.f61081f = 2L;
            int i18 = com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI.f172816q;
            teenModeBindStruct.f61082g = teenModeBindStruct.b("targetUsername", bindGuardianMsgUI.U6(), true);
            return java.lang.Boolean.valueOf(teenModeBindStruct.k());
        }
        java.lang.String str = fVar.f70617c;
        int i19 = com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI.f172816q;
        android.widget.TextView textView = (android.widget.TextView) bindGuardianMsgUI.findViewById(com.tencent.mm.R.id.dhj);
        textView.setVisibility(0);
        if (str == null) {
            str = bindGuardianMsgUI.getString(com.tencent.mm.R.string.f490390tn);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        textView.setText(str);
        return jz5.f0.f302826a;
    }
}
