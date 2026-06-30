package kp3;

/* loaded from: classes14.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI f311070b;

    public z(java.lang.String str, com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI) {
        this.f311069a = str;
        this.f311070b = palmPrintFrontUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        byte[] initialProtobufBytes;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        jp3.t tVar = jp3.t.f301029a;
        java.lang.String str = this.f311069a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70616b);
        java.lang.String str2 = fVar.f70617c;
        r45.r10 r10Var = (r45.r10) fVar.f70618d;
        tVar.c("checkonlineopenpalmserviceauth", str, valueOf, str2, (r10Var == null || (initialProtobufBytes = r10Var.initialProtobufBytes()) == null) ? null : java.lang.Integer.valueOf(initialProtobufBytes.length));
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] response : " + fVar);
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && fVar.f70618d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] success");
            r45.s10 s10Var = (r45.s10) ((r45.r10) fVar.f70618d).getCustom(1);
            com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI = this.f311070b;
            if (s10Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] is_upload_bypass: " + s10Var.getBoolean(0) + ", sdk_config: " + s10Var.getString(1) + ", guide_popup_config: " + s10Var.getString(2));
                jp3.r rVar = jp3.s.f301025b;
                java.lang.String string = s10Var.getString(1);
                if (string == null) {
                    string = "";
                }
                jp3.s.f301028e = string;
                palmPrintFrontUI.getIntent().putExtra("is_upload_bypass", s10Var.getBoolean(0));
                palmPrintFrontUI.getIntent().putExtra("guide_popup_config", s10Var.getString(2));
            }
            j45.l.n(palmPrintFrontUI, "palm", ".ui.PalmPrintMainUI", palmPrintFrontUI.getIntent(), palmPrintFrontUI.f152867d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] failed");
            jp3.g gVar = jp3.g.f301000a;
            com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI2 = this.f311070b;
            int i17 = fVar.f70616b;
            if (i17 == 0) {
                i17 = 80020;
            }
            int i18 = i17;
            java.lang.String str3 = fVar.f70617c;
            gVar.i(palmPrintFrontUI2, i18, !(str3 == null || str3.length() == 0) ? fVar.f70617c : "ERR_PALM_SERVER_CHECK_AUTH", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        return jz5.f0.f302826a;
    }
}
