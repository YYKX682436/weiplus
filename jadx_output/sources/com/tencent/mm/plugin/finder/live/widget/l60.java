package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l60 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f118910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars f118912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(mm2.n0 n0Var, com.tencent.mm.plugin.finder.live.widget.z60 z60Var, com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118910e = n0Var;
        this.f118911f = z60Var;
        this.f118912g = finderLiveColiveAnchorListAvatars;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.l60(this.f118910e, this.f118911f, this.f118912g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.widget.l60) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118909d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.f3 f3Var = this.f118910e.f329265g;
            com.tencent.mm.plugin.finder.live.widget.k60 k60Var = new com.tencent.mm.plugin.finder.live.widget.k60(this.f118911f, this.f118912g);
            this.f118909d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(k60Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
