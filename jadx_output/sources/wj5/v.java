package wj5;

/* loaded from: classes8.dex */
public final class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.y f446845d;

    public v(wj5.y yVar) {
        this.f446845d = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        wj5.y yVar = this.f446845d;
        yVar.p(yVar.f446848e.x());
    }
}
