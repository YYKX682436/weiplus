package du3;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f243670d;

    public o0(du3.t0 t0Var) {
        this.f243670d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        du3.t0 t0Var = this.f243670d;
        hk0.e T6 = t0Var.B().T6();
        hk0.h hVar = hk0.h.f281741f;
        if (T6.f281724a == hVar) {
            t0Var.B().b7(t0Var.f243713n);
        } else {
            t0Var.B().b7(new hk0.e(hVar, 0, 0, 6, null));
        }
        nu3.i.c(nu3.i.f340218a, "KEY_CLICK_PEN_ERASER", 0, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
