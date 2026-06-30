package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class d8 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f160937d;

    public d8(android.widget.TextView textView) {
        this.f160937d = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f160937d;
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.weight = textView.getLineCount() == 1 ? 0.0f : 1.0f;
        android.view.ViewParent parent = textView.getParent();
        if (parent != null) {
            parent.requestLayout();
        }
    }
}
