package u32;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f424311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f424312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.a1 f424313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int[] f424314g;

    public j(u32.p pVar, int i17, u32.a1 a1Var, int[] iArr) {
        this.f424311d = pVar;
        this.f424312e = i17;
        this.f424313f = a1Var;
        this.f424314g = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (u32.p.a(this.f424311d, this.f424312e, this.f424313f, this.f424314g)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.scanImp failed!!!");
    }
}
