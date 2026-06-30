package w22;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.g f442526d;

    public c(w22.g gVar) {
        this.f442526d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "voice finish called force");
        w22.g gVar = this.f442526d;
        if (!gVar.f442537h) {
            ((y22.m) gVar.f442532c).e(gVar.f442538i);
        }
        gVar.f442537h = true;
    }
}
