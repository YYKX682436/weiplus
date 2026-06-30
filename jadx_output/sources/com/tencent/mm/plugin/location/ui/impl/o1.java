package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144860d;

    public o1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144860d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144860d;
        com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = x1Var.f144922l1;
        finishSelectPOIStruct.f58105d = 2;
        finishSelectPOIStruct.f58109h = x1Var.f144935w.getShowTimes();
        finishSelectPOIStruct.f58110i = x1Var.f144935w.getClickTimes();
        finishSelectPOIStruct.k();
        x1Var.r(12, x1Var.f144931s.f144760f, false);
        com.tencent.mm.plugin.location.ui.impl.x1.p(x1Var);
        x1Var.f144909d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
