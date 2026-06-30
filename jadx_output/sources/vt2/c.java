package vt2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f439940a;

    /* renamed from: b, reason: collision with root package name */
    public final long f439941b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f439942c;

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f439943d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f439944e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f439945f;

    public c(int i17, long j17, android.content.Context context, gk2.e buContext, yz5.a refresher) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(refresher, "refresher");
        this.f439940a = i17;
        this.f439941b = j17;
        this.f439942c = context;
        this.f439943d = buContext;
        this.f439944e = refresher;
        this.f439945f = "Finder.FinderLiveProductOpenPriceRequestPresenter";
    }

    public final boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type ");
        int i17 = this.f439940a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(this.f439945f, sb6.toString());
        if (i17 != 3) {
            return false;
        }
        r45.ld2 ld2Var = new r45.ld2();
        gk2.e eVar = this.f439943d;
        ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        ld2Var.set(0, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
        ld2Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
        kotlinx.coroutines.l.d(eVar.f272475i, null, null, new vt2.b("/cgi-bin/mmbiz-bin/finderliveaskforopenpriceproduct", 7401, ld2Var, this, null), 3, null);
        return true;
    }
}
