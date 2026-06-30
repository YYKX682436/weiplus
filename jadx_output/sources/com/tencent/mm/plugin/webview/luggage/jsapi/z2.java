package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class z2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public sd.b f182529a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f182530b;

    public z2(sd.b bVar, java.lang.String str) {
        this.f182529a = bVar;
        this.f182530b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.j14 j14Var;
        sd.b bVar = this.f182529a;
        if (bVar == null) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreVerify", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            b(str);
            return;
        }
        r45.y14 y14Var = (r45.y14) oVar.f70711b.f70700a;
        if (y14Var == null || (j14Var = y14Var.f390710d) == null || j14Var.f377491d != 0) {
            b(str);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.c4 c4Var = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).K;
        java.lang.String str2 = this.f182530b;
        c4Var.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.webview.luggage.e0 e0Var = c4Var.f182161d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e0Var.u())) {
                c4Var.f182158a.put(c4Var.a(e0Var.u()), str2);
            }
        }
        com.tencent.mm.plugin.webview.luggage.c4 c4Var2 = ((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).K;
        java.lang.String str3 = this.f182530b;
        java.lang.String str4 = y14Var.f390713g;
        c4Var2.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            c4Var2.f182160c.put(str3, str4);
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.q qVar = new com.tencent.mm.plugin.webview.ui.tools.jsapi.q(this.f182530b, y14Var);
        com.tencent.mm.plugin.webview.luggage.c4 c4Var3 = ((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).K;
        com.tencent.mm.plugin.webview.luggage.e0 e0Var2 = c4Var3.f182161d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e0Var2.u())) {
            c4Var3.f182159b.put(c4Var3.a(e0Var2.u()), qVar);
        }
        java.util.LinkedList linkedList = y14Var.f390711e;
        sd.d dVar = this.f182529a.f406596a;
        com.tencent.mm.protocal.JsapiPermissionWrapper h17 = ((com.tencent.mm.plugin.webview.luggage.e0) dVar).f182178J.h(((com.tencent.mm.plugin.webview.luggage.e0) dVar).u());
        if (h17 == null) {
            b("");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.lx6 lx6Var = (r45.lx6) it.next();
                o45.m b17 = o45.vf.b(lx6Var.f379957d);
                if (b17 != null) {
                    int i19 = b17.f342978c;
                    int d17 = h17.d(i19);
                    int i27 = lx6Var.f379958e;
                    if (d17 != i27) {
                        h17.h(i19, (byte) i27);
                    }
                }
            }
        }
        if (((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).D != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreVerify", "updateFloatBallIcon:%s", y14Var.f390713g);
            ((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).D.X(y14Var.f390713g);
        }
        if (((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).E != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreVerify", "updateFloatBallIcon:%s", y14Var.f390713g);
            com.tencent.mm.plugin.webview.luggage.x3 x3Var = ((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).E;
            java.lang.String icon = y14Var.f390713g;
            x3Var.getClass();
            kotlin.jvm.internal.o.g(icon, "icon");
            if (x3Var.f182688z == null) {
                x3Var.K(icon);
            }
        }
        sd.d dVar2 = this.f182529a.f406596a;
        if (((com.tencent.mm.plugin.webview.luggage.e0) dVar2).F != null) {
            com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = ((com.tencent.mm.plugin.webview.luggage.e0) dVar2).F;
            java.lang.String str5 = y14Var.f390713g;
            if (str5 == null) {
                str5 = "";
            }
            handOffURL.setIcon(str5);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).F);
        }
        b("");
    }

    public final void b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f182529a.a();
        } else {
            this.f182529a.c(str, null);
        }
        sx4.d0.l(((com.tencent.mm.plugin.webview.luggage.e0) this.f182529a.f406596a).s(), java.lang.System.currentTimeMillis());
        this.f182529a = null;
        this.f182530b = null;
    }
}
