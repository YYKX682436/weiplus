package j71;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.keyboard_change_input_panel).view(com.tencent.mm.R.id.mnp).desc(com.tencent.mm.R.string.hxm).type(com.tencent.mm.accessibility.type.ViewType.Button);
    }
}
