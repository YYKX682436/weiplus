package rx4;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.util.List list) {
        super(1);
        this.f401225d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f401225d.add(kz5.c1.k(new jz5.l("query", it.optString("hotword")), new jz5.l(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000))));
        return jz5.f0.f302826a;
    }
}
