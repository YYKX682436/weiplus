package ov;

/* loaded from: classes8.dex */
public final class a implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov.b f349063d;

    public a(ov.b bVar) {
        this.f349063d = bVar;
    }

    @Override // uh4.i0
    public final void onDataChanged() {
        boolean isTeenMode = ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode();
        ov.b bVar = this.f349063d;
        if (isTeenMode != bVar.f349069g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelFeatureService", "onTeenModeChanged new: " + isTeenMode + ", old: " + bVar.f349069g);
            bVar.f349069g = isTeenMode;
            if (bVar.Bi()) {
                bVar.Ni();
            }
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(null);
        }
    }
}
