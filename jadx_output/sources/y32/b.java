package y32;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = view(com.tencent.mm.R.id.dj7, com.tencent.mm.R.id.dj7).desc(com.tencent.mm.R.string.a6x);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        view(com.tencent.mm.R.id.f484244dj2, com.tencent.mm.R.id.f484244dj2).desc(com.tencent.mm.R.string.c57).type(viewType);
    }
}
