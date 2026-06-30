package r36;

/* loaded from: classes16.dex */
public final class u extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f369459e;

    /* renamed from: f, reason: collision with root package name */
    public final int f369460f;

    /* renamed from: g, reason: collision with root package name */
    public final int f369461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r36.z f369462h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r36.z zVar, boolean z17, int i17, int i18) {
        super("OkHttp %s ping %08x%08x", zVar.f369474g, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f369462h = zVar;
        this.f369459e = z17;
        this.f369460f = i17;
        this.f369461g = i18;
    }

    @Override // m36.b
    public void a() {
        int i17 = this.f369460f;
        int i18 = this.f369461g;
        boolean z17 = this.f369459e;
        r36.z zVar = this.f369462h;
        zVar.getClass();
        try {
            zVar.A.j(z17, i17, i18);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
