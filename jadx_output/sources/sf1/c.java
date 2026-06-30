package sf1;

/* loaded from: classes13.dex */
public class c implements sf1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf1.e f406958a;

    public c(sf1.e eVar) {
        this.f406958a = eVar;
    }

    @Override // sf1.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "connect, onConnectSuccess");
        this.f406958a.b(true, "");
    }

    @Override // sf1.g
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "connect, onConnectFailure");
        this.f406958a.b(false, str);
    }
}
