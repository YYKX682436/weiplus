package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class b6 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f202137t = {978321457, 974127153};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f202138u = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202139s;

    public b6(android.content.Context context) {
        super(context);
        this.f202139s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static com.tencent.mm.ui.chatting.presenter.z5 p(com.tencent.mm.ui.chatting.presenter.b6 b6Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a3 a3Var) {
        ot0.q v17;
        b6Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f348666i;
        if (!(i17 == 111 || i17 == 82)) {
            return null;
        }
        java.lang.String j18 = b6Var.j(f9Var, com.tencent.mm.storage.z3.R4(b6Var.f202542e), false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        com.tencent.mm.ui.chatting.presenter.z5 z5Var = new com.tencent.mm.ui.chatting.presenter.z5(b6Var, f9Var.getCreateTime(), v17.f348666i, v17.f348654f, f9Var.getMsgId(), n17.d1(), n17.f2(), n17.w0(), a3Var != null ? a3Var.z0(j18) : "");
        int i18 = v17.f348666i;
        if (i18 == 82) {
            r45.br2 br2Var = ((zy2.l) v17.y(zy2.l.class)).f477449b;
            z5Var.f202590k = br2Var.getString(8);
            z5Var.f198410c = br2Var.getString(9);
            z5Var.f202591l = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.o47, new java.text.DecimalFormat("#.##").format(br2Var.getInteger(11) / 100.0f), br2Var.getString(13));
            z5Var.f202589j = com.tencent.mm.ui.chatting.presenter.y5.PRODUCT;
            return z5Var;
        }
        if (i18 != 111) {
            return z5Var;
        }
        bw5.g9 g9Var = ((hs.a) v17.y(hs.a.class)).f284507b;
        z5Var.f202590k = g9Var.b();
        z5Var.f198410c = g9Var.getNickname();
        z5Var.f202591l = b6Var.f202541d.getString(com.tencent.mm.R.string.mes);
        z5Var.f202589j = com.tencent.mm.ui.chatting.presenter.y5.SHOP;
        return z5Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData] isFirst:%s", objArr);
        this.f202543f.P(z17);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.o5(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.met);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.a6(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489595d34, viewGroup, false));
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
        com.tencent.mm.ui.chatting.presenter.a6 a6Var = (com.tencent.mm.ui.chatting.presenter.a6) e0Var;
        com.tencent.mm.ui.chatting.presenter.z5 z5Var = (com.tencent.mm.ui.chatting.presenter.z5) h(i17);
        a6Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(this.f202541d, z5Var.f198408a));
        com.tencent.mm.ui.chatting.presenter.y5 y5Var = z5Var.f202589j;
        com.tencent.mm.ui.chatting.presenter.y5 y5Var2 = com.tencent.mm.ui.chatting.presenter.y5.SHOP;
        mn2.g1 g1Var = mn2.g1.f329975a;
        android.widget.ImageView imageView = a6Var.f202117i;
        if (y5Var == y5Var2) {
            vo0.d g17 = g1Var.g();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            g17.c(ya2.l.f460502a.e(z5Var.f202590k, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329962p));
        } else {
            vo0.d f17 = g1Var.f();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            f17.c(ya2.l.f460502a.e(z5Var.f202590k, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329962p));
        }
        java.lang.String str = z5Var.f202591l;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = a6Var.f202118m;
        textView.setText(str);
        a6Var.i(textView, this.f202544g.f198433e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.met);
    }

    @Override // zb5.h
    public int getType() {
        return 0;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.x5(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 12;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202139s.set(true);
        super.onDetach();
    }
}
