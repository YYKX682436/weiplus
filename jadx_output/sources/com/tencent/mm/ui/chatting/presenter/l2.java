package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class l2 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f202321t = {48};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f202322u = {"msgId", "createTime"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f202323v = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202324s;

    public l2(android.content.Context context) {
        super(context);
        this.f202324s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final com.tencent.mm.ui.chatting.presenter.a2 p(com.tencent.mm.ui.chatting.presenter.l2 l2Var, com.tencent.mm.storage.f9 f9Var, boolean z17, com.tencent.mm.storage.a3 a3Var) {
        l2Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            return null;
        }
        o15.b bVar = new o15.b();
        bVar.fromXml(j17);
        java.lang.String j18 = l2Var.j(f9Var, z17, false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        long createTime = f9Var.getCreateTime();
        o15.a j19 = bVar.j();
        com.tencent.mm.ui.chatting.presenter.a2 a2Var = new com.tencent.mm.ui.chatting.presenter.a2(l2Var, createTime, 42, j19 != null ? j19.s() : null, f9Var.getMsgId(), n17.d1(), n17.f2(), n17.w0(), z07);
        a2Var.f202104j = com.tencent.mm.R.drawable.f481475bi4;
        o15.a j27 = bVar.j();
        a2Var.f202105k = j27 != null ? j27.l() : null;
        return a2Var;
    }

    public static final void q(com.tencent.mm.ui.chatting.presenter.l2 l2Var, boolean z17, long j17) {
        if (l2Var.f202324s.get()) {
            return;
        }
        l2Var.n();
        java.util.ArrayList mDataList = l2Var.f202546i;
        kotlin.jvm.internal.o.f(mDataList, "mDataList");
        if (!mDataList.isEmpty()) {
            if (((com.tencent.mm.ui.chatting.adapter.f0) l2Var.f202546i.get(r0.size() - 1)).a() == 2147483646) {
                l2Var.f202546i.remove(r0.size() - 1);
            }
        }
        l2Var.f202547m = l2Var.f202546i;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(l2Var.f202546i.size())};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationHistoryListPresenter", "[loadData][perf][final] total cost:%dms, items:%d", objArr);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.i2(l2Var, z17));
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        this.f202324s.set(false);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.j2(this, z17), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        java.lang.String string = this.f202541d.getString(com.tencent.mm.R.string.p7f);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489595d34, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.ui.chatting.presenter.b2(this, inflate);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void d(androidx.recyclerview.widget.k3 holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void f(com.tencent.mm.ui.chatting.adapter.e0 baseholder, int i17, int i18) {
        kotlin.jvm.internal.o.g(baseholder, "baseholder");
        com.tencent.mm.ui.chatting.presenter.b2 b2Var = (com.tencent.mm.ui.chatting.presenter.b2) baseholder;
        com.tencent.mm.ui.chatting.adapter.f0 h17 = h(i17);
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.presenter.LocationHistoryListPresenter.LocationHistoryListItem");
        com.tencent.mm.ui.chatting.presenter.a2 a2Var = (com.tencent.mm.ui.chatting.presenter.a2) h17;
        b2Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(this.f202541d, a2Var.f198408a));
        b2Var.f202125i.setImageResource(a2Var.f202104j);
        java.lang.String str = a2Var.f202105k;
        android.widget.TextView textView = b2Var.f202126m;
        textView.setText(str);
        b2Var.i(textView, this.f202544g.f198433e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        java.lang.String string = this.f202541d.getString(com.tencent.mm.R.string.p7f);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // zb5.h
    public int getType() {
        return 0;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.h2(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 10;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202324s.set(true);
        super.onDetach();
    }
}
