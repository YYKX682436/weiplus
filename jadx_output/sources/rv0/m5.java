package rv0;

/* loaded from: classes5.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView f400117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView clipStorylineSegmentTimelineView, ex0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400117e = clipStorylineSegmentTimelineView;
        this.f400118f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.m5(this.f400117e, this.f400118f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.m5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400116d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView.f69281z;
            dx0.n thumbnailProviderManager = this.f400117e.getThumbnailProviderManager();
            com.tencent.maas.base.MJID mjid = this.f400118f.f257168b;
            this.f400116d = 1;
            if (thumbnailProviderManager.c(mjid, true, this) == aVar) {
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
