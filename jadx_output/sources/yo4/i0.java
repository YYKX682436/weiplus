package yo4;

/* loaded from: classes10.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f464235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, so4.b bVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464234d = multiVideoFullScreenPluginLayout;
        this.f464235e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.i0(this.f464234d, null, this.f464235e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yo4.i0 i0Var = (yo4.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464234d;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.pause();
        }
        multiVideoFullScreenPluginLayout.H.c(null);
        throw null;
    }
}
