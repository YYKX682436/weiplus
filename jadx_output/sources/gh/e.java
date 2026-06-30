package gh;

/* loaded from: classes7.dex */
public final class e implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f271814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gh.g f271815e;

    public e(gh.g gVar) {
        this.f271815e = gVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        this.f271814d = j17;
        gh.g gVar = this.f271815e;
        gVar.f271819i.getClass();
        gVar.f271802e.k(gVar.f271822o, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        gh.g gVar = this.f271815e;
        if (gVar.f271804g) {
            synchronized (gVar.f271803f) {
                android.view.Choreographer choreographer = gVar.f271821n;
                if (choreographer != null) {
                    choreographer.postFrameCallback(gVar.f271822o);
                }
            }
            this.f271815e.c(this.f271814d / 1000000.0d);
        }
    }
}
