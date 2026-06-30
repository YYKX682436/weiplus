package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f209378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var, boolean z17) {
        super(1);
        this.f209377d = e0Var;
        this.f209378e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var = this.f209377d;
        if (dVar != null && (dVar instanceof wi5.e)) {
            e0Var.T6(state, true);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            if (!this.f209378e) {
                e0Var.T6(state, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
