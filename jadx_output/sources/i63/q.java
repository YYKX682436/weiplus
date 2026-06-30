package i63;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f289019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i63.u f289020e;

    public q(i63.u uVar, dl3.a aVar) {
        this.f289020e = uVar;
        this.f289019d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i63.u uVar = this.f289020e;
        java.util.Map map = uVar.f289036a.f288976i;
        dl3.a aVar = this.f289019d;
        java.lang.Short valueOf = java.lang.Short.valueOf(aVar.f235269a);
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) ((p60.u) i95.n0.c(p60.u.class)).f352200d).getValue()).booleanValue();
        short s17 = aVar.f235269a;
        ((java.util.HashMap) map).put(valueOf, new ua1.b(s17, booleanValue));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStart sessionId: " + ((int) s17) + " audioType: " + aVar.f235270b + " audioId: " + aVar.f235271c + " streams: " + ((java.util.HashMap) uVar.f289036a.f288976i).size());
    }
}
