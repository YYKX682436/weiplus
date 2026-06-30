package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.z2 f149450d;

    public y2(com.tencent.mm.plugin.mmsight.ui.z2 z2Var) {
        this.f149450d = z2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.z2 z2Var = this.f149450d;
        dp.a.makeText(z2Var.f149454a, com.tencent.mm.R.string.gw9, 1).show();
        z2Var.f149454a.setSelfNavigationBarVisible(8);
        z2Var.f149454a.f149238p.setVisibility(0);
        z2Var.f149454a.f149241q.setVisibility(0);
        z2Var.f149454a.f149248x.setVisibility(0);
    }
}
