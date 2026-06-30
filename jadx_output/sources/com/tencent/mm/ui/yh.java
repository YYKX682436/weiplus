package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class yh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f212590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.zh f212591e;

    public yh(com.tencent.mm.ui.zh zhVar, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f212591e = zhVar;
        this.f212590d = subscribeMsgRequestResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
        java.lang.String str = this.f212591e.f212635e;
        am.g00 g00Var = updateWxaOptionsEvent.f54927g;
        g00Var.f6724a = str;
        g00Var.f6725b = !this.f212590d.f71789o ? 1 : 2;
        g00Var.f6726c = 1;
        updateWxaOptionsEvent.e();
    }
}
