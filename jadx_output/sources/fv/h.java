package fv;

/* loaded from: classes16.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f266923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fv.k kVar) {
        super(0);
        this.f266923d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fv.k kVar = this.f266923d;
        com.tencent.mars.xlog.Log.i(kVar.d(), "doReleaseCallback");
        kVar.f266930c.invoke();
        return jz5.f0.f302826a;
    }
}
