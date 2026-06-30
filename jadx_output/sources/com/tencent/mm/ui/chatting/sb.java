package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class sb implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.tb f202670a;

    public sb(com.tencent.mm.ui.chatting.tb tbVar) {
        this.f202670a = tbVar;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 windowInsets) {
        kotlin.jvm.internal.o.g(view, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(windowInsets, "windowInsets");
        e3.d a17 = windowInsets.a(135);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        em.i1 i1Var = this.f202670a.f202711d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        i1Var.a().setPadding(a17.f247044a, a17.f247045b, a17.f247046c, a17.f247047d);
        return n3.g3.f334337b;
    }
}
