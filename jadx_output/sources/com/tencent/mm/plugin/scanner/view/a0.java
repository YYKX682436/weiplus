package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class a0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159921d;

    public a0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f159921d = t0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.lang.String str;
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159921d;
        t0Var.getClass();
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_enable_multi_angles, 0) == 1) && t0Var.F && t0Var.D != null) {
            t0Var.x(19);
            t0Var.C = false;
            t0Var.G = true;
            t0Var.M = false;
            java.util.Map<java.lang.String, java.lang.String> scanDetailMsgMap = t0Var.getScanDetailMsgMap();
            str = scanDetailMsgMap != null ? scanDetailMsgMap.get("lean_forward") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = t0Var.getContext().getString(com.tencent.mm.R.string.lna);
            }
            android.widget.TextView textView = t0Var.T;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = t0Var.T;
            if (textView2 != null) {
                textView2.setText(str);
            }
            t0Var.f159995x0 = true;
            com.tencent.mm.plugin.scanner.view.t0.o(t0Var);
            com.tencent.mm.plugin.scanner.view.t0.p(t0Var);
            com.tencent.mm.sdk.platformtools.b4 b4Var = t0Var.f159993w;
            if (b4Var != null) {
                b4Var.d();
            }
        } else {
            t0Var.f159994x = false;
            if (t0Var.t()) {
                t0Var.x(23);
                java.util.Map<java.lang.String, java.lang.String> scanDetailMsgMap2 = t0Var.getScanDetailMsgMap();
                str = scanDetailMsgMap2 != null ? scanDetailMsgMap2.get("horizontal_screen_timeout_tips") : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = t0Var.getContext().getString(com.tencent.mm.R.string.lfa);
                }
            } else {
                t0Var.x(6);
                java.util.Map<java.lang.String, java.lang.String> scanDetailMsgMap3 = t0Var.getScanDetailMsgMap();
                str = scanDetailMsgMap3 != null ? scanDetailMsgMap3.get("scan_timeout") : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = t0Var.getContext().getString(com.tencent.mm.R.string.n3c);
                }
            }
            com.tencent.mm.ui.widget.dialog.j0 A = db5.e1.A(t0Var.getContext(), str, "", t0Var.getContext().getString(com.tencent.mm.R.string.f493655n33), t0Var.getContext().getString(com.tencent.mm.R.string.n37), new com.tencent.mm.plugin.scanner.view.y(t0Var), new com.tencent.mm.plugin.scanner.view.z(t0Var));
            if (A != null) {
                A.setCanceledOnTouchOutside(false);
            }
        }
        return true;
    }
}
