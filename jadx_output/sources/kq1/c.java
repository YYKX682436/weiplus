package kq1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final kq1.b f311237a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.BroadcastReceiver f311238b;

    public c(kq1.b bVar) {
        kq1.a aVar = new kq1.a(this);
        this.f311238b = aVar;
        com.tencent.mars.xlog.Log.i("McroMsg.exdevice.BluetoohtStateMonitor", "register BluetoothState receiver");
        this.f311237a = bVar;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(aVar, intentFilter);
    }
}
