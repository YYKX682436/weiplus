package du3;

/* loaded from: classes3.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f243764d;

    public x0(du3.i1 i1Var) {
        this.f243764d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "update rotate");
        hk0.u0 C = this.f243764d.C();
        int i17 = (C.f281818i.f281857i + 90) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateRotate >> " + i17 + ' ' + C.f281818i.f281857i);
        hk0.z zVar = C.f281818i;
        zVar.f281857i = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateRotate >> " + zVar.f281857i);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hk0.j U6 = C.U6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(U6);
        arrayList2.add(new hk0.j(5, new android.os.Bundle()));
        kotlinx.coroutines.l.d(C.f281822p, null, null, new hk0.s0(C, arrayList2, null), 3, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateRotate >> " + f0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
