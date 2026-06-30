package du3;

/* loaded from: classes3.dex */
public final class q0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f243683d;

    public q0(du3.t0 t0Var) {
        this.f243683d = t0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.c1 c1Var = (hk0.c1) obj;
        du3.t0 t0Var = this.f243683d;
        if (t0Var.B().R6(1)) {
            java.lang.Object value = ((jz5.n) t0Var.f243709g).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            int i17 = c1Var.f281712b ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$2", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$2", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
