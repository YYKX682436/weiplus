package du3;

/* loaded from: classes3.dex */
public final class b1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f243542d;

    public b1(du3.i1 i1Var) {
        this.f243542d = i1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.o oVar = (hk0.o) obj;
        du3.i1 i1Var = this.f243542d;
        android.view.View A = i1Var.A();
        int i17 = oVar.f281783b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (oVar.f281783b) {
            boolean z17 = i1Var.C().U6().f281753b.getBoolean("BUNDLE_KEY_BOOLEAN_1", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "FUNC_CROP selected, restore enable=" + z17);
            i1Var.z(z17);
        }
    }
}
