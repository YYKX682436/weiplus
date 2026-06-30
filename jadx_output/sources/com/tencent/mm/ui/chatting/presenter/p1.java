package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class p1 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f202416t = {-2130706383, -2113929167};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f202417u = {"msgId", "createTime"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f202418v = {"msgId", "type", "createTime", "talker", "content", "isSend", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202419s;

    public p1(android.content.Context context) {
        super(context);
        this.f202419s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static void p(com.tencent.mm.ui.chatting.presenter.p1 p1Var, boolean z17, long j17) {
        if (p1Var.f202419s.get()) {
            return;
        }
        p1Var.n();
        if (!p1Var.f202546i.isEmpty()) {
            if (((com.tencent.mm.ui.chatting.adapter.f0) p1Var.f202546i.get(r0.size() - 1)).a() == 2147483646) {
                p1Var.f202546i.remove(r0.size() - 1);
            }
        }
        p1Var.f202547m = p1Var.f202546i;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(p1Var.f202546i.size())};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf][final] total cost:%dms, items:%d", objArr);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.r1(p1Var, z17));
    }

    public static com.tencent.mm.ui.chatting.presenter.y1 q(com.tencent.mm.ui.chatting.presenter.p1 p1Var, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        ot0.q v17;
        p1Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f348666i;
        if (!(i17 == 115 || i17 == 124)) {
            return null;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p1Var.j(f9Var, z17, false), true);
        l15.c cVar = new l15.c();
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GiftHistoryListPresenter", "decode msg content failed, ecsGiftAppMsg is null", null);
            return null;
        }
        w05.d dVar = (w05.d) k17.getCustom(k17.f432315e + 66);
        if (dVar == null) {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GiftHistoryListPresenter", "decode msg content failed, ecsGiftAppMsgInfo is null", null);
            return null;
        }
        w05.e eVar = (w05.e) dVar.s().getFirst();
        com.tencent.mm.ui.chatting.presenter.y1 y1Var = new com.tencent.mm.ui.chatting.presenter.y1(p1Var, f9Var.getCreateTime(), v17.f348666i, v17.f348654f, f9Var.getMsgId(), n17.d1(), n17.f2(), "", "");
        y1Var.f202557l = dVar.B();
        y1Var.f202555j = dVar.C();
        int i27 = y1Var.f202557l;
        int i28 = h20.h.f278268a;
        if (i27 == 0) {
            y1Var.f198413f += com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492164o41);
        } else if (i27 == 1) {
            y1Var.f198413f += com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492166o43);
        } else {
            y1Var.f198413f += com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492165o42);
        }
        if (y1Var.f202557l == 2 || v17.f348666i == 115) {
            y1Var.f198410c = ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).cj(dVar.w(), dVar.n(), n17.d1(), dVar.z(), null);
        } else {
            y1Var.f198410c = y1Var.f202555j;
            y1Var.f202555j = "";
        }
        if (eVar.l() == 0) {
            y1Var.f202558m = com.tencent.mm.R.raw.blue_envelope_default_regular;
        } else {
            y1Var.f202558m = com.tencent.mm.R.raw.blue_envelope_disable_regular;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.x())) {
            int i29 = v17.f348666i;
            if (i29 == 124) {
                int i37 = y1Var.f202557l;
                if (i37 == 0) {
                    y1Var.f202556k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492167o44);
                } else if (i37 == 1) {
                    y1Var.f202556k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492169o46);
                } else {
                    y1Var.f202556k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492168o45);
                }
            } else if (i29 == 115) {
                y1Var.f202556k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492168o45);
            } else {
                y1Var.f202556k = "";
            }
        } else {
            y1Var.f202556k = eVar.x();
        }
        return y1Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        this.f202419s.set(false);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.q1(this, z17), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.mer);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.z1(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489595d34, viewGroup, false));
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void d(androidx.recyclerview.widget.k3 k3Var, int i17, int i18) {
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void f(com.tencent.mm.ui.chatting.adapter.e0 e0Var, int i17, int i18) {
        com.tencent.mm.ui.chatting.presenter.z1 z1Var = (com.tencent.mm.ui.chatting.presenter.z1) e0Var;
        com.tencent.mm.ui.chatting.presenter.y1 y1Var = (com.tencent.mm.ui.chatting.presenter.y1) h(i17);
        z1Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(this.f202541d, y1Var.f198408a));
        z1Var.f202575i.setImageResource(y1Var.f202558m);
        java.lang.String str = y1Var.f202555j;
        android.widget.TextView textView = z1Var.f202576m;
        if (str != "") {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            z1Var.i(textView, this.f202544g.f198433e);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        z1Var.f202577n.setText(y1Var.f202556k);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.mer);
    }

    @Override // zb5.h
    public int getType() {
        return 0;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.x1(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 13;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202419s.set(true);
        super.onDetach();
    }
}
