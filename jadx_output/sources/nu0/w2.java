package nu0;

/* loaded from: classes5.dex */
public final class w2 implements nv0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340129d;

    public w2(nu0.b4 b4Var) {
        this.f340129d = b4Var;
    }

    @Override // nv0.f
    public void v4(boolean z17, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel, nv0.d stack) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        kotlin.jvm.internal.o.g(stack, "stack");
        nu0.b4 b4Var = this.f340129d;
        ((nu0.b1) ((jz5.n) b4Var.f339917n).getValue()).l7();
        if (!stack.f340428b.isEmpty()) {
            android.view.View view = b4Var.f339888x;
            if (view == null) {
                kotlin.jvm.internal.o.o("mcBackBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup viewGroup = b4Var.V6().f243410m;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("musicTipContainer");
                throw null;
            }
        }
        android.view.View view2 = b4Var.f339888x;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mcBackBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup viewGroup2 = b4Var.V6().f243410m;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("musicTipContainer");
            throw null;
        }
    }
}
