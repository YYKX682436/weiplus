package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class k0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162289d;

    public k0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI) {
        this.f162289d = shakeSayHiListUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.storage.qa Di = r21.w.Di();
        com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI = this.f162289d;
        Di.y0(java.lang.String.valueOf(shakeSayHiListUI.f162217i));
        shakeSayHiListUI.f162213e.f();
    }
}
