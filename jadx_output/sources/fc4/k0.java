package fc4;

/* loaded from: classes4.dex */
public final class k0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBeforeFinish", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        super.onBeforeFinish(intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261180d;
        if (flexibleVideoView != null) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.r(flexibleVideoView, false, false, false, 6, null);
        }
        this.f261180d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBeforeFinish", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.k0.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261180d;
        if (flexibleVideoView != null) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.r(flexibleVideoView, false, false, false, 6, null);
        }
        this.f261180d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        super.onPause();
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261180d;
        if (flexibleVideoView != null) {
            flexibleVideoView.k(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261180d;
        if (flexibleVideoView != null) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.m(flexibleVideoView, false, false, false, 7, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleVideoViewUIC");
    }
}
