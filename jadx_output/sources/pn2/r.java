package pn2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.z f357010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn2.s f357011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(km2.z zVar, pn2.s sVar) {
        super(0);
        this.f357010d = zVar;
        this.f357011e = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.z zVar = this.f357010d;
        if (zVar.f309232d != null) {
            pn2.s sVar = this.f357011e;
            pn2.d0 c17 = pn2.s.c(sVar, zVar);
            com.tencent.mars.xlog.Log.i(sVar.f357015g, "updateStatus " + c17);
            boolean z17 = c17.f356985a;
            if (z17) {
                sVar.s(z17, c17.f356986b, c17.f356988d, c17.f356989e);
            }
        }
        return jz5.f0.f302826a;
    }
}
