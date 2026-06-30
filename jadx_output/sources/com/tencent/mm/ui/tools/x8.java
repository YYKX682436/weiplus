package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210907d;

    public x8(com.tencent.mm.ui.tools.c9 c9Var) {
        this.f210907d = c9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.c9 c9Var = this.f210907d;
        if (c9Var.f210321f == null) {
            com.tencent.mars.xlog.Log.w(c9Var.f210316a, "post do expand search menu, but search menu item is null");
            return;
        }
        if (c9Var.f210317b) {
            com.tencent.mm.ui.tools.z8 z8Var = c9Var.f210332q;
            if (z8Var != null) {
                z8Var.expandActionView();
                return;
            }
            return;
        }
        com.tencent.mm.ui.tools.z8 z8Var2 = c9Var.f210332q;
        if (z8Var2 != null) {
            z8Var2.expandActionView();
        }
    }
}
