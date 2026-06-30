package y32;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.id.f482482fq, com.tencent.mm.R.id.f482482fq).desc(com.tencent.mm.R.string.f491153c54).type(com.tencent.mm.accessibility.type.ViewType.Button);
    }
}
