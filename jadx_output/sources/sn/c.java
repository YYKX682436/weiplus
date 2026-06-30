package sn;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.cjw);
        root.view(com.tencent.mm.R.id.f485378hh0).checkOn(sn.b.f409962d);
        root.view(com.tencent.mm.R.id.b17).disableChildren();
        root.view(com.tencent.mm.R.id.b17).disable();
        root.view(com.tencent.mm.R.id.mjo).disable();
    }
}
