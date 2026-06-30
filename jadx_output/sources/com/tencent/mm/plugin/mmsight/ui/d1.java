package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.f1 f149308d;

    public d1(com.tencent.mm.plugin.mmsight.ui.f1 f1Var) {
        this.f149308d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.f1 f1Var = this.f149308d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f1Var.f149329d.f149361e.f149279o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.mmsight.ui.z1 z1Var = f1Var.f149329d.f149361e.f149280p;
        if (z1Var != null) {
            z1Var.a();
        }
    }
}
