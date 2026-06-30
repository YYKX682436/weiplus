package df;

/* loaded from: classes15.dex */
public final class m0 implements io.flutter.embedding.engine.renderer.FlutterUiDisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f229514b;

    public m0(kotlinx.coroutines.q qVar, io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        this.f229513a = qVar;
        this.f229514b = flutterRenderer;
        ((kotlinx.coroutines.r) qVar).m(new df.k0(flutterRenderer, this));
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiDisplayed() {
        kotlinx.coroutines.q qVar = this.f229513a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
        com.tencent.mm.sdk.platformtools.u3.h(new df.l0(this.f229514b, this));
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiNoLongerDisplayed() {
    }
}
