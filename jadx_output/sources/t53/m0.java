package t53;

@j95.b
/* loaded from: classes8.dex */
public final class m0 extends i95.w implements t53.k {

    /* renamed from: d, reason: collision with root package name */
    public d95.b0 f415796d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f415797e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f415798f = jz5.h.b(t53.l.f415790d);

    /* renamed from: g, reason: collision with root package name */
    public y53.a0 f415799g;

    /* renamed from: h, reason: collision with root package name */
    public f63.k f415800h;

    /* renamed from: i, reason: collision with root package name */
    public z53.t f415801i;

    /* renamed from: m, reason: collision with root package name */
    public c63.m f415802m;

    /* renamed from: n, reason: collision with root package name */
    public c63.l f415803n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f415804o;

    /* renamed from: p, reason: collision with root package name */
    public final l75.q0 f415805p;

    public m0() {
        jz5.h.b(t53.a0.f415721d);
        this.f415805p = new t53.l0(this);
    }

    public static /* synthetic */ void hj(t53.m0 m0Var, int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2, int i18, java.lang.Object obj) {
        m0Var.fj(i17, j17, str, str2, str3, (i18 & 32) != 0 ? null : bool, (i18 & 64) != 0 ? null : num, (i18 & 128) != 0 ? null : bool2);
    }

