package u10;

/* loaded from: classes9.dex */
public final class a extends t10.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        if (jumpInfo.c() == null) {
            return false;
        }
        java.lang.String url = jumpInfo.c().getUrl();
        return !(url == null || url.length() == 0);
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (jumpInfo.c() == null) {
            callback.c("jumpInfo.html5Info is null");
            return;
        }
        bw5.o7 c17 = jumpInfo.c();
        kotlin.jvm.internal.o.f(c17, "getHtml5Info(...)");
        java.lang.String url = c17.getUrl();
        if (url == null || url.length() == 0) {
            callback.c("jumpInfo.html5Info.url is null");
            return;
        }
        android.content.Context c18 = context.c();
        if (c18 == null) {
            callback.c("context.context is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("ECS_O.Router.H5", "jumpH5:url:%s", c17.getUrl());
        z20.e eVar = z20.e.f469543e;
        z20.b bVar = new z20.b();
        bVar.f469537a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f31999d = "ecso_open";
        q9Var.f32013u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f469538b = q9Var;
        bVar.f(java.lang.String.valueOf(context.f357555e));
        bVar.c("open_h5");
        bVar.e(kz5.b1.e(new jz5.l("url", c17.getUrl())));
        bVar.a();
        boolean[] zArr = c17.f31006i;
        if (zArr[4] && c17.f31004g && (z17 = zArr[5])) {
            bw5.n7 n7Var = z17 ? c17.f31005h : new bw5.n7();
            com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388607, null);
            boolean[] zArr2 = n7Var.f30530o;
            if (zArr2[1]) {
                n1Var.f187418a = (float) n7Var.f30522d;
            }
            if (zArr2[3]) {
                n1Var.f187434q = n7Var.f30524f;
            } else {
                n1Var.f187434q = false;
            }
            if (zArr2[4]) {
                n1Var.f187427j = !n7Var.f30525g;
            } else {
                n1Var.f187427j = true;
            }
            if (zArr2[6]) {
                n1Var.f187425h = !n7Var.f30527i;
            } else {
                n1Var.f187425h = true;
            }
            if (zArr2[7]) {
                n1Var.f187431n = n7Var.f30528m;
            } else {
                n1Var.f187431n = false;
            }
            if (zArr2[8]) {
                n1Var.f187422e = n7Var.f30529n;
            } else {
                n1Var.f187422e = false;
            }
            if (zArr2[2]) {
                int i17 = n7Var.f30523e;
                if (i17 == 1) {
                    n1Var.f187423f = 1;
                } else if (i17 == 2) {
                    n1Var.f187423f = 2;
                } else if (i17 == 3) {
                    n1Var.f187423f = -1;
                }
            }
            n1Var.f187432o = false;
            zg0.u2 u2Var = (zg0.u2) i95.n0.c(zg0.u2.class);
            java.lang.String url2 = jumpInfo.c().getUrl();
            kotlin.jvm.internal.o.f(url2, "getUrl(...)");
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) ((yg0.s2) u2Var).wi(c18, url2, null, n1Var)).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", c17.getUrl());
            j45.l.j(c18, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        callback.d(null);
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.d(null);
    }
}
