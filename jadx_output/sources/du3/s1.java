package du3;

/* loaded from: classes3.dex */
public final class s1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243696d;

    public s1(du3.g2 g2Var) {
        this.f243696d = g2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        du3.g2 g2Var = this.f243696d;
        android.view.View B = g2Var.B();
        int i17 = ((hk0.o) obj).f281783b ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(B, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(B, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        du3.g2.z(g2Var);
    }
}
