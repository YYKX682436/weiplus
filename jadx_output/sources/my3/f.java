package my3;

/* loaded from: classes13.dex */
public final class f implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332801d;

    public f(my3.q qVar) {
        this.f332801d = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        fy3.i iVar = fy3.i.f267246e;
        my3.q qVar = this.f332801d;
        qVar.Ri(iVar);
        fy3.f fVar = qVar.f332833s;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onRtosClose");
            int i17 = com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.E;
            com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = ((oy3.t) fVar).f350044a;
            rtosWatchLoginUI.D.postUI(new oy3.j(rtosWatchLoginUI));
            rtosWatchLoginUI.finish();
        }
    }
}
