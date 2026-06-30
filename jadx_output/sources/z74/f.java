package z74;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470596a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f470597b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f470598c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f470599d;

    public f(java.lang.String str) {
        this.f470596a = android.text.TextUtils.isEmpty(str) ? "OnlineVideoChecker" : str;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        android.view.ViewGroup viewGroup = this.f470597b;
        java.lang.String str = this.f470596a;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e(str, "OnlineVideoChecker: the container is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f470598c;
        if (timeLineObject == null) {
            com.tencent.mars.xlog.Log.e(str, "OnlineVideoChecker: the timeline object is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        } else {
            try {
                b(viewGroup, timeLineObject, this.f470599d);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        }
    }

    public final void b(android.view.ViewGroup viewGroup, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        boolean e17 = a84.y0.e(viewGroup);
        java.lang.String str = this.f470596a;
        if (!e17) {
            com.tencent.mars.xlog.Log.i(str, "OnlineVideoChecker: there is no child video view in container!!");
        } else if (z17) {
            android.view.View childAt = viewGroup.getChildAt(0);
            if ((childAt instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) && !com.tencent.mm.sdk.platformtools.t8.D0(((com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) childAt).f170641m2, timeLineObject.Id)) {
                com.tencent.mars.xlog.Log.i(str, "OnlineVideoChecker: the online video container has child, but the time line id is different!!");
                a84.y0.c(viewGroup);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "OnlineVideoChecker: it doesn't use online video container!!");
            a84.y0.c(viewGroup);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
    }

    public z74.f c(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f470597b = viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }

    public z74.f d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f470598c = timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }

    public z74.f e(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f470599d = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }
}
