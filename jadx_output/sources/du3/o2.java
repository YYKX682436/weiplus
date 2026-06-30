package du3;

/* loaded from: classes3.dex */
public final class o2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.s2 f243672d;

    public o2(du3.s2 s2Var) {
        this.f243672d = s2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object value = ((jz5.n) this.f243672d.f243698g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        int i17 = ((hk0.o) obj).f281783b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
