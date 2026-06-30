package wj;

/* loaded from: classes5.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f446406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f446407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wj.u0 f446408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446409h;

    public g0(java.lang.String str, wj.j0 j0Var, wj.t0 t0Var, wj.u0 u0Var, java.lang.String str2) {
        this.f446405d = str;
        this.f446406e = j0Var;
        this.f446407f = t0Var;
        this.f446408g = u0Var;
        this.f446409h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.advertise.cgi.MagicAdIPCCgiData(yj.h.f462637e, new com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData(this.f446405d), null, 4, null), yj.f.class, new wj.f0(this.f446406e, this.f446407f, this.f446408g, this.f446409h));
    }
}
