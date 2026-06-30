package dj0;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0.i f232824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f232825e;

    public f(dj0.i iVar, float f17) {
        this.f232824d = iVar;
        this.f232825e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dj0.z zVar = this.f232824d.f232836n;
        if (zVar != null) {
            zVar.a(this.f232825e);
        }
    }
}
