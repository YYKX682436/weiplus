package wj;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f446386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f446387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wj.r0 f446389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xj.l f446390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f446391i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446393n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446394o;

    public d0(android.content.Context context, android.content.Intent intent, java.lang.String str, wj.r0 r0Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, xj.l lVar, wj.j0 j0Var) {
        this.f446386d = context;
        this.f446387e = intent;
        this.f446388f = str;
        this.f446389g = r0Var;
        this.f446393n = str2;
        this.f446394o = str3;
        this.f446392m = str4;
        this.f446390h = lVar;
        this.f446391i = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context = this.f446386d;
        android.content.Intent intent = this.f446387e;
        java.lang.String str = this.f446388f;
        int i17 = this.f446389g.f446502d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490358sq);
        java.lang.String str2 = this.f446393n;
        java.lang.String str3 = this.f446394o;
        java.lang.String str4 = this.f446392m;
        xj.l lVar = this.f446390h;
        ((kt.c) i0Var).hj(context, intent, str, i17, string, new wj.b0(str2, str3, str4, lVar, this.f446391i), new wj.c0(lVar));
    }
}
