package iz3;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry3.r f296100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f296101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry3.q f296102f;

    public t(ry3.r rVar, long j17, ry3.q qVar) {
        this.f296100d = rVar;
        this.f296101e = j17;
        this.f296102f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry3.r rVar = this.f296100d;
        if (rVar != null) {
            rVar.a(this.f296101e, this.f296102f);
        }
    }
}
