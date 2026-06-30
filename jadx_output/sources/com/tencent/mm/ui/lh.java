package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class lh extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.cki).view(com.tencent.mm.R.id.btf).desc(com.tencent.mm.ui.jh.f209008d);
        root(com.tencent.mm.R.layout.cki).view(com.tencent.mm.R.id.p5a).desc(com.tencent.mm.ui.kh.f209048d);
    }
}
