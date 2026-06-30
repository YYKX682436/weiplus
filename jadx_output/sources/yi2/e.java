package yi2;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.f f462507d;

    public e(yi2.f fVar) {
        this.f462507d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yi2.f fVar = this.f462507d;
        fVar.B.animate().alpha(0.0f).setDuration(500L).setListener(new yi2.d(fVar)).start();
    }
}
