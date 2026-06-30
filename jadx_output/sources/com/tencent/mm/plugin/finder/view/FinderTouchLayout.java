package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout;", "Landroid/widget/FrameLayout;", "", "d", "F", "getLastX", "()F", "setLastX", "(F)V", "lastX", "", "e", "Z", "isInterceptDown", "()Z", "setInterceptDown", "(Z)V", "Lcom/tencent/mm/plugin/finder/view/sm;", "f", "Lcom/tencent/mm/plugin/finder/view/sm;", "getTouchListener", "()Lcom/tencent/mm/plugin/finder/view/sm;", "setTouchListener", "(Lcom/tencent/mm/plugin/finder/view/sm;)V", "touchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderTouchLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float lastX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isInterceptDown;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.sm touchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTouchLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        boolean z17 = false;
        if (event.getAction() == 0) {
            this.lastX = event.getRawX();
            com.tencent.mm.plugin.finder.feed.ui.l1 l1Var = (com.tencent.mm.plugin.finder.feed.ui.l1) getTouchListener();
            l1Var.getClass();
            float rawX = event.getRawX();
            com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI = l1Var.f110253b;
            if (rawX <= finderCommentUI.f109222v && event.getRawY() > finderCommentUI.f109223w) {
                z17 = true;
            }
            this.isInterceptDown = z17;
            if (z17) {
                return true;
            }
            return super.dispatchTouchEvent(event);
        }
        if (event.getAction() == 3 || event.getAction() == 1) {
            if (this.isInterceptDown) {
                com.tencent.mm.plugin.finder.feed.ui.l1 l1Var2 = (com.tencent.mm.plugin.finder.feed.ui.l1) getTouchListener();
                l1Var2.getClass();
                com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI2 = l1Var2.f110253b;
                com.tencent.mars.xlog.Log.i(finderCommentUI2.f109220t, "translationY " + finderCommentUI2.c7().getTranslationY() + ", height:" + finderCommentUI2.c7().getHeight());
                if (finderCommentUI2.c7().getTranslationY() > finderCommentUI2.f109224x * finderCommentUI2.c7().getHeight()) {
                    finderCommentUI2.d7().u();
                } else {
                    finderCommentUI2.c7().clearAnimation();
                    finderCommentUI2.c7().animate().cancel();
                    finderCommentUI2.c7().animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(0.0f).setDuration(finderCommentUI2.f109221u).start();
                }
                this.isInterceptDown = false;
                return true;
            }
        } else if (this.isInterceptDown) {
            com.tencent.mm.plugin.finder.view.sm touchListener = getTouchListener();
            float rawX2 = event.getRawX() - this.lastX;
            com.tencent.mm.plugin.finder.feed.ui.l1 l1Var3 = (com.tencent.mm.plugin.finder.feed.ui.l1) touchListener;
            com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI3 = l1Var3.f110253b;
            finderCommentUI3.c7().setTranslationY(l1Var3.f110252a * rawX2);
            com.tencent.mars.xlog.Log.i(finderCommentUI3.f109220t, "distanceX " + rawX2 + ", translationY " + finderCommentUI3.c7().getTranslationY());
        }
        return super.dispatchTouchEvent(event);
    }

    public final float getLastX() {
        return this.lastX;
    }

    public final com.tencent.mm.plugin.finder.view.sm getTouchListener() {
        com.tencent.mm.plugin.finder.view.sm smVar = this.touchListener;
        if (smVar != null) {
            return smVar;
        }
        kotlin.jvm.internal.o.o("touchListener");
        throw null;
    }

    public final void setInterceptDown(boolean z17) {
        this.isInterceptDown = z17;
    }

    public final void setLastX(float f17) {
        this.lastX = f17;
    }

    public final void setTouchListener(com.tencent.mm.plugin.finder.view.sm smVar) {
        kotlin.jvm.internal.o.g(smVar, "<set-?>");
        this.touchListener = smVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTouchLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
