package o34;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility");
        root(com.tencent.mm.R.layout.f489501cr5).view(com.tencent.mm.R.id.f482830p4).talkOn(com.tencent.mm.R.string.jea, o34.a.f342744d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility");
    }
}