    public static final void wi(t53.m0 m0Var) {
        java.lang.Boolean bool;
        synchronized (m0Var) {
            if (m0Var.f415804o == null) {
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_UNREAD_MSG_STATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
                m0Var.f415804o = (java.lang.Boolean) m17;
            }
            java.lang.Boolean bool2 = m0Var.f415804o;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
                if ((Ri > 0 && !booleanValue) || (Ri == 0 && booleanValue)) {
                    boolean z17 = Ri > 0;
                    com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "the state of game chat has changed, gameChatUnreadState:%b", java.lang.Boolean.valueOf(z17));
                    com.tencent.mm.game.report.service.c cVar = com.tencent.mm.game.report.service.c.f68207a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("cmd", 1);
                    bundle.putBoolean("has_unread_msg", z17);
                    cVar.a(bundle);
                    booleanValue = z17;
                }
                bool = java.lang.Boolean.valueOf(booleanValue);
            } else {
                bool = null;
            }
            m0Var.f415804o = bool;
        }
    }

    public final void Ai() {
        gm0.j1.b().c();
        Vi();
        java.lang.String str = this.f415797e;
        if (str == null) {
            kotlin.jvm.internal.o.o("cacheDBPath");
            throw null;
        }
        com.tencent.mm.vfs.w6.h(str);
        d95.b0 b0Var = this.f415796d;
        if (b0Var != null) {
            b0Var.L();
        }
        this.f415796d = null;
        this.f415799g = null;
        this.f415800h = null;
        this.f415801i = null;
        this.f415803n = null;
        this.f415802m = null;
        aj();
    }

    public void Bi(android.content.Context context, java.lang.String selfUsername, java.lang.String talker, int i17, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ku5.u0 u0Var = ku5.t0.f312615d;
        t53.x xVar = new t53.x(h0Var, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z17 = t0Var.z(xVar, 1000L, false);
        ((d63.e) ((u53.b0) i95.n0.c(u53.b0.class))).wi();
        t53.v vVar = new t53.v(z17, h0Var, str, selfUsername, context);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        t53.o oVar = new t53.o(atomicInteger, linkedList, vVar);
        u53.e0 e0Var = (u53.e0) i95.n0.c(u53.e0.class);
        ((f63.h) e0Var).wi(selfUsername, talker, i17, gVar, new t53.m(atomicInteger, vVar, linkedList, oVar));
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(kz5.c0.i(selfUsername, talker), new t53.n(selfUsername, talker, oVar, atomicInteger, vVar));
    }

    public void Di(android.content.Context context, java.lang.String str, int i17) {
        java.lang.String str2;
        v53.l lVar;
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str3 = "";
        if (i17 == 2) {
            if (com.tencent.mm.storage.z3.Z3(str)) {
                cj(2, 7L, str, null, null, "1");
                str2 = str;
            } else {
                f63.e eVar = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(str);
                str2 = eVar.v0();
                cj(2, 7L, eVar.t0(), eVar.u0(), eVar.v0(), "2");
            }
        } else if (i17 == 1) {
            f63.e eVar2 = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(str);
            str2 = eVar2.v0();
            hj(this, 2, 7L, eVar2.u0(), eVar2.t0(), eVar2.v0(), null, null, null, 224, null);
        } else {
            str2 = "";
        }
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(str2);
        if (Di != null && (lVar = Di.field_jumpInfo) != null && lVar.f433346d == 1) {
            java.lang.String jump_url = lVar.f433347e;
            kotlin.jvm.internal.o.f(jump_url, "jump_url");
            str3 = jump_url;
        }
        if (str3.length() == 0) {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "userName:%s,jumpUrl null");
            return;
        }
        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "userName:%s,jumpUrl:%s", str2, str3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str3);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final c63.l Ni() {
        gm0.j1.b().c();
        c63.l lVar = this.f415803n;
        if (lVar == null) {
            lVar = new c63.l(Vi());
        }
        this.f415803n = lVar;
        return lVar;
    }

    public final y53.a0 Ri() {
        gm0.j1.b().c();
        y53.a0 a0Var = this.f415799g;
        if (a0Var == null) {
            a0Var = new y53.a0(Vi());
        }
        this.f415799g = a0Var;
        return a0Var;
    }

    public final z53.t Ui() {
        gm0.j1.b().c();
        z53.t tVar = this.f415801i;
        if (tVar == null) {
            tVar = new z53.t(Vi());
        }
        this.f415801i = tVar;
        return tVar;
    }

    public final d95.b0 Vi() {
        d95.b0 b0Var = this.f415796d;
        if (b0Var != null) {
            kotlin.jvm.internal.o.d(b0Var);
            return b0Var;
        }
        aj();
        d95.b0 b0Var2 = this.f415796d;
        kotlin.jvm.internal.o.d(b0Var2);
        return b0Var2;
    }

    public final f63.k Zi() {
        gm0.j1.b().c();
        f63.k kVar = this.f415800h;
        if (kVar == null) {
            kVar = new f63.k(Vi());
        }
        this.f415800h = kVar;
        return kVar;
    }

    public final void aj() {
        this.f415797e = gm0.j1.u().h() + "GameLife.db";
        d95.b0 b0Var = this.f415796d;
        if (b0Var == null) {
            b0Var = new d95.b0();
            java.lang.String str = this.f415797e;
            if (str == null) {
                kotlin.jvm.internal.o.o("cacheDBPath");
                throw null;
            }
            if (!b0Var.S(str, kz5.c1.i(new jz5.l(684917266, t53.p.f415817a), new jz5.l(-1596213930, t53.q.f415818a), new jz5.l(-791091759, t53.r.f415819a), new jz5.l(-1647188391, t53.s.f415820a), new jz5.l(-214072634, t53.t.f415821a)), true, true)) {
                com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "GameLife db init failed!");
            }
        }
        this.f415796d = b0Var;
    }

    public final void bj(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "jumpToGameLifeSingleChatInfoUI sessionId null!");
        } else {
            f63.e eVar = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(str);
            cj(1, 6L, eVar.t0(), str, eVar.v0(), null);
        }
    }

    public final void cj(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        pq5.h.a().i(new t53.b0(str, str2, str3, i17, j17, str4)).B();
    }

    public final void fj(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2) {
        pq5.h.a().i(new t53.c0(str2, str3, num, bool2, bool, i17, j17, str)).B();
    }

    public final void ij(android.content.Context context, java.lang.String str, int i17, ik1.b0 b0Var, ik1.b0 b0Var2, t53.j jVar, u53.c0 c0Var) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 2, false);
        z2Var.i(com.tencent.mm.R.layout.f489161bi4);
        android.view.View findViewById = z2Var.f212058g.findViewById(com.tencent.mm.R.id.gpt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = z2Var.f212058g.findViewById(com.tencent.mm.R.id.gpv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById2;
        android.view.View findViewById3 = z2Var.f212058g.findViewById(com.tencent.mm.R.id.gpw);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        ik1.b0 b0Var3 = new ik1.b0();
        b0Var3.f291824a = java.lang.Boolean.TRUE;
        checkBox.setOnCheckedChangeListener(new t53.d0(b0Var3));
        if ((b0Var != null ? (java.lang.Boolean) b0Var.f291824a : null) == null) {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "showGameLifeDialog isBlackList null");
            return;
        }
        java.lang.Object value = b0Var.f291824a;
        kotlin.jvm.internal.o.f(value, "value");
        if (((java.lang.Boolean) value).booleanValue()) {
            if (i17 == 1) {
                textView.setText(com.tencent.mm.R.string.f492214fn1);
                if (b0Var2 != null) {
                    java.lang.Object value2 = b0Var2.f291824a;
                    kotlin.jvm.internal.o.f(value2, "value");
                    if (((java.lang.Boolean) value2).booleanValue()) {
                        textView2.setText(com.tencent.mm.R.string.f492216fn3);
                    } else {
                        checkBox.setVisibility(8);
                        textView2.setVisibility(8);
                    }
                }
            } else if (i17 == 2) {
                textView.setText(com.tencent.mm.R.string.f492215fn2);
                textView2.setVisibility(8);
                checkBox.setVisibility(8);
            }
            t53.e0 e0Var = new t53.e0(jVar, b0Var, z2Var, b0Var2, b0Var3, this, c0Var, i17);
            t53.g0 g0Var = new t53.g0(z2Var, b0Var2, b0Var3, str, this, c0Var, i17, b0Var, context, jVar);
            z2Var.D = e0Var;
            z2Var.E = g0Var;
            z2Var.m(context.getResources().getString(com.tencent.mm.R.string.f490347sg), context.getResources().getString(com.tencent.mm.R.string.fmz));
            z2Var.q(context.getResources().getString(com.tencent.mm.R.string.f492213fn0));
            z2Var.C();
            f63.e eVar = (f63.e) c0Var;
            hj(this, 7, 1L, eVar.u0(), eVar.t0(), eVar.v0(), null, null, null, 224, null);
            return;
        }
        if (i17 == 1) {
            textView.setText(com.tencent.mm.R.string.fmv);
            if (b0Var2 != null) {
                java.lang.Object value3 = b0Var2.f291824a;
                kotlin.jvm.internal.o.f(value3, "value");
                if (((java.lang.Boolean) value3).booleanValue()) {
                    textView2.setText(com.tencent.mm.R.string.fmx);
                } else {
                    checkBox.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
        } else if (i17 == 2) {
            textView.setText(com.tencent.mm.R.string.fmw);
            checkBox.setVisibility(8);
        }
        t53.h0 h0Var = new t53.h0(z2Var, jVar, b0Var, b0Var2, b0Var3, this, c0Var, i17);
        t53.j0 j0Var = new t53.j0(z2Var, b0Var2, b0Var3, str, this, c0Var, i17, b0Var, context, jVar);
        z2Var.D = h0Var;
        z2Var.E = j0Var;
        z2Var.v(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        z2Var.o(2);
        z2Var.m(context.getResources().getString(com.tencent.mm.R.string.f490347sg), context.getResources().getString(com.tencent.mm.R.string.fmy));
        z2Var.q(context.getResources().getString(com.tencent.mm.R.string.fmu));
        z2Var.C();
        f63.e eVar2 = (f63.e) c0Var;
        hj(this, 6, 1L, eVar2.u0(), eVar2.t0(), eVar2.v0(), null, null, null, 224, null);
    }

    public final void mj() {
        t53.m0 m0Var = (t53.m0) i95.n0.c(t53.m0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        m0Var.Bi(context, "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife", "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife", 0, null, null);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "Account Init");
        ((ku5.t0) ku5.t0.f312615d).k(new t53.z(this), 1000L);
    }
}
