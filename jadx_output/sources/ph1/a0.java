package ph1;

/* loaded from: classes7.dex */
public class a0 implements ph1.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f354306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f354307b;

    public a0(ph1.g0 g0Var) {
        this.f354307b = g0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(g0Var.hashCode());
        sb6.append("@");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        this.f354306a = sb6.toString();
    }

    @Override // ph1.b
    public void a(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17) {
        this.f354307b.m(str, dVar, cVar, z17, this.f354306a);
    }

    @Override // ph1.b
    public void commit() {
        ph1.q.f354348a.a(this.f354306a);
    }
}
