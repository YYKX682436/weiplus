package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f117018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMedia f117020g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gk2.e eVar, com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var, com.tencent.mm.protocal.protobuf.FinderMedia finderMedia, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117018e = eVar;
        this.f117019f = a1Var;
        this.f117020g = finderMedia;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.d0(this.f117018e, this.f117019f, this.f117020g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117017d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117019f;
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = this.f117020g;
            gk2.e eVar = this.f117018e;
            com.tencent.mm.plugin.finder.live.viewmodel.c0 c0Var = new com.tencent.mm.plugin.finder.live.viewmodel.c0(eVar, a1Var, finderMedia);
            this.f117017d = 1;
            if (r4Var.s2(eVar, c0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
