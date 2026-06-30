package rp4;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw3.o0 f398673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f398674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f398675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, java.lang.String str, dw3.o0 o0Var, java.lang.Integer num, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398671d = editorVideoCompositionPluginLayout;
        this.f398672e = str;
        this.f398673f = o0Var;
        this.f398674g = num;
        this.f398675h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.m(this.f398671d, this.f398672e, this.f398673f, this.f398674g, this.f398675h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rp4.m mVar = (rp4.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dw3.u0 u0Var = dw3.u0.f244283a;
        com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = this.f398671d;
        android.content.Context context = editorVideoCompositionPluginLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        u0Var.f(context, new rp4.l(editorVideoCompositionPluginLayout, null), this.f398672e, dw3.j0.f244218a.b(), new dw3.l0(null, editorVideoCompositionPluginLayout.M, this.f398673f, null, this.f398674g, 9, null), this.f398675h);
        return jz5.f0.f302826a;
    }
}
