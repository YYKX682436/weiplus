package ju1;

/* loaded from: classes.dex */
public final class p extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.f488289p7).view(com.tencent.mm.R.id.bvt).desc(ju1.m.f301762d);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.layout.f488305pn).view(com.tencent.mm.R.id.bvw).desc(ju1.o.f301774d).type(viewType);
    }
}
