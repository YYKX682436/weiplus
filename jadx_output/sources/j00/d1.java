package j00;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f296745g;

    public d1(j00.k1 k1Var, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f296742d = k1Var;
        this.f296743e = str;
        this.f296744f = str2;
        this.f296745g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f296742d.ij(this.f296743e, this.f296744f, this.f296745g, null);
    }
}
