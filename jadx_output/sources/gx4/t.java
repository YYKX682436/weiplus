package gx4;

/* loaded from: classes8.dex */
public enum t {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag f277443d;

    /* renamed from: e, reason: collision with root package name */
    public gx4.d f277444e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f277445f;

    /* renamed from: g, reason: collision with root package name */
    public long f277446g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final gx4.s f277447h = new gx4.s();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f277448i = new java.util.LinkedList();

    t() {
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "attachBag");
        android.view.WindowManager windowManager = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName();
        layoutParams.flags = 40;
        layoutParams.gravity = 51;
        int i17 = gx4.e.f277413d;
        layoutParams.width = i17;
        layoutParams.height = i17;
        gx4.s sVar = this.f277447h;
        layoutParams.x = sVar.f277437e;
        layoutParams.y = sVar.f277436d;
        try {
            windowManager.addView(this.f277443d, layoutParams);
            m();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagMgr", "add failed %s", e17);
        }
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "checkResumeBag mInWebViewUIFromBag:%b", java.lang.Boolean.valueOf(this.f277445f));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f277447h.f277434b) && !this.f277445f) {
            boolean z17 = java.lang.System.currentTimeMillis() - this.f277446g > 500;
            if (!z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBagMgr", "click to fast!!!");
            }
            if (z17) {
                com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = this.f277443d;
                if (webViewBag == null || webViewBag.getVisibility() != 0) {
                    o(false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "checkResumeBag show bag");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "already show");
                    this.f277443d.setTouchEnable(true);
                    return;
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag2 = this.f277443d;
        if (webViewBag2 != null) {
            webViewBag2.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "checkResumeBag hide bag");
    }

    public void j() {
        gx4.s sVar = this.f277447h;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "clearBag mCurrentUrl:%s", sVar.f277434b);
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = this.f277443d;
        if (webViewBag != null) {
            webViewBag.setVisibility(8);
        }
        sVar.f277433a = null;
        sVar.f277434b = null;
        sVar.f277435c = null;
        sVar.f277438f = 0L;
        sVar.f277439g = 0;
        sVar.f277440h = new org.json.JSONObject();
        sVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "unAttachBag");
        if (this.f277443d != null) {
            try {
                ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).removeView(this.f277443d);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagMgr", "remove failed %s", e17);
            }
            this.f277443d = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagMgr", "unAttachBag mBag null");
        }
        gx4.d dVar = this.f277444e;
        if (dVar != null) {
            try {
                ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).removeView(dVar.f277401a);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BagCancelController", "whenBagUnAttach remove failed %s", e18);
            }
            this.f277444e = null;
        }
        java.util.Iterator it = this.f277448i.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public final void k(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        gx4.s sVar = this.f277447h;
        g0Var.d(11576, sVar.f277434b, java.lang.Integer.valueOf(i17), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - sVar.f277438f), sVar.f277433a);
    }

    public final void l(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        gx4.s sVar = this.f277447h;
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(sVar.f277433a)) {
            k(23);
            sVar.f277433a = com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("bagId#%d#%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), sVar.f277434b));
        }
        sVar.f277434b = str;
        sVar.f277435c = str2;
        sVar.f277439g = i17;
        sVar.f277438f = java.lang.System.currentTimeMillis();
        int i18 = gx4.n.f277423a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bundle != null) {
            try {
                for (java.lang.String str3 : bundle.keySet()) {
                    jSONObject.put(str3, new gx4.m(bundle.get(str3)));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagIntentLogic", "save exp:%s", e17);
            }
        }
        sVar.f277440h = jSONObject;
        sVar.a();
    }

    public final void m() {
        gx4.s sVar = this.f277447h;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "setAngryInfo mBagInfo.lastActiveTime:%d", java.lang.Long.valueOf(sVar.f277438f));
        if (this.f277443d == null) {
            return;
        }
        if ("1".equals((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEBVIEW_BAG_TEST_INFO_STRING_SYNC, "0"))) {
            this.f277443d.b(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, 100, sVar.f277438f + 2000);
        } else {
            this.f277443d.b(3600000, 30000, sVar.f277438f + 3600000);
        }
    }

    public void n(float f17) {
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = this.f277443d;
        if (webViewBag == null) {
            return;
        }
        webViewBag.setAlpha(f17);
        if (f17 == 0.0f) {
            this.f277443d.setVisibility(8);
        } else {
            this.f277443d.setVisibility(0);
        }
    }

    public final void o(boolean z17) {
        gx4.s sVar = this.f277447h;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "showBag url:%s", sVar.f277434b);
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(sVar.f277434b)) {
            j();
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = this.f277443d;
        boolean z18 = webViewBag == null;
        if (webViewBag == null) {
            this.f277444e = new gx4.d(new gx4.p(this));
            com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag2 = new com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag(com.tencent.mm.sdk.platformtools.x2.f193071a, null);
            this.f277443d = webViewBag2;
            webViewBag2.setListener(new gx4.q(this));
            this.f277443d.setOnClickListener(new gx4.r(this));
        }
        n(1.0f);
        this.f277443d.setTouchEnable(true);
        this.f277443d.setIcon(sVar.f277435c);
        m();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "bag showed needAttach:%b mCurrentBagId:%s", java.lang.Boolean.valueOf(z18), sVar.f277433a);
        if (z18) {
            if (!z17) {
                h();
                return;
            }
            this.f277443d.setVisibility(4);
            h();
            this.f277443d.setVisibility(0);
            this.f277443d.d();
            return;
        }
        if (this.f277443d.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "already showed");
            return;
        }
        this.f277443d.setVisibility(0);
        if (z17) {
            this.f277443d.d();
        }
    }
}
