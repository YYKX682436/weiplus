package com.tencent.mm.plugin.story.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AvatarLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final int f171874v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarLayoutManager(android.content.Context context, int i17) {
        super(context, i17, false);
        kotlin.jvm.internal.o.g(context, "context");
        this.f171874v = i65.a.b(context, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P(int i17, int i18) {
        super.P(i17, i18);
        W();
    }

    public final void W() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            kotlin.jvm.internal.o.d(childAt);
            int top = (childAt.getTop() + childAt.getBottom()) / 2;
            int height = getHeight() / 2;
            boolean z17 = true;
            if (childAt.getMeasuredHeight() - java.lang.Math.abs(top - height) > this.f171874v) {
                float min = java.lang.Math.min(1 - (java.lang.Math.abs(r3) / (r5 - r6)), 1.0f);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(min));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (1.0f - childAt.getAlpha() >= 0.1f) {
                z17 = false;
            }
            childAt.setSelected(z17);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutChildren(z2Var, h3Var);
        W();
    }
}
