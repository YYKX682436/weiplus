package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class uc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186563d;

    public uc(nw4.k kVar) {
        this.f186563d = kVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.ArrayList<com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc> arrayList;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186689h;
        if (rcVar == null || (arrayList = rcVar.f186500c) == null) {
            return;
        }
        for (com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc qcVar : arrayList) {
            g4Var.n(qcVar.f186462b, qcVar.f186461a, new android.graphics.drawable.BitmapDrawable(this.f186563d.f340860a.getResources(), qcVar.f186464d), 0);
        }
    }
}
