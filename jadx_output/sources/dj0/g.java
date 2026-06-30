package dj0;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0.i f232826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f232827e;

    public g(dj0.i iVar, float f17) {
        this.f232826d = iVar;
        this.f232827e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dj0.z zVar = this.f232826d.f232836n;
        if (zVar != null) {
            zVar.a(this.f232827e);
        }
    }
}
