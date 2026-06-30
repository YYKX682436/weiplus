package com.tencent.mm.view.manager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class SmileyPanelManager$9 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmojiUpdatePanelEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmileyPanelManager$9(com.tencent.mm.view.manager.d dVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f213610d = dVar;
        this.__eventId = 281399509;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.EmojiUpdatePanelEvent emojiUpdatePanelEvent) {
        com.tencent.mm.autogen.events.EmojiUpdatePanelEvent emojiUpdatePanelEvent2 = emojiUpdatePanelEvent;
        int i17 = emojiUpdatePanelEvent2.f54105g.f7799a;
        java.lang.String str = i17 == 1 ? "custom" : i17 == 2 ? "capture" : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.view.manager.o(this, str), 500L);
        emojiUpdatePanelEvent2.f54106h.f7869a = true;
        return false;
    }
}
