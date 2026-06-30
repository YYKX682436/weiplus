package zr2;

/* loaded from: classes2.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr2.k f475185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f475186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475188g;

    public g(zr2.k kVar, java.util.LinkedList linkedList, int i17, int i18) {
        this.f475185d = kVar;
        this.f475186e = linkedList;
        this.f475187f = i17;
        this.f475188g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zr2.k.a(this.f475185d, this.f475186e, this.f475187f, this.f475188g);
    }
}
