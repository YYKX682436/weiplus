package du3;

/* loaded from: classes3.dex */
public final class y1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243774d;

    public y1(du3.g2 g2Var) {
        this.f243774d = g2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.view.View B = this.f243774d.B();
        int i17 = ((hk0.c1) obj).f281712b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(B, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin$onAttach$7", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(B, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin$onAttach$7", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
