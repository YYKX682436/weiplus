package ij4;

/* loaded from: classes11.dex */
public final class o extends ym3.a {

    /* renamed from: i, reason: collision with root package name */
    public static final ij4.m f291742i = new ij4.m(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f291743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f291744e;

    /* renamed from: f, reason: collision with root package name */
    public final long f291745f;

    /* renamed from: g, reason: collision with root package name */
    public final int f291746g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f291747h;

    public o(android.content.Context context, java.lang.String str, int i17, long j17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f291743d = context;
        this.f291744e = i17;
        this.f291745f = j17;
        this.f291746g = i18;
        this.f291747h = z17;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.flow.i2 a17 = kotlinx.coroutines.flow.r2.a(1, 0, u26.u.DROP_OLDEST);
        v65.i.b(scope, null, new ij4.n(request, this, a17, null), 1, null);
        return a17;
    }
}
