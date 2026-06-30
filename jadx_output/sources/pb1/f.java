package pb1;

/* loaded from: classes7.dex */
public class f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb1.i f353135a;

    public f(pb1.i iVar) {
        this.f353135a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        pb1.i iVar = this.f353135a;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i(iVar.f353140a, "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            java.lang.String str = iVar.f353140a;
            if (state == 12 || state == 11) {
                return;
            }
            if (state == 10 || state == 13) {
                com.tencent.mars.xlog.Log.i(iVar.f353140a, "bluetooth is disable, stop scan", new java.lang.Object[0]);
                iVar.f353144e.set(false);
                iVar.d();
            }
        }
    }
}
