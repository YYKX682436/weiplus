package x14;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f451456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451457e = getHdHeadImageGalleryView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x14.p(this.f451457e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x14.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451456d;
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451457e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            x14.k kVar = new x14.k(getHdHeadImageGalleryView);
            x14.l lVar = x14.l.f451452d;
            this.f451456d = 1;
            if (com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView.e(getHdHeadImageGalleryView, false, kVar, lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        x14.m mVar = new x14.m(getHdHeadImageGalleryView);
        x14.o oVar = new x14.o(getHdHeadImageGalleryView);
        this.f451456d = 2;
        if (com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView.e(getHdHeadImageGalleryView, true, mVar, oVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
