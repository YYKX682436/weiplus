package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m4 f202284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f202285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f202286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f202287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f202288h;

    public j4(com.tencent.mm.ui.chatting.presenter.m4 m4Var, java.util.ArrayList arrayList, kotlin.jvm.internal.f0 f0Var, boolean z17, int i17) {
        this.f202284d = m4Var;
        this.f202285e = arrayList;
        this.f202286f = f0Var;
        this.f202287g = z17;
        this.f202288h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.m4 m4Var = this.f202284d;
        if (m4Var.f202346t.get()) {
            return;
        }
        m4Var.n();
        m4Var.f202546i.clear();
        m4Var.f202546i.addAll(this.f202285e);
        int i17 = this.f202286f.f310116d;
        m4Var.getClass();
        m4Var.f202547m = m4Var.f202546i;
        zb5.i iVar = m4Var.f202543f;
        if (iVar != null) {
            iVar.A(this.f202287g, this.f202288h);
        }
    }
}
