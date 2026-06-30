package du3;

/* loaded from: classes3.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f243505d;

    public a1(du3.i1 i1Var) {
        this.f243505d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "onClick crop done");
        hk0.u0 C = this.f243505d.C();
        C.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "doCropDone");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new hk0.j(9, new android.os.Bundle()));
        kotlinx.coroutines.l.d(C.f281822p, null, null, new hk0.j0(C, arrayList2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
