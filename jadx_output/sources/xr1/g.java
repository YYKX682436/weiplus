package xr1;

/* loaded from: classes8.dex */
public final class g extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f456193d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ip3 f456194e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456195f;

    /* renamed from: g, reason: collision with root package name */
    public int f456196g = (int) (java.lang.System.currentTimeMillis() / 1000);

    /* renamed from: h, reason: collision with root package name */
    public final xr1.d f456197h = new xr1.d();

    /* renamed from: i, reason: collision with root package name */
    public final xr1.m f456198i = new xr1.m();

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xr1.f(request, this, b17, null), 1, null);
        return b17;
    }
}
