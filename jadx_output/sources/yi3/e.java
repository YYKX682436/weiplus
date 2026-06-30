package yi3;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f489474co1).view(com.tencent.mm.R.id.a9m).disable();
        root(com.tencent.mm.R.layout.c3x).view(com.tencent.mm.R.id.m7g).disable();
    }
}
