package sn1;

/* loaded from: classes12.dex */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    public long f410085b;

    /* renamed from: c, reason: collision with root package name */
    public long f410086c;

    /* renamed from: d, reason: collision with root package name */
    public long f410087d;

    /* renamed from: e, reason: collision with root package name */
    public long f410088e;

    /* renamed from: f, reason: collision with root package name */
    public long f410089f;

    /* renamed from: g, reason: collision with root package name */
    public long f410090g;

    /* renamed from: l, reason: collision with root package name */
    public final sn1.r0 f410095l;

    /* renamed from: a, reason: collision with root package name */
    public long f410084a = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f410091h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f410092i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f410093j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Queue f410094k = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f410096m = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new sn1.q0(this), true);

    public s0(sn1.r0 r0Var) {
        this.f410095l = r0Var;
    }

    public void a() {
        this.f410093j -= java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "startTickTime");
    }
}
