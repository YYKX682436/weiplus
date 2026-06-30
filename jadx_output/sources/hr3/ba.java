package hr3;

/* loaded from: classes11.dex */
public class ba implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283424d;

    public ba(hr3.va vaVar) {
        this.f283424d = vaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
        exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
        exitTrackRoomEvent.e();
        this.f283424d.l();
        dialogInterface.dismiss();
    }
}
