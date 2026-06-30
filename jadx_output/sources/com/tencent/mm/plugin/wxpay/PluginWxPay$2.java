package com.tencent.mm.plugin.wxpay;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class PluginWxPay$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypPayMsgReportEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxpay.g f188562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginWxPay$2(com.tencent.mm.plugin.wxpay.g gVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f188562d = gVar;
        this.__eventId = -2015894908;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.BypPayMsgReportEvent bypPayMsgReportEvent) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.wxpay.f(this, bypPayMsgReportEvent), "MicroMsg.PluginWxPay");
        return false;
    }
}
