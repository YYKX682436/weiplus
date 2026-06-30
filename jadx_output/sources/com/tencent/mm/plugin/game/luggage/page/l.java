package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.plugin.game.luggage.page.x0 {

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.Map f139910j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.Map f139911k2;

    /* renamed from: l2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.k f139912l2;

    /* renamed from: m2, reason: collision with root package name */
    public android.widget.FrameLayout f139913m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.view.View f139914n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.x0 f139915o2;

    /* renamed from: p2, reason: collision with root package name */
    public final java.lang.String f139916p2;

    /* renamed from: q2, reason: collision with root package name */
    public android.app.Dialog f139917q2;

    /* renamed from: r2, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f139918r2;

    /* renamed from: s2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.j f139919s2;

    public l(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f139910j2 = concurrentHashMap;
        this.f139911k2 = new java.util.concurrent.ConcurrentHashMap();
        android.content.Context context = this.f406610d;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            this.f139918r2 = (com.tencent.mm.ui.MMActivity) context;
        }
        java.lang.String string = bundle.getString("game_tab_key");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            concurrentHashMap.put(string, this);
        }
        this.f139915o2 = this;
        this.V1 = this;
        c0(this, string);
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182186t;
        if (y1Var != null) {
            y1Var.b();
        }
        this.f139916p2 = bundle.getString("game_pre_inject_data");
        this.f406657n.remove("game_pre_inject_data");
        if (this.f139917q2 == null) {
            androidx.appcompat.app.i0 i0Var = new androidx.appcompat.app.i0(this.f406610d, com.tencent.mm.R.style.f494220hf);
            this.f139917q2 = i0Var;
            i0Var.setCanceledOnTouchOutside(true);
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0
    public void C(java.lang.String str) {
        super.C(str);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0
    public void D(int i17, java.lang.String str, java.lang.String str2) {
        super.D(i17, str, str2);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0
    public java.lang.String O() {
        return this.f139916p2;
    }

    public void W(java.lang.String str) {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var;
        android.view.View view;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) ((java.util.concurrent.ConcurrentHashMap) this.f139910j2).get(str)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "switch to tab: %s", str);
        if (x0Var != this || (view = this.f139914n2) == null) {
            x0Var.f406654h.bringToFront();
            x0Var.g();
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var2 = this.f139915o2;
            if (x0Var2 != x0Var) {
                x0Var2.d();
            }
        } else {
            view.bringToFront();
        }
        this.f139915o2 = x0Var;
    }

    public final void X(java.lang.String str, int i17) {
        java.util.Map map = this.f139911k2;
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num == null) {
            map.put(str, java.lang.Integer.valueOf(i17));
        } else {
            map.put(str, java.lang.Integer.valueOf(i17 | num.intValue()));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !map.containsKey(str)) {
            return;
        }
        java.util.Map map2 = this.f139910j2;
        if (map2.containsKey(str) && ((java.lang.Integer) map.get(str)).intValue() == 3) {
            map.put(str, 4);
            ((com.tencent.mm.plugin.game.luggage.page.x0) map2.get(str)).o("javascript:(function(){ window.__gameTabFirstShow__= 1; })()", null);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "injectTabFirstShow, tabKey:%s", str);
        }
    }

    public void Y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "computeFcp()");
        for (com.tencent.mm.plugin.game.luggage.page.x0 x0Var : ((java.util.concurrent.ConcurrentHashMap) this.f139910j2).values()) {
            if (x0Var != null) {
                x0Var.M(null);
            }
        }
    }

    public final java.lang.String Z(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        if (x0Var == null) {
            return "";
        }
        for (java.util.Map.Entry entry : this.f139910j2.entrySet()) {
            if (x0Var == entry.getValue()) {
                return (java.lang.String) entry.getKey();
            }
        }
        return "";
    }

    @Override // sd.u0, sd.k
    public void a() {
        super.a();
        java.util.Map map = this.f139910j2;
        for (com.tencent.mm.plugin.game.luggage.page.x0 x0Var : map.values()) {
            if (x0Var != null && x0Var != this) {
                x0Var.a();
            }
        }
        map.clear();
    }

    public void a0(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        java.util.Map map = this.f139910j2;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) || this.f139913m2 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "insertTabHomeWeb, tabKey:%s, url:%s", str, str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(this.f406657n);
        bundle.putString("rawUrl", str2);
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = new com.tencent.mm.plugin.game.luggage.page.x0(this.f406612f, null, bundle);
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = x0Var.f182186t;
        if (y1Var != null) {
            y1Var.b();
        }
        x0Var.V1 = this;
        x0Var.W1 = z17;
        com.tencent.mm.ui.MMActivity mMActivity = this.f139918r2;
        if (mMActivity != null && mMActivity.isPaused() && z17) {
            x0Var.Y1 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "mockFetchFcp, url:%s", str2);
        }
        c0(x0Var, str);
        this.f139913m2.addView(x0Var.f406654h, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        x0Var.b(str2, bundle);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, x0Var);
    }

    public void b0() {
    }

    public void c0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, java.lang.String str) {
        if (x0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        x0Var.f139955g2 = new com.tencent.mm.plugin.game.luggage.page.i(this, str, x0Var);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void d() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139915o2;
        if (x0Var == null) {
            return;
        }
        if (!(x0Var instanceof com.tencent.mm.plugin.game.luggage.page.l)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "onBackground, url:%s", x0Var.s());
            this.f139915o2.e();
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var2 = this.f139915o2;
            if (x0Var2.f182189w.isShown()) {
                x0Var2.J(false);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "GameTabWebPage onBackground, url:%s", x0Var.s());
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var3 = this.f139915o2;
        if (x0Var3 == this) {
            super.d();
        } else {
            x0Var3.d();
        }
        if (this.f182189w.isShown()) {
            J(false);
        }
    }

    public void d0(java.lang.String str) {
        if (this.f139912l2 != null) {
            if (!android.text.TextUtils.equals(str, "chat")) {
                this.f139912l2.g(str);
            } else if (this.f139912l2.h() == 1) {
                b0();
            } else {
                this.f139912l2.g(str);
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "onDestroy");
        android.app.Dialog dialog = this.f139917q2;
        if (dialog != null) {
            dialog.dismiss();
            this.f139917q2 = null;
        }
        super.f();
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void g() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139915o2;
        if (x0Var == null) {
            return;
        }
        X(Z(x0Var), 1);
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var2 = this.f139915o2;
        if (x0Var2 instanceof com.tencent.mm.plugin.game.luggage.page.l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "GameTabWebPage onForeground, url:%s", x0Var2.s());
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var3 = this.f139915o2;
            if (x0Var3 == this) {
                super.g();
            } else {
                x0Var3.g();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "onForeground, url:%s", x0Var2.s());
            this.f139915o2.h();
        }
        android.app.Dialog dialog = this.f139917q2;
        if (dialog != null) {
            dialog.show();
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.game.luggage.page.g gVar = new com.tencent.mm.plugin.game.luggage.page.g(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(gVar, 50L, false);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0, sd.u0
    public android.view.View k() {
        android.view.View k17 = super.k();
        this.f139914n2 = k17;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f406610d);
        this.f139913m2 = frameLayout;
        frameLayout.addView(k17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return this.f139913m2;
    }
}
