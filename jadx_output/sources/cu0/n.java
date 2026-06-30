package cu0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cu0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222327d = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cu0.n(this.f222327d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cu0.n nVar = (cu0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cu0.x xVar = this.f222327d;
        yz5.q qVar = xVar.f222361k;
        if (qVar != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = xVar.f222355e;
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) xVar.g().e().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
            qVar.invoke(audioCacheInfo, java.lang.Boolean.valueOf(e0Var != null ? e0Var.s(3) : false), java.lang.Boolean.valueOf(xVar.f222356f));
        }
        return jz5.f0.f302826a;
    }
}
