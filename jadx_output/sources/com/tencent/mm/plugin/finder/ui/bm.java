package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class bm implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lb2.j f128963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f128964e;

    public bm(com.tencent.mm.plugin.finder.ui.cm cmVar, lb2.j jVar, in5.s0 s0Var) {
        this.f128963d = jVar;
        this.f128964e = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        lb2.j jVar = this.f128963d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            boolean j17 = jVar.j();
            in5.s0 s0Var = this.f128964e;
            if (j17) {
                jVar.f317747r = new com.tencent.mm.plugin.finder.ui.am(new java.lang.ref.WeakReference(s0Var.f293122f), s0Var.getAdapterPosition());
            }
            jVar.n(i17);
            s0Var.f293122f.notifyItemChanged(s0Var.getAdapterPosition());
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
