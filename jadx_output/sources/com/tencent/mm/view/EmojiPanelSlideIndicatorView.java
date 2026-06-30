package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/view/EmojiPanelSlideIndicatorView;", "Landroid/widget/FrameLayout;", "Lym5/a0;", "Lym5/f0;", "value", "d", "Lym5/f0;", "getController", "()Lym5/f0;", "setController", "(Lym5/f0;)V", "controller", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiPanelSlideIndicatorView extends android.widget.FrameLayout implements ym5.a0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ym5.f0 controller;

    /* renamed from: e, reason: collision with root package name */
    public boolean f213301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPanelSlideIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View view = new android.view.View(context);
        view.setBackgroundResource(com.tencent.mm.R.drawable.emoji_panel_slidable_indicator);
        addView(view, new android.widget.FrameLayout.LayoutParams(ym5.x.a(context, 44.0f), ym5.x.a(context, 4.0f), 17));
        setOnClickListener(new ym5.y(this));
        setContentDescription(getResources().getString(com.tencent.mm.R.string.by8));
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        ym5.f0 f0Var = this.controller;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    public final ym5.f0 getController() {
        return this.controller;
    }

    @Override // android.view.View
    public boolean isClickable() {
        return true;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(this.f213301e ? com.tencent.mm.R.string.by7 : com.tencent.mm.R.string.by8));
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.addAction(accessibilityAction);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1 != 3) goto L75;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.EmojiPanelSlideIndicatorView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setController(ym5.f0 f0Var) {
        java.util.Set set;
        java.util.Set set2;
        ym5.f0 f0Var2 = this.controller;
        if (f0Var2 != null && (set2 = f0Var2.f463291q) != null) {
            set2.remove(this);
        }
        this.controller = f0Var;
        if (f0Var != null && (set = f0Var.f463291q) != null) {
            set.add(this);
        }
        if ((f0Var == null || f0Var.f463292r) ? false : true) {
            this.f213301e = true;
            setContentDescription(getResources().getString(com.tencent.mm.R.string.by7));
            notifySubtreeAccessibilityStateChanged(this, this, 4);
        }
    }
}
