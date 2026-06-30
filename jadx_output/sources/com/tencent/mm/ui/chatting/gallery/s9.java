package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class s9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f201370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(t21.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201370d = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.s9(this.f201370d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.s9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t21.v2 v2Var = this.f201370d;
        if (com.tencent.mm.storage.z3.R4(v2Var.h())) {
            i17 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(v2Var.h());
        } else {
            i17 = 0;
        }
        return new java.lang.Integer(i17);
    }
}
