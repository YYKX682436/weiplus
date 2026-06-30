package vy5;

/* loaded from: classes11.dex */
public final class f implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f441524d;

    /* renamed from: e, reason: collision with root package name */
    public final vy5.a f441525e;

    public f(vy5.a connectivity, kotlinx.coroutines.y0 coroutineScope) {
        kotlin.jvm.internal.o.g(connectivity, "connectivity");
        kotlin.jvm.internal.o.g(coroutineScope, "coroutineScope");
        this.f441524d = coroutineScope;
        this.f441525e = connectivity;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        kotlinx.coroutines.y0 y0Var = this.f441524d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new vy5.e(call, result, this, null), 2, null);
    }
}
