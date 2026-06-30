package ed4;

/* loaded from: classes4.dex */
public class a implements com.tencent.mm.pluginsdk.ui.span.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem f251282a;

    public a(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem) {
        this.f251282a = baseTimeLineItem;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.a
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem = this.f251282a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdTagClickableHelper", th6.toString());
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("AdTagClickableHelper", "BaseTimeLineItem, position < 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo c17 = baseTimeLineItem.f169251h.c(i17);
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("AdTagClickableHelper", "BaseTimeLineItem position = " + i17 + ", snsId = " + c17.field_snsId + ", source = SOURCE_TIMELINE , clickPos = " + i18);
            n74.o0.c(baseTimeLineItem.f169249f, 0, c17, i18);
        } else {
            com.tencent.mars.xlog.Log.e("AdTagClickableHelper", "BaseTimeLineItem, snsInfo is null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
    }
}
