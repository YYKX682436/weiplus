package fi5;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f263071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi5.f f263072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f263073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263075h;

    public c(java.lang.String[] strArr, fi5.f fVar, mf3.k kVar, java.lang.String str, java.lang.Runnable runnable) {
        this.f263071d = strArr;
        this.f263072e = fVar;
        this.f263073f = kVar;
        this.f263074g = str;
        this.f263075h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f263071d) {
            ((dk5.s5) tg3.t1.a()).Vi(this.f263072e.getActivity(), str, this.f263073f.g(), 0, "", "", new c01.h7());
            ((dk5.s5) tg3.t1.a()).Ui(this.f263074g, str);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new fi5.b(this.f263075h, this.f263072e));
    }
}
