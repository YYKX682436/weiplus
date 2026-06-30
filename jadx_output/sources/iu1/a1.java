package iu1;

/* loaded from: classes.dex */
public final class a1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.f488332qe).view(com.tencent.mm.R.id.byq).desc(iu1.x0.f294977d);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.layout.f488370rh).view(com.tencent.mm.R.id.bvw).desc(iu1.z0.f294982d).type(viewType);
    }
}
