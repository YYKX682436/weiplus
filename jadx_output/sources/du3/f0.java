package du3;

/* loaded from: classes3.dex */
public final class f0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.j0 f243578d;

    public f0(du3.j0 j0Var) {
        this.f243578d = j0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.view.View z17 = this.f243578d.z();
        int i17 = ((hk0.o) obj).f281783b ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(z17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBackPlugin$onAttach$2", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(z17, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBackPlugin$onAttach$2", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
