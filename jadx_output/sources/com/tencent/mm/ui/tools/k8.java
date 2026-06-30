package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public abstract class k8 {
    public static void a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        b(context, viewGroup, view, view2, view3, i17, 0.0f, false);
    }

    public static void b(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, int i17, float f17, boolean z17) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new com.tencent.mm.ui.tools.h8(view, view3, context, i17, view2, f17, viewGroup, z17));
    }

    public static void c(androidx.core.widget.NestedScrollView nestedScrollView, long j17) {
        if (nestedScrollView == null || nestedScrollView.getChildCount() == 0 || nestedScrollView.getChildAt(0) == null || nestedScrollView.getHeight() > nestedScrollView.getChildAt(0).getHeight()) {
            return;
        }
        nestedScrollView.postDelayed(new com.tencent.mm.ui.tools.j8(nestedScrollView), j17);
    }
}
