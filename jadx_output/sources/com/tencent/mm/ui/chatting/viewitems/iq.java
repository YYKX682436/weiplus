package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class iq implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.er f204208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.kq f204209e;

    public iq(com.tencent.mm.ui.chatting.viewitems.kq kqVar, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        this.f204209e = kqVar;
        this.f204208d = erVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
        exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
        exitTrackRoomEvent.e();
        this.f204209e.b(this.f204208d);
        dialogInterface.dismiss();
    }
}
