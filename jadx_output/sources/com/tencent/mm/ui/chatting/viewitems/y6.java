package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class y6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.z6 f206043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206044c;

    public y6(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.z6 z6Var, yb5.d dVar) {
        this.f206042a = f9Var;
        this.f206043b = z6Var;
        this.f206044c = dVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.ui.chatting.viewitems.a7 a7Var = com.tencent.mm.ui.chatting.viewitems.a7.f203285a;
            com.tencent.mm.ui.chatting.viewitems.z6 z6Var = this.f206043b;
            yb5.d dVar = this.f206044c;
            com.tencent.mm.storage.f9 f9Var = this.f206042a;
            java.lang.String A = z6Var.A(dVar, f9Var);
            kotlin.jvm.internal.o.f(A, "getUserName(...)");
            a7Var.e(f9Var, A);
        }
    }
}
