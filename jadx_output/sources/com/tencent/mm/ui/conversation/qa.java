package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public final class qa extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.a2w).view(com.tencent.mm.R.id.f483943cj0).disableChildren();
        root(com.tencent.mm.R.layout.a2v).view(com.tencent.mm.R.id.f483943cj0).disableChildren();
    }
}
