package pi0;

/* loaded from: classes11.dex */
public final class l implements io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f354641b;

    public l(pi0.q qVar, pi0.u0 u0Var) {
        this.f354640a = qVar;
        this.f354641b = u0Var;
    }

    @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
    public void onEngineWillDestroy() {
        pi0.q qVar = this.f354640a;
        qVar.f354702f.remove(this.f354641b);
        qVar.getClass();
    }

    @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
    public void onPreEngineRestart() {
    }
}
