package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class o1 implements mr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174139a;

    public o1(com.tencent.mm.plugin.textstatus.ui.w1 w1Var) {
        this.f174139a = w1Var;
    }

    @Override // mr.a
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = this.f174139a;
        com.tencent.mars.xlog.Log.i(w1Var.f174390i, "onPageSelected() called with: position = " + i17);
        w1Var.f(i17);
    }
}
