package vr1;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vr1.o oVar) {
        super(0);
        this.f439562d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vr1.o oVar = this.f439562d;
        android.view.View findViewByPosition = ((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) oVar.f439589n).getValue()).findViewByPosition(0);
        int[] iArr = new int[2];
        if (findViewByPosition != null) {
            findViewByPosition.getLocationInWindow(iArr);
        }
        if (((java.lang.Number) ((jz5.n) oVar.f439587i).getValue()).intValue() - iArr[1] > i65.a.b(oVar.getContext(), 10) + 2) {
            android.view.View view = oVar.f439585g;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = oVar.f439585g;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
