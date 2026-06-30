package i63;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f289021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f289024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f289025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f289026i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i63.u f289027m;

    public r(i63.u uVar, dl3.a aVar, int i17, int i18, int i19, byte[] bArr, long j17) {
        this.f289027m = uVar;
        this.f289021d = aVar;
        this.f289022e = i17;
        this.f289023f = i18;
        this.f289024g = i19;
        this.f289025h = bArr;
        this.f289026i = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f289027m.f289036a.f288976i;
        dl3.a aVar = this.f289021d;
        ua1.b bVar = (ua1.b) ((java.util.HashMap) map).get(java.lang.Short.valueOf(aVar.f235269a));
        int i17 = this.f289023f;
        if (bVar != null) {
            bVar.d((short) i17, this.f289024g, this.f289025h, this.f289026i);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + ((int) aVar.f235269a) + " audioType: " + aVar.f235270b + " audioId: " + aVar.f235271c + " format: " + this.f289022e + " channel: " + i17 + " samplerate: " + this.f289024g + " size: " + this.f289025h.length);
    }
}
