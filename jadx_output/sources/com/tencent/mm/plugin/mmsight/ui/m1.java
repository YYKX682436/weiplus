package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149367d;

    public m1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149367d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149367d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = a2Var.f149279o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.mmsight.ui.z1 z1Var = a2Var.f149280p;
        if (z1Var != null) {
            z1Var.b();
        }
    }
}
