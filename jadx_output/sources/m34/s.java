package m34;

/* loaded from: classes4.dex */
public class s implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323374d;

    public s(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323374d = videoPlayView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323374d;
        videoPlayView.f162507d = i17;
        videoPlayView.f162508e = i18;
        if (videoPlayView.B) {
            videoPlayView.f162519s.post(new m34.r(this));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323374d;
        if (videoPlayView.A) {
            videoPlayView.f162514n.setIsPlay(false);
            videoPlayView.f((int) videoPlayView.f162515o);
            videoPlayView.g();
            m34.a0 a0Var = videoPlayView.f162511h;
            if (a0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayDownloadedPartComplete", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onPlayDownloadedPartComplete");
                com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = ((com.tencent.mm.plugin.sns.ui.iy) a0Var).f169458a;
                com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.U6(videoAdPlayerUI, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView2 = videoAdPlayerUI.f167657e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                videoPlayView2.f162510g.setVisibility(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayDownloadedPartComplete", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                return;
            }
            return;
        }
        videoPlayView.f162515o = 0.0d;
        videoPlayView.b(0.0d);
        videoPlayView.f162514n.setIsPlay(false);
        videoPlayView.f(0);
        videoPlayView.g();
        if (java.lang.System.currentTimeMillis() - videoPlayView.C < 2000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "Too short onCompletion");
            return;
        }
        videoPlayView.C = java.lang.System.currentTimeMillis();
        m34.a0 a0Var2 = videoPlayView.f162511h;
        if (a0Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayCompletion", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onPlayCompletion");
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI2 = ((com.tencent.mm.plugin.sns.ui.iy) a0Var2).f169458a;
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI2).f289121i.f297910b++;
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.U6(videoAdPlayerUI2, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i17 = videoAdPlayerUI2.L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i17 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,2,");
                sb6.append(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.V6(videoAdPlayerUI2));
                sb6.append(",");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str = videoAdPlayerUI2.M;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str);
                sb6.append(",");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str2 = videoAdPlayerUI2.N;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str2);
                sb6.append(",");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.i1());
                sb6.append(",");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str3 = videoAdPlayerUI2.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str3);
                sb6.append(",");
                sb6.append(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.V6(videoAdPlayerUI2));
                com.tencent.mm.modelstat.r rVar = new com.tencent.mm.modelstat.r(13227, sb6.toString(), (int) com.tencent.mm.sdk.platformtools.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f273288b.g(rVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayCompletion", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoPlayView", "on play video error, what %d extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f323374d.f162513m.stop();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        fp.k.b();
        int i17 = com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.H;
        this.f323374d.h(true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        com.tencent.mm.sdk.platformtools.u3.h(new m34.q(this, i17, i18));
        return 0;
    }
}
