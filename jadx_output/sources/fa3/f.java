package fa3;

/* loaded from: classes10.dex */
public class f implements bi3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260756a;

    public f(fa3.b bVar, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260756a = gVar;
    }

    @Override // bi3.f
    public void a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppCameraManager", "LiteAppCamera InitErrorCallback");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("error", "camera init error");
        this.f260756a.f(hashMap);
    }
}
