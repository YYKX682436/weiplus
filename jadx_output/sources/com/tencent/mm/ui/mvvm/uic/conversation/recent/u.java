package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f209373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var, wi5.n0 n0Var) {
        super(0);
        this.f209372d = e0Var;
        this.f209373e = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var = this.f209372d;
        e0Var.f209308n = new em.j2(android.view.LayoutInflater.from(e0Var.getActivity()).inflate(com.tencent.mm.R.layout.c5k, (android.view.ViewGroup) null));
        e0Var.T6(this.f209373e, false);
        em.j2 j2Var = e0Var.f209308n;
        if (j2Var != null) {
            return j2Var.f254464a;
        }
        return null;
    }
}
