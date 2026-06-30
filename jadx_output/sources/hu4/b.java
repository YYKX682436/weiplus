package hu4;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.baj);
        root.focusFirst(com.tencent.mm.R.id.f484997g65);
        root.view(com.tencent.mm.R.id.f484997g65).talkOn(hu4.a.f285223d);
    }
}
