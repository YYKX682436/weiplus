package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class qm implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sm f199793d;

    public qm(com.tencent.mm.ui.chatting.component.sm smVar) {
        this.f199793d = smVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        com.tencent.mm.ui.chatting.component.sm smVar = this.f199793d;
        smVar.p0(smVar.f198580d.x());
    }
}
