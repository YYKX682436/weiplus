package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.c2.class)
/* loaded from: classes9.dex */
public class gl extends com.tencent.mm.ui.chatting.component.a implements sb5.c2, com.tencent.mm.modelbase.u0, xg3.h0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f199108n;

    /* renamed from: e, reason: collision with root package name */
    public int f199109e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f199112h;

    /* renamed from: m, reason: collision with root package name */
    public long f199114m;

    /* renamed from: f, reason: collision with root package name */
    public int f199110f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f199111g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f199113i = new com.tencent.mm.ui.chatting.component.cl(this);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).n0(this, android.os.Looper.getMainLooper());
        c01.d9.e().a(100017, this);
        c01.d9.e().a(10, this);
        this.f199111g = 0;
        this.f199112h = "";
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "[onComponentUnInstall] hash:%s", this);
        this.f199113i.removeCallbacksAndMessages(null);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
        c01.d9.e().q(100017, this);
        c01.d9.e().q(10, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
        c01.d9.e().q(100017, this);
        c01.d9.e().q(10, this);
        int i17 = this.f199111g;
        boolean z17 = true;
        if (i17 != 1 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            n0(2);
        }
        this.f199111g = 0;
        this.f199112h = "";
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "[onComponentInstall] hash:%s", this);
        c01.d9.e().g(new c01.ra(new com.tencent.mm.ui.chatting.component.dl(this), null));
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        yb5.d dVar = this.f198580d;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SignallingComponent", "[onNotifyChange] mChattingContext is null!");
            return;
        }
        if (dVar.x().equals(l0Var.f454410a) && "insert".equals(l0Var.f454411b)) {
            java.util.ArrayList arrayList = l0Var.f454412c;
            if (arrayList.size() <= 0 || ((com.tencent.mm.storage.f9) arrayList.get(0)).A0() != 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "summerbadcr oreh onNotifyChange receive a new msg flag[%d], msgSeq[%d]", java.lang.Integer.valueOf(((com.tencent.mm.storage.f9) arrayList.get(0)).w0()), java.lang.Long.valueOf(((com.tencent.mm.storage.f9) arrayList.get(0)).F0()));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f199114m = java.lang.System.currentTimeMillis();
        }
    }

    public final void m0() {
        com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class));
        java.lang.String charSequence = (peVar.f199692p.f208976i.getVisibility() != 0 || peVar.f199692p.f208976i.getText() == null) ? "" : peVar.f199692p.f208976i.getText().toString();
        this.f199112h = charSequence;
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "clearSubTitle!");
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).y0("");
    }

    public void n0(int i17) {
        java.lang.Boolean valueOf;
        java.util.List list;
        if (this.f198580d == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!", com.tencent.mm.sdk.platformtools.z3.b(true));
            return;
        }
        if (this.f199111g == i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "doDirectSend same chatStatus :%s, return!", java.lang.Integer.valueOf(i17));
            return;
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("DisableSendTyping", 0) == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "doDirectSend disable send typing, return!");
            return;
        }
        yb5.d dVar = this.f198580d;
        java.lang.String x17 = dVar.x();
        if (this.f198580d == null) {
            valueOf = java.lang.Boolean.FALSE;
        } else {
            valueOf = java.lang.Boolean.valueOf((!com.tencent.mm.storage.z3.O4(x17) || com.tencent.mm.storage.z3.R4(x17) || this.f198580d.u().k2()) ? false : true);
        }
        if (!valueOf.booleanValue() || dVar.x().equals(c01.z1.r())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "doDirectSend typing  not support");
            return;
        }
        boolean z18 = dVar.C() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198754s;
        int intValue = ((java.lang.Integer) c01.d9.g().b(35, 10)).intValue();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(dVar.x());
        if (intValue == -2) {
            if (z18 && (i17 == 1 || i17 == 2)) {
                return;
            }
            if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTypingSend()) != 1) {
                c01.d9.e().g(new com.tencent.mm.modelsimple.g0(111, linkedList, kk.u.d(i17)));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "sendTyping lastChatStatus:%s , chatStatus:%s", java.lang.Integer.valueOf(this.f199111g), java.lang.Integer.valueOf(i17));
            this.f199111g = i17;
            c01.d9.e().g(new com.tencent.mm.modelsimple.k1(dVar.x(), i17));
            return;
        }
        if (this.f199114m == 0 && (list = ((com.tencent.mm.ui.chatting.component.ah) ((sb5.e1) this.f198580d.f460708c.a(sb5.e1.class))).f198623e) != null && list.size() > 0) {
            this.f199114m = ((com.tencent.mm.storage.f9) list.get(0)).getCreateTime();
        }
        long j17 = this.f199114m;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if ((intValue == -1 || currentTimeMillis > intValue * 1000) && (i17 == 1 || i17 == 3)) {
            long j18 = currentTimeMillis / 1000;
            return;
        }
        if ((intValue == -1 || currentTimeMillis > intValue * 1500) && (i17 == 2 || i17 == 4)) {
            long j19 = currentTimeMillis / 1000;
            return;
        }
        long j27 = currentTimeMillis / 1000;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTypingSend()) != 1) {
            c01.d9.e().g(new com.tencent.mm.modelsimple.g0(111, linkedList, kk.u.d(i17)));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "sendTyping lastChatStatus:%s , chatStatus:%s", java.lang.Integer.valueOf(this.f199111g), java.lang.Integer.valueOf(i17));
        this.f199111g = i17;
        c01.d9.e().g(new com.tencent.mm.modelsimple.k1(dVar.x(), i17));
    }

    public void o0() {
        if (this.f199109e == -2) {
            c01.d9.e().g(new c01.ra(new com.tencent.mm.ui.chatting.component.el(this), null));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelsimple.g0 g0Var;
        java.lang.String str2;
        int a17;
        yb5.d dVar = this.f198580d;
        if (dVar == null) {
            return;
        }
        dVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "scene.getType:%s errType:%s, errCode:%s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (10 == m1Var.getType() || 100017 == m1Var.getType()) {
            boolean z17 = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class))).f199295f;
            ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class)).getClass();
            boolean z18 = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class))).f199301o;
            if (z18 || z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "[onSceneEnd] [%s|%s|%s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z18));
                return;
            }
            if (i17 == 0 && i18 == 0) {
                if (100017 == m1Var.getType()) {
                    com.tencent.mm.modelsimple.k1 k1Var = (com.tencent.mm.modelsimple.k1) m1Var;
                    java.lang.String str3 = k1Var.f71363f;
                    if (str3 != null && str3.equals(this.f198580d.x())) {
                        a17 = k1Var.f71364g;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "typingSend: status=" + a17);
                    }
                    a17 = 0;
                } else {
                    if (10 == m1Var.getType() && (str2 = (g0Var = (com.tencent.mm.modelsimple.g0) m1Var).f71324f) != null && str2.equals(this.f198580d.x())) {
                        byte[] bArr = g0Var.f71325g;
                        if (bArr == null || bArr.length != 4) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "unknown directsend op");
                            return;
                        }
                        a17 = kk.u.a(bArr, 0);
                    }
                    a17 = 0;
                }
                if (a17 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "unknown typingSend status");
                    return;
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f199113i;
                if (a17 == 1) {
                    f199108n = true;
                    ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).A0(com.tencent.mm.R.string.b67);
                    m0();
                    n3Var.sendMessageDelayed(new android.os.Message(), 15000L);
                    new com.tencent.mm.autogen.events.ReceiveTypingEvent().e();
                    return;
                }
                if (a17 == 3) {
                    f199108n = true;
                    ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).A0(com.tencent.mm.R.string.b67);
                    m0();
                    n3Var.sendMessageDelayed(new android.os.Message(), 15000L);
                    return;
                }
                f199108n = false;
                ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).C();
                p0();
                yb5.d dVar2 = this.f198580d;
                if (dVar2.f460727v) {
                    dVar2.f460728w = false;
                    dVar2.J();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "onSceneEnd, current ChattingUI lose focus!");
                    this.f198580d.f460728w = true;
                }
            }
        }
    }

    public final void p0() {
        java.lang.String str = this.f199112h;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "recoverSubTitle!");
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).y0(this.f199112h);
        this.f199112h = "";
    }

    public void q0() {
        c01.d9.e().g(new c01.ra(new com.tencent.mm.ui.chatting.component.fl(this), null));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        p0();
    }
}
