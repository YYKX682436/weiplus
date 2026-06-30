package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class z3 {
    public z3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(hy4.a0 eventType) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        boolean b17 = kotlin.jvm.internal.o.b(com.tencent.mm.plugin.webview.model.h4.f182915j, java.lang.Boolean.TRUE);
        int i17 = eventType.f286083d;
        if (b17) {
            com.tencent.mm.autogen.events.WebViewKeyActionEvent webViewKeyActionEvent = new com.tencent.mm.autogen.events.WebViewKeyActionEvent();
            webViewKeyActionEvent.f54986g.f7394a = i17;
            webViewKeyActionEvent.e();
        } else {
            java.lang.String PROCESS_TOOLS = com.tencent.mm.sdk.platformtools.w9.f193055c;
            kotlin.jvm.internal.o.f(PROCESS_TOOLS, "PROCESS_TOOLS");
            com.tencent.mm.ipcinvoker.f.a(PROCESS_TOOLS, new com.tencent.mm.ipcinvoker.type.IPCInteger(i17), com.tencent.mm.plugin.webview.model.y3.f183205d, null);
        }
    }
}
