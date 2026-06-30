package sl;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.h f409024d;

    public g(sl.h hVar) {
        this.f409024d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sl.h hVar = this.f409024d;
        fl.a aVar = hVar.f409025d.f409026a.f409040m;
        aVar.a(aVar.f263690p);
        sl.i iVar = hVar.f409025d;
        sl.j jVar = iVar.f409026a;
        jVar.getClass();
        if (com.tencent.mm.sdk.platformtools.v5.a(jVar.f409029b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
            if (!iVar.f409026a.c()) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(iVar.f409026a.f409036i);
                iVar.f409026a.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", valueOf, java.lang.Boolean.FALSE);
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", java.lang.Boolean.valueOf(iVar.f409026a.f409030c));
                sl.j jVar2 = iVar.f409026a;
                jVar2.f409040m.E(jVar2.f409030c);
                iVar.f409026a.f409030c = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
            }
        } else if (iVar.f409026a.f409028a == null || !j65.e.g()) {
            sl.j jVar3 = iVar.f409026a;
            android.content.Context context = jVar3.f409029b;
            boolean z17 = jVar3.f409040m.f263690p;
            com.tencent.mm.sdk.platformtools.q5 q5Var = new com.tencent.mm.sdk.platformtools.q5(new sl.e(this));
            com.tencent.mm.sdk.platformtools.d6 d6Var = com.tencent.mm.sdk.platformtools.d6.f192524a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.sdk.platformtools.d6.e(context, com.tencent.mm.R.string.hje, z17 ? com.tencent.mm.sdk.platformtools.x5.f193085e : com.tencent.mm.sdk.platformtools.x5.f193086f, -1, false, q5Var);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new sl.f(this));
    }
}
