package ed4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.pluginsdk.ui.span.d1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem f251284g;

    public b(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem) {
        this.f251284g = baseTimeLineItem;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
        this.f251284g.f169251h.f168043i.f169663k.onClick(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
        int color = this.f251284g.f169249f.getResources().getColor(com.tencent.mm.R.color.f479514a61);
        if (getPress()) {
            textPaint.bgColor = color;
        } else {
            textPaint.bgColor = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
    }
}
