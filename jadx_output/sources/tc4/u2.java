package tc4;

/* loaded from: classes4.dex */
public final class u2 extends com.tencent.mm.pluginsdk.ui.span.d1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.c3 f417483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.nb0 f417484h;

    public u2(tc4.c3 c3Var, bw5.nb0 nb0Var) {
        this.f417483g = c3Var;
        this.f417484h = nb0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadAppNameView$1");
        kotlin.jvm.internal.o.g(widget, "widget");
        tc4.c3 c3Var = this.f417483g;
        android.content.Context context = c3Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String finderUsername = this.f417484h.getFinderUsername();
        kotlin.jvm.internal.o.f(finderUsername, "getFinderUsername(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jumpToFinderProfile", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        c3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToFinderProfile", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new tc4.t2(context, finderUsername, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFinderProfile", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jumpToFinderProfile", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadAppNameView$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadAppNameView$1");
        kotlin.jvm.internal.o.g(ds6, "ds");
        int d17 = i65.a.d(this.f417483g.getContext(), com.tencent.mm.R.color.f479514a61);
        if (getPress()) {
            ds6.bgColor = d17;
        } else {
            ds6.bgColor = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$loadAppNameView$1");
    }
}
