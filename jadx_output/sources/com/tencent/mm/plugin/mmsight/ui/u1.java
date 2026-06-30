package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.v1 f149430d;

    public u1(com.tencent.mm.plugin.mmsight.ui.v1 v1Var) {
        this.f149430d = v1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.v1 v1Var = this.f149430d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = v1Var.f149434a.f149279o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.mmsight.ui.z1 z1Var = v1Var.f149434a.f149280p;
        if (z1Var != null) {
            z1Var.a();
        }
    }
}
