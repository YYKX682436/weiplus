package gx0;

/* loaded from: classes5.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f277019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f277020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cv0.e f277021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ au0.b f277022h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.PlaybackSession f277023i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(boolean z17, gx0.x4 x4Var, cv0.e eVar, au0.b bVar, com.tencent.maas.moviecomposing.PlaybackSession playbackSession, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277019e = z17;
        this.f277020f = x4Var;
        this.f277021g = eVar;
        this.f277022h = bVar;
        this.f277023i = playbackSession;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.u4(this.f277019e, this.f277020f, this.f277021g, this.f277022h, this.f277023i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.u4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277018d;
        gx0.x4 x4Var = this.f277020f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f277019e && x4Var.t7().isPlaying()) {
                gx0.bf t76 = x4Var.t7();
                this.f277018d = 1;
                if (gx0.bf.t7(t76, false, this, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cv0.e showOption = this.f277021g;
        java.util.Objects.toString(showOption);
        x4Var.Y6().e();
        com.tencent.maas.base.Vec2 renderScale = x4Var.b7();
        au0.b bVar = this.f277022h;
        java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxTitle> Z6 = x4Var.Z6(bVar.b());
        android.app.Activity context = x4Var.getContext();
        com.tencent.maas.moviecomposing.segments.Segment segment = (com.tencent.maas.moviecomposing.segments.Segment) bVar.f14053a;
        cv0.l lVar = cv0.h.f222538a;
        com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f277023i;
        kotlin.jvm.internal.o.g(playbackSession, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(segment, "segment");
        kotlin.jvm.internal.o.g(renderScale, "renderScale");
        kotlin.jvm.internal.o.g(showOption, "showOption");
        com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle e17 = (segment.y() && segment.x()) ? cv0.h.e(context) : new com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle(new com.tencent.maas.model.MJColor(0.0f, 0.0f, 0.0f, 0.0f), 0.0f, new com.tencent.maas.model.MJColor(0.0f, 0.0f, 0.0f, 0.1f), 0.0f);
        com.tencent.maas.model.MJEdgeInsets b17 = cv0.h.b(segment, context);
        if (segment.y() && segment.x()) {
            ug.m C = segment.C();
            kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
            list = cv0.h.f(context, av0.a.a(C), showOption, renderScale);
        } else {
            list = kz5.p0.f313996d;
        }
        playbackSession.enableHandleBox();
        playbackSession.showHandleBox(segment.f48532a, list, Z6, b17, e17);
        x4Var.f277156y = ((com.tencent.maas.moviecomposing.segments.ElementSegment) bVar.f14053a).B();
        return jz5.f0.f302826a;
    }
}
