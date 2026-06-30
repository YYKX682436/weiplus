package px2;

/* loaded from: classes2.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358880e = finderLandscapePreviewLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px2.f(this.f358880e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((px2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358879d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f358879d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout.P;
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358880e;
        finderLandscapePreviewLayout.r();
        finderLandscapePreviewLayout.s();
        return jz5.f0.f302826a;
    }
}
