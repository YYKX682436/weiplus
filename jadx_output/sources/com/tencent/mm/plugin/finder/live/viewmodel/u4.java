package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v4 f117453d;

    public u4(com.tencent.mm.plugin.finder.live.viewmodel.v4 v4Var) {
        this.f117453d = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.viewmodel.v4 v4Var = this.f117453d;
        if (v4Var.f117473e == null) {
            v4Var.f117473e = new com.tencent.mm.ui.tools.f5(v4Var.getContext());
            com.tencent.mm.plugin.finder.live.viewmodel.v4 v4Var2 = this.f117453d;
            com.tencent.mm.ui.tools.f5 f5Var = v4Var2.f117473e;
            if (f5Var != null) {
                f5Var.f210400e = new com.tencent.mm.plugin.finder.live.viewmodel.t4(v4Var2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f117453d.f117473e;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
