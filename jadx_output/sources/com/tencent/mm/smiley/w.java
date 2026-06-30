package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class w extends qz5.l implements yz5.p {
    public w(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.smiley.w(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.smiley.w wVar = new com.tencent.mm.smiley.w((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.tencent.mm.smiley.c0.f193229e == null) {
            com.tencent.mm.smiley.c0.f193229e = com.tencent.mm.smiley.c0.a(com.tencent.mm.smiley.c0.f193225a);
        }
        kotlinx.coroutines.sync.d dVar = com.tencent.mm.smiley.c0.f193228d;
        if (((kotlinx.coroutines.sync.k) dVar).a()) {
            kotlinx.coroutines.sync.c.c(dVar, null, 1, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "resume successfully");
        return jz5.f0.f302826a;
    }
}
