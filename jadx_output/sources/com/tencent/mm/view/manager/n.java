package com.tencent.mm.view.manager;

/* loaded from: classes15.dex */
public class n implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213668d;

    public n(com.tencent.mm.view.manager.d dVar) {
        this.f213668d = dVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "emoji storage notify %s", str);
        if (str == null) {
            return;
        }
        this.f213668d.f213643s.b();
    }
}
