package sl;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.i f409025d;

    public h(sl.i iVar) {
        this.f409025d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sl.i iVar = this.f409025d;
        try {
            if (wo.v1.f447823c.f447607j == 1) {
                java.lang.Thread.sleep(300L);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion, intOnCompletion: %s, shouldPlayComplete: %s", iVar.f409026a.f409043p, java.lang.Boolean.TRUE);
            com.tencent.mm.sdk.platformtools.u3.h(new sl.g(this));
            tl.h hVar = iVar.f409026a.f409028a;
            if (hVar != null) {
                hVar.b(null);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoicePlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
