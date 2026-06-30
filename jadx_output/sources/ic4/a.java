package ic4;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility");
        com.tencent.mm.accessibility.base.ViewSetter view = view(com.tencent.mm.R.id.f482894r2, com.tencent.mm.R.id.f482894r2);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        view.desc(com.tencent.mm.R.string.j9m);
        view.expand(0, 12, 20, 12);
        com.tencent.mm.accessibility.base.ViewSetter view2 = view(com.tencent.mm.R.id.f482844pi, com.tencent.mm.R.id.f482844pi);
        view2.type(viewType);
        view2.desc(com.tencent.mm.R.string.j9y);
        view(com.tencent.mm.R.id.f482852pt, com.tencent.mm.R.id.f482852pt).desc(com.tencent.mm.R.string.jd9);
        view(com.tencent.mm.R.id.r_, com.tencent.mm.R.id.r_).desc(com.tencent.mm.R.string.jf_);
        view(com.tencent.mm.R.id.n96, com.tencent.mm.R.id.f485336hc1).desc(com.tencent.mm.R.string.f490424ul);
        view(com.tencent.mm.R.id.n96, com.tencent.mm.R.id.f485335hc0).desc(com.tencent.mm.R.string.f490424ul);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility");
    }
}
