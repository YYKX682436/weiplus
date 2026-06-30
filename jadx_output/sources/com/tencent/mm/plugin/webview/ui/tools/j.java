package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class j implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI f184848d;

    public j(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
        this.f184848d = createAvatarUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = this.f184848d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "avatar file id get success = &s", createAvatarUI.f183594q);
        createAvatarUI.f183594q = (java.lang.String) obj;
        if (createAvatarUI.f183595r) {
            ck5.f b17 = ck5.f.b(createAvatarUI.f183585e);
            b17.f42561f = 1;
            b17.f42560e = 32;
            b17.d(createAvatarUI);
        }
    }
}
