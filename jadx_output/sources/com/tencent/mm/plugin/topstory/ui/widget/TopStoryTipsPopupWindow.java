package com.tencent.mm.plugin.topstory.ui.widget;

/* loaded from: classes8.dex */
public class TopStoryTipsPopupWindow extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f175269a;

    /* renamed from: b, reason: collision with root package name */
    public int f175270b;

    /* renamed from: c, reason: collision with root package name */
    public int f175271c;

    /* renamed from: d, reason: collision with root package name */
    public int f175272d;

    /* renamed from: e, reason: collision with root package name */
    public int f175273e;

    /* renamed from: f, reason: collision with root package name */
    public int f175274f;

    /* renamed from: g, reason: collision with root package name */
    public int f175275g;

    /* renamed from: h, reason: collision with root package name */
    public int f175276h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f175277i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f175278j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f175279k;

    public TopStoryTipsPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.f175276h = 0;
        android.view.View view = this.f175279k;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f175277i);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.f175269a.getChildAt(0);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f175269a;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // android.widget.PopupWindow
    public void update() {
        super.update();
    }

    public TopStoryTipsPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175278j = new int[2];
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f175269a = frameLayout;
        super.setContentView(frameLayout);
    }

    public TopStoryTipsPopupWindow(android.view.View view) {
        this(view.getContext(), null);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
        this.f175269a = frameLayout;
        super.setContentView(frameLayout);
        setContentView(view);
    }
}
