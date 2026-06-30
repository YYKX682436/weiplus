package r36;

/* loaded from: classes16.dex */
public class o extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x36.k f369446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f369447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r36.z f369448h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, x36.k kVar, int i18, boolean z17) {
        super(str, objArr);
        this.f369448h = zVar;
        this.f369445e = i17;
        this.f369446f = kVar;
        this.f369447g = i18;
    }

    @Override // m36.b
    public void a() {
        try {
            r36.l0 l0Var = this.f369448h.f369480p;
            x36.k kVar = this.f369446f;
            int i17 = this.f369447g;
            ((r36.k0) l0Var).getClass();
            kVar.skip(i17);
            this.f369448h.A.k(this.f369445e, r36.b.CANCEL);
            synchronized (this.f369448h) {
                this.f369448h.C.remove(java.lang.Integer.valueOf(this.f369445e));
            }
        } catch (java.io.IOException unused) {
        }
    }
}
