package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
class RefreshHelper$3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.pa f207413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshHelper$3(com.tencent.mm.ui.conversation.pa paVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f207413d = paVar;
        this.__eventId = -893558668;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent) {
        if (this.f207413d.f207970e == null) {
            return true;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.ga(this));
        return true;
    }
}
