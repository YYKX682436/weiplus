package nw3;

/* loaded from: classes.dex */
public final class f extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488182js);
        root.view(com.tencent.mm.R.id.axs).disableChildren().desc(nw3.a.f340785d);
        root.view(com.tencent.mm.R.id.axt).disableChildren().desc(nw3.b.f340786d);
        root.view(com.tencent.mm.R.id.axu).disableChildren().desc(nw3.c.f340787d);
        root(com.tencent.mm.R.layout.f488180jq).view(com.tencent.mm.R.id.adm).disableChildren().desc(nw3.d.f340788d);
        root(com.tencent.mm.R.layout.f488181jr).view(com.tencent.mm.R.id.adm).disableChildren().desc(nw3.e.f340789d);
    }
}
