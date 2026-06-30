package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.l1 f149344d;

    public i1(com.tencent.mm.plugin.mmsight.ui.l1 l1Var) {
        this.f149344d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.l1 l1Var = this.f149344d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = l1Var.f149361e.f149279o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.mmsight.ui.z1 z1Var = l1Var.f149361e.f149280p;
        if (z1Var != null) {
            z1Var.a();
        }
    }
}
