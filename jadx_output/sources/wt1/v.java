package wt1;

/* loaded from: classes13.dex */
public class v extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt1.t f449356a;

    public v(wt1.t tVar) {
        this.f449356a = tVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            wt1.t tVar = this.f449356a;
            if (state == 12) {
                tVar.f449346c = true;
                com.tencent.mm.sdk.platformtools.u3.i(tVar.f449350g, tVar.f449349f);
            } else if (state == 10) {
                com.tencent.mm.sdk.platformtools.u3.l(tVar.f449350g);
                tVar.f449346c = false;
                ((java.util.concurrent.ConcurrentHashMap) tVar.f449347d).clear();
            }
        }
    }
}
