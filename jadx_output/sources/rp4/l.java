package rp4;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f398669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f398670e = editorVideoCompositionPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new rp4.l(this.f398670e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((rp4.l) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398669d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f398669d = 1;
            obj = com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout.y(this.f398670e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        return new dw3.m0((java.util.List) lVar.f302833d, (java.util.List) lVar.f302834e);
    }
}
