package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class q2 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f186767d;

    public q2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI) {
        this.f186767d = sDKOAuthUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f186767d;
        sDKOAuthUI.f183720f = i17;
        int i18 = sDKOAuthUI.f183724m.getItem(i17).f380893d;
        if (i18 != 0 && i18 != 1) {
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI2 = this.f186767d;
            sDKOAuthUI2.f183725n.g(view, i17, j17, sDKOAuthUI2, sDKOAuthUI2.I, sDKOAuthUI2.f183721g, sDKOAuthUI2.f183722h);
        }
        return true;
    }
}
