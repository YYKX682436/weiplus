package hu3;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final hu3.a f285194a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f285195b;

    /* renamed from: c, reason: collision with root package name */
    public final tl.w f285196c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.p f285197d;

    public s0(hu3.a audioConfig) {
        kotlin.jvm.internal.o.g(audioConfig, "audioConfig");
        this.f285194a = audioConfig;
        this.f285195b = "MicroMsg.RecordMaasTemplateAudioRecorder";
        tl.w wVar = new tl.w(audioConfig.f285082a, audioConfig.f285083b, 5);
        this.f285196c = wVar;
        wVar.e(1);
        wVar.f420160m = -19;
        wVar.f420172y = new hu3.r0(this);
        audioConfig.f285084c = wVar.f420155h;
    }

    public final void a(yz5.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f285197d = callback;
        com.tencent.mars.xlog.Log.i(this.f285195b, "start ret:" + this.f285196c.k());
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i(this.f285195b, "stop ret:" + this.f285196c.l());
        this.f285197d = null;
    }
}
