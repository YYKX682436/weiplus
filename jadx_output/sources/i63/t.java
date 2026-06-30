package i63;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f289034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i63.u f289035e;

    public t(i63.u uVar, dl3.a aVar) {
        this.f289035e = uVar;
        this.f289034d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hilive] AbstractAudioOutputListener onStop sessionId: ");
        dl3.a aVar = this.f289034d;
        sb6.append((int) aVar.f235269a);
        sb6.append(" audioType: ");
        sb6.append(aVar.f235270b);
        sb6.append(" audioId: ");
        sb6.append(aVar.f235271c);
        sb6.append(" streams: ");
        i63.u uVar = this.f289035e;
        sb6.append(((java.util.HashMap) uVar.f289036a.f288976i).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", sb6.toString());
        ua1.b bVar = (ua1.b) ((java.util.HashMap) uVar.f289036a.f288976i).remove(java.lang.Short.valueOf(aVar.f235269a));
        if (bVar != null) {
            bVar.c();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStop, not found sessionId: " + ((int) aVar.f235269a) + " audioType: " + aVar.f235270b + " audioId: " + aVar.f235271c + " streams: " + ((java.util.HashMap) uVar.f289036a.f288976i).size());
    }
}
