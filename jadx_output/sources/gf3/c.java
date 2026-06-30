package gf3;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.bvv);
        root.view(com.tencent.mm.R.id.m7j).desc(gf3.a.f271328d).clickAs(com.tencent.mm.R.id.jim).checkOn(gf3.b.f271329d);
        root.disable(com.tencent.mm.R.id.jim);
    }
}
