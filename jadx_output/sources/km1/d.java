package km1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.e f308993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f308994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(km1.e eVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(0);
        this.f308993d = eVar;
        this.f308994e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km1.f fVar = this.f308993d.f308996b;
        com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var = fVar.f308997a;
        fVar.f308997a = null;
        if (n5Var != null) {
            if (km1.s.F) {
                java.lang.String str = this.f308993d.f308995a;
            }
            this.f308994e.i(n5Var, null);
        }
        return jz5.f0.f302826a;
    }
}
