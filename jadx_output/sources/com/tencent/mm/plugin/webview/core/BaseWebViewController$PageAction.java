package com.tencent.mm.plugin.webview.core;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b%\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"com/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$WebAction;", "", "status", "", "url", "", "waitFor", "verify", "<init>", "()V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class BaseWebViewController$PageAction extends com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction {
    public abstract boolean verify(java.lang.String url);

    public final boolean waitFor(int status, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return (kotlin.jvm.internal.o.b(url, getController().D) || getController().f181961w0.contains(java.lang.Integer.valueOf(status))) && getController().B0.contains(java.lang.Integer.valueOf(status));
    }
}
