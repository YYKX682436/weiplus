package el3;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f253967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f253968g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f253969h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f253970i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253971m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f253972n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f253973o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f253974p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ el3.h f253975q;

    public d(el3.h hVar, java.lang.String str, java.lang.String str2, long j17, long j18, long j19, boolean z17, java.lang.String str3, long j27, long j28, long j29) {
        this.f253975q = hVar;
        this.f253965d = str;
        this.f253966e = str2;
        this.f253967f = j17;
        this.f253968g = j18;
        this.f253969h = j19;
        this.f253970i = z17;
        this.f253971m = str3;
        this.f253972n = j27;
        this.f253973o = j28;
        this.f253974p = j29;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f253965d + "-" + com.tencent.mm.sdk.platformtools.w2.a(this.f253966e);
        synchronized (el3.h.f253996i) {
            if (el3.h.f253996i.containsKey(str)) {
                el3.h.A(this.f253975q, el3.h.f253998k, str, this.f253967f);
                el3.h.A(this.f253975q, el3.h.f253999l, str, this.f253968g);
                el3.h.A(this.f253975q, el3.h.f254000m, str, this.f253969h);
                int intValue = ((java.lang.Integer) el3.h.f253996i.get(str)).intValue() - 1;
                if (intValue > 0) {
                    el3.h.f253996i.put(str, java.lang.Integer.valueOf(intValue));
                } else {
                    el3.h.f253996i.remove(str);
                }
                if (this.f253970i) {
                    el3.h.f253993f++;
                } else {
                    el3.h.f253988a = 1;
                    el3.h.f253994g++;
                }
            }
            if (el3.h.f253995h.containsKey(str)) {
                int intValue2 = ((java.lang.Integer) el3.h.f253995h.get(str)).intValue() - 1;
                if (intValue2 > 0) {
                    el3.h.f253995h.put(str, java.lang.Integer.valueOf(intValue2));
                } else {
                    el3.h.f253995h.remove(str);
                }
            }
            if (!this.f253970i && !android.text.TextUtils.isEmpty(this.f253971m)) {
                if (el3.h.f253997j.containsKey(this.f253971m)) {
                    el3.f fVar = (el3.f) el3.h.f253997j.get(this.f253971m);
                    if (fVar != null) {
                        fVar.f253981a++;
                    }
                    fVar.f253984d = this.f253972n;
                    fVar.f253983c = this.f253973o;
                    fVar.f253982b = this.f253974p;
                    el3.h.f253997j.put(this.f253971m, fVar);
                } else {
                    el3.f fVar2 = new el3.f(this.f253975q);
                    fVar2.f253981a = 1;
                    fVar2.f253984d = this.f253972n;
                    fVar2.f253983c = this.f253973o;
                    fVar2.f253982b = this.f253974p;
                    el3.h.f253997j.put(this.f253971m, fVar2);
                }
            }
        }
    }
}
