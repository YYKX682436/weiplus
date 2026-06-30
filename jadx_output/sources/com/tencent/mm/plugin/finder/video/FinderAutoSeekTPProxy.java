package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderAutoSeekTPProxy;", "Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "Lcw2/t6;", "getStartPlayParam", "", "k2", "J", "getContinuePlayTimeLimitMs", "()J", "setContinuePlayTimeLimitMs", "(J)V", "continuePlayTimeLimitMs", "", "l2", "Z", "getEnableContinuePlay", "()Z", "setEnableContinuePlay", "(Z)V", "enableContinuePlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderAutoSeekTPProxy extends com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy {

    /* renamed from: j2, reason: collision with root package name */
    public final ey2.v2 f130513j2;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public long continuePlayTimeLimitMs;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public boolean enableContinuePlay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAutoSeekTPProxy(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f130513j2 = (ey2.v2) a17;
        this.enableContinuePlay = true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
    public boolean Q(java.lang.String invokeSource) {
        zy2.ub videoViewCallback;
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        boolean Q = super.Q(invokeSource);
        if (Q && (videoViewCallback = getVideoViewCallback()) != null) {
            cw2.wa mediaSource = getMediaSource();
            videoViewCallback.p2("", mediaSource != null ? mediaSource.f224096c : null);
        }
        return Q;
    }

    public final long getContinuePlayTimeLimitMs() {
        return this.continuePlayTimeLimitMs;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, cw2.da
    public /* bridge */ /* synthetic */ android.widget.ImageView getCoverImage() {
        return null;
    }

    public final boolean getEnableContinuePlay() {
        return this.enableContinuePlay;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
    /* renamed from: getStartPlayParam */
    public cw2.t6 getS() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        cw2.wa f130607n = getF130607n();
        if (f130607n == null || (feedData = f130607n.f224099f) == null) {
            return null;
        }
        long feedId = feedData.getFeedId();
        ey2.q2 R6 = this.f130513j2.R6(feedId, false, ey2.t2.f257515e);
        if (R6 == null) {
            return null;
        }
        boolean z17 = this.continuePlayTimeLimitMs <= 0 || java.lang.System.currentTimeMillis() - R6.f257484g < this.continuePlayTimeLimitMs;
        com.tencent.mars.xlog.Log.i(getFTPPTag(), "getStartPlayMs: enableContinuePlay=" + z17 + ", playTimeMs=" + R6.f257481d + ", feedId=" + pm0.v.u(feedId) + ", continuePlayTimeLimitMs=" + this.continuePlayTimeLimitMs);
        if (z17) {
            return new cw2.t6(R6.f257481d, false);
        }
        return null;
    }

    public void p0(java.lang.String source) {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        kotlin.jvm.internal.o.g(source, "source");
        cw2.wa f130607n = getF130607n();
        if (f130607n != null && (feedData = f130607n.f224099f) != null) {
            long feedId = feedData.getFeedId();
            long currentPlayMs = getCurrentPlayMs();
            long videoDurationMs = getVideoDurationMs();
            int i17 = (int) ((((float) currentPlayMs) / ((float) videoDurationMs)) * 500);
            com.tencent.mars.xlog.Log.i(getFTPPTag(), "storeVideoProgress: source=" + source + ", progress=" + i17 + ", currentPlayMs=" + currentPlayMs + ", videoDurationMs=" + videoDurationMs);
            if (currentPlayMs >= 0 && videoDurationMs > 0) {
                ey2.v2.X6(this.f130513j2, feedId, 0, i17, currentPlayMs, videoDurationMs, 1.0f, 0, false, ey2.t2.f257515e, 192, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean pause() {
        boolean pause = super.pause();
        if (pause) {
            p0("pause");
        }
        return pause;
    }

    public final void setContinuePlayTimeLimitMs(long j17) {
        this.continuePlayTimeLimitMs = j17;
    }

    public final void setEnableContinuePlay(boolean z17) {
        this.enableContinuePlay = z17;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public void stop() {
        if (W()) {
            p0("stop");
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAutoSeekTPProxy(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f130513j2 = (ey2.v2) a17;
        this.enableContinuePlay = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAutoSeekTPProxy(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f130513j2 = (ey2.v2) a17;
        this.enableContinuePlay = true;
    }
}
