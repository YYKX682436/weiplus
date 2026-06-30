package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.f f184391d;

    public e(com.tencent.mm.plugin.webview.ui.tools.fts.f fVar) {
        this.f184391d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.f fVar = this.f184391d;
        if (fVar.f184405h.s9() != null) {
            android.os.Bundle bundle = fVar.f184401d;
            if (bundle == null || bundle.getInt("isRefresh") != 1 || fVar.f184401d.getString("widgetId") == null) {
                fVar.f184405h.s9().b0(fVar.f184402e, fVar.f184403f, fVar.f184404g);
            } else {
                fVar.f184405h.s9().g0(fVar.f184401d.getString("widgetId"), fVar.f184402e);
            }
        }
    }
}
