package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class i0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeMsgListUI f162281d;

    public i0(com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI) {
        this.f162281d = shakeMsgListUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI = this.f162281d;
        c34.u uVar = shakeMsgListUI.f162102d;
        java.lang.String valueOf = java.lang.String.valueOf(shakeMsgListUI.f162110o);
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeMessageStorage", "delBySvrId = " + uVar.f38243d.delete(uVar.getTableName(), "svrid = '" + valueOf + "'", null));
        shakeMsgListUI.f162103e.f();
    }
}
