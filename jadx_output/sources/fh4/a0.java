package fh4;

/* loaded from: classes3.dex */
public class a0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262660d;

    public a0(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262660d = talkRoomUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        c01.d9.b().p().w(144641, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) c01.d9.b().p().l(144641, null), 0) + 1));
        this.f262660d.onBackPressed();
    }
}
