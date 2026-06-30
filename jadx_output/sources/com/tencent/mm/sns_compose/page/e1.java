package com.tencent.mm.sns_compose.page;

/* loaded from: classes4.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n85.t f193457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n85.t f193458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(n85.t tVar, n85.t tVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193457d = tVar;
        this.f193458e = tVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.sns_compose.page.e1(this.f193457d, this.f193458e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.sns_compose.page.e1 e1Var = (com.tencent.mm.sns_compose.page.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dx1.f fVar = dx1.g.f244489a;
        n85.t tVar = this.f193457d;
        java.lang.String str = tVar.f335724d;
        bx1.u uVar = bx1.u.f36313h;
        fVar.j("MomentsTogetherHistoryBrowsing", "withFriendFeedCount", str, uVar);
        if ((tVar.f335731k & 32) > 0) {
            fVar.j("MomentsTogetherHistoryBrowsing", "withFriendExtraFeedCount", tVar.f335724d, uVar);
        }
        java.lang.String snsId = this.f193458e.f335724d;
        kotlin.jvm.internal.o.g(snsId, "snsId");
        fVar.l("MomentsTogetherHistoryBrowsing", "withFriendDetailAction", pm0.v.u(0L), "0,0,0,0,0", bx1.u.f36309d);
        return jz5.f0.f302826a;
    }
}
