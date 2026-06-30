package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.u f120948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f120949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar, r45.l03 l03Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120948e = uVar;
        this.f120949f = l03Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.megavideo.topstory.flow.l(this.f120948e, this.f120949f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120947d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vn2.k kVar = vn2.l.f438315a;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar = this.f120948e;
            java.lang.String tag = uVar.getTAG();
            r45.l03 l03Var = this.f120949f;
            im5.c cVar = uVar.f121017d;
            this.f120947d = 1;
            obj = vn2.k.b(kVar, tag, l03Var, cVar, 0L, null, this, 24, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
