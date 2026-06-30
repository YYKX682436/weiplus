package n14;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.cmc).view(com.tencent.mm.R.id.oju).desc(new n14.f(this)).type(com.tencent.mm.accessibility.type.ViewType.Button);
    }
}
