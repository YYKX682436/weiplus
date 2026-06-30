package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes.dex */
public final class w extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public boolean f180996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.d5z).view(com.tencent.mm.R.id.hdh).expand(12, 12, 12, 12);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (this.f180996d) {
            return;
        }
        this.f180996d = true;
        ((android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.pen)).sendAccessibilityEvent(128);
    }
}
