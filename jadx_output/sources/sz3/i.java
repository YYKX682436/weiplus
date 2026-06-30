package sz3;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.l f414027e;

    public i(sz3.m mVar, xz3.l lVar) {
        this.f414026d = mVar;
        this.f414027e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414026d;
        java.util.ArrayList arrayList = mVar.f414069e;
        kotlin.jvm.internal.m0.a(arrayList).remove(this.f414027e);
        sz3.m.l(mVar);
    }
}
