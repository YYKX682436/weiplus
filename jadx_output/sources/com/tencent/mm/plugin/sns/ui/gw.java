package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gw implements w64.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jw f168468b;

    public gw(com.tencent.mm.plugin.sns.ui.jw jwVar) {
        this.f168468b = jwVar;
    }

    @Override // w64.x
    public w64.u a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return null;
    }

    @Override // w64.x
    public java.lang.String b() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.ui.jw jwVar = this.f168468b;
        java.lang.String str2 = jwVar.f169568c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (str2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            java.lang.String str3 = jwVar.f169568c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            if (!str3.isEmpty()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
                str = jwVar.f169568c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
                return str;
            }
        }
        str = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return str;
    }

    @Override // w64.x
    public android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return null;
    }

    @Override // w64.x
    public w64.w d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return null;
    }

    @Override // w64.x
    public java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        java.util.List emptyList = java.util.Collections.emptyList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return emptyList;
    }

    @Override // w64.x
    public com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f168468b.f169567b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return iVar;
    }

    @Override // w64.x
    public java.util.List j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        java.util.List emptyList = java.util.Collections.emptyList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return emptyList;
    }

    @Override // w64.x
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        return 1;
    }
}
