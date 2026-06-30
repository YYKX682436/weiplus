package k02;

/* loaded from: classes8.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.w1 f303084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c02.m f303085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303087h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f303088i;

    public o(android.content.Context context, vz.w1 w1Var, c02.m mVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f303083d = context;
        this.f303084e = w1Var;
        this.f303085f = mVar;
        this.f303086g = str;
        this.f303087h = str2;
        this.f303088i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f303083d;
        vz.w1 w1Var = this.f303084e;
        c02.m mVar = this.f303085f;
        c02.e app_info = mVar.f37608f;
        kotlin.jvm.internal.o.f(app_info, "app_info");
        k02.s.a(context, w1Var, app_info, this.f303086g, mVar.f37607e, this.f303087h, this.f303088i);
    }
}
