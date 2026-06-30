package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class tc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186549d;

    public tc(nw4.k kVar) {
        this.f186549d = kVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.ArrayList<com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc> arrayList;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186686e;
        kotlin.jvm.internal.o.d(scVar);
        boolean z17 = scVar.f186416a;
        nw4.k kVar = this.f186549d;
        if (z17) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186686e;
            kotlin.jvm.internal.o.d(scVar2);
            if (scVar2.a()) {
                g4Var.h(2147483646, kVar.f340860a.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.icons_filled_share, kVar.f340860a.getResources().getColor(com.tencent.mm.R.color.f478502m));
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar3 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186687f;
        kotlin.jvm.internal.o.d(scVar3);
        if (scVar3.f186416a) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.sc scVar4 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186687f;
            kotlin.jvm.internal.o.d(scVar4);
            if (scVar4.a()) {
                g4Var.h(2147483645, kVar.f340860a.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186688g;
        if (rcVar == null || (arrayList = rcVar.f186500c) == null) {
            return;
        }
        for (com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc qcVar : arrayList) {
            g4Var.n(qcVar.f186462b, qcVar.f186461a, new android.graphics.drawable.BitmapDrawable(kVar.f340860a.getResources(), qcVar.f186464d), 0);
        }
    }
}
