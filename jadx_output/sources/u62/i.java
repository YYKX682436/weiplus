package u62;

/* loaded from: classes12.dex */
public class i implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy f424957d;

    public i(com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy) {
        this.f424957d = extControlProviderNearBy;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy = this.f424957d;
        if (extControlProviderNearBy.f99905w) {
            return false;
        }
        extControlProviderNearBy.f99905w = true;
        if (z17) {
            gm0.j1.d().g(new an3.f(extControlProviderNearBy.f99897o, f17, f18, (int) d18, i17, "", ""));
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderNearBy", "get location failed");
        com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy.n(extControlProviderNearBy);
        extControlProviderNearBy.f99902t.countDown();
        return false;
    }
}
