package la5;

/* loaded from: classes.dex */
public final class y0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.c08).disable(com.tencent.mm.R.id.n0e);
        root(com.tencent.mm.R.layout.byz).disable(android.R.id.title);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f489297c13);
        root.view(com.tencent.mm.R.id.ocy).clickAs(com.tencent.mm.R.id.btf).desc(la5.u0.f317643d).checkOn(la5.v0.f317645d);
        root.view(com.tencent.mm.R.id.btf).disable();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489298c14);
        root2.view(com.tencent.mm.R.id.ocy).clickAs(com.tencent.mm.R.id.btf).desc(la5.w0.f317646d).checkOn(la5.x0.f317647d);
        root2.view(com.tencent.mm.R.id.btf).disable();
    }
}
