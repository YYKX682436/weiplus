package cw2;

/* loaded from: classes4.dex */
public final class p9 extends com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView {
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoView L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(android.content.Context context, com.tencent.mm.plugin.finder.video.FinderVideoView finderVideoView) {
        super(context);
        this.L = finderVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView
    public int getBusinessType() {
        return 1;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        java.lang.String defaultLog;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setVideoPath] ");
        defaultLog = this.L.getDefaultLog();
        sb6.append(defaultLog);
        com.tencent.mars.xlog.Log.i("Finder.VideoView", sb6.toString());
        super.setVideoPath(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        java.lang.String defaultLog;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[stop] ");
        defaultLog = this.L.getDefaultLog();
        sb6.append(defaultLog);
        com.tencent.mars.xlog.Log.i("Finder.VideoView", sb6.toString());
        super.stop();
    }
}
