package ow0;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f349351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw0.g f349352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ow0.a0 a0Var, vw0.g gVar) {
        super(0);
        this.f349351d = a0Var;
        this.f349352e = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        ow0.a0 a0Var = this.f349351d;
        a0Var.J7();
        ow0.g gVar = (ow0.g) a0Var.f69240i;
        if (gVar != null) {
            sw0.f fVar = sw0.f.f413432g;
            java.util.Iterator it = gVar.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
            sw0.n nVar = (sw0.n) obj;
            android.view.View view = nVar != null ? nVar.f413445c : null;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView ? view : null);
            if (captionView != null) {
                vw0.g newState = this.f349352e;
                kotlin.jvm.internal.o.g(newState, "newState");
                int ordinal = newState.ordinal();
                if (ordinal == 0) {
                    android.view.View view2 = captionView.f69327n;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = captionView.f69323g;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view4 = captionView.f69328o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (ordinal == 1) {
                    android.view.View view5 = captionView.f69327n;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = captionView.f69323g;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view7 = captionView.f69328o;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (ordinal == 2) {
                    android.view.View view8 = captionView.f69327n;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view9 = captionView.f69323g;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(8);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view10 = captionView.f69328o;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view10, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "updateCaptionViewState", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$CaptionViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
