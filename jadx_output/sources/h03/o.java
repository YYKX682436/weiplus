package h03;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoFeedInfo f277906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h03.q f277907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f277908f;

    public o(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, h03.q qVar, long j17) {
        this.f277906d = megaVideoFeedInfo;
        this.f277907e = qVar;
        this.f277908f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        so2.u1 d17 = c03.i.d(this.f277906d);
        if (d17 != null) {
            h03.q.a(this.f277907e, d17, (int) this.f277908f);
        }
    }
}
