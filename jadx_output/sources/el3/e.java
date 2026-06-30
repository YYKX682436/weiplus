package el3;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f253977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f253978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f253979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ el3.h f253980h;

    public e(el3.h hVar, java.lang.String str, long j17, long j18, long j19) {
        this.f253980h = hVar;
        this.f253976d = str;
        this.f253977e = j17;
        this.f253978f = j18;
        this.f253979g = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (el3.h.f253996i) {
            java.lang.String str = "";
            int i17 = 0;
            int i18 = 0;
            for (java.util.Map.Entry entry : el3.h.f253995h.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                i18 += ((java.lang.Integer) entry.getValue()).intValue();
                if (((java.lang.Integer) entry.getValue()).intValue() > i17) {
                    i17 = ((java.lang.Integer) entry.getValue()).intValue();
                    str = str2;
                }
                entry.getValue();
            }
            el3.h.f253995h.clear();
            java.lang.String str3 = "";
            int i19 = 0;
            int i27 = 0;
            for (java.util.Map.Entry entry2 : el3.h.f253996i.entrySet()) {
                java.lang.String str4 = (java.lang.String) entry2.getKey();
                i19 += ((java.lang.Integer) entry2.getValue()).intValue();
                if (((java.lang.Integer) entry2.getValue()).intValue() > i27) {
                    i27 = ((java.lang.Integer) entry2.getValue()).intValue();
                    str3 = str4;
                }
                entry2.getValue();
            }
            el3.h.f253996i.clear();
            el3.h hVar = this.f253980h;
            el3.g gVar = new el3.g(hVar);
            el3.g gVar2 = new el3.g(hVar);
            el3.g gVar3 = new el3.g(hVar);
            el3.h.y(hVar, gVar, el3.h.f253998k);
            el3.h.y(this.f253980h, gVar2, el3.h.f253999l);
            el3.h.y(this.f253980h, gVar3, el3.h.f254000m);
            el3.h.f253998k.clear();
            el3.h.f253999l.clear();
            el3.h.f254000m.clear();
            int i28 = el3.h.f253988a;
            int i29 = el3.h.f253988a;
            int i37 = el3.h.f253988a;
            int i38 = el3.h.f253988a;
            int i39 = el3.h.f253988a;
            int i47 = el3.h.f253988a;
            int i48 = el3.h.f253988a;
            int i49 = el3.h.f253988a;
            int i57 = el3.h.f253988a;
            int i58 = el3.h.f253988a;
            int i59 = el3.h.f253988a;
            int i66 = el3.h.f253988a;
            if (gVar.f253985a > 0 && gVar2.f253985a > 0 && gVar3.f253985a > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15686, this.f253976d, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(gVar.f253985a), java.lang.Long.valueOf(gVar.f253986b), java.lang.Long.valueOf(gVar.f253987c), java.lang.Integer.valueOf(gVar2.f253985a), java.lang.Long.valueOf(gVar2.f253986b), java.lang.Long.valueOf(gVar2.f253987c), java.lang.Integer.valueOf(gVar3.f253985a), java.lang.Long.valueOf(gVar3.f253986b), java.lang.Long.valueOf(gVar3.f253987c), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, java.lang.Integer.valueOf(el3.h.f253989b), java.lang.Integer.valueOf(el3.h.f253990c), java.lang.Integer.valueOf(el3.h.f253988a), java.lang.Integer.valueOf(el3.h.f253993f), java.lang.Integer.valueOf(el3.h.f253994g), java.lang.Long.valueOf(this.f253977e), java.lang.Long.valueOf(this.f253978f), java.lang.Long.valueOf(this.f253979g), java.lang.Integer.valueOf((el3.h.f253991d - el3.h.f253993f) + el3.h.f253990c), java.lang.Integer.valueOf(el3.h.f253992e - el3.h.f253994g));
                this.f253980h.B(el3.h.f253988a, gVar2.f253987c, gVar3.f253987c, gVar.f253987c, el3.h.f253990c + i19, i18, this.f253978f, this.f253979g, (el3.h.f253991d - el3.h.f253993f) + el3.h.f253990c, el3.h.f253992e - el3.h.f253994g);
            }
            el3.h.f253989b = 0;
            el3.h.f253990c = 0;
            el3.h.f253988a = 0;
            el3.h.f253991d = 0;
            el3.h.f253992e = 0;
            el3.h.f253993f = 0;
            el3.h.f253994g = 0;
            el3.h.z(this.f253980h, this.f253976d);
            el3.h.f253997j.clear();
        }
    }
}
