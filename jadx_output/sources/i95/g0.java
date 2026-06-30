package i95;

/* loaded from: classes12.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs.q f289792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f289793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i95.r f289794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f289795g;

    public g0(fs.q qVar, java.lang.Throwable th6, i95.r rVar, boolean z17) {
        this.f289792d = qVar;
        this.f289793e = th6;
        this.f289794f = rVar;
        this.f289795g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fs.q qVar = this.f289792d;
        i95.w wVar = (i95.w) qVar.get();
        if (wVar == null) {
            throw new com.tencent.mm.support.feature_service.ServiceDefException(java.lang.String.format(java.util.Locale.ENGLISH, "fail to get instance from '%s'", qVar));
        }
        wVar.setLastCallerStack(this.f289793e);
        i95.n0.j(null, wVar, this.f289794f, true, this.f289795g, false);
    }
}
