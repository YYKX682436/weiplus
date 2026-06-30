package wc1;

/* loaded from: classes7.dex */
public final class g implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wc1.b f444474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f444475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f444476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f444477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444478e;

    public g(wc1.b bVar, boolean[] zArr, com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        this.f444474a = bVar;
        this.f444475b = zArr;
        this.f444476c = yVar;
        this.f444477d = i17;
        this.f444478e = str;
    }

    @Override // ph1.d
    public final void a(ph1.g gVar) {
        int i17 = gVar == null ? -1 : wc1.f.f444473a[gVar.ordinal()];
        java.lang.String str = this.f444478e;
        int i18 = this.f444477d;
        com.tencent.mm.plugin.appbrand.y yVar = this.f444476c;
        wc1.b bVar = this.f444474a;
        if (i17 == 1) {
            bVar.execute(new wc1.c(yVar, i18, str));
            return;
        }
        if (i17 == 2 || i17 == 3) {
            this.f444475b[0] = true;
            bVar.execute(new wc1.d(yVar, i18, str));
        } else {
            if (i17 != 4) {
                return;
            }
            bVar.execute(new wc1.e(yVar, i18, str));
        }
    }
}
