package m34;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f323370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f323371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m34.s f323372f;

    public q(m34.s sVar, int i17, int i18) {
        this.f323372f = sVar;
        this.f323370d = i17;
        this.f323371e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play time ");
        int i17 = this.f323370d;
        sb6.append(i17);
        sb6.append(" video time ");
        int i18 = this.f323371e;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", sb6.toString());
        m34.s sVar = this.f323372f;
        if (i18 > 0) {
            com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = sVar.f323374d;
            videoPlayView.f162524x = i18;
            if (videoPlayView.f162514n != null && videoPlayView.f162509f) {
                videoPlayView.f162509f = false;
            }
            com.tencent.mm.plugin.sns.ui.iy iyVar = (com.tencent.mm.plugin.sns.ui.iy) videoPlayView.f162511h;
            iyVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayInfo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = iyVar.f169458a;
            if (com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.V6(videoAdPlayerUI) == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                videoAdPlayerUI.f167666q = i18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                r45.jj4 jj4Var = videoAdPlayerUI.f167655J;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                jj4Var.A = i18;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayInfo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
        m34.d dVar = sVar.f323374d.f162514n;
        if (dVar != null) {
            if (dVar.getVideoTotalTime() != i18) {
                sVar.f323374d.f162514n.setVideoTotalTime(i18);
            }
            sVar.f323374d.f162514n.a(i17);
            sVar.f323374d.f162514n.setIsPlay(true);
        }
        if (sVar.f323374d.f162510g.getVisibility() == 0) {
            sVar.f323374d.f162510g.setVisibility(8);
        }
        sVar.f323374d.f162515o = i17;
    }
}
