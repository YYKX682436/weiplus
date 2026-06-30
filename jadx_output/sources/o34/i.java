package o34;

/* loaded from: classes14.dex */
public final class i extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final java.lang.String O6(android.view.View layout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDescRead", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility");
        kotlin.jvm.internal.o.g(layout, "layout");
        java.lang.String obj = ((com.tencent.mm.ui.widget.MMNeat7extView) layout.findViewById(com.tencent.mm.R.id.f484050cu2)).getContentDescription().toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDescRead", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility");
        return obj;
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility");
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.ctm);
        root.view(com.tencent.mm.R.id.cuh).desc(new o34.c(this)).disableChildren();
        root.view(com.tencent.mm.R.id.haa).desc(new o34.d(this)).disableChildren();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489515ct1);
        root2.view(com.tencent.mm.R.id.cuh).desc(new o34.e(this)).disableChildren();
        root2.view(com.tencent.mm.R.id.haa).desc(new o34.f(this)).disableChildren();
        root2.view(com.tencent.mm.R.id.hab).desc(new o34.g(this)).disableChildren();
        root2.view(com.tencent.mm.R.id.hac).desc(new o34.h(this)).disableChildren();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility");
    }
}
