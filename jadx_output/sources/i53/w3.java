package i53;

/* loaded from: classes12.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final dn.o f288779d;

    public w3(com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI, dn.o oVar) {
        this.f288779d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dn.o oVar = this.f288779d;
        if (oVar != null) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().e(oVar, false);
        }
    }
}
