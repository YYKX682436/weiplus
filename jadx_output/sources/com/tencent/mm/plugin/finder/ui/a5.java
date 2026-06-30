package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class a5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.d5 f128849d;

    public a5(com.tencent.mm.plugin.finder.ui.d5 d5Var) {
        this.f128849d = d5Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.plugin.finder.ui.d5 d5Var = this.f128849d;
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) d5Var.f129052b).h("material_poi_switch");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        if (checkBoxPreference == null) {
            return;
        }
        boolean N = checkBoxPreference.N();
        com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "modMaterialPoiSwitchCallback, ret " + ret.getInteger(1) + " isChecked:" + N);
        if (ret.getInteger(1) == 0) {
            ya2.g gVar = ya2.h.f460484a;
            ya2.b2 b17 = gVar.b(d5Var.f129053c);
            long j17 = b17 != null ? b17.field_additionalFlag : 0L;
            long j18 = N ? j17 | 1024 : (-1025) & j17;
            if (b17 != null) {
                b17.field_additionalFlag = j18;
                gVar.o(b17);
            }
        } else {
            checkBoxPreference.O(!N);
            android.app.Activity activity = d5Var.f129051a;
            java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.f491357mh5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
        }
        az2.f fVar = d5Var.f129054d;
        if (fVar != null) {
            fVar.b();
        }
    }
}
