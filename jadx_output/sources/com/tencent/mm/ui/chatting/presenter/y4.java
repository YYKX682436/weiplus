package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class y4 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f202564t = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202565s;

    public y4(android.content.Context context) {
        super(context);
        this.f202565s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.p4(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.icj);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.x4(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.acy, viewGroup, false));
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void d(androidx.recyclerview.widget.k3 k3Var, int i17, int i18) {
        if (i17 == 0 && q() && !c01.e2.E(this.f202542e)) {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.tencent.mm.plugin.luckymoney.model.m5.s() && (k3Var instanceof com.tencent.mm.ui.chatting.presenter.v4)) {
                ((com.tencent.mm.ui.chatting.presenter.v4) k3Var).f202508e.setVisibility(0);
                return;
            }
        }
        if (k3Var instanceof com.tencent.mm.ui.chatting.presenter.v4) {
            ((com.tencent.mm.ui.chatting.presenter.v4) k3Var).f202508e.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.v4(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.dfd, viewGroup, false));
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void f(com.tencent.mm.ui.chatting.adapter.e0 e0Var, int i17, int i18) {
        com.tencent.mm.ui.chatting.presenter.x4 x4Var = (com.tencent.mm.ui.chatting.presenter.x4) e0Var;
        com.tencent.mm.ui.chatting.presenter.w4 w4Var = (com.tencent.mm.ui.chatting.presenter.w4) h(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(w4Var.f202520k)) {
            x4Var.f202539m.setVisibility(8);
        } else {
            x4Var.f202539m.setVisibility(0);
            java.lang.String str = w4Var.f202520k;
            if (str == null) {
                str = "";
            }
            x4Var.f202539m.setText(str);
        }
        int b17 = i65.a.b(this.f202541d, 6);
        x4Var.f202538i.setPadding(b17, b17, b17, b17);
        int i19 = w4Var.f202519j;
        android.widget.ImageView imageView = x4Var.f202538i;
        imageView.setImageResource(i19);
        imageView.setBackgroundColor(w4Var.f202521l);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.icj);
    }

    @Override // zb5.h
    public int getType() {
        return 5;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.t4(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 5;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202565s.set(true);
        super.onDetach();
    }

    public boolean p(int i17) {
        return com.tencent.mm.sdk.platformtools.t8.D1("1001", 0) == i17 || com.tencent.mm.sdk.platformtools.t8.D1("1002", 0) == i17 || com.tencent.mm.sdk.platformtools.t8.D1("1005", 0) == i17 || 419430449 == i17;
    }

    public final boolean q() {
        return com.tencent.mm.storage.z3.R4(this.f202542e) || com.tencent.mm.storage.z3.q4(this.f202542e);
    }
}
