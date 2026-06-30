package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class w6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.x6 f205909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205910c;

    public w6(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.x6 x6Var, yb5.d dVar) {
        this.f205908a = f9Var;
        this.f205909b = x6Var;
        this.f205910c = dVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.ui.chatting.viewitems.a7 a7Var = com.tencent.mm.ui.chatting.viewitems.a7.f203285a;
            com.tencent.mm.ui.chatting.viewitems.x6 x6Var = this.f205909b;
            yb5.d dVar = this.f205910c;
            com.tencent.mm.storage.f9 f9Var = this.f205908a;
            java.lang.String A = x6Var.A(dVar, f9Var);
            kotlin.jvm.internal.o.f(A, "getUserName(...)");
            a7Var.e(f9Var, A);
        }
    }
}
