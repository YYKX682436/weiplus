package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class r0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144890d;

    public r0(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144890d = x1Var;
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
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 >= 0) {
            com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144890d;
            if (i17 < x1Var.f144931s.getCount()) {
                com.tencent.mm.plugin.location.ui.impl.d0 item = x1Var.f144931s.getItem(i17);
                if (item.f144787m == 0) {
                    x1Var.f144934v.setSelected(false);
                } else {
                    x1Var.f144934v.setSelected(true);
                }
                x1Var.E = item.f144778d;
                x1Var.F = item.f144777c;
                x1Var.f144935w.h1(item.f144789o, item.f144790p);
                if (com.tencent.mm.sdk.platformtools.t8.K0(item.f144789o)) {
                    x1Var.f144910e.getIController().animateTo(item.f144778d, item.f144777c, 15);
                } else {
                    x1Var.f144910e.getIController().animateTo(item.f144778d, item.f144777c, 18);
                }
                if (x1Var.k().getBooleanExtra("key_geo_coder_four_level", false)) {
                    u60.h hVar = new u60.h(x1Var.E, x1Var.F);
                    hVar.f424871d = !com.tencent.mm.sdk.platformtools.t8.K0(item.f144789o) ? 1 : 0;
                    hVar.f424872e = item.f144790p;
                    hVar.f424874g = true;
                    ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, new com.tencent.mm.plugin.location.ui.impl.q0(this, item));
                }
                com.tencent.mm.plugin.location.ui.impl.c0 c0Var = x1Var.f144931s;
                c0Var.f144760f = i17;
                c0Var.notifyDataSetChanged();
                x1Var.Z = false;
                ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) x1Var.f144910e).announceForAccessibility(x1Var.f144909d.getString(com.tencent.mm.R.string.ggv));
                com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = x1Var.f144922l1;
                finishSelectPOIStruct.f58108g = i17 + 1;
                finishSelectPOIStruct.f58107f = 4;
                yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "wrong position");
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
