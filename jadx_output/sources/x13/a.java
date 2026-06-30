package x13;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.bbs);
        root.view(com.tencent.mm.R.id.mdd).clickAs(com.tencent.mm.R.id.mec);
        root.disable(com.tencent.mm.R.id.mec);
        root(com.tencent.mm.R.layout.bbp).disable(com.tencent.mm.R.id.meb);
    }
}
