package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class k2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.m2 f129410d;

    public k2(com.tencent.mm.plugin.finder.ui.m2 m2Var) {
        this.f129410d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "modShowFinderAtWxProfile, ret " + ret.getInteger(1));
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f129410d;
        if (integer != 0) {
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) m2Var.f129495b).h("settings_show_my_finder");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
            if (checkBoxPreference == null) {
                return;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity context = m2Var.f129494a;
            kotlin.jvm.internal.o.g(context, "context");
            m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
            checkBoxPreference.O(((j37 != null ? j37.field_extFlag : 0) & 262144) != 0);
            db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.f9b), 0).show();
        }
        az2.f fVar = m2Var.f129498e;
        if (fVar != null) {
            fVar.b();
        }
    }
}
