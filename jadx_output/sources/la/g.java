package la;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public float f317452a;

    /* renamed from: b, reason: collision with root package name */
    public float f317453b;

    /* renamed from: c, reason: collision with root package name */
    public float f317454c;

    /* renamed from: d, reason: collision with root package name */
    public float f317455d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f317456e;

    public g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f317456e = arrayList;
        this.f317452a = 0.0f;
        this.f317453b = 0.0f;
        this.f317454c = 0.0f;
        this.f317455d = 0.0f;
        arrayList.clear();
    }

    public void a(float f17, float f18, float f19, float f27, float f28, float f29) {
        la.d dVar = new la.d(f17, f18, f19, f27);
        dVar.f317447f = f28;
        dVar.f317448g = f29;
        ((java.util.ArrayList) this.f317456e).add(dVar);
        double d17 = f28 + f29;
        this.f317454c = ((f17 + f19) * 0.5f) + (((f19 - f17) / 2.0f) * ((float) java.lang.Math.cos(java.lang.Math.toRadians(d17))));
        this.f317455d = ((f18 + f27) * 0.5f) + (((f27 - f18) / 2.0f) * ((float) java.lang.Math.sin(java.lang.Math.toRadians(d17))));
    }

    public void b(float f17, float f18) {
        la.e eVar = new la.e();
        eVar.f317449b = f17;
        eVar.f317450c = f18;
        ((java.util.ArrayList) this.f317456e).add(eVar);
        this.f317454c = f17;
        this.f317455d = f18;
    }
}
