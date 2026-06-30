package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181761d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181761d;
        java.util.Set set = r0Var.f181920c;
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var.R;
        com.tencent.mm.ui.widget.MMWebView mMWebView = r0Var.f181916a;
        nw4.n nVar = set == null ? new nw4.n(mMWebView, wVar, r0Var.U(), r0Var.f181922d) : new nw4.n(mMWebView, wVar, r0Var.U(), r0Var.f181920c);
        m05.q qVar = ((ph0.i) i95.n0.c(ph0.i.class)) != null ? new m05.q() : null;
        if (qVar != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) nVar.f340911y;
            if (!arrayList.contains(qVar)) {
                arrayList.add(qVar);
            }
        }
        mMWebView.addJavascriptInterface(nVar, "__wx");
        if (nVar.y() != null) {
            mMWebView.addJavascriptInterface(nVar.y(), "__wxtag");
        }
        mMWebView.addJavascriptInterface(r0Var.o0(nVar), "WXTransInterface");
        if (nVar.E == null) {
            nVar.E = new pw4.a();
        }
        pw4.a aVar = nVar.E;
        aVar.f358709a = nVar.f340887a;
        mMWebView.addJavascriptInterface(aVar, "CustomFullscreenApi");
        mMWebView.addJavascriptInterface(r0Var.f181938l, "__wxWebEnv");
        mMWebView.setRandomStr(nVar.f340904r);
        return nVar;
    }
}
