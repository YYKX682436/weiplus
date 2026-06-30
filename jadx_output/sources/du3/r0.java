package du3;

/* loaded from: classes3.dex */
public final class r0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f243688d;

    public r0(du3.t0 t0Var) {
        this.f243688d = t0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.g gVar = (hk0.g) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeDoodleState >> ");
        sb6.append(gVar.f281734a.f281724a);
        sb6.append(", ");
        hk0.e eVar = gVar.f281735b;
        sb6.append(eVar.f281724a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoBrushPlugin", sb6.toString());
        hk0.e eVar2 = gVar.f281734a;
        hk0.h hVar = eVar2.f281724a;
        hk0.h hVar2 = eVar.f281724a;
        if (hVar2 == hVar) {
            return;
        }
        hk0.h hVar3 = hk0.h.f281741f;
        du3.t0 t0Var = this.f243688d;
        if (hVar2 == hVar3) {
            t0Var.z().setBackground(null);
        } else if (hVar2 == hk0.h.f281740e && hVar == hVar3) {
            eu3.c cVar = t0Var.f243712m;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoBrushListAdapter", "cancelSelectBrush " + cVar.f256822e);
            cVar.f256822e = -1;
            android.view.View view = cVar.f256823f;
            if (view != null) {
                cVar.x(view, 1.0f);
            }
        }
        if (hVar == hVar3) {
            t0Var.z().setBackground(i65.a.i(t0Var.f243708f.getContext(), com.tencent.mm.R.drawable.cjs));
            return;
        }
        if (hVar == hk0.h.f281740e) {
            if (hVar2 == hk0.h.f281739d || hVar2 == hVar3) {
                int i17 = t0Var.f243712m.f256822e;
                int i18 = eVar2.f281726c;
                if (i17 == -1 && i18 != 2) {
                    androidx.recyclerview.widget.RecyclerView A = t0Var.A();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/DoodleState;)V", "Undefined", "scrollToPosition", "(I)V");
                    A.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/DoodleState;)V", "Undefined", "scrollToPosition", "(I)V");
                }
                eu3.c cVar2 = t0Var.f243712m;
                if (cVar2.f256822e != i18) {
                    cVar2.f256822e = i18;
                    if (i18 == 2) {
                        cVar2.f256823f = cVar2.f256826i;
                    }
                    android.view.View view2 = cVar2.f256823f;
                    if (view2 != null) {
                        view2.setScaleX(1.4f);
                    }
                    android.view.View view3 = cVar2.f256823f;
                    if (view3 == null) {
                        return;
                    }
                    view3.setScaleY(1.4f);
                }
            }
        }
    }
}
