package z74;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470600a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f470601b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f470602c;

    /* renamed from: d, reason: collision with root package name */
    public r45.jj4 f470603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470604e;

    public g(java.lang.String str) {
        this.f470600a = android.text.TextUtils.isEmpty(str) ? "OnlineVideoLayoutBuilder" : str;
    }

    public final void a() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
        r45.jj4 jj4Var = this.f470603d;
        java.lang.String str = this.f470600a;
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.e(str, "OnlineVideoLayoutBuilder: the media object is null");
            z17 = false;
        } else {
            z17 = true;
        }
        if (this.f470602c == null) {
            com.tencent.mars.xlog.Log.e(str, "OnlineVideoLayoutBuilder: the time line object is null");
            z17 = false;
        }
        if (this.f470601b == null) {
            com.tencent.mars.xlog.Log.e(str, "OnlineVideoLayoutBuilder: the video container is null");
            z17 = false;
        }
        if (android.text.TextUtils.isEmpty(this.f470604e)) {
            com.tencent.mars.xlog.Log.e(str, "OnlineVideoLayoutBuilder: the sns local id is empty");
            z17 = false;
        }
        if (z17) {
            r45.jj4 jj4Var2 = this.f470603d;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f470602c;
            android.view.ViewGroup viewGroup = this.f470601b;
            java.lang.String str2 = this.f470604e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
            java.lang.String str3 = timeLineObject.Id;
            boolean f17 = xd4.o0.d().f(str3);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView b17 = xd4.o0.d().b(str3);
            if (a84.y0.e(viewGroup)) {
                android.view.View childAt = viewGroup.getChildAt(0);
                if ((childAt instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) && !com.tencent.mm.sdk.platformtools.t8.D0(str3, ((com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) childAt).f170641m2)) {
                    com.tencent.mars.xlog.Log.w(str, "the obj id is not equal, remove child!!!!");
                    a84.y0.c(viewGroup);
                }
            }
            if (b17 == null) {
                com.tencent.mars.xlog.Log.w(str, "the item is  null!!!!");
            } else {
                b17.P(jj4Var2, str2, timeLineObject.CreateTime);
            }
            if (b17 != null && !a84.y0.e(viewGroup)) {
                com.tencent.mars.xlog.Log.w(str, "the videoView is not null, the container is empty");
                a84.y0.i(b17);
                a84.y0.o(b17, -1, -1);
                a84.y0.p(b17, true);
                b17.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                a84.y0.b(viewGroup, b17, 0);
            } else if (f17 && a84.y0.e(viewGroup) && !xd4.o0.d().e(str3)) {
                com.tencent.mars.xlog.Log.w(str, "the container is not empty, the state is invalid");
                a84.y0.c(viewGroup);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
    }
}
