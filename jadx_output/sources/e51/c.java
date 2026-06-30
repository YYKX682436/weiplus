package e51;

/* loaded from: classes10.dex */
public final class c implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e51.d f249570d;

    public c(e51.d dVar) {
        this.f249570d = dVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        e51.b bVar;
        e51.d dVar = this.f249570d;
        dVar.getClass();
        long j18 = j17 / 1000000;
        java.lang.ref.WeakReference weakReference = dVar.f249571a;
        if (weakReference != null && (bVar = (e51.b) weakReference.get()) != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.obj = java.lang.Long.valueOf(j18);
            ((e51.e) bVar).sendMessage(obtain);
        }
        if (dVar.f249574d) {
            dVar.f249572b.postFrameCallback(dVar.f249573c);
        }
    }
}
