package com.tencent.mm.plugin.finder.live.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/util/FinderLivePushReplaceLayout;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "getFirstChild", "()Landroid/view/View;", "firstChild", "getSecondChild", "secondChild", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/util/e0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLivePushReplaceLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f115431d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLivePushReplaceLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    private final android.view.View getFirstChild() {
        if (getChildCount() != 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final android.view.View getSecondChild() {
        if (getChildCount() > 1) {
            return getChildAt(1);
        }
        return null;
    }

    public final boolean a(android.view.View view, com.tencent.mm.plugin.finder.live.util.e0 pushDirection, long j17) {
        kotlin.jvm.internal.o.g(pushDirection, "pushDirection");
        if (getSecondChild() != null || view == null) {
            return false;
        }
        addView(view);
        int ordinal = pushDirection.ordinal();
        if (ordinal == 1) {
            view.setTranslationY(getHeight());
        } else if (ordinal == 2) {
            view.setTranslationY(-getHeight());
        } else if (ordinal == 3) {
            view.setTranslationX(getWidth());
        } else if (ordinal == 4) {
            view.setTranslationX(-getWidth());
        }
        if (pushDirection == com.tencent.mm.plugin.finder.live.util.e0.f115483d) {
            post(new com.tencent.mm.plugin.finder.live.util.f0(this));
        } else {
            android.view.View firstChild = getFirstChild();
            if (firstChild != null) {
                android.view.ViewPropertyAnimator animate = firstChild.animate();
                int ordinal2 = pushDirection.ordinal();
                if (ordinal2 == 1) {
                    animate.translationY(-getHeight());
                } else if (ordinal2 == 2) {
                    animate.translationY(getHeight());
                } else if (ordinal2 == 3) {
                    animate.translationX(-getWidth());
                } else if (ordinal2 == 4) {
                    animate.translationX(getWidth());
                }
                animate.setListener(null);
                animate.setDuration(j17);
                animate.start();
            }
            android.view.View secondChild = getSecondChild();
            if (secondChild != null) {
                android.view.ViewPropertyAnimator animate2 = secondChild.animate();
                animate2.translationX(0.0f);
                animate2.translationY(0.0f);
                animate2.setListener(new com.tencent.mm.plugin.finder.live.util.g0(this));
                animate2.setDuration(j17);
                animate2.start();
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLivePushReplaceLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
