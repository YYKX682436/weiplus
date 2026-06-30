package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class w implements com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static int f153363m;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f153364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f153365e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f153366f = false;

    /* renamed from: g, reason: collision with root package name */
    public final wq3.j f153367g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.v f153368h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f153369i;

    public w(android.app.Activity activity, com.tencent.mm.plugin.product.ui.v vVar) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f153369i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.product.ui.MallProductHelper$4
            {
                this.__eventId = 520089918;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
                boolean z17 = false;
                if (walletPayResultEvent2 instanceof com.tencent.mm.autogen.events.WalletPayResultEvent) {
                    am.s10 s10Var = walletPayResultEvent2.f54965g;
                    if (s10Var.f7865e) {
                        com.tencent.mars.xlog.Log.f("MicroMsg.MallProductUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    } else {
                        z17 = true;
                        if (s10Var.f7863c == -1) {
                            com.tencent.mm.plugin.product.ui.w wVar = com.tencent.mm.plugin.product.ui.w.this;
                            if (!wVar.f153366f) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MallProductUI", "MallProduct pay result : ok");
                                wVar.a();
                                wVar.f153366f = true;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MallProductUI", "MallProduct pay result : cancel");
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.f("MicroMsg.MallProductUI", "mismatched event");
                }
                return z17;
            }
        };
        this.f153364d = activity;
        this.f153367g = vq3.e.wi().Ai();
        this.f153368h = vVar;
    }

    public final void a() {
        wq3.k Bi = vq3.e.wi().Bi();
        r45.ek5 h17 = this.f153367g.h();
        Bi.getClass();
        if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.f373583e) && !h17.f373583e.contains(";")) {
            java.util.ArrayList arrayList = (java.util.ArrayList) Bi.f448568a;
            arrayList.remove(h17.f373583e);
            arrayList.add(h17.f373583e);
            Bi.a();
        }
        android.content.Intent intent = new android.content.Intent(this.f153364d, (java.lang.Class<?>) com.tencent.mm.plugin.product.ui.MallProductUI.class);
        intent.putExtra("key_go_finish", true);
        intent.addFlags(67108864);
        android.app.Activity activity = this.f153364d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "doSuccessFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/product/ui/MallProductHelper", "doSuccessFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b(int i17, int i18, android.content.Intent intent) {
        wq3.j jVar = this.f153367g;
        if (i17 == 1) {
            if (i18 != -1 || intent == null) {
                return;
            }
            jVar.s(intent);
            com.tencent.mm.plugin.product.ui.v vVar = this.f153368h;
            if (vVar != null) {
                vVar.a(0, 0, "");
            }
            gm0.j1.i();
            com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
            wq3.t tVar = jVar.f448549b;
            r1Var.g(new wq3.n(tVar != null ? tVar.f448595a : "", jVar.f448551d, jVar.f448556i));
            return;
        }
        if (i17 == 2) {
            if (i18 != -1 || intent == null) {
                return;
            }
            jVar.s(intent);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new wq3.q(jVar.i(), f153363m));
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
            am.s10 s10Var = walletPayResultEvent.f54965g;
            s10Var.f7863c = i17;
            s10Var.f7861a = intent;
            this.f153369i.callback(walletPayResultEvent);
            return;
        }
        if (i17 == 4) {
            com.tencent.mm.plugin.product.ui.v vVar2 = this.f153368h;
            if (vVar2 != null) {
                vVar2.a(0, 0, "");
                return;
            }
            return;
        }
        if (i17 != 10000) {
            return;
        }
        this.f153364d.showDialog(-10002);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new wq3.p(jVar.f448551d, jVar.f448559l));
    }

    public void c() {
        gm0.j1.i();
        gm0.j1.n().f273288b.a(553, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(554, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(uc1.s1.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(556, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.lab.d.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(578, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(nd1.j2.CTRL_INDEX, this);
    }

    public void d() {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(553, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(554, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(uc1.s1.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(556, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.lab.d.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(578, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(nd1.j2.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        android.app.Activity activity = this.f153364d;
        wq3.j jVar = this.f153367g;
        if (i17 != 0 || i18 != 0) {
            if (i18 == -10010003) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallProductUI", "deal with MMBIZPAY_FUNC_ERR_NO_EXISTED_PRODUCT");
                if (m1Var instanceof wq3.o) {
                    wq3.o oVar = (wq3.o) m1Var;
                    jVar.u(oVar.f448579g, oVar.f448580h);
                    com.tencent.mm.plugin.product.ui.v vVar = this.f153368h;
                    if (vVar != null) {
                        vVar.a(i17, i18, str);
                        return;
                    }
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MallProductUI", "unkown errCode " + i18);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str2 = i18 + " : " + activity.getString(com.tencent.mm.R.string.gro);
            } else {
                str2 = str;
            }
            com.tencent.mm.plugin.product.ui.v vVar2 = this.f153368h;
            if (vVar2 != null) {
                vVar2.a(i17, i18, str2);
                return;
            }
            return;
        }
        if (m1Var instanceof wq3.o) {
            wq3.o oVar2 = (wq3.o) m1Var;
            jVar.u(oVar2.f448579g, oVar2.f448580h);
            com.tencent.mm.plugin.product.ui.v vVar3 = this.f153368h;
            if (vVar3 != null) {
                vVar3.a(i17, i18, str);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(oVar2.f448579g.f448595a)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11007, jVar.j(), oVar2.f448578f, java.lang.Integer.valueOf(f153363m), 1);
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11007, jVar.j(), oVar2.f448579g.f448595a, java.lang.Integer.valueOf(f153363m), 1);
                return;
            }
        }
        if (m1Var instanceof wq3.q) {
            wq3.q qVar = (wq3.q) m1Var;
            java.lang.String str3 = qVar.f448587f;
            java.util.LinkedList linkedList = qVar.f448588g;
            java.util.LinkedList linkedList2 = qVar.f448589h;
            jVar.f448551d = str3;
            jVar.f448564q = linkedList2;
            jVar.f448563p = linkedList;
            jVar.t(0);
            android.app.Activity activity2 = this.f153364d;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.product.ui.MallProductSubmitUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/product/ui/MallProductHelper", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11009, jVar.j(), jVar.f448549b.f448595a, java.lang.Integer.valueOf(f153363m), 1);
            return;
        }
        if (m1Var instanceof wq3.m) {
            return;
        }
        if (m1Var instanceof wq3.s) {
            java.lang.String str4 = ((wq3.s) m1Var).f448594f;
            int i19 = f153363m == 7 ? 1001 : 6;
            xq3.n nVar = jVar.f448549b.f448600f;
            java.lang.String str5 = nVar != null ? nVar.f456105d : null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = str4;
                payInfo.f192116o = str5;
                payInfo.f192117p = null;
                payInfo.f192109e = i19;
                payInfo.f192121t = null;
                payInfo.f192111g = 0;
                h45.a0.f(activity, payInfo, 3);
            }
            this.f153369i.alive();
            return;
        }
        if (m1Var instanceof wq3.r) {
            db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.gs6));
            a();
            return;
        }
        if (m1Var instanceof wq3.n) {
            try {
                activity.dismissDialog(-10002);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MallProductUI", e17.toString());
            }
            jVar.f448563p = ((wq3.n) m1Var).f448575f;
            jVar.t(0);
            return;
        }
        if (m1Var instanceof wq3.p) {
            try {
                activity.dismissDialog(-10002);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MallProductUI", e18.toString());
            }
            wq3.p pVar = (wq3.p) m1Var;
            java.lang.String str6 = pVar.f448584g;
            java.util.LinkedList linkedList3 = pVar.f448583f;
            jVar.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str6) && linkedList3 != null && linkedList3.size() > 0) {
                if (jVar.f448567t == null) {
                    jVar.f448567t = new java.util.HashMap();
                }
                ((java.util.HashMap) jVar.f448567t).put(str6, linkedList3);
            }
            com.tencent.mm.plugin.product.ui.v vVar4 = this.f153368h;
            if (vVar4 != null) {
                vVar4.a(i17, i18, str);
            }
        }
    }
}
