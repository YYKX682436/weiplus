package y62;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y62.g f459627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ga f459628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl f459629f;

    public b(com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl extControlProviderVoiceControl, y62.g gVar, r45.ga gaVar) {
        this.f459629f = extControlProviderVoiceControl;
        this.f459627d = gVar;
        this.f459628e = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode getVoiceControlResult");
        int i17 = this.f459628e.f375031e;
        y62.g gVar = this.f459627d;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] setGetResultTimeOut %s", java.lang.Integer.valueOf(i17));
        gVar.f459649s = i17;
        this.f459629f.n(gVar.f459641h, gVar.f459640g, gVar.f459642i);
    }
}
