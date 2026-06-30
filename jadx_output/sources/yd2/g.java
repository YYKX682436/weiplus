package yd2;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f461065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd2.j f461066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xg2.h hVar, kotlin.coroutines.Continuation continuation, yd2.j jVar) {
        super(2, continuation);
        this.f461065d = hVar;
        this.f461066e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yd2.g(this.f461065d, continuation, this.f461066e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yd2.g gVar = (yd2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yd2.j.a(this.f461066e);
        com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolManager", "reportToolResults: failed");
        return jz5.f0.f302826a;
    }
}
