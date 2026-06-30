package qw3;

/* loaded from: classes.dex */
public class i1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public i1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488185jv);
        root.view(com.tencent.mm.R.id.che).disableChildren().desc(new qw3.g1(this));
        root.view(android.R.id.title).desc(new qw3.h1(this));
    }
}
