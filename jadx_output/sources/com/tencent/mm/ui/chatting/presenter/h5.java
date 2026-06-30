package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m5 f202250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f202251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202252f;

    public h5(com.tencent.mm.ui.chatting.presenter.m5 m5Var, java.util.ArrayList arrayList, int i17, int i18) {
        this.f202250d = m5Var;
        this.f202251e = arrayList;
        this.f202252f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.m5 m5Var = this.f202250d;
        if (m5Var.f202348s.get()) {
            return;
        }
        m5Var.n();
        m5Var.f202546i.clear();
        m5Var.f202546i.addAll(this.f202251e);
        m5Var.getClass();
        m5Var.f202547m = m5Var.f202546i;
        zb5.i iVar = m5Var.f202543f;
        if (iVar != null) {
            iVar.A(false, this.f202252f);
        }
    }
}
