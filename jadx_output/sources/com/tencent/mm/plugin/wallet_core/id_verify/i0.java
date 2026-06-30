package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fo f179390d;

    public i0(r45.fo foVar) {
        this.f179390d = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.fo foVar = this.f179390d;
        com.tencent.mm.wallet_core.ui.r1.c0(foVar.f374478i, foVar.f374479m, 0, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT, new com.tencent.mm.plugin.wallet_core.id_verify.h0(foVar));
    }
}
