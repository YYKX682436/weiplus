package v22;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.f f432804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f432805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f432806f;

    public d(v22.f fVar, byte[] bArr, long j17) {
        this.f432804d = fVar;
        this.f432805e = bArr;
        this.f432806f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        v22.f fVar = this.f432804d;
        boolean a17 = fVar.f432811c.a(this.f432805e, this.f432806f);
        com.tencent.mars.xlog.Log.i(fVar.f432809a, "encodeRgbaFrame used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", ret:" + a17);
    }
}
