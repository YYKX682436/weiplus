package ng1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f336914c = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(ng1.c.class, "qualitySession", "getQualitySession()Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final pg1.a f336915a = new pg1.a("qualitySession", false, new ng1.b(this));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f336916b = new java.util.LinkedList();

    public void a(jx3.a struct) {
        boolean z17;
        kotlin.jvm.internal.o.g(struct, "struct");
        pg1.a aVar = this.f336915a;
        synchronized (aVar) {
            z17 = aVar.f354079d != null;
        }
        if (z17) {
            struct.k();
        } else {
            synchronized (this.f336916b) {
                this.f336916b.add(struct);
            }
        }
    }
}
