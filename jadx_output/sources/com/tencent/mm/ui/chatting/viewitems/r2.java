package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class r2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f205404b;

    public r2(com.tencent.mm.ui.chatting.viewitems.o2 o2Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f205403a = f9Var;
        this.f205404b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.storage.f9 f9Var = this.f205403a;
        if (!com.tencent.mm.storage.z3.N4(f9Var.Q0()) && this.f205404b == 5) {
            el0.i.c(false, f9Var.I0(), f9Var.Q0());
        }
    }
}
