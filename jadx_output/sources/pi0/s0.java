package pi0;

/* loaded from: classes11.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.FlutterEngine f354725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(io.flutter.embedding.engine.FlutterEngine flutterEngine, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354725d = flutterEngine;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.s0(this.f354725d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pi0.s0 s0Var = (pi0.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f354725d.beforeDestroyInAnyThread();
        return jz5.f0.f302826a;
    }
}
