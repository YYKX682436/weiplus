package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class cq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.dq f160925d;

    public cq(com.tencent.mm.plugin.setting.ui.setting.dq dqVar) {
        this.f160925d = dqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.dq dqVar = this.f160925d;
        com.tencent.mm.plugin.setting.ui.setting.gq gqVar = dqVar.f160958e;
        if (gqVar != null) {
            int size = dqVar.f160965o.f160780u.size();
            int i17 = dqVar.f160961h;
            com.tencent.mm.plugin.setting.ui.setting.mp mpVar = (com.tencent.mm.plugin.setting.ui.setting.mp) gqVar;
            mpVar.getClass();
            com.tencent.mm.plugin.setting.ui.setting.fq.f161046a += size;
            java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.B;
            com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = mpVar.f161339a;
            unfamiliarContactDetailUI.V6(false);
            unfamiliarContactDetailUI.f160770h.setText(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2o) + "(" + unfamiliarContactDetailUI.f160779t.size() + ")");
            com.tencent.mm.plugin.setting.ui.setting.xp xpVar = unfamiliarContactDetailUI.f160776q;
            if (xpVar != null) {
                xpVar.notifyDataSetChanged();
            }
            if (i17 < size) {
                com.tencent.mars.xlog.Log.w("MicroMsg.UnfamiliarContactUI", "[onDelSuccess] realDeleteCount:%s count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
                db5.e1.s(unfamiliarContactDetailUI.getContext(), unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2l, java.lang.Integer.valueOf(size - i17)), "");
            }
            dqVar.f160965o.f160780u.clear();
        }
    }
}
