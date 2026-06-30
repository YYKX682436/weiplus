package px2;

/* loaded from: classes2.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358930e = finderLandscapePreviewLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px2.w(this.f358930e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((px2.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vx2.k fastSeekHelper;
        vx2.k fastSeekHelper2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358929d;
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358930e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fastSeekHelper = finderLandscapePreviewLayout.getFastSeekHelper();
            fastSeekHelper.j();
            fastSeekHelper2 = finderLandscapePreviewLayout.getFastSeekHelper();
            vx2.k.e(fastSeekHelper2, 0L, false, 3, null);
            this.f358929d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        finderLandscapePreviewLayout.setPlayState(1);
        finderLandscapePreviewLayout.t();
        return jz5.f0.f302826a;
    }
}
