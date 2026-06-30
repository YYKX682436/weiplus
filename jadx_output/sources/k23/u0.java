package k23;

/* loaded from: classes12.dex */
public final class u0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f303699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k23.v0 v0Var, android.os.Looper looper) {
        super(looper);
        this.f303699a = v0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 101) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "finishRecognizeTimeoutTask run");
            ((k23.n0) this.f303699a.f303721p).run();
        }
    }
}
