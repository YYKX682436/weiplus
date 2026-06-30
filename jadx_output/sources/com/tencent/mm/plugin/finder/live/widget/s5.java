package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f119722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        super(0);
        this.f119722d = d6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f119722d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = d6Var.f118074p;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        if (!liveBottomSheetPanel.isShowing) {
            liveBottomSheetPanel.f();
        }
        android.widget.TextView textView = d6Var.f118064f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = d6Var.f118065g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        d6Var.e();
        return jz5.f0.f302826a;
    }
}
