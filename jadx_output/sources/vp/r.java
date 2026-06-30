package vp;

/* loaded from: classes15.dex */
public class r implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.k f438825d;

    public r(vp.k kVar, vp.l lVar) {
        this.f438825d = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        vp.k kVar = this.f438825d;
        if (kVar.f438790f && !kVar.f438788d && kVar.f438789e) {
            vp.j0 j0Var = kVar.K;
            if (j0Var.a()) {
                j0Var.f438781a.removeMessages(4);
                j0Var.f438781a.sendEmptyMessage(4);
            }
        }
    }
}
