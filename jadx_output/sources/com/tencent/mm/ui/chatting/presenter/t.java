package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class t implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f202469d = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f202470e = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.chatting.presenter.s(this), false);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y f202471f;

    public t(com.tencent.mm.ui.chatting.presenter.y yVar) {
        this.f202471f = yVar;
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "onSearchEditTextReady");
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        if (this.f202469d.equals(str)) {
            return;
        }
        this.f202469d = str;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f202470e;
        b4Var.d();
        b4Var.c(500L, 500L);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        zb5.i iVar = this.f202471f.f202543f;
        if (iVar != null) {
            iVar.onFinish();
        }
    }

    @Override // y90.j
    public void m6() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
