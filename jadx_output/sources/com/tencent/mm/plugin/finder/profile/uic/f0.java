package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f123680d;

    public f0(com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f123680d = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f123680d;
        if (o0Var.R6()) {
            o0Var.a7().setVisibility(0);
            o0Var.a7().setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.e0(o0Var));
        } else {
            o0Var.a7().setVisibility(8);
        }
        o0Var.S6();
    }
}
