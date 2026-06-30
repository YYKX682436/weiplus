package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class u2 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f488166j1).view(com.tencent.mm.R.id.a_3).desc(new com.tencent.mm.plugin.webview.ui.tools.t2(this));
    }
}
