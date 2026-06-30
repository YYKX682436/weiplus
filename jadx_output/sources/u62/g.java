package u62;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy f424955d;

    public g(com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy) {
        this.f424955d = extControlProviderNearBy;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy = this.f424955d;
        if (extControlProviderNearBy.f99899q == null) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            extControlProviderNearBy.f99899q = i11.h.e();
        }
        ((i11.h) extControlProviderNearBy.f99899q).l(extControlProviderNearBy.f99907y, true, false, false);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }
}
