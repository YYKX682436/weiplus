package fv;

/* loaded from: classes16.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f266919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fv.k kVar) {
        super(0);
        this.f266919d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fv.k kVar = this.f266919d;
        long j17 = kVar.f266928a.f364317c;
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i(kVar.d(), "startDelayRelease:" + j17 + ", deepBackground");
            pm0.v.X(new fv.j(kVar, 100, j17));
        }
        return jz5.f0.f302826a;
    }
}
