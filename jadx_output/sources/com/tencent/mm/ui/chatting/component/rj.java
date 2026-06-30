package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class rj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.RemittanceSearchComponent$1 f199860d;

    public rj(com.tencent.mm.ui.chatting.component.RemittanceSearchComponent$1 remittanceSearchComponent$1) {
        this.f199860d = remittanceSearchComponent$1;
    }

    @Override // java.lang.Runnable
    public void run() {
        yb5.d dVar = this.f199860d.f198566d.f198580d;
        int i17 = dVar.f460720o;
        com.tencent.mm.pluginsdk.ui.tools.v3 p17 = dVar.p();
        if (!(p17.getFirstVisiblePosition() < i17 && i17 < p17.getLastVisiblePosition())) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.ui.chatting.component.qj qjVar = new com.tencent.mm.ui.chatting.component.qj(this, i17);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(qjVar, 200L, false);
            return;
        }
        int x17 = ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) this.f199860d.f198566d.f198580d.f460718m).C0().x(1, i17);
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f199860d.f198566d.f198580d.f460719n).B;
        if (mMChattingListView != null) {
            mMChattingListView.setHighLightChildNew(x17);
            this.f199860d.f198566d.f198580d.f460721p = false;
        }
    }
}
