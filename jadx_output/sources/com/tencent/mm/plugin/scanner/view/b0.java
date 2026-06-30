package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159922d;

    public b0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f159922d = t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.scanner.view.t0.f159982p1;
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159922d;
        t0Var.x(7);
        t0Var.f159994x = true;
        t0Var.C = false;
        t0Var.G = true;
        t0Var.M = false;
        java.util.Map<java.lang.String, java.lang.String> scanDetailMsgMap = t0Var.getScanDetailMsgMap();
        java.lang.String str = scanDetailMsgMap != null ? scanDetailMsgMap.get("lean_forward") : null;
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
        com.tencent.mm.plugin.scanner.view.t0.p(t0Var);
        t0Var.f159995x0 = true;
        com.tencent.mm.plugin.scanner.view.t0.o(t0Var);
    }
}
