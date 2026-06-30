package dt2;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f243158a;

    /* renamed from: b, reason: collision with root package name */
    public dk2.rg f243159b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f243160c;

    public a0(android.content.Context context, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = new com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy(context);
        this.f243158a = finderLiveThumbPlayerProxy;
        finderLiveThumbPlayerProxy.setLoop(false);
        finderLiveThumbPlayerProxy.setMute(false);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", "init " + hashCode() + " playerView:" + finderLiveThumbPlayerProxy.hashCode());
        this.f243160c = new dt2.y(this);
    }

    public final void a(mn2.g4 data, java.lang.String key, boolean z17, com.tencent.mm.plugin.finder.storage.FeedData feedData) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(feedData, "feedData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindMediaInfo ");
        sb6.append(hashCode());
        sb6.append(" key:");
        sb6.append(key);
        sb6.append(", playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        sb6.append(",newContainer:");
        sb6.append(data.f330002e.getString(9));
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.setDecryptionKey(key);
        finderLiveThumbPlayerProxy.n(data, z17, feedData);
    }

    public final void b(android.view.ViewGroup newContainer, java.lang.Integer num, android.util.Size mediaSize, com.tencent.mm.pluginsdk.ui.e1 scaleType, boolean z17) {
        kotlin.jvm.internal.o.g(newContainer, "newContainer");
        kotlin.jvm.internal.o.g(mediaSize, "mediaSize");
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        boolean isPlaying = finderLiveThumbPlayerProxy.isPlaying();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", "moveToNewContainer " + hashCode() + " playerView:" + finderLiveThumbPlayerProxy.hashCode() + ",newContainer:" + newContainer.hashCode() + ",isPlaying:" + isPlaying + ",index:" + num + ",scaleType:" + scaleType);
        finderLiveThumbPlayerProxy.D = true;
        finderLiveThumbPlayerProxy.animate().cancel();
        finderLiveThumbPlayerProxy.animate().setListener(null);
        zl2.r4.f473950a.Q2(finderLiveThumbPlayerProxy);
        if (z17) {
            finderLiveThumbPlayerProxy.setClipToOutline(true);
            finderLiveThumbPlayerProxy.setOutlineProvider(new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8)));
        } else {
            finderLiveThumbPlayerProxy.setClipToOutline(false);
        }
        if (newContainer.indexOfChild(finderLiveThumbPlayerProxy) == -1) {
            if (num != null) {
                newContainer.addView(finderLiveThumbPlayerProxy, num.intValue(), new android.view.ViewGroup.LayoutParams(-1, -1));
            } else {
                newContainer.addView(finderLiveThumbPlayerProxy, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
        }
        newContainer.post(new dt2.z(this, newContainer, mediaSize, scaleType, isPlaying));
    }

    public final void c(android.view.ViewGroup newContainer, android.util.Size mediaSize, com.tencent.mm.pluginsdk.ui.e1 scaleType, boolean z17) {
        kotlin.jvm.internal.o.g(newContainer, "newContainer");
        kotlin.jvm.internal.o.g(mediaSize, "mediaSize");
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        b(newContainer, 0, mediaSize, scaleType, z17);
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseVideo ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.pause();
    }

    public final void e(java.lang.Integer num) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playVideo ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        sb6.append(",offset:");
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.setMute(false);
        finderLiveThumbPlayerProxy.setVideoViewFocused(true);
        finderLiveThumbPlayerProxy.J(num);
    }

    public final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.d();
        finderLiveThumbPlayerProxy.b();
    }

    public final void g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFillScaleType ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
    }

    public final void h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFitScaleType ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
    }

    public final void i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopVideo ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f243158a;
        sb6.append(finderLiveThumbPlayerProxy.hashCode());
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        finderLiveThumbPlayerProxy.stop();
    }
}
