package fv;

/* loaded from: classes16.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f266922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fv.k kVar) {
        super(0);
        this.f266922d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fv.k kVar = this.f266922d;
        kVar.f266931d = false;
        long j17 = kVar.f266928a.f364315a;
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i(kVar.d(), "startDelayRelease:" + j17 + ", inactive");
            pm0.v.X(new fv.j(kVar, 0, j17));
        }
        return jz5.f0.f302826a;
    }
}
