package la5;

/* loaded from: classes.dex */
public final class t0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f490356so);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.f490012ig);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        kotlin.jvm.internal.o.f(getResources().getString(com.tencent.mm.R.string.f490558yg), "getString(...)");
        view(com.tencent.mm.R.id.actionbar_up_indicator, com.tencent.mm.R.id.actionbar_up_indicator).type(com.tencent.mm.accessibility.type.ViewType.Button).desc(new la5.s0(string, string2));
    }
}
