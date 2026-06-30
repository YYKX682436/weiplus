package fc4;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public float f261159d;

    /* renamed from: e, reason: collision with root package name */
    public float f261160e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f261161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f261159d = -1.0f;
        this.f261160e = -1.0f;
        this.f261161f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_hdr_high_light, false);
    }

    public final void O6(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppScreenBrightness", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleBrightnessUIC");
        if (this.f261160e <= this.f261159d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppScreenBrightness", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleBrightnessUIC");
            return;
        }
        android.view.Window window = getContext().getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        kotlin.jvm.internal.o.f(attributes, "getAttributes(...)");
        float f18 = this.f261159d;
        float f19 = f18 + ((this.f261160e - f18) * f17);
        attributes.screenBrightness = f19 > 0.0f ? f19 / 255.0f : -1.0f;
        window.setAttributes(attributes);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppScreenBrightness", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleBrightnessUIC");
    }
}
