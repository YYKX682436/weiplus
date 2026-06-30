package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var) {
        super(1);
        this.f209375d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.i0 i0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            wi5.h0 h0Var = (wi5.h0) dVar;
            java.util.LinkedList linkedList = state.f446319o;
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var = this.f209375d;
            e0Var.getClass();
            kotlin.jvm.internal.o.g(linkedList, "<set-?>");
            j75.e eVar = h0Var.f298067a;
            if (eVar != null) {
                i0Var = (wi5.i0) eVar;
            } else {
                i0Var = new wi5.i0();
                h0Var.f298067a = i0Var;
            }
            i0Var.f446295a[2] = new com.tencent.mm.ui.mvvm.uic.conversation.recent.u(e0Var, state);
        }
        return jz5.f0.f302826a;
    }
}
