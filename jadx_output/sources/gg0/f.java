package gg0;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg0.j f271507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f271508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w21.w0 f271509f;

    public f(gg0.j jVar, com.tencent.mm.storage.f9 f9Var, w21.w0 w0Var) {
        this.f271507d = jVar;
        this.f271508e = f9Var;
        this.f271509f = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent = new com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent();
            am.p00 p00Var = voiceMsgDownloadFinishEvent.f54936g;
            com.tencent.mm.storage.f9 f9Var = this.f271508e;
            w21.w0 w0Var = this.f271509f;
            if (p00Var != null) {
                p00Var.f7590a = f9Var.getMsgId();
            }
            if (p00Var != null) {
                p00Var.f7591b = false;
            }
            if (p00Var != null) {
                p00Var.f7592c = w0Var.c();
            }
            voiceMsgDownloadFinishEvent.b(android.os.Looper.getMainLooper());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadError[" + this.f271507d.f271513t.f271488b + "] event publish error: " + e17);
        }
    }
}
