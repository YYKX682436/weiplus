package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class w implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x f202510d;

    public w(com.tencent.mm.ui.chatting.presenter.x xVar) {
        this.f202510d = xVar;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "[requestExitSelectedMode] %s del ", java.lang.Thread.currentThread(), e3Var);
        if (e3Var == ot0.e3.del) {
            this.f202510d.f202527g.f202544g.notifyDataSetChanged();
        }
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        if (e3Var == ot0.e3.del) {
            com.tencent.mm.ui.chatting.presenter.v vVar = new com.tencent.mm.ui.chatting.presenter.v(this);
            com.tencent.mm.ui.chatting.presenter.x xVar = this.f202510d;
            vVar.f198411d = xVar.f202526f.getMsgId();
            xVar.f202527g.f202546i.remove(vVar);
            xVar.f202527g.f202547m.remove(vVar);
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
