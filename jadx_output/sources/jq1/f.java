package jq1;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f301069a;

    /* renamed from: b, reason: collision with root package name */
    public final long f301070b;

    /* renamed from: c, reason: collision with root package name */
    public jq1.h f301071c = null;

    /* renamed from: d, reason: collision with root package name */
    public jq1.i f301072d = null;

    /* renamed from: e, reason: collision with root package name */
    public jq1.j f301073e = null;

    /* renamed from: f, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f301074f;

    public f(long j17) {
        this.f301069a = j17;
        this.f301070b = j17;
        this.f301074f = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a42.i.f(j17));
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothChatSession", "disconnect");
        jq1.h hVar = this.f301071c;
        if (hVar != null) {
            hVar.a();
            this.f301071c = null;
        }
        jq1.i iVar = this.f301072d;
        if (iVar != null) {
            iVar.a();
            this.f301072d = null;
        }
        jq1.j jVar = this.f301073e;
        if (jVar != null) {
            jVar.f301088d = null;
            jVar.f301094m = true;
            synchronized (jVar) {
                jVar.notify();
            }
            jVar.f301091g.clear();
            jVar.f301090f.clear();
            this.f301073e = null;
        }
    }
}
