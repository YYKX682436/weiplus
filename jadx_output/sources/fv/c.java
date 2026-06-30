package fv;

/* loaded from: classes16.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f266918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fv.k kVar) {
        super(0);
        this.f266918d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fv.k kVar = this.f266918d;
        fv.l lVar = kVar.f266932e;
        if (lVar != null) {
            com.tencent.mars.xlog.Log.i(kVar.d(), "delayTask:" + kVar.f266932e + ", cancel");
            lVar.f266933a.cancel(false);
            kVar.f266932e = null;
        }
        return jz5.f0.f302826a;
    }
}
