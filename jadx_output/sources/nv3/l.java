package nv3;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340687a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f340688b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f340689c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f340690d;

    public l(java.lang.String moduleName, java.lang.String pageName) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        kotlin.jvm.internal.o.g(pageName, "pageName");
        this.f340687a = moduleName;
        this.f340688b = pageName;
        this.f340689c = "MusicLoadingTimeHelper";
        this.f340690d = new java.util.LinkedHashSet();
    }

    public final void a(long j17) {
        java.util.Set set = this.f340690d;
        if (set.contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i(this.f340689c, "[markEndLoading] recorded");
            return;
        }
        set.add(java.lang.Long.valueOf(j17));
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((qs2.q) ((w40.e) c17)).rj(this.f340687a, this.f340688b, pm0.v.u(j17), -1);
    }

    public final void b(long j17) {
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e.eh((w40.e) c17, this.f340687a, this.f340688b, pm0.v.u(j17), 0, 8, null);
    }
}
