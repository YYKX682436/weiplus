package io.flutter.embedding.engine;

@qz5.f(c = "io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2", f = "MMFlutterEngineGroup.kt", l = {}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MMFlutterEngineGroup$createAndRunEngineAsync$2 extends qz5.l implements yz5.p {
    final /* synthetic */ kotlin.jvm.internal.h0 $dartEntrypoint;
    final /* synthetic */ java.util.List<java.lang.String> $dartEntrypointArgs;
    final /* synthetic */ kotlin.jvm.internal.h0 $engine;
    final /* synthetic */ pi0.m1 $initialRoute;
    final /* synthetic */ pi0.u0 $mmEngine;
    final /* synthetic */ io.flutter.embedding.engine.MMFlutterEngineGroup.Options $options;
    int label;
    final /* synthetic */ io.flutter.embedding.engine.MMFlutterEngineGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup$createAndRunEngineAsync$2(kotlin.jvm.internal.h0 h0Var, io.flutter.embedding.engine.MMFlutterEngineGroup mMFlutterEngineGroup, io.flutter.embedding.engine.MMFlutterEngineGroup.Options options, pi0.u0 u0Var, pi0.m1 m1Var, java.util.List<java.lang.String> list, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation<? super io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2> continuation) {
        super(2, continuation);
        this.$engine = h0Var;
        this.this$0 = mMFlutterEngineGroup;
        this.$options = options;
        this.$mmEngine = u0Var;
        this.$initialRoute = m1Var;
        this.$dartEntrypointArgs = list;
        this.$dartEntrypoint = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2(this.$engine, this.this$0, this.$options, this.$mmEngine, this.$initialRoute, this.$dartEntrypointArgs, this.$dartEntrypoint, continuation);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        pz5.a aVar = pz5.a.f359186d;
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.flutter.embedding.engine.FlutterEngine flutterEngine = (io.flutter.embedding.engine.FlutterEngine) this.$engine.f310123d;
        if (flutterEngine != null) {
            flutterEngine.recordStartupTiming("mm_engine_created_launched");
        }
        str = this.this$0.TAG;
        io.flutter.Log.i(str, "start GeneratedPluginRegister");
        java.lang.Object obj2 = this.$engine.f310123d;
        kotlin.jvm.internal.o.d(obj2);
        io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister.registerGeneratedPlugins((io.flutter.embedding.engine.FlutterEngine) obj2);
        str2 = this.this$0.TAG;
        io.flutter.Log.i(str2, "do start engineSetup");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yz5.l engineSetup = this.$options.getEngineSetup();
        if (engineSetup != null) {
            engineSetup.invoke(this.$mmEngine);
        }
        str3 = this.this$0.TAG;
        io.flutter.Log.i(str3, "engineSetup cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        pi0.m1 m1Var = this.$initialRoute;
        if (m1Var != null) {
            java.util.List<java.lang.String> list = this.$dartEntrypointArgs;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                if (m1Var.f354671g != null) {
                    jSONObject.put("initParams", new org.json.JSONObject(m1Var.f354671g));
                }
            } catch (org.json.JSONException unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "getEmojiParams(...)");
            list.add(jSONObject2);
            this.$initialRoute.f354668d = this.$mmEngine.f354730a;
            str6 = this.this$0.TAG;
            io.flutter.Log.i(str6, "start setInitialRoute");
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            str7 = this.this$0.TAG;
            io.flutter.Log.i(str7, "do start setInitialRoute");
            java.lang.Object obj3 = this.$engine.f310123d;
            kotlin.jvm.internal.o.d(obj3);
            ((io.flutter.embedding.engine.FlutterEngine) obj3).getNavigationChannel().setInitialRoute(this.$initialRoute.a());
            str8 = this.this$0.TAG;
            io.flutter.Log.i(str8, "setInitialRoute cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        str4 = this.this$0.TAG;
        io.flutter.Log.i(str4, "do start executeDartEntrypoint");
        io.flutter.embedding.engine.FlutterEngine flutterEngine2 = (io.flutter.embedding.engine.FlutterEngine) this.$engine.f310123d;
        if (flutterEngine2 != null) {
            flutterEngine2.recordStartupTiming("mm_engine_created_execute");
        }
        java.lang.Object obj4 = this.$engine.f310123d;
        kotlin.jvm.internal.o.d(obj4);
        ((io.flutter.embedding.engine.FlutterEngine) obj4).getDartExecutor().executeDartEntrypoint((io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint) this.$dartEntrypoint.f310123d, kz5.n0.S0(this.$dartEntrypointArgs));
        io.flutter.embedding.engine.FlutterEngine flutterEngine3 = (io.flutter.embedding.engine.FlutterEngine) this.$engine.f310123d;
        if (flutterEngine3 != null) {
            flutterEngine3.recordStartupTiming("mm_engine_created_execute_down");
        }
        str5 = this.this$0.TAG;
        io.flutter.Log.i(str5, "executeDartEntrypoint cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis3));
        return jz5.f0.f302826a;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
