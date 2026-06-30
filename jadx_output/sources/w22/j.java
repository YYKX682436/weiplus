package w22;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f442559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f442560e;

    public j(yz5.l lVar, boolean z17) {
        this.f442559d = lVar;
        this.f442560e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f442559d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(this.f442560e));
        }
    }
}
