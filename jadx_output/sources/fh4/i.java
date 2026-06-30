package fh4;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262698d;

    public i(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI, java.lang.String str) {
        this.f262698d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dh4.l.Di().h(this.f262698d, 0);
    }
}
