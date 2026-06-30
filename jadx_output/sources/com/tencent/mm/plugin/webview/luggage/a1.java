package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class a1 implements com.tencent.mm.plugin.webview.permission.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182142a;

    public a1(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182142a = e0Var;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182142a;
        e0Var.Q = false;
        e0Var.F(new com.tencent.mm.plugin.webview.luggage.y0(this, str, str2));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void c(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182142a;
        e0Var.Q = false;
        e0Var.F(new com.tencent.mm.plugin.webview.luggage.z0(this, i17, str, i18, i19, str2));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void d(int i17, java.lang.String str) {
        sx4.d0 d0Var = ((com.tencent.mm.plugin.game.luggage.page.x0) this.f182142a).P1;
        if (d0Var.f413587f == 0) {
            d0Var.f413587f = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void e(int i17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f182142a.Q = false;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void f(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public /* bridge */ /* synthetic */ boolean g(int i17, java.lang.String str, java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void h(int i17, boolean z17, final java.lang.String str, final java.lang.String str2, java.lang.Object obj) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182142a;
        e0Var.Q = false;
        final java.util.Map g17 = com.tencent.mm.plugin.webview.permission.d.g(((r45.s83) obj).f385562x);
        if (z17) {
            final com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) e0Var;
            x0Var.F(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.luggage.e0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.webview.luggage.e0 e0Var2 = com.tencent.mm.plugin.webview.luggage.e0.this;
                    sd.o0 o0Var = e0Var2.f406655i;
                    o0Var.f406641t = false;
                    if (e0Var2.y(str) || e0Var2.T || e0Var2.f182181p0) {
                        return;
                    }
                    java.util.Map map = g17;
                    java.lang.String str3 = str2;
                    if (map == null || map.size() <= 0) {
                        o0Var.j(str3);
                    } else {
                        o0Var.f406633i.loadUrl(str3, map);
                    }
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onUrlForceRedirect reqUrl = " + str);
            if (!x0Var.f139953e2) {
                x0Var.f139953e2 = true;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("uia", 1000);
                    jSONObject.put("pid", "000");
                    jSONObject.put("url", str);
                } catch (org.json.JSONException unused) {
                }
                com.tencent.mm.game.report.l.c(x0Var.f182185s.getContext(), 36, 0, 0, 56, 0, jSONObject.toString());
            }
        }
        e0Var.F(new com.tencent.mm.plugin.webview.luggage.x0(this, str, str2, g17));
    }
}
