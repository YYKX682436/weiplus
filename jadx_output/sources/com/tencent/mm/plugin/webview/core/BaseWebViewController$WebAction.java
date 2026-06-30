package com.tencent.mm.plugin.webview.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b%\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006J\u001e\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00062\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"com/tencent/mm/plugin/webview/core/BaseWebViewController$WebAction", "", "", "status", "", "waitFor", "Lf06/d;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "clazz", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "", "url", "keep", "Z", "getKeep", "()Z", "Lcom/tencent/mm/plugin/webview/core/r0;", "controller", "Lcom/tencent/mm/plugin/webview/core/r0;", "getController", "()Lcom/tencent/mm/plugin/webview/core/r0;", "setController", "(Lcom/tencent/mm/plugin/webview/core/r0;)V", "<init>", "()V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class BaseWebViewController$WebAction {
    public com.tencent.mm.plugin.webview.core.r0 controller;
    private final boolean keep;

    public final com.tencent.mm.plugin.webview.core.r0 getController() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.controller;
        if (r0Var != null) {
            return r0Var;
        }
        kotlin.jvm.internal.o.o("controller");
        throw null;
    }

    public boolean getKeep() {
        return this.keep;
    }

    public final void setController(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        kotlin.jvm.internal.o.g(r0Var, "<set-?>");
        this.controller = r0Var;
    }

    public final boolean waitFor(int status) {
        return getController().C0.contains(java.lang.Integer.valueOf(status));
    }

    public final boolean waitFor(f06.d clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        return getController().E0.contains(clazz.g());
    }

    public final boolean waitFor(f06.d clazz, java.lang.String url) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        kotlin.jvm.internal.o.g(url, "url");
        return kotlin.jvm.internal.o.b(url, getController().D) && getController().D0.contains(clazz.g());
    }
}
