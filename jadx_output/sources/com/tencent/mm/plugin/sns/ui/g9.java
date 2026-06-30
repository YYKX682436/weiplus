package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class g9 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f168411a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f168412b;

    /* renamed from: c, reason: collision with root package name */
    public int f168413c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f168414d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoSightView f168415e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f168416f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView f168417g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f168418h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f168419i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f168420j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f168421k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f168422l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f168423m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f168424n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f168425o = 2;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.jw f168426p;

    public void a(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindObj", "com.tencent.mm.plugin.sns.ui.SightViewTag");
        this.f168411a = timeLineObject;
        this.f168413c = i17;
        this.f168412b = str;
        this.f168424n = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindObj", "com.tencent.mm.plugin.sns.ui.SightViewTag");
    }
}
