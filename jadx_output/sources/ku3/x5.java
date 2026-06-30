package ku3;

/* loaded from: classes3.dex */
public final class x5 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.c6 f312460d;

    public x5(ku3.c6 c6Var) {
        this.f312460d = c6Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.d dVar = (zt3.d) obj;
        ku3.c6 c6Var = this.f312460d;
        if (c6Var.f312189m) {
            return;
        }
        if (dVar.f475593b == 0) {
            android.view.View c17 = c6Var.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View c18 = c6Var.c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c18, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
