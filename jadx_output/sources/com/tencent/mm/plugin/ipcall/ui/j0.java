package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142876d;

    public j0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142876d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.zr3 e17 = t83.f.e();
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142876d;
        if (e17 == null) {
            m0Var.f142934f.setText("");
            m0Var.f142935g.setText("");
            m0Var.f142935g.setVisibility(8);
            return;
        }
        m0Var.f142934f.setText(e17.f392323m);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17.f392331u)) {
            m0Var.f142935g.setText("");
            m0Var.f142935g.setVisibility(8);
        } else {
            m0Var.f142935g.setText(e17.f392331u);
            m0Var.f142935g.setVisibility(0);
        }
    }
}
