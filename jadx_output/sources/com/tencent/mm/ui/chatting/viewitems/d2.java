package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class d2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f203757b;

    public d2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f203756a = f9Var;
        this.f203757b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.storage.f9 f9Var = this.f203756a;
        if (!com.tencent.mm.storage.z3.N4(f9Var.Q0()) && this.f203757b == 5) {
            el0.i.c(true, f9Var.I0(), f9Var.Q0());
        }
    }
}
