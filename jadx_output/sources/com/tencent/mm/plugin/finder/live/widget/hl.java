package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f118573a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.kn f118574b;

    public hl(com.tencent.mm.view.MMPAGView giftPlayView, com.tencent.mm.plugin.finder.live.plugin.kn plugin) {
        kotlin.jvm.internal.o.g(giftPlayView, "giftPlayView");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f118573a = giftPlayView;
        this.f118574b = plugin;
    }

    public final void a() {
        tn0.w0 Z0 = this.f118574b.Z0();
        if (Z0 != null) {
            Z0.G0();
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f118573a;
        mMPAGView.setVisibility(8);
        mMPAGView.n();
        mMPAGView.setAlpha(1.0f);
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        mMPAGView.setClickable(true);
    }

    public final void b(boolean z17, ce2.i giftInfo, java.lang.String customText, java.lang.String str) {
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
        kotlin.jvm.internal.o.g(customText, "customText");
        this.f118573a.post(new com.tencent.mm.plugin.finder.live.widget.el(this, customText, giftInfo, z17, str));
    }
}
