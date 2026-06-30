package hr3;

/* loaded from: classes11.dex */
public final class kc extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.lc f283722a;

    public kc(hr3.lc lcVar) {
        this.f283722a = lcVar;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        return this.f283722a.f283764m;
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(changedView, "changedView");
        hr3.lc lcVar = this.f283722a;
        if (changedView != lcVar.f283760f || i18 < lcVar.f283764m || lcVar.f283765n) {
            return;
        }
        lcVar.f283765n = true;
        android.app.Activity activity = lcVar.f283761g;
        if (activity == null) {
            kotlin.jvm.internal.o.o("mActivity");
            throw null;
        }
        activity.finish();
        android.view.View view = lcVar.f283760f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.Activity activity2 = lcVar.f283761g;
        if (activity2 == null) {
            kotlin.jvm.internal.o.o("mActivity");
            throw null;
        }
        android.view.View decorView = activity2.getWindow().getDecorView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(decorView, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        hr3.lc lcVar = this.f283722a;
        if (top <= lcVar.f283763i) {
            androidx.customview.widget.l lVar = lcVar.f283762h;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("mViewDragHelper");
                throw null;
            }
            lVar.s(0, 0);
        } else {
            androidx.customview.widget.l lVar2 = lcVar.f283762h;
            if (lVar2 == null) {
                kotlin.jvm.internal.o.o("mViewDragHelper");
                throw null;
            }
            lVar2.s(0, lcVar.f283764m);
        }
        lcVar.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        return true;
    }
}
