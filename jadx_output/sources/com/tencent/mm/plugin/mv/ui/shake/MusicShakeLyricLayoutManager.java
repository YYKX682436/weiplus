package com.tencent.mm.plugin.mv.ui.shake;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MusicShakeLyricLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final int f150922v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicShakeLyricLayoutManager(android.content.Context r1, int r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 4
            r5 = 0
            if (r4 == 0) goto Lb
            r3 = r5
        Lb:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.o.g(r1, r4)
            r0.<init>(r1, r2, r3)
            int r1 = i65.a.b(r1, r5)
            r0.f150922v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.shake.MusicShakeLyricLayoutManager.<init>(android.content.Context, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    public final void W() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                int top = (childAt.getTop() + childAt.getBottom()) / 2;
                int height = getHeight() / 2;
                int measuredHeight = childAt.getMeasuredHeight();
                android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.j7m);
                android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
                if ((textView != null ? textView.getLineCount() : 0) > 1) {
                    measuredHeight /= 2;
                    top = (top + childAt.getBottom()) / 2;
                }
                if (measuredHeight - java.lang.Math.abs(top - height) > this.f150922v) {
                    float min = java.lang.Math.min(1 - (java.lang.Math.abs(r3) / (measuredHeight - r6)), 1.0f);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(min));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        W();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i17, z2Var, h3Var);
        W();
        return scrollVerticallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.mv.ui.shake.u uVar = new com.tencent.mm.plugin.mv.ui.shake.u(recyclerView.getContext());
        uVar.f12049a = i17;
        startSmoothScroll(uVar);
    }
}
