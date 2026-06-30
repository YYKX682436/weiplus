package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes.dex */
public final class n1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.chp);
        root.disable(com.tencent.mm.R.id.ad6);
        root.disable(com.tencent.mm.R.id.ad8);
        root.focusFirst(com.tencent.mm.R.id.avx);
        root.view(com.tencent.mm.R.id.ofg).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.ad8).valueByString(com.tencent.mm.R.string.i8u).type(com.tencent.mm.accessibility.type.ViewType.Button).clickAs(com.tencent.mm.R.id.ad6);
    }
}
