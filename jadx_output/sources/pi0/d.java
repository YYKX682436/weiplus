package pi0;

/* loaded from: classes11.dex */
public final class d implements io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.FlutterEngine f354543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pi0.u f354545c;

    public d(io.flutter.embedding.engine.FlutterEngine flutterEngine, pi0.q qVar, pi0.u uVar) {
        this.f354543a = flutterEngine;
        this.f354544b = qVar;
        this.f354545c = uVar;
    }

    @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
    public void onEngineWillDestroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy engine ");
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f354543a;
        sb6.append(flutterEngine);
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", sb6.toString());
        pi0.q qVar = this.f354544b;
        qVar.f354703g.remove(this.f354545c);
        qVar.f(flutterEngine);
    }

    @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
    public void onPreEngineRestart() {
    }
}
