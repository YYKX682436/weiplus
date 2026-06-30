package sf1;

/* loaded from: classes13.dex */
public class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf1.e f406956a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sf1.e eVar, android.os.Looper looper) {
        super(looper);
        this.f406956a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message == null) {
            return;
        }
        boolean z17 = true;
        if (message.what != 1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "MSG_TIME_OUT");
        sf1.e eVar = this.f406956a;
        int i17 = eVar.f406968i;
        if (i17 != 3 && i17 != 2) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        eVar.a("fail to connect wifi:time out");
        com.tencent.mars.xlog.Log.i("MicroMsg.wifi_event", "MSG_TIME_OUT FAIL.");
    }
}
