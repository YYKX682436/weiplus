package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class m5 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f202347t = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202348s;

    public m5(android.content.Context context) {
        super(context);
        this.f202348s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final com.tencent.mm.ui.chatting.presenter.z4 p(com.tencent.mm.ui.chatting.presenter.m5 m5Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a3 a3Var) {
        java.lang.String d17;
        m5Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            return null;
        }
        m15.a aVar = new m15.a();
        aVar.fromXml(j17);
        java.lang.String j18 = m5Var.j(f9Var, com.tencent.mm.storage.z3.R4(m5Var.f202542e), false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        java.lang.String str = (n17 == null || (d17 = n17.d1()) == null) ? j18 : d17;
        java.lang.String f27 = n17 != null ? n17.f2() : null;
        java.lang.String str2 = f27 == null ? "" : f27;
        java.lang.String w07 = n17 != null ? n17.w0() : null;
        com.tencent.mm.ui.chatting.presenter.z4 z4Var = new com.tencent.mm.ui.chatting.presenter.z4(m5Var, f9Var.getCreateTime(), 42, aVar.getNickname(), f9Var.getMsgId(), str, str2, w07 == null ? "" : w07, z07);
        int o17 = aVar.o();
        java.util.Set set = c01.e2.f37117a;
        boolean D3 = com.tencent.mm.storage.z3.D3(o17);
        android.content.Context context = m5Var.f202541d;
        if (D3) {
            if (aVar.n() == 1) {
                z4Var.f202588l = context.getString(com.tencent.mm.R.string.n7g);
            } else {
                z4Var.f202588l = context.getString(com.tencent.mm.R.string.f490851b14);
            }
            z4Var.f202587k = true;
        } else {
            z4Var.f202588l = context.getString(com.tencent.mm.R.string.b4y);
            z4Var.f202587k = false;
        }
        z4Var.f202586j = aVar.getUsername();
        z4Var.f198410c = aVar.getNickname();
        return z4Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        this.f202348s.set(false);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.k5(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        java.lang.String string = this.f202541d.getString(com.tencent.mm.R.string.b4y);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489595d34, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.ui.chatting.presenter.a5(this, inflate);
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
        com.tencent.mm.ui.chatting.presenter.a5 a5Var = (com.tencent.mm.ui.chatting.presenter.a5) baseholder;
        com.tencent.mm.ui.chatting.adapter.f0 h17 = h(i17);
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.presenter.ShareCardHistoryListPresenter.ShareCardHistoryListItem");
        com.tencent.mm.ui.chatting.presenter.z4 z4Var = (com.tencent.mm.ui.chatting.presenter.z4) h17;
        a5Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(this.f202541d, z4Var.f198408a));
        boolean z17 = z4Var.f202587k;
        android.widget.ImageView imageView = a5Var.f202115i;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(z4Var.f202586j)) {
                imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, z4Var.f202586j);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(z4Var.f202586j)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, z4Var.f202586j, null);
        }
        java.lang.String str = z4Var.f202588l;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = a5Var.f202116m;
        textView.setText(str);
        a5Var.i(textView, this.f202544g.f198433e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        java.lang.String string = this.f202541d.getString(com.tencent.mm.R.string.b4y);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // zb5.h
    public int getType() {
        return 0;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.g5(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 9;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202348s.set(true);
        super.onDetach();
    }
}
