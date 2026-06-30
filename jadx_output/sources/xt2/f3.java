package xt2;

/* loaded from: classes2.dex */
public final class f3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456742e;

    public f3(com.tencent.mm.view.MMPAGView mMPAGView, xt2.r3 r3Var) {
        this.f456741d = mMPAGView;
        this.f456742e = r3Var;
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f456741d.setVisibility(0);
        android.view.View view = this.f456742e.f456986i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f456741d.setVisibility(4);
        android.view.View view = this.f456742e.f456986i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
