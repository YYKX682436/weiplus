package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f164133f;

    public d0(com.tencent.mm.plugin.sns.model.m0 m0Var, java.lang.String str, java.lang.String str2) {
        this.f164133f = m0Var;
        this.f164131d = str;
        this.f164132e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.m0 m0Var = this.f164133f;
        java.util.Set set = m0Var.f164448k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (set != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
            java.util.Set set2 = m0Var.f164448k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
            java.util.Iterator it = ((java.util.HashSet) set2).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.model.g0 g0Var = (com.tencent.mm.plugin.sns.model.g0) it.next();
                if (g0Var != null) {
                    com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = (com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI) g0Var;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "isPlaying " + videoAdPlayerUI.f167657e.isPlaying());
                    if (videoAdPlayerUI.f167657e.isPlaying()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    } else {
                        videoAdPlayerUI.f167657e.setLoop(false);
                        java.lang.String f174598m = videoAdPlayerUI.f167657e.getF174598m();
                        java.lang.String str = this.f164132e;
                        boolean equals = str.equals(f174598m);
                        java.lang.String str2 = this.f164131d;
                        if (equals) {
                            com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = videoAdPlayerUI.f167657e;
                            videoPlayView.b(videoPlayView.getLastProgresstime());
                            videoAdPlayerUI.f167657e.h(true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + str2 + " path: " + str);
                        } else {
                            videoAdPlayerUI.f167657e.setVideoPath(str);
                            com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView2 = videoAdPlayerUI.f167657e;
                            videoPlayView2.b(videoPlayView2.getLastProgresstime());
                            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + str2 + " path: " + str);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$4");
    }
}
