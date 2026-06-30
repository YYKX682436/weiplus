package tc4;

/* loaded from: classes4.dex */
public final class e2 extends tc4.r3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tc4.i2 f417323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(xc4.p pVar, tc4.i2 i2Var) {
        super(pVar);
        this.f417323h = i2Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SnsClickableSpanV2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SnsClickableSpanV2");
        xc4.p pVar = this.f417452g;
        this.f417323h.x("MicroMsg.Improve.TimelineItemMeasure", "appNameStub click,snsId:".concat(pVar.a1()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SnsClickableSpanV2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SnsClickableSpanV2");
        widget.setTag(pVar.h1());
        com.tencent.mm.plugin.sns.ui.kw.c(widget, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
        kotlin.jvm.internal.o.g(ds6, "ds");
        int d17 = i65.a.d(this.f417323h.getContext(), com.tencent.mm.R.color.f479514a61);
        if (getPress()) {
            ds6.bgColor = d17;
        } else {
            ds6.bgColor = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadAppNameView$1");
    }
}
