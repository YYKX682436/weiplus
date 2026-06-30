package df;

/* loaded from: classes15.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f229503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.m0 f229504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, df.m0 m0Var) {
        super(1);
        this.f229503d = flutterRenderer;
        this.f229504e = m0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f229503d.removeIsDisplayingFlutterUiListener(this.f229504e);
        return jz5.f0.f302826a;
    }
}
