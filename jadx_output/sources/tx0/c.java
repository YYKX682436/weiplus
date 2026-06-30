package tx0;

/* loaded from: classes.dex */
public final class c implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx0.k f422505d;

    public c(tx0.k kVar) {
        this.f422505d = kVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        if (!z17) {
            return false;
        }
        com.tencent.mm.autogen.events.FinderLocationRefreshEvent finderLocationRefreshEvent = new com.tencent.mm.autogen.events.FinderLocationRefreshEvent();
        am.hc hcVar = finderLocationRefreshEvent.f54302g;
        hcVar.getClass();
        hcVar.getClass();
        finderLocationRefreshEvent.e();
        tx0.k kVar = this.f422505d;
        kotlinx.coroutines.l.d(kVar.f422524a, null, null, new tx0.b(kVar, f18, f17, null), 3, null);
        return true;
    }
}
