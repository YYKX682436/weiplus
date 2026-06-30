package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class hi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f204114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ii f204115e;

    public hi(com.tencent.mm.ui.chatting.viewitems.ii iiVar, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f204115e = iiVar;
        this.f204114d = subscribeMsgRequestResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
        com.tencent.mm.ui.chatting.viewitems.ii iiVar = this.f204115e;
        java.lang.String str = iiVar.f204184d.f204339d.f204482d;
        am.g00 g00Var = updateWxaOptionsEvent.f54927g;
        g00Var.f6724a = str;
        g00Var.f6725b = !this.f204114d.f71789o ? 1 : 2;
        g00Var.f6726c = 1;
        updateWxaOptionsEvent.e();
        yb5.d dVar = iiVar.f204184d.f204339d.f204484f.f203175s;
        if (dVar != null) {
            dVar.J();
        }
    }
}
