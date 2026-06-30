package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.s f183572g;

    public t(com.tencent.mm.plugin.webview.stub.s sVar, int i17, android.os.Bundle bundle, int i18) {
        this.f183572g = sVar;
        this.f183569d = i17;
        this.f183570e = bundle;
        this.f183571f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.l4 x17;
        int i17 = this.f183571f;
        android.os.Bundle bundle = this.f183570e;
        com.tencent.mm.plugin.webview.stub.s sVar = this.f183572g;
        int i18 = this.f183569d;
        if (i18 == 20) {
            bundle.setClassLoader(com.tencent.mm.plugin.webview.stub.t.class.getClassLoader());
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17).f184984o = bundle.getBundle("jsapiargs");
            java.lang.String str = (java.lang.String) bundle.getCharSequence("bizofstartfrom");
            android.os.Bundle bundle2 = bundle.getBundle("startwebviewparams");
            if (str != null && bundle2 != null) {
                com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent notifyStartWebViewParamsEvent = new com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent();
                am.yl ylVar = notifyStartWebViewParamsEvent.f54553g;
                ylVar.f8468a = str;
                ylVar.f8469b = bundle2;
                notifyStartWebViewParamsEvent.e();
            }
            sVar.f183566d.f183497w = bundle.getInt("screen_orientation", -1);
            return;
        }
        if (i18 == 21) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17).r6().putAll(bundle);
            return;
        }
        boolean z17 = false;
        if (i18 == 29) {
            java.lang.String string = bundle.getString("srcUsername");
            r01.q3.cj().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && r01.z.l(string)) {
                qk.o b17 = r01.z.b(string);
                if (b17.D0(false) != null && b17.D0(false).d() != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.y0()) && (x17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().x(b17.y0())) != null && x17.h1().equals(string) && x17.d1() > 0) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(b17.y0());
                }
                android.database.Cursor b37 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b3(string);
                b37.moveToFirst();
                while (!b37.isAfterLast()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(b37);
                    f9Var.r1(4);
                    b37.moveToNext();
                    z17 = true;
                }
                b37.close();
                if (z17) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(string);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Mb(string);
                }
            }
            r01.q3.cj().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && r01.z.l(string)) {
                ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f63516b = string;
                ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).e();
            }
            r01.q3.Zi().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && r01.z.l(string)) {
                r01.r1 Zi = r01.q3.Zi();
                Zi.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new r01.p1(Zi, null, string, null, 0));
                return;
            }
            return;
        }
        if (i18 == 30) {
            java.lang.String string2 = bundle.getString("srcUsername");
            r01.q3.cj().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2) && r01.z.l(string2)) {
                ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f63516b = "";
            }
            r01.q3.Zi().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2) && r01.z.l(string2)) {
                r01.r1 Zi2 = r01.q3.Zi();
                Zi2.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new r01.q1(Zi2, null, string2));
                return;
            }
            return;
        }
        if (i18 == 53) {
            if (java.lang.Boolean.valueOf(bundle.getBoolean("web_search_data_ui_image_path_use_circle_to_search")).booleanValue()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String string3 = bundle.getString("web_search_data_ui_image_path");
                java.lang.String string4 = bundle.getString("web_search_data_ui_image_path_origin_url");
                java.lang.String string5 = bundle.getString("web_search_data_ui_image_path_image_url");
                hashMap.put("imgPath", string3);
                hashMap.put("sourceUrl", string4);
                hashMap.put("imageUrl", string5);
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, 7, 8, hashMap);
                return;
            }
            su4.i1 i1Var = new su4.i1();
            i1Var.f412923b = sVar.f183566d;
            i1Var.f412928g = bundle.getString("web_search_data_ui_image_path");
            i1Var.f412925d = bundle.getInt("KWebSearchSendDataImagePath_from_source");
            i1Var.f412930i = 83;
            i1Var.f412922a = com.tencent.mm.plugin.webview.ui.tools.b5.f183930w;
            com.tencent.mm.plugin.webview.ui.tools.b5.f183930w = 0L;
            ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
            return;
        }
        if (i18 == 54) {
            java.lang.String string6 = bundle.getString("web_search_data_ui_image_path_origin_url");
            java.lang.String string7 = bundle.getString("web_search_data_ui_image_path");
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            long g17 = o13.n.g(67);
            com.tencent.mm.plugin.webview.ui.tools.b5.f183930w = g17;
            java.lang.String c17 = o13.p.c(g17);
            int i19 = (com.tencent.mm.sdk.platformtools.t8.K0(string6) || !(string6.startsWith("http://mp.weixin.qq.com/s?") || string6.startsWith("https://mp.weixin.qq.com/s?") || string6.startsWith("http://mp.weixin.qq.com/s/") || string6.startsWith("https://mp.weixin.qq.com/s/"))) ? 14 : 11;
            com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
            chatImageWebSearchActionStruct.t(c17);
            chatImageWebSearchActionStruct.r("");
            chatImageWebSearchActionStruct.f55628f = i19;
            chatImageWebSearchActionStruct.f55627e = 1;
            chatImageWebSearchActionStruct.f55629g = 83;
            chatImageWebSearchActionStruct.q("");
            chatImageWebSearchActionStruct.p("");
            chatImageWebSearchActionStruct.f55632j = 0;
            chatImageWebSearchActionStruct.s(com.tencent.mm.sdk.platformtools.w2.a(string7));
            chatImageWebSearchActionStruct.f55635m = java.lang.System.currentTimeMillis();
            chatImageWebSearchActionStruct.k();
            su4.k3.m(chatImageWebSearchActionStruct);
            return;
        }
        switch (i18) {
            case 1:
                com.tencent.mm.plugin.webview.stub.WebViewStubService.a(sVar.f183566d, 2, bundle, i17);
                return;
            case 2:
                db5.t7.k(sVar.f183566d, null);
                return;
            case 3:
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putInt("stat_scene", 4);
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
                if (a17 != null) {
                    bundle3.putString("stat_url", a17.n6());
                }
                sVar.f183566d.f183488n.post(new com.tencent.mm.plugin.webview.stub.u(sVar, bundle, bundle3));
                return;
            case 4:
                com.tencent.mm.plugin.webview.stub.WebViewStubService.a(sVar.f183566d, 3, bundle, i17);
                return;
            case 5:
                int i27 = bundle.getInt("scene_end_type", 0);
                int i28 = bundle.getInt("scene_end_listener_hash_code", -1);
                if (i28 != -1) {
                    ((java.util.HashSet) sVar.f183566d.f183496v).add(java.lang.Integer.valueOf(i28));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "add Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_inc_count[%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(((java.util.HashSet) sVar.f183566d.f183496v).size()), java.lang.Integer.valueOf(sVar.f183566d.f183487m));
                if (i27 > 0) {
                    sVar.f183566d.f183487m++;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "real add Scene end, hashCode:[%d]", java.lang.Integer.valueOf(i28));
                    gm0.j1.d().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, sVar.f183566d);
                    gm0.j1.d().a(673, sVar.f183566d);
                    gm0.j1.d().a(ma1.i.CTRL_INDEX, sVar.f183566d);
                    return;
                }
                return;
            case 6:
                int i29 = bundle.getInt("scene_end_type", 0);
                int i37 = bundle.getInt("scene_end_listener_hash_code", -1);
                if (i37 != -1) {
                    ((java.util.HashSet) sVar.f183566d.f183496v).remove(java.lang.Integer.valueOf(i37));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_dec_count:[%d]", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(((java.util.HashSet) sVar.f183566d.f183496v).size()), java.lang.Integer.valueOf(sVar.f183566d.f183487m));
                if (i29 > 0) {
                    com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = sVar.f183566d;
                    int i38 = webViewStubService.f183487m - 1;
                    webViewStubService.f183487m = i38;
                    if (i38 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set size:[%d], unexpected_count[%d]", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(((java.util.HashSet) sVar.f183566d.f183496v).size()), java.lang.Integer.valueOf(sVar.f183566d.f183487m));
                        sVar.f183566d.f183487m = 0;
                    }
                    com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService2 = sVar.f183566d;
                    if (webViewStubService2.f183487m > 0 || ((java.util.HashSet) webViewStubService2.f183496v).size() > 0) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "real remove Scene end, hashCode:[%d]", java.lang.Integer.valueOf(i37));
                    if (gm0.j1.a()) {
                        gm0.j1.d().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, sVar.f183566d);
                        gm0.j1.d().q(673, sVar.f183566d);
                        gm0.j1.d().q(ma1.i.CTRL_INDEX, sVar.f183566d);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
                intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
                intent.addFlags(268435456);
                o25.t1 t1Var = dw4.a.f244297a;
                com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService3 = sVar.f183566d;
                ((com.tencent.mm.app.y7) t1Var).getClass();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtras(intent.getExtras());
                if (intent.getFlags() != 0) {
                    intent2.addFlags(intent.getFlags());
                }
                java.lang.String str2 = o25.z.f342593a;
                if (c01.e2.a0()) {
                    o25.z.k(com.tencent.mm.sdk.platformtools.x2.f193071a, o45.cg.a());
                    return;
                } else {
                    o25.z.j(webViewStubService3, o45.cg.a());
                    return;
                }
            case 8:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtras(bundle);
                intent3.addFlags(268435456);
                o25.t1 t1Var2 = dw4.a.f244297a;
                com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService4 = sVar.f183566d;
                ((com.tencent.mm.app.y7) t1Var2).getClass();
                if (webViewStubService4 != null) {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtras(intent3.getExtras());
                    if (intent3.getFlags() != 0) {
                        intent4.addFlags(intent3.getFlags());
                    }
                    j45.l.j(webViewStubService4, "subapp", ".ui.pluginapp.ContactSearchUI", intent4, null);
                    return;
                }
                return;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "not support action code:[%d]", java.lang.Integer.valueOf(i18));
                return;
        }
    }
}
