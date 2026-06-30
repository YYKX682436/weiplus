package i63;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f289028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f289031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f289032h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i63.u f289033i;

    public s(i63.u uVar, dl3.a aVar, int i17, int i18, int i19, float[] fArr) {
        this.f289033i = uVar;
        this.f289028d = aVar;
        this.f289029e = i17;
        this.f289030f = i18;
        this.f289031g = i19;
        this.f289032h = fArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f289033i.f289036a.f288976i;
        dl3.a aVar = this.f289028d;
        ua1.b bVar = (ua1.b) ((java.util.HashMap) map).get(java.lang.Short.valueOf(aVar.f235269a));
        float[] fArr = this.f289032h;
        int i17 = this.f289031g;
        int i18 = this.f289030f;
        if (bVar != null) {
            bVar.e((short) i18, i17, fArr);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + ((int) aVar.f235269a) + " audioType: " + aVar.f235270b + " audioId: " + aVar.f235271c + " format: " + this.f289029e + " channel: " + i18 + " samplerate: " + i17 + " size: " + fArr.length);
    }
}
