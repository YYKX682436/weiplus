package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveMusicScrollViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveMusicScrollViewBehavior extends com.google.android.material.appbar.AppBarLayout.Behavior {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMusicScrollViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: L */
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout child, android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (i27 >= 0) {
            super.o(coordinatorLayout, child, target, i17, i18, i19, i27, i28);
        }
    }
}
