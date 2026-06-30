package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class t1 implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final ot0.q f205548d;

    public t1(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String U1 = f9Var.U1();
        if (U1 != null) {
            this.f205548d = ot0.q.v(U1);
        } else {
            this.f205548d = null;
        }
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        ot0.q qVar;
        com.tencent.mm.ui.chatting.viewitems.t1 t1Var = (com.tencent.mm.ui.chatting.viewitems.t1) obj;
        ot0.q qVar2 = this.f205548d;
        return (qVar2 == null || (qVar = t1Var.f205548d) == null || qVar2.f348682m != qVar.f348682m) ? false : true;
    }
}
