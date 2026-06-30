package xg3;

/* loaded from: classes11.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f454422a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f454423b;

    /* renamed from: c, reason: collision with root package name */
    public long f454424c;

    /* renamed from: d, reason: collision with root package name */
    public int f454425d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f454426e;

    /* renamed from: f, reason: collision with root package name */
    public int f454427f;

    /* renamed from: g, reason: collision with root package name */
    public long f454428g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454429h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454430i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f454431j;

    public q0(int i17) {
        this.f454425d = i17;
    }

    public byte[] a() {
        com.tencent.mm.protobuf.f fVar;
        if (this.f454426e == null && (fVar = this.f454431j) != null) {
            try {
                this.f454426e = fVar.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: " + e17.getMessage());
            }
        }
        return this.f454426e;
    }

    public int b() {
        return this.f454425d;
    }
}
