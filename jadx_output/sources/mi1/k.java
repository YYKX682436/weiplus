package mi1;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.l f326596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mi1.l lVar) {
        super(0);
        this.f326596d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = this.f326596d.f326604d.getRuntime();
        kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
        return new mi1.l2(null, runtime);
    }
}
