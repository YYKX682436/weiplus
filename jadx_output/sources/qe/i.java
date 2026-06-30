package qe;

/* loaded from: classes7.dex */
public final class i implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.f0 f361959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.m f361960e;

    public i(com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var, qe.m mVar) {
        this.f361959d = f0Var;
        this.f361960e = mVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            this.f361959d.k(new qe.h(this.f361960e), true);
        }
    }
}
