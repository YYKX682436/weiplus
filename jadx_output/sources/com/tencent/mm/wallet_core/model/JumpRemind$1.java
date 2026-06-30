package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
class JumpRemind$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxPayGdprResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f213844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumpRemind$1(com.tencent.mm.wallet_core.model.p0 p0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f213844d = p0Var;
        this.__eventId = -553207673;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.WxPayGdprResultEvent wxPayGdprResultEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpRemind", "WxPayGdprResultEvent result");
        com.tencent.mm.wallet_core.model.p0 p0Var = this.f213844d;
        p0Var.f213970i = true;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.wallet_core.model.g0(this, wxPayGdprResultEvent));
        p0Var.f213972k.dead();
        return false;
    }
}
