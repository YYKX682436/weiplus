package vp;

/* loaded from: classes15.dex */
public class j implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.d f438780d;

    public j(vp.d dVar, vp.e eVar) {
        this.f438780d = dVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        vp.d dVar = this.f438780d;
        if (dVar.f438744g && !dVar.f438742e && dVar.f438743f) {
            vp.g0 g0Var = dVar.L;
            if (g0Var.a()) {
                g0Var.f438773a.removeMessages(4);
                g0Var.f438773a.sendEmptyMessage(4);
            }
        }
    }
}
