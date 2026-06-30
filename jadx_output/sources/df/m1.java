package df;

/* loaded from: classes7.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f229516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(df.w1 w1Var, java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f229515d = w1Var;
        this.f229516e = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f229515d;
        sb6.append(w1Var.f229580d);
        sb6.append(" attachToActivity platformPlugin:");
        sb6.append(w1Var.B);
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        android.app.Activity activity = (android.app.Activity) this.f229516e.get();
        if (activity == null) {
            ff.e eVar = w1Var.B;
            if (eVar != null) {
                eVar.f261580b.setPlatformMessageHandler(null);
            }
            w1Var.B = null;
        } else {
            ff.e eVar2 = w1Var.B;
            if ((eVar2 == null || !kotlin.jvm.internal.o.b(activity, eVar2.f261579a)) && (flutterEngine = com.tencent.skyline.SkylineLogic.getFlutterEngine(w1Var.f229580d)) != null) {
                w1Var.B = new ff.e(activity, flutterEngine.getPlatformChannel(), new df.l1());
            }
        }
        return jz5.f0.f302826a;
    }
}
