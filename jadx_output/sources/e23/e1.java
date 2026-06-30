package e23;

/* loaded from: classes12.dex */
public class e1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f246830q;

    /* renamed from: r, reason: collision with root package name */
    public long f246831r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f246832s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f246833t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f246834u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f246835v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f246836w;

    /* renamed from: x, reason: collision with root package name */
    public final e23.c1 f246837x;

    /* renamed from: y, reason: collision with root package name */
    public final e23.d1 f246838y;

    public e1(int i17) {
        super(16, i17);
        this.f246837x = new e23.c1(this, this.f423765h);
        this.f246838y = new e23.d1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String g27;
        e23.d1 d1Var = (e23.d1) eVar;
        p13.y yVar = this.f246830q;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(yVar.f351187e, yVar.f351186d);
        tt0.c a17 = tt0.c.a(Li.j());
        this.f246831r = Li.getMsgId();
        this.f246832s = a17.f421787b;
        if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(this.f246832s)) {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(this.f246832s);
            g27 = Bi == null ? this.f246832s : Bi.field_nickname;
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f246832s, true);
            g27 = n17 == null ? this.f246832s : n17.g2();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = d1Var.f246819c.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f246833t = com.tencent.mm.pluginsdk.ui.span.c0.n(context, g27, textSize);
        this.f246834u = a17.f421788c;
        this.f246835v = k35.m1.f(context, this.f246830q.f351188f, true, false);
        this.f246836w = a17.f421794i;
    }

    @Override // u13.g
    public int j() {
        return this.f246830q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246837x;
    }
}
