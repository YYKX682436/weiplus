package k41;

/* loaded from: classes11.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f304002h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.gk3 f304003i;

    public g1(java.lang.String str, int i17, int i18, java.lang.String str2, k41.g0 g0Var, r45.gk3 gk3Var) {
        this.f303998d = str;
        this.f303999e = i17;
        this.f304000f = i18;
        this.f304001g = str2;
        this.f304002h = g0Var;
        this.f304003i = gk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k41.h1.f304009f.remove(this.f303998d);
        java.util.ArrayList arrayList = (java.util.ArrayList) k41.h1.f304010g.remove(this.f303998d);
        ((ku5.t0) ku5.t0.f312615d).B(new k41.f1(arrayList, this.f303999e, this.f304000f, this.f304001g, this.f304002h, this.f304003i));
    }
}
