package s74;

/* loaded from: classes4.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f404480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f404481b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f404482c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f404483d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f404484e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f404485f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f404486g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f404487h;

    /* renamed from: i, reason: collision with root package name */
    public final rl5.r f404488i;

    /* renamed from: j, reason: collision with root package name */
    public final int f404489j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.FrameLayout f404490k;

    public p2(android.view.View rootView, int i17, android.content.Context ctx, android.view.ViewGroup contentContainer, android.view.ViewGroup mainContainer, android.view.ViewGroup mVideoContainer, java.lang.Object tag, com.tencent.mm.plugin.sns.ui.listener.i iVar, rl5.r rVar, int i18) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(contentContainer, "contentContainer");
        kotlin.jvm.internal.o.g(mainContainer, "mainContainer");
        kotlin.jvm.internal.o.g(mVideoContainer, "mVideoContainer");
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f404480a = rootView;
        this.f404481b = i17;
        this.f404482c = ctx;
        this.f404483d = contentContainer;
        this.f404484e = mainContainer;
        this.f404485f = mVideoContainer;
        this.f404486g = tag;
        this.f404487h = iVar;
        this.f404488i = rVar;
        this.f404489j = i18;
        this.f404490k = (android.widget.FrameLayout) contentContainer.findViewById(com.tencent.mm.R.id.q1c);
    }

    public final android.view.ViewGroup a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        return this.f404483d;
    }

    public final android.view.ViewGroup b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        return this.f404485f;
    }

    public final android.view.ViewGroup c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        return this.f404484e;
    }

    public final int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        return this.f404481b;
    }

    public final java.lang.Object e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        return this.f404486g;
    }

    public final com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        return this.f404487h;
    }
}
