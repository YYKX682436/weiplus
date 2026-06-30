package du3;

/* loaded from: classes3.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f243762d;

    public w3(du3.h4 h4Var) {
        this.f243762d = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.l lVar;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "undo click");
        hk0.u0 C = this.f243762d.C();
        hk0.z zVar = C.f281818i;
        java.util.LinkedList linkedList = zVar.f281849a;
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoDataModel", "when undo editState data is empty");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar = new jz5.l(new jz5.l(bool, bool), null);
        } else {
            hk0.k kVar = (hk0.k) linkedList.getLast();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("undo lastEdit >> ");
            sb6.append(kVar.f281758b);
            sb6.append(' ');
            hk0.l lVar2 = kVar.f281757a;
            sb6.append(lVar2);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", sb6.toString());
            if (lVar2 == hk0.l.f281765f) {
                java.util.LinkedList linkedList2 = zVar.f281856h;
                if (linkedList2.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoDataModel", "undo currentCropEditDataList >> error restore crop");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "undo >> remove crop " + kVar.f281758b + ", " + ((java.lang.String) linkedList2.removeLast()));
                    if (linkedList2.isEmpty()) {
                        zVar.f281858j = zVar.f281857i;
                        zVar.f281857i = 0;
                        zVar.f281859k = false;
                    } else {
                        hk0.d dVar = (hk0.d) zVar.f281851c.get(linkedList2.getLast());
                        if (dVar != null) {
                            zVar.f281858j = zVar.f281857i;
                            zVar.f281857i = dVar.f281715d;
                            f0Var = jz5.f0.f302826a;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoDataModel", "undo >> error restore crop");
                        }
                    }
                }
            }
            zVar.f281850b.add(kVar);
            linkedList.removeLast();
            lVar = new jz5.l(new jz5.l(java.lang.Boolean.valueOf(!linkedList.isEmpty()), java.lang.Boolean.valueOf(!r0.isEmpty())), kVar);
        }
        jz5.l lVar3 = (jz5.l) lVar.f302833d;
        hk0.k kVar2 = (hk0.k) lVar.f302834e;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("undoEdit >> ");
        sb7.append(((java.lang.Boolean) lVar3.f302833d).booleanValue());
        sb7.append(", ");
        java.lang.Boolean bool2 = (java.lang.Boolean) lVar3.f302834e;
        sb7.append(bool2.booleanValue());
        sb7.append(", ");
        sb7.append(kVar2 != null ? kVar2.f281758b : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", sb7.toString());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", ((java.lang.Boolean) lVar3.f302833d).booleanValue());
        arrayList2.add(new hk0.j(1, bundle));
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("BUNDLE_KEY_BOOLEAN_1", bool2.booleanValue());
        arrayList2.add(new hk0.j(2, bundle2));
        arrayList2.add(C.U6());
        kotlinx.coroutines.l.d(C.f281822p, null, null, new hk0.q0(C, arrayList2, kVar2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
