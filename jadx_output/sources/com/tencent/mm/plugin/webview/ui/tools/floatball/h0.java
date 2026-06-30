package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.floatball.h0 f184201a = new com.tencent.mm.plugin.webview.ui.tools.floatball.h0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f184202b = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.floatball.g0.f184199d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f184203c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f184204d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f184205e = new java.util.concurrent.atomic.AtomicReference(null);

    /* renamed from: f, reason: collision with root package name */
    public static final gp1.z f184206f = new com.tencent.mm.plugin.webview.ui.tools.floatball.e0();

    public static final void a(com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var, android.content.Intent intent) {
        h0Var.getClass();
        try {
            java.lang.String stringExtra = intent.getStringExtra("float_ball_key");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            kotlin.jvm.internal.o.d(stringExtra);
            com.tencent.mm.plugin.webview.core.e3 c17 = h0Var.c(stringExtra);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallManager", "onBallRemove " + intent.getStringExtra("rawUrl"));
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.floatball.f0(stringExtra, c17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallManager", "onRemove is null, " + e17.getMessage());
        }
    }

    public static final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) f184202b).getValue()).booleanValue();
    }

    public final void b(com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar) {
        if (yVar != null && java.lang.Math.abs(java.lang.System.currentTimeMillis() - yVar.f184242d) >= 1800000) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.ui.tools.floatball.b0(yVar), "WebViewFloatBallThread");
        }
    }

    public final com.tencent.mm.plugin.webview.core.e3 c(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) f184203c.get(id6);
        if (softReference != null) {
            return (com.tencent.mm.plugin.webview.core.e3) softReference.get();
        }
        return null;
    }

    public void e(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo == null) {
            return;
        }
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.parseFrom(multiTaskInfo.field_data);
            java.lang.String string = k97Var.getString(1);
            if (string == null) {
                return;
            }
            java.lang.String string2 = k97Var.getString(27);
            java.lang.String str = multiTaskInfo.field_id;
            if (str == null) {
                return;
            }
            b(new com.tencent.mm.plugin.webview.ui.tools.floatball.y(string, string2, str, multiTaskInfo.field_updateTime));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallManager", "WebMultiTaskData parse fail", th6);
        }
    }

    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo == null) {
            return;
        }
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.parseFrom(multiTaskInfo.field_data);
            java.lang.String string = k97Var.getString(1);
            if (string == null) {
                return;
            }
            java.lang.String string2 = k97Var.getString(27);
            java.lang.String str = multiTaskInfo.field_id;
            if (str == null) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar = new com.tencent.mm.plugin.webview.ui.tools.floatball.y(string, string2, str, multiTaskInfo.field_updateTime);
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.ui.tools.floatball.d0(yVar), "WebViewFloatBallThread");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallManager", "WebMultiTaskData parse fail", th6);
        }
    }

    public final void g(java.lang.String id6, com.tencent.mm.plugin.webview.core.e3 controller) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(controller, "controller");
        f184203c.put(id6, new java.lang.ref.SoftReference(controller));
    }
}
