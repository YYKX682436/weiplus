package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class v0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144907d;

    public v0(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144907d = x1Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144907d;
        if (-1 == x1Var.f144932t.f144760f) {
            x1Var.s(true);
            x1Var.y(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        }
        com.tencent.mm.plugin.location.ui.impl.c0 c0Var = x1Var.f144932t;
        c0Var.f144760f = i17;
        c0Var.notifyDataSetChanged();
        if (i17 >= 0 && i17 < x1Var.f144932t.getCount()) {
            x1Var.Z = true;
            com.tencent.mm.plugin.location.ui.PoiPoint poiPoint = x1Var.I1;
            if (poiPoint != null && za3.w.STAND == poiPoint.B) {
                poiPoint.B = za3.w.SIT;
                poiPoint.f144639q.reverse();
                poiPoint.f144640r.reverse();
                poiPoint.f144641s.reverse();
            }
            com.tencent.mm.plugin.location.ui.impl.d0 item = x1Var.f144932t.getItem(i17);
            if (item.f144778d == x1Var.G && item.f144777c == x1Var.H) {
                x1Var.f144934v.setSelected(true);
            } else {
                x1Var.f144934v.setSelected(false);
            }
            x1Var.f144935w.h1(item.f144789o, item.f144790p);
            if (com.tencent.mm.sdk.platformtools.t8.K0(item.f144789o)) {
                x1Var.f144910e.getIController().animateTo(item.f144778d, item.f144777c, 15);
            } else {
                x1Var.f144910e.getIController().animateTo(item.f144778d, item.f144777c, 18);
            }
            if (x1Var.k().getBooleanExtra("key_geo_coder_four_level", false)) {
                u60.h hVar = new u60.h(item.f144778d, item.f144777c);
                hVar.f424871d = !com.tencent.mm.sdk.platformtools.t8.K0(item.f144789o) ? 1 : 0;
                hVar.f424872e = item.f144790p;
                hVar.f424874g = true;
                ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, new com.tencent.mm.plugin.location.ui.impl.u0(this, item));
            }
            java.util.Map map = x1Var.J1;
            com.tencent.mm.plugin.location.ui.PoiPoint poiPoint2 = (com.tencent.mm.plugin.location.ui.PoiPoint) ((java.util.HashMap) map).get(item.f144778d + "" + item.f144777c);
            if (poiPoint2 == null) {
                poiPoint2 = new com.tencent.mm.plugin.location.ui.PoiPoint(x1Var.f144909d, x1Var.f144910e);
                poiPoint2.setPosition(i17);
                poiPoint2.setOnPointClick(x1Var.H1);
                ((java.util.HashMap) map).put(item.f144778d + "" + item.f144777c, poiPoint2);
                poiPoint2.b(item.f144778d, item.f144777c, true);
            } else {
                poiPoint2.c();
            }
            x1Var.I1 = poiPoint2;
            com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = x1Var.f144922l1;
            finishSelectPOIStruct.f58108g = i17 + 1;
            finishSelectPOIStruct.f58107f = 1;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
