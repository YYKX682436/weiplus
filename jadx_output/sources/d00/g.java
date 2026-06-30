package d00;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d00.d f225258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d00.d f225259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d00.d f225260f;

    public g(d00.d dVar, d00.d dVar2, d00.d dVar3) {
        this.f225258d = dVar;
        this.f225259e = dVar2;
        this.f225260f = dVar3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object a17 = this.f225259e.a(this.f225258d.a(jz5.f0.f302826a));
        ((ku5.t0) ku5.t0.f312615d).B(new d00.f(this.f225260f, a17));
    }
}
