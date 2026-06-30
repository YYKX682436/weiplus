package z21;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.w f469678d;

    public s(z21.w wVar) {
        this.f469678d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z21.w wVar = this.f469678d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceInputAddr", "run NetSceneNewVoiceInput mWroteBytesCnt %s time %s", java.lang.Integer.valueOf(wVar.f469682e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (wVar.f469684g || wVar.f469700z == null || wVar.f469682e == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SceneVoiceInputAddr", "WorkerThread too busy can not do work");
            return;
        }
        gm0.j1.d().a(wVar.C ? 12220 : 235, wVar);
        if (wVar.f469692r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SceneVoiceInputAddr", "onFilteredSpeakVoice disableTrans");
        } else {
            if (((z21.h) wVar.f469700z).P() && gm0.j1.d().h(wVar.f469700z, 0)) {
                return;
            }
            wVar.a(13, 131, -1);
        }
    }
}
