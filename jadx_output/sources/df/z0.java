package df;

/* loaded from: classes7.dex */
public final class z0 implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.FlutterEngine f229625d;

    public z0(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        this.f229625d = flutterEngine;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).h(runnable, java.lang.String.valueOf(this.f229625d.hashCode()));
        com.tencent.mm.sdk.platformtools.Log.c("SkylineManager", "post background task:" + runnable.hashCode(), new java.lang.Object[0]);
    }
}
