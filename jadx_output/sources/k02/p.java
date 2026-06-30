package k02;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.w1 f303090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c02.m f303091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303093h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f303094i;

    public p(android.content.Context context, vz.w1 w1Var, c02.m mVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f303089d = context;
        this.f303090e = w1Var;
        this.f303091f = mVar;
        this.f303092g = str;
        this.f303093h = str2;
        this.f303094i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f303089d;
        vz.w1 w1Var = this.f303090e;
        c02.e app_info = this.f303091f.f37608f;
        kotlin.jvm.internal.o.f(app_info, "app_info");
        k02.s.a(context, w1Var, app_info, this.f303092g, null, this.f303093h, this.f303094i);
    }
}
