package uy3;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f431968a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f431969b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f431970c;

    /* renamed from: d, reason: collision with root package name */
    public long f431971d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f431972e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f431973f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f431974g;

    public l0(uy3.m0 m0Var) {
    }

    public final void a() {
        if (!this.f431974g && this.f431971d >= 0 && this.f431973f > 0 && this.f431972e > 0) {
            this.f431974g = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20835, java.lang.Integer.valueOf(this.f431968a ? 1 : 0), java.lang.Integer.valueOf(this.f431970c ? 1 : 0), java.lang.Long.valueOf(this.f431971d), java.lang.Long.valueOf(this.f431972e), java.lang.Long.valueOf(this.f431973f), java.lang.Integer.valueOf(this.f431969b ? 1 : 0));
        }
    }
}
