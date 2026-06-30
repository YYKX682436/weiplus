package y62;

/* loaded from: classes11.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y62.g f459632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl f459633e;

    public d(com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl extControlProviderVoiceControl, y62.g gVar) {
        this.f459633e = extControlProviderVoiceControl;
        this.f459632d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        y62.g gVar = this.f459632d;
        this.f459633e.n(gVar.f459641h, gVar.f459640g, gVar.f459642i);
    }
}
