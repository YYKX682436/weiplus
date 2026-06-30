package zf0;

/* loaded from: classes12.dex */
public final class l implements zf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf0.j1 f472465b;

    public l(zf0.v0 v0Var, vf0.j1 j1Var) {
        this.f472464a = v0Var;
        this.f472465b = j1Var;
    }

    @Override // zf0.a
    public boolean a(int i17) {
        java.lang.Integer d17 = this.f472464a.d(false);
        if (d17 == null) {
            return false;
        }
        d17.intValue();
        this.f472465b.f436198b.put("e_gen_compress_video_failed", "cancel");
        return true;
    }
}
