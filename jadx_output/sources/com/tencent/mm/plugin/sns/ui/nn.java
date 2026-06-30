package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nn implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.on f170019a;

    public nn(com.tencent.mm.plugin.sns.ui.on onVar) {
        this.f170019a = onVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
        com.tencent.mm.plugin.sns.ui.on onVar = this.f170019a;
        if (!com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(onVar.f170114d).B1) {
            final com.tencent.mm.plugin.sns.ui.OnlineVideoView T6 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(onVar.f170114d);
            T6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFrameViewOnceRendered", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = T6.B;
            if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var;
                yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        int i17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f166427j2;
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                        onlineVideoView.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$hideFrameViewOnceRendered$0", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.F.setImageBitmap(null);
                        onlineVideoView.F.setVisibility(8);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$hideFrameViewOnceRendered$0", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        return null;
                    }
                };
                thumbPlayerVideoView.getClass();
                thumbPlayerVideoView.f174602q.f356526c = aVar;
            } else {
                T6.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f166427j2;
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                        onlineVideoView.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$hideFrameViewOnceRendered$1", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.F.setImageBitmap(null);
                        onlineVideoView.F.setVisibility(8);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$hideFrameViewOnceRendered$1", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    }
                }, 50L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFrameViewOnceRendered", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        if (com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(onVar.f170114d) != null) {
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = onVar.f170114d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            boolean z17 = snsOnlineVideoActivity.f167310J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(onVar.f170114d).K();
            } else {
                com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(onVar.f170114d).C();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(this.f170019a.f170114d).F.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
    }
}
