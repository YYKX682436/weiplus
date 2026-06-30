package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.l1 f183315d;

    public k1(com.tencent.mm.plugin.webview.modeltools.l1 l1Var) {
        this.f183315d = l1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTingEntryHelper", "user click ting!");
        nw4.n nVar = this.f183315d.f183317a.f183844p0;
        if (!nVar.f340895i) {
            return false;
        }
        nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onTingEntryClick", null, nVar.f340903q, nVar.f340904r) + ")", null);
        return false;
    }
}
