package zh5;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f473065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.v f473066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f473067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f473069h;

    public s(java.lang.String[] strArr, zh5.v vVar, mf3.k kVar, java.lang.String str, java.lang.Runnable runnable) {
        this.f473065d = strArr;
        this.f473066e = vVar;
        this.f473067f = kVar;
        this.f473068g = str;
        this.f473069h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f473065d) {
            ((dk5.s5) tg3.t1.a()).Vi(this.f473066e.getActivity(), str, this.f473067f.g(), 0, "", "", new c01.h7());
            ((dk5.s5) tg3.t1.a()).Ui(this.f473068g, str);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new zh5.r(this.f473069h, this.f473066e));
    }
}
