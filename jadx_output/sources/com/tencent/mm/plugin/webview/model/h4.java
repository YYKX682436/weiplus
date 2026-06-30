package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class h4 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.z3 f182914i = new com.tencent.mm.plugin.webview.model.z3(null);

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Boolean f182915j;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.d4 f182916a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.WebViewEventReporter$webViewActionEventListener$1 f182917b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f182918c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.v3 f182919d;

    /* renamed from: e, reason: collision with root package name */
    public long f182920e;

    /* renamed from: f, reason: collision with root package name */
    public long f182921f;

    /* renamed from: g, reason: collision with root package name */
    public long f182922g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f182923h;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.webview.model.WebViewEventReporter$webViewActionEventListener$1] */
    public h4() {
        com.tencent.mm.plugin.webview.model.d4 d4Var = new com.tencent.mm.plugin.webview.model.d4(this);
        this.f182916a = d4Var;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r27 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewKeyActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.model.WebViewEventReporter$webViewActionEventListener$1
            {
                this.__eventId = -2000303506;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewKeyActionEvent webViewKeyActionEvent) {
                com.tencent.mm.autogen.events.WebViewKeyActionEvent event = webViewKeyActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.n20 n20Var = event.f54986g;
                int i17 = n20Var.f7394a;
                hy4.a0 a0Var2 = hy4.a0.f286076i;
                com.tencent.mm.plugin.webview.model.h4 h4Var = com.tencent.mm.plugin.webview.model.h4.this;
                if (i17 == 6) {
                    h4Var.d(a0Var2);
                    return true;
                }
                hy4.a0 a0Var3 = hy4.a0.f286077m;
                if (i17 == 7) {
                    h4Var.d(a0Var3);
                    return true;
                }
                hy4.a0 a0Var4 = hy4.a0.f286075h;
                if (i17 != 4) {
                    hy4.a0 a0Var5 = hy4.a0.f286078n;
                    if (i17 != 8) {
                        return true;
                    }
                    h4Var.d(a0Var5);
                    return true;
                }
                r45.n54 n54Var = new r45.n54();
                n54Var.f381090d = n20Var.f7395b;
                h4Var.getClass();
                if (j45.l.f()) {
                    com.tencent.mm.plugin.webview.luggage.util.g.f(new com.tencent.mm.plugin.webview.model.g4(h4Var, a0Var4, n54Var));
                    return true;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewEventReporter", "reportEvent has not login");
                return true;
            }
        };
        this.f182917b = r27;
        this.f182920e = -1L;
        this.f182921f = -1L;
        this.f182922g = -1L;
        r27.alive();
        d4Var.alive();
    }

    public static final void b(hy4.a0 a0Var) {
        f182914i.a(a0Var);
    }

    public static final void c(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(f182915j, java.lang.Boolean.TRUE)) {
            com.tencent.mm.autogen.events.WebViewKeyActionEvent webViewKeyActionEvent = new com.tencent.mm.autogen.events.WebViewKeyActionEvent();
            hy4.a0 a0Var = hy4.a0.f286072e;
            am.n20 n20Var = webViewKeyActionEvent.f54986g;
            n20Var.f7394a = 4;
            if (str == null) {
                str = "";
            }
            n20Var.f7395b = str;
            webViewKeyActionEvent.e();
            return;
        }
        com.tencent.mm.plugin.webview.model.WebViewEventReporter$Companion$IPCWebViewEventData webViewEventReporter$Companion$IPCWebViewEventData = new com.tencent.mm.plugin.webview.model.WebViewEventReporter$Companion$IPCWebViewEventData();
        hy4.a0 a0Var2 = hy4.a0.f286072e;
        webViewEventReporter$Companion$IPCWebViewEventData.f182731d = 4;
        if (str == null) {
            str = "";
        }
        webViewEventReporter$Companion$IPCWebViewEventData.f182732e = str;
        java.lang.String PROCESS_TOOLS = com.tencent.mm.sdk.platformtools.w9.f193055c;
        kotlin.jvm.internal.o.f(PROCESS_TOOLS, "PROCESS_TOOLS");
        com.tencent.mm.ipcinvoker.f.a(PROCESS_TOOLS, webViewEventReporter$Companion$IPCWebViewEventData, com.tencent.mm.plugin.webview.model.x3.f183186d, null);
    }

    public final void a(com.tencent.mm.ui.widget.MMWebView webView, int i17, int i18, int i19, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f182918c = webView;
        java.lang.String stringExtra = intent.getStringExtra("geta8key_username");
        java.lang.String stringExtra2 = intent.getStringExtra("msgUsername");
        java.lang.String stringExtra3 = intent.getStringExtra("serverMsgID");
        long longExtra = intent.getLongExtra("createTime", 0L);
        int i27 = i18 == 0 ? i17 : i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewEventReporter", "initReportInfo requestId: " + i17 + ", initRequestId: " + i27 + ", scene: " + i19 + ", username: " + stringExtra + ", msgUsername: " + stringExtra2 + ", msgId: " + stringExtra3);
        this.f182919d = new com.tencent.mm.plugin.webview.model.v3(0, i27, i17, stringExtra3, i19, stringExtra, stringExtra2, null, longExtra, 0, null, dc1.e.CTRL_INDEX, null);
        f182915j = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x2.n());
    }

    public final void d(hy4.a0 eventType) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        if (j45.l.f()) {
            com.tencent.mm.plugin.webview.luggage.util.g.f(new com.tencent.mm.plugin.webview.model.g4(this, eventType, null));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewEventReporter", "reportEvent has not login");
        }
    }

    public final void e(boolean z17) {
        long j17 = z17 ? this.f182921f : this.f182922g;
        if (j17 < 0 || java.lang.System.currentTimeMillis() - j17 >= 500) {
            if (z17) {
                this.f182921f = java.lang.System.currentTimeMillis();
                d(hy4.a0.f286081q);
            } else {
                this.f182922g = java.lang.System.currentTimeMillis();
                d(hy4.a0.f286080p);
            }
        }
    }
}
