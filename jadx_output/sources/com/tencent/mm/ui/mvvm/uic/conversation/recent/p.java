package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.t f209351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar) {
        super(1);
        this.f209351d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.i0 i0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            wi5.h0 h0Var = (wi5.h0) dVar;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(com.tencent.mm.ui.contact.k3.d())) {
                j75.e eVar = h0Var.f298067a;
                if (eVar != null) {
                    i0Var = (wi5.i0) eVar;
                } else {
                    i0Var = new wi5.i0();
                    h0Var.f298067a = i0Var;
                }
                i0Var.f446295a[1] = new com.tencent.mm.ui.mvvm.uic.conversation.recent.o(this.f209351d);
            }
        }
        return jz5.f0.f302826a;
    }
}
