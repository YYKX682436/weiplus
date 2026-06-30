package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes3.dex */
public final class i1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f156258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f156259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f156260f;

    public i1(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f156258d = view;
        this.f156259e = textView;
        this.f156260f = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f156258d.getViewTreeObserver().removeOnPreDrawListener(this);
        android.widget.TextView textView = this.f156259e;
        int measuredWidth = textView.getMeasuredWidth();
        if (measuredWidth <= 0) {
            return true;
        }
        android.widget.TextView textView2 = this.f156260f;
        if (textView2.getWidth() == measuredWidth) {
            return true;
        }
        textView2.setMinWidth(measuredWidth);
        textView.setMinWidth(measuredWidth);
        textView2.requestLayout();
        return true;
    }
}
