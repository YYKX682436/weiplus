package yi3;

/* loaded from: classes.dex */
public final class d extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.c3c);
        root.view(com.tencent.mm.R.id.hf7).descFormat(com.tencent.mm.R.string.h1w).valueByView(com.tencent.mm.R.id.hf8);
        root.view(com.tencent.mm.R.id.n0_).desc(yi3.a.f462597d);
        root.view(com.tencent.mm.R.id.n0a).disable();
        root.view(com.tencent.mm.R.id.hef).disable();
        root.view(com.tencent.mm.R.id.hf6).disable();
        root(com.tencent.mm.R.layout.bvq).view(com.tencent.mm.R.id.jcb).descFormat(com.tencent.mm.R.string.h2_).valueByView(com.tencent.mm.R.id.a_m);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.c3_);
        root2.view(com.tencent.mm.R.id.jwd).descFormat(com.tencent.mm.R.string.h1t).valueByView(com.tencent.mm.R.id.h7c);
        root2.view(com.tencent.mm.R.id.h7c).disable();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.c38);
        root3.view(com.tencent.mm.R.id.gdh).desc(new yi3.b(this));
        root3.view(com.tencent.mm.R.id.f485057ge1).desc(new yi3.c(this));
    }
}
