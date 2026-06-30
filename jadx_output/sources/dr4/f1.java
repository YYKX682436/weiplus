package dr4;

/* loaded from: classes14.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242631d;

    public f1(dr4.p1 p1Var) {
        this.f242631d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.p1 p1Var = this.f242631d;
        p1Var.f242711j = true;
        yz5.a aVar = p1Var.f242710i;
        if (aVar != null) {
            aVar.invoke();
        }
        new com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent(1).e();
    }
}
