package com.tencent.mm.ui.conversation.banner;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class NetWarnBanner$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.k0 f207489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetWarnBanner$1(com.tencent.mm.ui.conversation.banner.k0 k0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f207489d = k0Var;
        this.__eventId = 829538561;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent networkDiagnoseResultEvent) {
        am.zk zkVar = networkDiagnoseResultEvent.f54528g;
        int i17 = zkVar.f8575b;
        int i18 = zkVar.f8574a;
        com.tencent.mm.ui.conversation.banner.k0 k0Var = this.f207489d;
        if (i17 == 0) {
            k0Var.f207538y = 33;
            k0Var.f207539z = i18 == 0;
        } else if (i17 == 1) {
            k0Var.f207538y = 66;
            k0Var.A = i18 == 0;
        } else if (i17 == 2) {
            k0Var.B = i18 == 0;
        }
        if (zkVar.f8576c) {
            k0Var.f207538y = 0;
            k0Var.f207537x = 0;
            k0Var.C = zkVar.f8577d;
            com.tencent.mm.sdk.platformtools.b4 b4Var = k0Var.D;
            if (b4Var != null) {
                b4Var.d();
                k0Var.D = null;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.banner.e0(this));
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.banner.f0(this));
        return false;
    }
}
