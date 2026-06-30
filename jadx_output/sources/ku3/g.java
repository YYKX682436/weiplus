package ku3;

/* loaded from: classes10.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.s f312234d;

    public g(ku3.s sVar) {
        this.f312234d = sVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.d dVar = (zt3.d) obj;
        ku3.s sVar = this.f312234d;
        if (sVar.F || !(!sVar.f312401x.isEmpty())) {
            return;
        }
        if (dVar.f475593b == 0) {
            android.view.View b17 = sVar.b();
            b17.animate().alpha(0.0f).withEndAction(new ku3.a(b17)).start();
            return;
        }
        android.view.View d17 = sVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sVar.m();
        ku3.s.a(sVar, sVar.b());
    }
}
