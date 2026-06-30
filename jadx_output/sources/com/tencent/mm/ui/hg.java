package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class hg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.rg f208882d;

    public hg(com.tencent.mm.ui.rg rgVar) {
        this.f208882d = rgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
        exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
        exitTrackRoomEvent.e();
        com.tencent.mm.ui.contact.VoipAddressUI.y7(this.f208882d.f209741t);
        dialogInterface.dismiss();
    }
}
