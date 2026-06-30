package st2;

/* loaded from: classes3.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f412363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412366g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f412367h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f412368i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo f412369m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ st2.j2 f412370n;

    public i2(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo, st2.j2 j2Var) {
        this.f412363d = context;
        this.f412364e = str;
        this.f412365f = str2;
        this.f412366g = str3;
        this.f412367h = i17;
        this.f412368i = z17;
        this.f412369m = customSubjectInfo;
        this.f412370n = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l81.b1 b1Var = new l81.b1();
        boolean z17 = this.f412368i;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = this.f412369m;
        java.lang.String str = this.f412364e;
        b1Var.f317014b = str;
        b1Var.f317022f = this.f412365f;
        b1Var.f317032k = zl2.r4.f473950a.w1() ? 1176 : 1177;
        b1Var.f317034l = this.f412366g;
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, 0, this.f412367h == 0 ? k91.s2.f305760d : k91.s2.f305761e, false, null, false, null, z17 ? k91.t2.f305767e : k91.t2.f305768f, false, z17, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, customSubjectInfo, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -67109510, 2047, null);
        kotlin.jvm.internal.o.d(str);
        st2.j2 j2Var = this.f412370n;
        java.lang.String str2 = j2Var.f412377b;
        android.content.Context context = this.f412363d;
        b1Var.f317037o = new st2.j2(context, str, str2, j2Var.f412378c);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }
}
