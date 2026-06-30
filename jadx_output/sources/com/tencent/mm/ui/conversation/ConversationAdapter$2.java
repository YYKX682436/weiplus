package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
class ConversationAdapter$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BackupResetAccUinEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o2 f207308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationAdapter$2(com.tencent.mm.ui.conversation.o2 o2Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f207308d = o2Var;
        this.__eventId = -991574716;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.BackupResetAccUinEvent backupResetAccUinEvent) {
        com.tencent.mm.ui.conversation.o2 o2Var = this.f207308d;
        o2Var.f207920y = true;
        o2Var.f207919x = true;
        return false;
    }
}
