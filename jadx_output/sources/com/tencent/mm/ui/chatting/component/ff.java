package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ff implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199054d;

    public ff(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f199054d = peVar;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.tencent.mm.ui.chatting.component.pe peVar = this.f199054d;
        peVar.f198580d.q().removeCallbacks(peVar.f199699w);
        com.tencent.mm.sdk.platformtools.n3 q17 = peVar.f198580d.q();
        com.tencent.mm.ui.chatting.component.ef efVar = new com.tencent.mm.ui.chatting.component.ef(this, str);
        peVar.f199699w = efVar;
        q17.postDelayed(efVar, 1000L);
    }
}
