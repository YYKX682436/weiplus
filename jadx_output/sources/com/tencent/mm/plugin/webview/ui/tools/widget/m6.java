package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class m6 extends com.tencent.mm.plugin.webview.stub.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187410e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f187411f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f187412g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f187413h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f187414i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f187415m;

    /* renamed from: n, reason: collision with root package name */
    public int f187416n;

    public m6(java.lang.ref.WeakReference controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f187410e = controller;
        this.f187416n = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.aak);
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String E6() {
        try {
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
            if (r0Var == null) {
                return "";
            }
            java.lang.String i17 = r0Var.i();
            return i17 == null ? "" : i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreloadWebViewStubCallback", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        try {
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
            if (r0Var == null) {
                return "";
            }
            java.lang.String str = r0Var.E;
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreloadWebViewStubCallback", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public void W1(java.lang.String str) {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        int i17 = 0;
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreloadWebViewStubCallback", "setFontSizeCb, ex = " + e17.getMessage());
        }
        f0Var.f310116d = i17;
        pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.widget.k6(this, f0Var));
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public int X1() {
        com.tencent.mm.plugin.webview.permission.d O;
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
        if (r0Var == null || (O = r0Var.O()) == null) {
            return 0;
        }
        return O.f183383c;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        try {
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.widget.j6(r0Var != null ? r0Var.g0() : null, str, str2, bundle, z17));
            return false;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreloadWebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.core.u0 u0Var;
        java.lang.ref.WeakReference weakReference = this.f187412g;
        if (weakReference == null || (u0Var = (com.tencent.mm.plugin.webview.core.u0) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) u0Var).b(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList<java.lang.String> stringArrayList;
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
        nw4.n g07 = r0Var != null ? r0Var.g0() : null;
        kotlin.jvm.internal.o.e(g07, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        com.tencent.mm.plugin.webview.core.r0 r0Var2 = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var2 != null ? r0Var2.R : null;
        java.lang.ref.WeakReference weakReference = this.f187411f;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        switch (i17) {
            case 1002:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.c6(activity, g07, wVar, bundle));
                return true;
            case 1003:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.d6(g07, wVar, bundle));
                return true;
            case 1004:
            case 1005:
            case 1009:
            default:
                return true;
            case 1006:
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.widget.b6(this, bundle, g07));
                return true;
            case 1007:
                kotlin.jvm.internal.o.d(bundle);
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.i6(g07, wVar, bundle.getString("download_manager_appid", ""), bundle.getLong("download_manager_downloadid"), bundle.getInt("download_manager_progress"), bundle.getFloat("download_manager_progress_float")));
                return true;
            case 1008:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.e6(g07, wVar, bundle));
                return true;
            case 1010:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.f6(g07, wVar, bundle));
                return true;
            case 1011:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.g6(g07, wVar, bundle));
                return true;
            case 1012:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.h6(g07, wVar, bundle));
                return true;
            case 1013:
                try {
                    linkedList = new java.util.LinkedList();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreloadWebViewStubCallback", e17, "parse webCompt", new java.lang.Object[0]);
                }
                if (bundle == null || (string = bundle.getString("__appId")) == null || (string2 = bundle.getString("__url")) == null) {
                    return false;
                }
                if (bundle.containsKey("__webComptList") && (stringArrayList = bundle.getStringArrayList("__webComptList")) != null) {
                    for (java.lang.String str : stringArrayList) {
                        r45.d24 d24Var = new r45.d24();
                        d24Var.parseFrom(bundle.getByteArray(str));
                        linkedList.add(d24Var);
                    }
                }
                com.tencent.mm.plugin.webview.webcompt.y1 y17 = g07.y();
                if (y17 != null) {
                    y17.b(string, string2, linkedList);
                }
                return true;
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        try {
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f187410e.get();
            if (r0Var == null) {
                return "";
            }
            java.lang.String Z = r0Var.Z();
            return Z == null ? "" : Z;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreloadWebViewStubCallback", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
    
        r7 = r8.getString("key_set_bounce_background_color");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle i(int r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.widget.m6.i(int, android.os.Bundle):android.os.Bundle");
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public void te(int i17, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f187411f;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.widget.l6(activity, this, i17, bundle));
    }
}
