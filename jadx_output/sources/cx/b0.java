package cx;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f224377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(cx.f0 f0Var, java.lang.String str) {
        super(0);
        this.f224377d = f0Var;
        this.f224378e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cx.f0 f0Var = this.f224377d;
        f0Var.Di(10);
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "brandServiceAdInfo");
        gVar.h("frameSetName", this.f224378e);
        gVar.p(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis());
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        cx.w0 w0Var = f0Var.f224422e;
        if (w0Var != null) {
            w0Var.G1(new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent().f147881d, gVar2);
        }
        return jz5.f0.f302826a;
    }
}
