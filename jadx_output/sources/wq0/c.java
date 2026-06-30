package wq0;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer f448497d;

    public c(com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer) {
        this.f448497d = magicSclViewContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.f448497d;
        fq0.x frameSet = magicSclViewContainer.getFrameSet();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclViewContainer", "need check frameset is bind:" + frameSet);
        if (frameSet != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclViewContainer", frameSet + " bind status is:" + frameSet.e());
            if (frameSet.e()) {
                return;
            }
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            if (iVar != null) {
                iVar.Sc("MagicAdMiniProgramNotExecutedOnLayout", 1, frameSet.toString(), com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneTenth.getValue());
            }
            magicSclViewContainer.requestLayout();
        }
    }
}
