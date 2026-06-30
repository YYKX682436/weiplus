package gg0;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg0.j f271510d;

    public g(gg0.j jVar) {
        this.f271510d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg0.j jVar = this.f271510d;
        try {
            com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent = new com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent();
            am.p00 p00Var = voiceMsgDownloadFinishEvent.f54936g;
            if (p00Var != null) {
                p00Var.f7590a = jVar.f271513t.f271490d;
            }
            if (p00Var != null) {
                p00Var.f7591b = true;
            }
            if (p00Var != null) {
                w21.w0 w0Var = jVar.f271514u;
                p00Var.f7592c = w0Var != null ? w0Var.c() : false;
            }
            voiceMsgDownloadFinishEvent.b(android.os.Looper.getMainLooper());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadSuccess[" + jVar.f271513t.f271488b + "] event publish error: " + e17);
        }
    }
}
