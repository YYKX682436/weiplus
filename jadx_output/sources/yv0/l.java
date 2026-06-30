package yv0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f465976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView f465977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.r f465978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView clipTimelineView, ex0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465977e = clipTimelineView;
        this.f465978f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yv0.l(this.f465977e, this.f465978f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yv0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465976d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView.L;
            dx0.n thumbnailProviderManager = this.f465977e.getThumbnailProviderManager();
            com.tencent.maas.base.MJID mjid = this.f465978f.f257168b;
            this.f465976d = 1;
            if (thumbnailProviderManager.c(mjid, false, this) == aVar) {
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
