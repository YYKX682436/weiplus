package y62;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y62.g f459630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl f459631e;

    public c(com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl extControlProviderVoiceControl, y62.g gVar) {
        this.f459631e = extControlProviderVoiceControl;
        this.f459630d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        y62.g gVar = this.f459630d;
        this.f459631e.n(gVar.f459641h, gVar.f459640g, gVar.f459642i);
    }
}
