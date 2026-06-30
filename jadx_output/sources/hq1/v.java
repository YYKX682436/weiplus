package hq1;

/* loaded from: classes13.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f283197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f283198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f283199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.w f283200g;

    public v(hq1.w wVar, long j17, boolean z17, long j18) {
        this.f283200g = wVar;
        this.f283197d = j17;
        this.f283198e = z17;
        this.f283199f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.w wVar = this.f283200g;
        java.util.HashMap hashMap = wVar.f283201a.f283089i;
        long j17 = this.f283197d;
        hq1.h0 h0Var = (hq1.h0) hashMap.get(java.lang.Long.valueOf(j17));
        boolean z17 = this.f283198e;
        boolean z18 = !z17;
        if (h0Var == null && !z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleManager", "no seesion(mac=%s) found", a42.i.f(j17));
            return;
        }
        hq1.z zVar = wVar.f283201a.f283082b;
        if (zVar != null) {
            u32.l1 l1Var = (u32.l1) zVar;
            l1Var.getClass();
            u32.q1 q1Var = new u32.q1(null);
            q1Var.f424351a = j17;
            q1Var.f424353c = z17 ? 2 : 4;
            q1Var.f424352b = 1;
            q1Var.f424354d = 0;
            q1Var.f424355e = this.f283199f;
            com.tencent.mm.sdk.platformtools.n3 n3Var = l1Var.f424323a.f424267p;
            if (!n3Var.sendMessage(n3Var.obtainMessage(9, q1Var))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 9);
            }
            if (z18) {
                a42.i.f(j17);
            }
        }
        if (z18) {
            a42.i.f(j17);
            wVar.f283201a.f283089i.remove(java.lang.Long.valueOf(j17));
            wVar.f283201a.f283090j.remove(java.lang.Long.valueOf(j17));
        }
    }
}
