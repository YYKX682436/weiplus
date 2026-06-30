package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes3.dex */
public class r implements rz3.e {
    public r(com.tencent.mm.plugin.scanner.model.s sVar) {
    }

    @Override // rz3.e
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "Deal QBar String notify, id:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = new com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent();
        am.kl klVar = notifyDealQBarStrResultEvent.f54539g;
        klVar.f7168c = i17;
        klVar.f7167b = com.tencent.mm.plugin.scanner.model.s.f159012m;
        klVar.f7166a = com.tencent.mm.plugin.scanner.model.s.f159011i;
        klVar.f7169d = bundle;
        notifyDealQBarStrResultEvent.e();
    }
}
