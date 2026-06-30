package com.tencent.mm.plugin.finder.megavideo.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B%\b\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\u0018¢\u0006\u0004\b'\u0010*R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R6\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0005\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\t¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/MegaVideoInputLayout;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/c5;", "", "e", "Z", "getListenKeyBoardChange", "()Z", "setListenKeyBoardChange", "(Z)V", "listenKeyBoardChange", "Landroid/view/View;", "f", "Landroid/view/View;", "getNestedAnimVideoView", "()Landroid/view/View;", "setNestedAnimVideoView", "(Landroid/view/View;)V", "nestedAnimVideoView", "g", "getNestedAnimButton", "setNestedAnimButton", "nestedAnimButton", "Lkotlin/Function2;", "", "Ljz5/f0;", "h", "Lyz5/p;", "getOnKeyboardChange", "()Lyz5/p;", "setOnKeyboardChange", "(Lyz5/p;)V", "onKeyboardChange", "isShowKeyboard", "setShowKeyboard", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MegaVideoInputLayout extends android.widget.LinearLayout implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121059d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean listenKeyBoardChange;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View nestedAnimVideoView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.view.View nestedAnimButton;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.p onKeyboardChange;

    public MegaVideoInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121059d = com.tencent.mm.ui.bl.f(getContext());
        this.listenKeyBoardChange = true;
    }

    public final void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        com.tencent.mars.xlog.Log.i("MegaVideoInputLayout", "restoreViews: return to original");
        android.view.View view = this.nestedAnimVideoView;
        if (view != null && (animate2 = view.animate()) != null && (duration2 = animate2.setDuration(180L)) != null && (translationY2 = duration2.translationY(0.0f)) != null && (scaleX = translationY2.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null) {
            scaleY.start();
        }
        android.view.View view2 = this.nestedAnimButton;
        if (view2 != null) {
            if (!(java.lang.Float.compare(view2.getTranslationY(), 0.0f) != 0)) {
                view2 = null;
            }
            if (view2 == null || (animate = view2.animate()) == null || (duration = animate.setDuration(180L)) == null || (translationY = duration.translationY(0.0f)) == null) {
                return;
            }
            translationY.start();
        }
    }

    public final boolean getListenKeyBoardChange() {
        return this.listenKeyBoardChange;
    }

    public final android.view.View getNestedAnimButton() {
        return this.nestedAnimButton;
    }

    public final android.view.View getNestedAnimVideoView() {
        return this.nestedAnimVideoView;
    }

    public final yz5.p getOnKeyboardChange() {
        return this.onKeyboardChange;
    }

    public final void setListenKeyBoardChange(boolean z17) {
        this.listenKeyBoardChange = z17;
    }

    public final void setNestedAnimButton(android.view.View view) {
        this.nestedAnimButton = view;
    }

    public final void setNestedAnimVideoView(android.view.View view) {
        this.nestedAnimVideoView = view;
    }

    public final void setOnKeyboardChange(yz5.p pVar) {
        this.onKeyboardChange = pVar;
    }

    public final void setShowKeyboard(boolean z17) {
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.view.View view;
        float f17;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        if (!this.listenKeyBoardChange) {
            com.tencent.mars.xlog.Log.i("MegaVideoInputLayout", "onKeyboardHeightChanged: listenKeyBoardChange = " + this.listenKeyBoardChange);
            return;
        }
        boolean z18 = i17 > 0;
        if (z18) {
            int c17 = this.f121059d ? com.tencent.mm.ui.bl.c(getContext()) + i17 : i17;
            boolean z19 = getContext().getResources().getConfiguration().orientation == 2;
            com.tencent.mars.xlog.Log.i("MegaVideoInputLayout", "animViews: footer isLand = " + z19 + ", translateY = " + c17);
            if (!z19 && (view = this.nestedAnimVideoView) != null) {
                android.graphics.Point h17 = com.tencent.mm.ui.bk.h(getContext());
                int i18 = (h17.x != 0 && h17.y != 0 ? h17.y : getContext().getResources().getDisplayMetrics().heightPixels) - c17;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int height = view.getHeight();
                if (height > i18) {
                    f17 = i18 / height;
                    height = i18;
                } else {
                    f17 = 1.0f;
                }
                int i19 = ((i18 - height) / 2) - iArr[1];
                view.setPivotY(0.0f);
                android.view.ViewPropertyAnimator animate2 = view.animate();
                if (animate2 != null && (duration2 = animate2.setDuration(90L)) != null && (translationY2 = duration2.translationY(i19)) != null && (scaleX = translationY2.scaleX(f17)) != null && (scaleY = scaleX.scaleY(f17)) != null) {
                    scaleY.start();
                }
                android.view.View view2 = this.nestedAnimButton;
                if (view2 != null) {
                    if (!(view2.getVisibility() == 0)) {
                        view2 = null;
                    }
                    if (view2 != null && (animate = view2.animate()) != null && (duration = animate.setDuration(90L)) != null && (translationY = duration.translationY(i19)) != null) {
                        translationY.start();
                    }
                }
                com.tencent.mars.xlog.Log.i("MegaVideoInputLayout", "animViews: video view translateY = " + i19 + ", scale = " + f17);
            }
        }
        com.tencent.mars.xlog.Log.i("MegaVideoInputLayout", "onKeyboardHeightChanged: isShow = " + z18 + ", height = " + i17);
        yz5.p pVar = this.onKeyboardChange;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17));
        }
    }

    public MegaVideoInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f121059d = com.tencent.mm.ui.bl.f(getContext());
        this.listenKeyBoardChange = true;
    }
}
