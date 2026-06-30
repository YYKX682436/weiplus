package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class n0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.cyz).view(com.tencent.mm.R.id.cyz).desc(com.tencent.mm.R.string.b9a).disableChildren();
    }
}
