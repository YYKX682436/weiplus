package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f116902d;

    public a7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f116902d = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        boolean z17 = false;
        if (c1Var != null && c1Var.O7()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.b8.O6(this.f116902d);
    }
}
