package io.flutter.embedding.engine;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/flutter/embedding/engine/FlutterEngine;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MMFlutterEngineGroup$createAndRunEngineAsync$spawnEngine$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ boolean $automaticallyRegisterPlugins;
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ kotlin.jvm.internal.h0 $dartEntrypoint;
    final /* synthetic */ java.util.List<java.lang.String> $dartEntrypointArgs;
    final /* synthetic */ pi0.m1 $initialRoute;
    final /* synthetic */ io.flutter.embedding.engine.MMFlutterEngineGroup.Options $options;
    final /* synthetic */ io.flutter.embedding.engine.MMFlutterEngineGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup$createAndRunEngineAsync$spawnEngine$1(io.flutter.embedding.engine.MMFlutterEngineGroup mMFlutterEngineGroup, android.content.Context context, kotlin.jvm.internal.h0 h0Var, pi0.m1 m1Var, java.util.List<java.lang.String> list, boolean z17, io.flutter.embedding.engine.MMFlutterEngineGroup.Options options) {
        super(0);
        this.this$0 = mMFlutterEngineGroup;
        this.$context = context;
        this.$dartEntrypoint = h0Var;
        this.$initialRoute = m1Var;
        this.$dartEntrypointArgs = list;
        this.$automaticallyRegisterPlugins = z17;
        this.$options = options;
    }

    @Override // yz5.a
    public final io.flutter.embedding.engine.FlutterEngine invoke() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.this$0.getActiveEngines().get(0);
        kotlin.jvm.internal.o.d(flutterEngine);
        io.flutter.embedding.engine.FlutterEngine flutterEngine2 = flutterEngine;
        android.content.Context context = this.$context;
        io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = (io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint) this.$dartEntrypoint.f310123d;
        pi0.m1 m1Var = this.$initialRoute;
        java.lang.String a17 = m1Var != null ? m1Var.a() : null;
        if (a17 == null) {
            a17 = "";
        }
        return flutterEngine2.spawn(context, dartEntrypoint, a17, this.$dartEntrypointArgs, new io.flutter.plugin.platform.PlatformViewsController(), this.$automaticallyRegisterPlugins, false, this.$options.getShareIsolateMode(), this.$options.getAutoRunEngine());
    }
}
