package dx1;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx1.c f244482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f244483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f244484f;

    public d(dx1.c cVar, boolean z17, boolean z18) {
        this.f244482d = cVar;
        this.f244483e = z17;
        this.f244484f = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dx1.g.f244489a.c(this.f244482d, this.f244483e, this.f244484f);
    }
}
