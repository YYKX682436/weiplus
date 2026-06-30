package zl2;

/* loaded from: classes3.dex */
public final class s3 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f473969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f473971c;

    public s3(long j17, java.lang.String str, int i17) {
        this.f473969a = j17;
        this.f473970b = str;
        this.f473971c = i17;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        long j18 = this.f473969a;
        if (j18 == j17 && (obj instanceof r45.l71)) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "tryToNotifyLiveEnd liveStatus:" + i17);
            if (i17 == 2) {
                zl2.r4.f473950a.C2(this.f473969a, this.f473970b, 2, this.f473971c);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveUtil", "tryToNotifyLiveEnd, local liveId:" + j18 + " resp live id " + j17 + '!');
    }
}
