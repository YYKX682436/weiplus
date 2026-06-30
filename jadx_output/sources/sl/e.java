package sl;

/* loaded from: classes12.dex */
public class e implements com.tencent.mm.sdk.platformtools.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.g f409022a;

    public e(sl.g gVar) {
        this.f409022a = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.t5
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
        sl.g gVar = this.f409022a;
        if (gVar.f409024d.f409025d.f409026a.c()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", java.lang.Boolean.valueOf(gVar.f409024d.f409025d.f409026a.f409030c));
        sl.j jVar = gVar.f409024d.f409025d.f409026a;
        jVar.f409040m.E(jVar.f409030c);
        sl.j jVar2 = gVar.f409024d.f409025d.f409026a;
        jVar2.f409030c = false;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jVar2.f409036i);
        gVar.f409024d.f409025d.f409026a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", valueOf, java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
    }
}
