package hq1;

/* loaded from: classes13.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final hq1.n f283081a;

    /* renamed from: b, reason: collision with root package name */
    public final hq1.z f283082b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f283083c;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f283085e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f283086f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f283084d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: g, reason: collision with root package name */
    public final hq1.m f283087g = new hq1.u(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f283088h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f283089i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f283090j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final hq1.f0 f283091k = new hq1.w(this);

    public a0(hq1.z zVar) {
        this.f283083c = null;
        this.f283085e = null;
        this.f283086f = null;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f283083c = context;
        this.f283082b = zVar;
        hq1.n nVar = hq1.n.f283167i;
        if (nVar == null) {
            nVar = new hq1.n(context);
            hq1.n.f283167i = nVar;
        }
        this.f283081a = nVar;
        this.f283086f = new hq1.x(this);
        this.f283085e = new com.tencent.mm.sdk.platformtools.n3("BluetoothLESimpleManagerThread");
    }

    public final boolean a() {
        return this.f283083c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }
}
