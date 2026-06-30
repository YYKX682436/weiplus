package s74;

/* loaded from: classes4.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(s74.f3 f3Var) {
        super(0);
        this.f404260d = f3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Typeface typeface;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$textSystemTypeFace$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$textSystemTypeFace$2");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f404260d.h()).inflate(com.tencent.mm.R.layout.f489481bd3, (android.view.ViewGroup) null);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = inflate instanceof androidx.appcompat.widget.AppCompatTextView ? (androidx.appcompat.widget.AppCompatTextView) inflate : null;
        if (appCompatTextView == null || (typeface = appCompatTextView.getTypeface()) == null) {
            typeface = android.graphics.Typeface.DEFAULT;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$textSystemTypeFace$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$textSystemTypeFace$2");
        return typeface;
    }
}
