package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WxPayGdprResultEvent f213900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.JumpRemind$1 f213901e;

    public g0(com.tencent.mm.wallet_core.model.JumpRemind$1 jumpRemind$1, com.tencent.mm.autogen.events.WxPayGdprResultEvent wxPayGdprResultEvent) {
        this.f213901e = jumpRemind$1;
        this.f213900d = wxPayGdprResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f213900d.f54995g.f8257a;
        com.tencent.mm.wallet_core.model.JumpRemind$1 jumpRemind$1 = this.f213901e;
        if (str == "agree_privacy") {
            jumpRemind$1.f213844d.f213969h.onUrlOk();
        } else {
            jumpRemind$1.f213844d.f213969h.onUrlCancel();
        }
    }
}
