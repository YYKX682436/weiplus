package rc5;

/* loaded from: classes11.dex */
public final class e extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394154a;

    public e(rc5.m mVar) {
        this.f394154a = mVar;
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
        return this.f394154a.f394173i;
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(changedView, "changedView");
        rc5.m mVar = this.f394154a;
        android.view.View view = mVar.f394179r;
        if (view == null) {
            kotlin.jvm.internal.o.o("mUIRootView");
            throw null;
        }
        if (!kotlin.jvm.internal.o.b(changedView, view) || mVar.f394181t || i18 < mVar.f394173i) {
            return;
        }
        mVar.f394181t = true;
        android.view.View view2 = mVar.f394179r;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mUIRootView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View decorView = mVar.f394170f.getActivity().getWindow().getDecorView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(decorView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rc5.n nVar = mVar.f394177p;
        if (nVar != null) {
            ((rc5.q) nVar).f394188a.getActivity().finish();
        }
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        int top = releasedChild.getTop();
        rc5.m mVar = this.f394154a;
        if (top <= mVar.f394174m) {
            mVar.f394178q.s(0, 0);
        } else {
            mVar.f394178q.s(0, mVar.f394173i);
        }
        mVar.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        this.f394154a.f394170f.getActivity().getWindow().getDecorView().setBackgroundColor(0);
        return true;
    }
}
