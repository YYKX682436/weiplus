package rq4;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f398953c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f398954d;

    /* renamed from: e, reason: collision with root package name */
    public int f398955e;

    /* renamed from: f, reason: collision with root package name */
    public int f398956f;

    /* renamed from: i, reason: collision with root package name */
    public long f398959i;

    /* renamed from: j, reason: collision with root package name */
    public long f398960j;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f398951a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f398952b = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f398957g = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public final long[] f398958h = new long[2];

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderReport", "timeoutEncodeNoFrame happened");
        long j17 = gq4.v.wi().f365983q;
        java.util.HashMap hashMap = this.f398952b;
        sq4.b bVar = (sq4.b) hashMap.get("EncoderSourceTimeoutNotFrame");
        if (bVar == null) {
            bVar = new sq4.b();
        }
        bVar.f411373a = "EncoderSourceTimeoutNotFrame";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.d(java.lang.System.currentTimeMillis() - j17);
        hashMap.put("EncoderSourceTimeoutNotFrame", bVar);
    }

    public final void b(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderReport", "timeoutEncodeNoFrame resume cost " + j17);
        sq4.b bVar = (sq4.b) this.f398952b.get("EncoderSourceTimeoutNotFrame");
        if (bVar == null) {
            return;
        }
        bVar.e(j17);
        bVar.f411376d = j17;
        bVar.f411374b++;
    }

    public final java.lang.String c() {
        cl0.g gVar = new cl0.g();
        int[] iArr = this.f398957g;
        if (iArr != null) {
            gVar.o("max", kz5.z.K(iArr));
            gVar.o("min", kz5.z.e0(iArr));
            gVar.o("avg", this.f398955e);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public final java.lang.String d() {
        cl0.g gVar = new cl0.g();
        long[] jArr = this.f398958h;
        if (jArr != null) {
            if (jArr.length == 0) {
                throw new java.util.NoSuchElementException("Array is empty.");
            }
            gVar.p("max", jArr[0]);
            if (jArr.length == 0) {
                throw new java.util.NoSuchElementException("Array is empty.");
            }
            gVar.p("min", jArr[jArr.length - 1]);
            gVar.p("avg", this.f398960j);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }
}
