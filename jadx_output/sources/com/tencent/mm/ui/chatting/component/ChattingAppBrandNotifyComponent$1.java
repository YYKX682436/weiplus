package com.tencent.mm.ui.chatting.component;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ChattingAppBrandNotifyComponent$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.s2 f198539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingAppBrandNotifyComponent$1(com.tencent.mm.ui.chatting.component.s2 s2Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198539d = s2Var;
        this.__eventId = -1390647424;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent) {
        yb5.d dVar = this.f198539d.f198580d;
        if (dVar == null) {
            return true;
        }
        dVar.g().runOnUiThread(new com.tencent.mm.ui.chatting.component.r2(this));
        return true;
    }
}
