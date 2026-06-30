package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.z1 f192097d;

    public y1(com.tencent.mm.pluginsdk.ui.z1 z1Var, com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
        this.f192097d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.z1 z1Var = this.f192097d;
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = z1Var.f192104e;
        int i17 = com.tencent.mm.pluginsdk.ui.MultiSelectContactView.f189783x;
        multiSelectContactView.i();
        z1Var.f192104e.h();
    }
}
