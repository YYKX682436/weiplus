package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class m4 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: s, reason: collision with root package name */
    public final int f202345s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202346t;

    public m4(android.content.Context context) {
        super(context);
        this.f202345s = -1;
        this.f202346t = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.mm.ui.chatting.presenter.d4 p(com.tencent.mm.ui.chatting.presenter.m4 r21, com.tencent.mm.storage.f9 r22, com.tencent.mm.storage.a3 r23) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.presenter.m4.p(com.tencent.mm.ui.chatting.presenter.m4, com.tencent.mm.storage.f9, com.tencent.mm.storage.a3):com.tencent.mm.ui.chatting.presenter.d4");
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        this.f202346t.set(false);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.l4(this, z17), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        java.lang.String string = this.f202541d.getString(com.tencent.mm.R.string.p7g);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.eld, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.ui.chatting.presenter.e4(this, inflate);
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
        com.tencent.mm.ui.chatting.presenter.e4 e4Var = (com.tencent.mm.ui.chatting.presenter.e4) baseholder;
        com.tencent.mm.ui.chatting.adapter.f0 h17 = h(i17);
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.presenter.NoteHistoryListPresenter.NoteHistoryListItem");
        com.tencent.mm.ui.chatting.presenter.d4 d4Var = (com.tencent.mm.ui.chatting.presenter.d4) h17;
        e4Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(this.f202541d, d4Var.f198408a));
        e4Var.f202201i.s(d4Var.f202171k, com.tencent.mm.R.color.FG_2);
        java.lang.String str = d4Var.f202170j;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = e4Var.f202202m;
        textView.setText(str);
        e4Var.i(textView, this.f202544g.f198433e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        java.lang.String string = this.f202541d.getString(com.tencent.mm.R.string.p7g);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // zb5.h
    public int getType() {
        return 0;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.h4(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 11;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202346t.set(true);
        super.onDetach();
    }
}
