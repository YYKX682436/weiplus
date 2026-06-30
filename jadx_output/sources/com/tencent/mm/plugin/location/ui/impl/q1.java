package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144874d;

    public q1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144874d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144874d;
        double d17 = x1Var.G;
        double d18 = x1Var.H;
        if (x1Var.G == -85.0d || x1Var.H == -1000.0d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "invalid lat lng");
            yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (x1Var.f144920J) {
            x1Var.f144910e.getIController().animateTo(x1Var.G, x1Var.H);
            x1Var.f144934v.setSelected(true);
            x1Var.y(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        } else {
            x1Var.f144910e.getIController().animateTo(x1Var.G, x1Var.H);
            double d19 = x1Var.G;
            x1Var.E = d19;
            double d27 = x1Var.H;
            x1Var.F = d27;
            com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = x1Var.f144924n;
            boolean booleanExtra = x1Var.k().getBooleanExtra("key_geo_coder_four_level", false);
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = x1Var.f144935w;
            pickPoi.b(d19, d27, booleanExtra, customIndoorPicker.f144696m2, customIndoorPicker.f144697n2, customIndoorPicker.f144698o2);
            x1Var.f144934v.setSelected(true);
            x1Var.Z = false;
            x1Var.f144931s.f144760f = 0;
            x1Var.f144925o.setSelection(0);
            com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = x1Var.f144922l1;
            finishSelectPOIStruct.f58108g = 0L;
            finishSelectPOIStruct.f58107f = 5;
            x1Var.w(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
