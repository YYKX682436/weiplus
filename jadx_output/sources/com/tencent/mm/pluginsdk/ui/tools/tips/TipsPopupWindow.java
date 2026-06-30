package com.tencent.mm.pluginsdk.ui.tools.tips;

/* loaded from: classes3.dex */
public class TipsPopupWindow extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f191934a;

    public TipsPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.f191934a.getChildAt(0);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f191934a;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    public TipsPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f191934a = frameLayout;
        super.setContentView(frameLayout);
    }
}
