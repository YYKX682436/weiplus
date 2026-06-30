package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
class JumpRemind$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewUIDestroyEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f213845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumpRemind$2(com.tencent.mm.wallet_core.model.p0 p0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f213845d = p0Var;
        this.__eventId = -1681666147;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.WebViewUIDestroyEvent webViewUIDestroyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpRemind", "WebViewUIDestroyEvent close");
        this.f213845d.f213973l.dead();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.wallet_core.model.h0(this), 200L);
        return false;
    }
}
