package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class p8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f195227d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.storage.p8(this.f195227d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.p8 p8Var = (com.tencent.mm.storage.p8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jm0.i iVar = jm0.k.f300269h;
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.h3.class);
        java.lang.String str = this.f195227d;
        h3Var.X6(str);
        ((com.tencent.mm.storage.u4) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.u4.class)).X6(str);
        ((com.tencent.mm.storage.k9) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.k9.class)).X6(str);
        return jz5.f0.f302826a;
    }
}
