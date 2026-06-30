package dl3;

/* loaded from: classes13.dex */
public class l implements dl3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl3.i f235336a;

    public l(dl3.i iVar) {
        this.f235336a = iVar;
    }

    public void a(java.lang.String str) {
        dl3.i iVar;
        dl3.d0 o17 = this.f235336a.o(str);
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onStart player is null");
            return;
        }
        this.f235336a.v(str, o17);
        synchronized (this.f235336a.f235323p) {
            iVar = this.f235336a;
            iVar.f235324q = false;
        }
        com.tencent.mm.sdk.platformtools.u3.l(iVar.P);
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 11;
        g0Var.f6719d = "real_play";
        g0Var.f6718c = str;
        g0Var.f6720e = this.f235336a.m(str);
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
    }
}
