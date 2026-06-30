package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class z2 implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.a3 f202578d;

    public z2(com.tencent.mm.ui.chatting.presenter.a3 a3Var) {
        this.f202578d = a3Var;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        zb5.g gVar;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        com.tencent.mm.ui.chatting.presenter.a3 a3Var = this.f202578d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[requestExitSelectedMode] %s del size:%s job:%s", currentThread, java.lang.Integer.valueOf(a3Var.f202107e.size()), e3Var);
        if (e3Var != ot0.e3.del || (gVar = a3Var.f202108f.f202356d) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).X6();
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        if (e3Var == ot0.e3.del) {
            com.tencent.mm.ui.chatting.presenter.a3 a3Var = this.f202578d;
            a3Var.f202108f.f202357e.removeAll(a3Var.f202107e);
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
