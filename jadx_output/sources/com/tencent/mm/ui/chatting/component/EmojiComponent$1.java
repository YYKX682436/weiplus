package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
class EmojiComponent$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.da f198547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiComponent$1(com.tencent.mm.ui.chatting.component.da daVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198547d = daVar;
        this.__eventId = -1339190943;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent appEmojiMsgProgressEvent) {
        com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent appEmojiMsgProgressEvent2 = appEmojiMsgProgressEvent;
        yb5.d dVar = this.f198547d.f198580d;
        if (dVar == null) {
            return false;
        }
        if (appEmojiMsgProgressEvent2.f53987g.f6112c == 1) {
            dVar.q().post(new com.tencent.mm.ui.chatting.component.x9(this));
            return false;
        }
        dVar.q().post(new com.tencent.mm.ui.chatting.component.y9(this, appEmojiMsgProgressEvent2));
        return false;
    }
}
