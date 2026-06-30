package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI f184086d;

    public d(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
        this.f184086d = createAvatarUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = this.f184086d;
        java.lang.String obj = createAvatarUI.f183585e.getText().toString();
        java.lang.String f17 = ip.c.f();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            if (obj.matches(".*[" + f17 + "].*")) {
                db5.e1.s(createAvatarUI.getContext(), createAvatarUI.getString(com.tencent.mm.R.string.g1m, f17), createAvatarUI.getString(com.tencent.mm.R.string.f490573yv));
                return true;
            }
        }
        ck5.f b17 = ck5.f.b(createAvatarUI.f183585e);
        b17.f42561f = 1;
        b17.f42560e = 32;
        b17.d(createAvatarUI);
        return true;
    }
}
