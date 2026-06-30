package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.p f207907d;

    public o(com.tencent.mm.ui.conversation.p pVar) {
        this.f207907d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f207907d.f207950e.h();
        return false;
    }
}
