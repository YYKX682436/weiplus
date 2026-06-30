package fa3;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f260763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260765f;

    public k(fa3.b bVar, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260765f = bVar;
        this.f260763d = map;
        this.f260764e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera startRecord onTimer");
        fa3.b bVar = this.f260765f;
        bVar.I = true;
        bVar.k(this.f260763d, this.f260764e);
    }
}
