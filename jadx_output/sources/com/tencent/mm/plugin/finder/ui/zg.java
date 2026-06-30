package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class zg implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f130103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f130104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f130105f;

    public zg(boolean z17, com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f130103d = z17;
        this.f130104e = finderSettingInfoUI;
        this.f130105f = checkBoxPreference;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ki2 req = (r45.ki2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchQQMusic isChecked:");
        boolean z17 = this.f130103d;
        sb6.append(z17);
        sb6.append(" onModifyResult: ret = ");
        sb6.append(ret.getInteger(1));
        com.tencent.mars.xlog.Log.i("FinderSettingInfoUI", sb6.toString());
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI = this.f130104e;
        if (integer != 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.yg(this.f130105f, z17, finderSettingInfoUI));
            return;
        }
        r45.nc4 nc4Var = finderSettingInfoUI.f128724f;
        if (nc4Var != null) {
            if (req.getInteger(0) == 1) {
                nc4Var.set(31, java.lang.Integer.valueOf(nc4Var.getInteger(31) | 1));
            } else {
                nc4Var.set(31, java.lang.Integer.valueOf(nc4Var.getInteger(31) & (-2)));
            }
        }
    }
}
