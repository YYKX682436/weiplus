package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class w9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(com.tencent.mm.ui.chatting.gallery.ja jaVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201543d = jaVar;
        this.f201544e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.w9(this.f201543d, this.f201544e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.gallery.w9 w9Var = (com.tencent.mm.ui.chatting.gallery.w9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t21.d3.A(this.f201543d.f201079t, this.f201544e);
        return jz5.f0.f302826a;
    }
}
