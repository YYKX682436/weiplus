package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public final class b8 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter disableChildren = root(com.tencent.mm.R.layout.a2v).view(com.tencent.mm.R.id.f483943cj0).disableChildren();
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        disableChildren.type(viewType).desc(new com.tencent.mm.ui.conversation.z7(this));
        root(com.tencent.mm.R.layout.a2w).view(com.tencent.mm.R.id.f483943cj0).disableChildren().type(viewType).desc(new com.tencent.mm.ui.conversation.a8(this));
    }
}
