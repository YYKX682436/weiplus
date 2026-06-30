package wm2;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm2.n f447249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f447250e;

    public m(wm2.n nVar, boolean z17) {
        this.f447249d = nVar;
        this.f447250e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm2.n nVar = this.f447249d;
        nVar.c();
        yz5.l lVar = nVar.f447259i;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(this.f447250e));
        }
    }
}
