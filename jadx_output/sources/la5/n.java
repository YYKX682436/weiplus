package la5;

/* loaded from: classes.dex */
public final class n extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f487910bc).view(com.tencent.mm.R.id.jha).desc(com.tencent.mm.R.string.f490549y8).type(com.tencent.mm.accessibility.type.ViewType.Button);
        root(com.tencent.mm.R.layout.f487915bh).view(com.tencent.mm.R.id.meb).disable();
    }
}
