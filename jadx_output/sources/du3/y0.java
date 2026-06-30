package du3;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f243773d;

    public y0(du3.i1 i1Var) {
        this.f243773d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        du3.i1 i1Var = this.f243773d;
        if (!i1Var.B().isEnabled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "onClick rotateUndo but disabled, skip");
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "onClick rotate");
        hk0.u0 C = i1Var.C();
        C.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "rotateAndEditRestore");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", false);
        arrayList2.add(new hk0.j(3, bundle));
        arrayList2.add(new hk0.j(6, new android.os.Bundle()));
        hk0.z zVar = C.f281818i;
        zVar.f281859k = false;
        zVar.f281857i = 0;
        zVar.f281860l = true;
        kotlinx.coroutines.l.d(C.f281822p, null, null, new hk0.p0(C, arrayList2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
