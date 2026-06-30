package ph3;

/* loaded from: classes14.dex */
public class h {

    /* renamed from: l, reason: collision with root package name */
    public final int f354397l;

    /* renamed from: a, reason: collision with root package name */
    public long f354386a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f354387b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f354388c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f354389d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f354390e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f354391f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f354392g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f354393h = 10;

    /* renamed from: i, reason: collision with root package name */
    public boolean f354394i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f354395j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f354396k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f354398m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f354399n = false;

    public h(boolean z17, int i17) {
        this.f354397l = i17;
    }

    public int a() {
        return this.f354397l == 1 ? com.tencent.mm.plugin.appbrand.jsapi.g5.CTRL_INDEX : com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX;
    }

    public int b() {
        return this.f354397l == 1 ? 20439 : 13836;
    }

    public java.lang.String c() {
        return hashCode() + "";
    }

    public void d(java.lang.String str) {
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(a(), 153L, 1L, false);
        fVar.d(b(), 501, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), str);
    }

    public void e(java.lang.String str) {
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(a(), 152L, 1L, false);
        fVar.d(b(), 500, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), str);
    }
}
