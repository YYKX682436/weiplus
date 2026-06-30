package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ih implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI f129367d;

    public ih(com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI finderSettingMsgUI) {
        this.f129367d = finderSettingMsgUI;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.yh2 req = (r45.yh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingMsgUI", "[onModifyResult] retCode=" + ret.getInteger(1));
        com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI finderSettingMsgUI = this.f129367d;
        android.app.Dialog dialog = finderSettingMsgUI.f128734d;
        if (dialog != null) {
            dialog.dismiss();
        }
        finderSettingMsgUI.f128734d = null;
        if (ret.getInteger(1) != 0) {
            db5.t7.makeText(finderSettingMsgUI, finderSettingMsgUI.getString(com.tencent.mm.R.string.eo9), 0).show();
        }
    }
}
