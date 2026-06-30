package rp4;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f398690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f398691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer[] f398692h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, java.util.List list, java.util.List list2, java.lang.Integer[] numArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398689e = editorVideoCompositionPluginLayout;
        this.f398690f = list;
        this.f398691g = list2;
        this.f398692h = numArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.u(this.f398689e, this.f398690f, this.f398691g, this.f398692h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398688d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = this.f398689e;
            editorVideoCompositionPluginLayout.getMediaModel().f(this.f398690f, this.f398691g, kz5.z.z0(this.f398692h));
            editorVideoCompositionPluginLayout.getMediaModel().e(rp4.w.f398694d);
            editorVideoCompositionPluginLayout.getMediaModel().b();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            rp4.t tVar = new rp4.t(editorVideoCompositionPluginLayout, null);
            this.f398688d = 1;
            if (kotlinx.coroutines.l.g(g3Var, tVar, this) == aVar) {
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
