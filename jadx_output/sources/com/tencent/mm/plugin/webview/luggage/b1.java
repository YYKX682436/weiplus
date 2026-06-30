package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class b1 extends sd.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182150a;

    public b1(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182150a = e0Var;
    }

    @Override // sd.t0
    public android.webkit.WebResourceResponse a(android.webkit.WebResourceRequest webResourceRequest, android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182150a;
        try {
            int i17 = bundle.getInt("resourceType");
            if (i17 == 1 || i17 == 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "get resoutce type is iframe : %d, start geta8key", java.lang.Integer.valueOf(i17));
                java.lang.String uri = webResourceRequest.getUrl().toString();
                com.tencent.mm.plugin.webview.permission.d dVar = e0Var.f182178J;
                com.tencent.mm.plugin.webview.permission.a aVar = e0Var.B1;
                synchronized (dVar) {
                    dVar.t(uri, false, 5, aVar);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuggageMMWebPage", "get resource type failed Exception ; %s", e17.getMessage());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuggageMMWebPage", "get resource type failed Throwable ; %s", th6.getMessage());
        }
        if (webResourceRequest != null) {
            webResourceRequest.getUrl().toString();
        }
        e0Var.getClass();
        return null;
    }

    @Override // sd.t0
    public void c(sd.u0 u0Var, java.lang.String str) {
        this.f182150a.C(str);
    }

    @Override // sd.t0
    public void d(sd.u0 u0Var, java.lang.String str) {
        int l17;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) this.f182150a;
        com.tencent.mm.plugin.game.luggage.page.w0 w0Var = x0Var.f139955g2;
        if (w0Var != null) {
            w0Var.a();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = x0Var.M;
        n3Var.postUI(new com.tencent.mm.plugin.game.luggage.page.l0(x0Var));
        vz4.x S = x0Var.S();
        uw4.n nVar = x0Var.f182180p;
        S.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new vz4.u(S, nVar));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onUrlLoadingStarted, url = %s, __Time__, time = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        int a17 = hy4.b0.a(x0Var.f406610d);
        if (a17 < 1 || a17 > 8) {
            a17 = 2;
        }
        x0Var.z(a17);
        n3Var.postUI(new com.tencent.mm.plugin.game.luggage.page.f0(x0Var, a17));
        boolean V = x0Var.V(str);
        sd.o0 o0Var = x0Var.f406655i;
        if (V && ((l17 = x0Var.f182178J.l(str, false)) == 0 || l17 == 2 || l17 == 8)) {
            o0Var.f406633i.stopLoading();
        } else {
            com.tencent.mm.plugin.webview.model.k.b(x0Var.f182180p);
            com.tencent.mm.plugin.webview.luggage.x2 x2Var = x0Var.D;
            if (x2Var != null) {
                x2Var.c0("rawUrl", str);
                x2Var.t0(str);
            }
            com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = x0Var.F;
            if (handOffURL != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                handOffURL.setUrl(str == null ? "" : str);
                ((d73.i) i95.n0.c(d73.i.class)).Jc(x0Var.F);
            }
            x0Var.f182186t.setOptionEnable(false);
            x0Var.U();
            x0Var.H(str);
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = x0Var.M1;
        if (gameWebPerformanceInfo.E == 0) {
            gameWebPerformanceInfo.E = currentTimeMillis;
        }
        sx4.d0 d0Var = x0Var.P1;
        if (d0Var.f413585d == 0) {
            d0Var.f413585d = currentTimeMillis;
        }
        java.lang.String N = com.tencent.mm.sdk.platformtools.t8.N(str);
        if (N == null || !N.equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
            o0Var.f406619e = x0Var.L;
        } else {
            o0Var.f406619e = td.c.f417583a;
        }
        sx4.v vVar = x0Var.L1.f413666f.f413660a;
        vVar.f413665e = null;
        vVar.f413662b = 0L;
        vVar.f413663c = 0L;
        vVar.f413664d = 0L;
    }
}
