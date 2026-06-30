package pl4;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f356711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f356712e;

    public h(pl4.k kVar, boolean z17) {
        this.f356711d = kVar;
        this.f356712e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f356711d.f(this.f356712e, false);
    }
}
