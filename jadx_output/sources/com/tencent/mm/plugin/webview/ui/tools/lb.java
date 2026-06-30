package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes12.dex */
public class lb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.mb f185645d;

    public lb(com.tencent.mm.plugin.webview.ui.tools.mb mbVar) {
        this.f185645d = mbVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.webview.ui.tools.mb mbVar = this.f185645d;
            com.tencent.mm.ui.ee.f(mbVar.f185700d.getTaskId(), null);
            com.tencent.mm.ui.fj.f(mbVar.f185700d, true);
        }
    }
}
