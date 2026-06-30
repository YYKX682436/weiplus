package pn4;

/* loaded from: classes5.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.z f357227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f357228e;

    public u(pn4.z zVar, com.tencent.mm.storage.f9 f9Var) {
        this.f357227d = zVar;
        this.f357228e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f357227d.getClass();
        com.tencent.mm.storage.f9 f9Var = this.f357228e;
        if (f9Var.A0() != 0) {
            return;
        }
        try {
            w21.x0.q(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechService", "clearVoiceMessageRedDot success msgId=" + f9Var.getMsgId());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextToSpeechService", "clearVoiceMessageRedDot failed msgId=" + f9Var.getMsgId(), e17);
        }
    }
}
