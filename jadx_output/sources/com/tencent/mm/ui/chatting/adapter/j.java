package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes5.dex */
public final class j implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.k f198421d;

    public j(com.tencent.mm.ui.chatting.adapter.k kVar) {
        this.f198421d = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.ui.chatting.adapter.k kVar = this.f198421d;
        yb5.d dVar = kVar.K;
        if (dVar == null || !dVar.f460714i) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[onTimerExpired]");
        kVar.Q0();
        return true;
    }
}
