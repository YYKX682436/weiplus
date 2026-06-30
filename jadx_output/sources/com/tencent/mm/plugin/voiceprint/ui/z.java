package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class z extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.d4j).view(com.tencent.mm.R.id.kj9).desc(com.tencent.mm.plugin.voiceprint.ui.x.f176282d).checkOn(com.tencent.mm.plugin.voiceprint.ui.y.f176284d);
    }
}
