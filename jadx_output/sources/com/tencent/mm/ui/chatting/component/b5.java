package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.d0.class)
/* loaded from: classes9.dex */
public class b5 extends com.tencent.mm.ui.chatting.component.a implements ot0.f3, sb5.d0 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.i6 f198693t = new com.tencent.mm.sdk.platformtools.i6(5, "MicroMsg.ChattingMoreBtnBarHelper", 1);

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar f198694e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f198695f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f198697h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f198698i;

    /* renamed from: n, reason: collision with root package name */
    public android.view.animation.Animation f198700n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f198696g = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198699m = true;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f198701o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f198702p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final tb5.g0 f198703q = new tb5.g0();

    /* renamed from: r, reason: collision with root package name */
    public boolean f198704r = false;

    /* renamed from: s, reason: collision with root package name */
    public final ub5.k f198705s = new com.tencent.mm.ui.chatting.component.d6(this);

    public static void m0(com.tencent.mm.ui.chatting.component.b5 b5Var, java.util.List list) {
        b5Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            ot0.q v17 = ot0.q.v(f9Var.j());
            int i17 = v17 == null ? 0 : v17.f348666i;
            sb6.append(f9Var.I0());
            sb7.append(f9Var.getType());
            sb8.append(i17);
            sb6.append("|");
            sb7.append("|");
            sb8.append("|");
        }
        int k17 = b5Var.f198580d.k();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", sb6.toString());
        hashMap.put("msgtype", sb7.toString());
        hashMap.put("submsgtype", sb8.toString());
        hashMap.put("chat_name", b5Var.f198580d.x());
        hashMap.put("enter_sessionid", b5Var.f198580d.f460722q);
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
        hashMap.put("view_id", "yuanbao_msg_share");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        if (this.f198696g) {
            o0();
        }
    }

    @Override // ot0.f3
    public boolean I6() {
        return this.f198699m;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
        o0();
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        this.f198580d.b0();
        o0();
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
    }

    public final void n0(final android.content.Context context, java.util.List msgItems) {
        gm0.b bVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        com.tencent.mm.storage.z3 z3Var = this.f198697h;
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.chatting.component.b5$$f
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.ui.chatting.component.b5 b5Var = com.tencent.mm.ui.chatting.component.b5.this;
                b5Var.getClass();
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                android.content.Context context2 = context;
                if (booleanValue) {
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
                    e4Var.d(com.tencent.mm.R.string.ohy);
                    e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
                    e4Var.c();
                    tb5.i0 i0Var = tb5.i0.f417055a;
                    java.util.List p07 = b5Var.p0();
                    tb5.g0 state = b5Var.f198703q;
                    kotlin.jvm.internal.o.g(state, "state");
                    i0Var.b("multi_select_msg_copy_succ", p07, state);
                    b5Var.o0();
                } else {
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                    e4Var2.d(com.tencent.mm.R.string.ohx);
                    e4Var2.c();
                }
                b5Var.f198702p.set(false);
                return jz5.f0.f302826a;
            }
        };
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.b5$$g
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.ui.chatting.component.b5.this.f198702p.set(false);
                return jz5.f0.f302826a;
            }
        };
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgItems, "msgItems");
        gm0.m b17 = gm0.j1.b();
        if (b17 == null || (bVar = b17.f273245h) == null || (lifecycleScope = bVar.f273145e) == null) {
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mm.ui.widget.dialog.f fVar = new com.tencent.mm.ui.widget.dialog.f(0L, 1, null);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        fVar.b(context, context.getString(com.tencent.mm.R.string.pag), true, 0, new com.tencent.mm.ui.chatting.component.k9(c0Var, v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.m9(context, msgItems, z3Var, fVar, c0Var, lVar, null), 1, null), aVar));
    }

    public void o0() {
        this.f198580d.e().j(false, this.f198695f);
        com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar chattingFooterMoreBtnBar = this.f198694e;
        if (chattingFooterMoreBtnBar != null) {
            chattingFooterMoreBtnBar.setVisibility(8);
        }
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class));
        kVar.T = false;
        kVar.h(null);
        kVar.B1 = kVar.C1;
        kVar.D1 = kVar.E1;
        kVar.F1 = kVar.G1;
        kVar.H1 = kVar.I1;
        kVar.J1 = kVar.K1;
        com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class));
        aVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.ui.chatting.component.biz.d(aVar), 500L, "getBizChatMsgSource");
        ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class))).p0();
        this.f198696g = false;
        this.f198580d.f460710e.X();
        r0();
        ((com.tencent.mm.ui.chatting.component.r9) ((sb5.l0) this.f198580d.f460708c.a(sb5.l0.class))).o0();
        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).F0();
        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).m0();
        this.f198580d.y();
        com.tencent.mm.ui.chatting.x3.a();
    }

    public java.util.List p0() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).W.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
            linkedList.add(pt0.f0.Li(msgIdTalker.a(), msgIdTalker.f149480d));
        }
        java.util.Collections.sort(linkedList, new com.tencent.mm.ui.chatting.component.e6(this));
        return linkedList;
    }

    public void q0() {
        com.tencent.mm.ui.tools.c9 c9Var = this.f198695f;
        if (c9Var != null) {
            c9Var.b();
            this.f198695f.f210324i = null;
        }
    }

    public final void r0() {
        if (this.f198696g) {
            this.f198580d.Y(false);
        } else {
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).E0();
        }
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f198580d.f460708c.a(sb5.q2.class))).y0();
    }

    @Override // ot0.f3
    public boolean u1() {
        return true;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
