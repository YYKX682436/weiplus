package io.flutter.embedding.engine;

@qz5.f(c = "io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$5", f = "MMFlutterEngineGroup.kt", l = {}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MMFlutterEngineGroup$createAndRunEngineAsync$5 extends qz5.l implements yz5.p {
    final /* synthetic */ kotlin.jvm.internal.h0 $dartEntrypoint;
    final /* synthetic */ java.util.List<java.lang.String> $dartEntrypointArgs;
    final /* synthetic */ kotlin.jvm.internal.h0 $engine;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup$createAndRunEngineAsync$5(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$5> continuation) {
        super(2, continuation);
        this.$engine = h0Var;
        this.$dartEntrypoint = h0Var2;
        this.$dartEntrypointArgs = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$5(this.$engine, this.$dartEntrypoint, this.$dartEntrypointArgs, continuation);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((io.flutter.embedding.engine.FlutterEngine) this.$engine.f310123d).recordStartupTiming("mm_spawn_execute_dart_entrypoint");
        ((io.flutter.embedding.engine.FlutterEngine) this.$engine.f310123d).getDartExecutor().executeDartEntrypointForce((io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint) this.$dartEntrypoint.f310123d, kz5.n0.S0(this.$dartEntrypointArgs));
        return jz5.f0.f302826a;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$5) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
