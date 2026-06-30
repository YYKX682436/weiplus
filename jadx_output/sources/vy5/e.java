package vy5;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodCall f441521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f441522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vy5.f f441523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result, vy5.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441521d = methodCall;
        this.f441522e = result;
        this.f441523f = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vy5.e(this.f441521d, this.f441522e, this.f441523f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vy5.e eVar = (vy5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean b17 = kotlin.jvm.internal.o.b("check", this.f441521d.method);
        io.flutter.plugin.common.MethodChannel.Result result = this.f441522e;
        if (b17) {
            result.success(this.f441523f.f441525e.b());
        } else {
            result.notImplemented();
        }
        return jz5.f0.f302826a;
    }
}
