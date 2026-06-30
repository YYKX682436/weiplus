package du3;

/* loaded from: classes3.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.s2 f243647d;

    public l2(du3.s2 s2Var) {
        this.f243647d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$initLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        du3.s2 s2Var = this.f243647d;
        hk0.z0 S6 = s2Var.D().S6();
        hk0.z0 z0Var = hk0.z0.f281865g;
        if (S6 == z0Var) {
            s2Var.D().g7(s2Var.f243702n, true);
        } else {
            s2Var.f243702n = s2Var.D().S6();
            s2Var.D().g7(z0Var, true);
        }
        nu3.i.c(nu3.i.f340218a, "KEY_CLICK_MOSAIC_COUNT", 0, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$initLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
