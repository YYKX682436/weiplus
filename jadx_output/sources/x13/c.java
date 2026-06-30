package x13;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.id.f484220df2, com.tencent.mm.R.id.f484220df2).disable();
        view(com.tencent.mm.R.id.f483758bz2, com.tencent.mm.R.id.f483758bz2).desc(new x13.b(this)).type(com.tencent.mm.accessibility.type.ViewType.Button);
    }
}
