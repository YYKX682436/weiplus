package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class cl extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gl f198896a;

    public cl(com.tencent.mm.ui.chatting.component.gl glVar) {
        this.f198896a = glVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.chatting.component.gl glVar = this.f198896a;
        yb5.d dVar = glVar.f198580d;
        if (dVar == null || !dVar.f460714i) {
            return;
        }
        if (!dVar.f460727v) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SignallingComponent", "current ChattingUI lose focus!");
            glVar.f198580d.f460728w = true;
            return;
        }
        dVar.f460728w = false;
        if (com.tencent.mm.ui.chatting.component.gl.f199108n) {
            com.tencent.mm.ui.chatting.component.gl.f199108n = false;
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).C();
            glVar.f198580d.J();
        }
    }
}
