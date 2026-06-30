package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class k9 extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.l9 f201900a;

    public k9(com.tencent.mm.ui.chatting.l9 l9Var) {
        this.f201900a = l9Var;
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
        return this.f201900a.f201929m;
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        android.view.Window window;
        kotlin.jvm.internal.o.g(changedView, "changedView");
        com.tencent.mm.ui.chatting.l9 l9Var = this.f201900a;
        com.tencent.mm.ui.chatting.j9 dialogActivityPullDownCallback = l9Var.getDialogActivityPullDownCallback();
        if (dialogActivityPullDownCallback != null) {
            com.tencent.mm.ui.chatting.db dbVar = ((com.tencent.mm.ui.chatting.cb) dialogActivityPullDownCallback).f198523a;
            int i28 = dbVar.f200426f - i18;
            dbVar.f200437t = java.lang.Integer.valueOf(i28);
            ((com.tencent.mm.ui.chatting.ta) dbVar.f200425e).b(i28, dbVar.f200426f);
        }
        if (changedView != l9Var.f201925f || i18 < l9Var.f201929m || l9Var.f201930n) {
            return;
        }
        l9Var.f201930n = true;
        android.app.Activity activity = l9Var.f201926g;
        if (activity != null) {
            activity.finish();
        }
        android.view.View view = l9Var.f201925f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.Activity activity2 = l9Var.f201926g;
        android.view.View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view2 = decorView;
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        com.tencent.mm.ui.chatting.l9 l9Var = this.f201900a;
        if (top <= l9Var.f201928i) {
            l9Var.getDialogActivityPullDownCallback();
            androidx.customview.widget.l lVar = l9Var.f201927h;
            if (lVar != null) {
                lVar.s(0, 0);
            }
        } else {
            com.tencent.mm.ui.chatting.j9 dialogActivityPullDownCallback = l9Var.getDialogActivityPullDownCallback();
            if (dialogActivityPullDownCallback != null) {
                com.tencent.mm.ui.chatting.db dbVar = ((com.tencent.mm.ui.chatting.cb) dialogActivityPullDownCallback).f198523a;
                dbVar.f200438u = true;
                ((jz5.n) dbVar.f200433p).getValue();
            }
            androidx.customview.widget.l lVar2 = l9Var.f201927h;
            if (lVar2 != null) {
                lVar2.s(0, l9Var.f201929m);
            }
        }
        l9Var.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        android.view.ViewGroup viewGroup = this.f201900a.f201924e;
        if (viewGroup == null) {
            return true;
        }
        viewGroup.setBackgroundColor(0);
        return true;
    }
}
