package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class qj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rj f199789e;

    public qj(com.tencent.mm.ui.chatting.component.rj rjVar, int i17) {
        this.f199789e = rjVar;
        this.f199788d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.rj rjVar = this.f199789e;
        int x17 = ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) rjVar.f199860d.f198566d.f198580d.f460718m).C0().x(1, this.f199788d);
        com.tencent.mm.ui.chatting.component.RemittanceSearchComponent$1 remittanceSearchComponent$1 = rjVar.f199860d;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = ((com.tencent.mm.ui.chatting.ChattingUIFragment) remittanceSearchComponent$1.f198566d.f198580d.f460719n).B;
        if (mMChattingListView != null) {
            mMChattingListView.setHighLightChildNew(x17);
            remittanceSearchComponent$1.f198566d.f198580d.f460721p = false;
        }
    }
}
