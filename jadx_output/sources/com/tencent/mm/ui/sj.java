package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class sj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TipUseDuplicateGroupUI f209861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(com.tencent.mm.ui.TipUseDuplicateGroupUI tipUseDuplicateGroupUI) {
        super(1);
        this.f209861d = tipUseDuplicateGroupUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.d0)) {
            wi5.d0 d0Var = (wi5.d0) dVar;
            if (d0Var.f446286c) {
                rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
                if (v0Var != null) {
                    java.lang.String str = d0Var.f446285b;
                    com.tencent.mm.ui.chatting.x3.i(this.f209861d, str, true, str);
                }
                if (v0Var != null) {
                    com.tencent.mm.ui.chatting.x3.a();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
