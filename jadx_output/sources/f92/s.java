package f92;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.t f260273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f92.t tVar) {
        super(0);
        this.f260273d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m92.h hVar = new m92.h();
        r92.a aVar = (r92.a) ((jz5.n) this.f260273d.f260279i).getValue();
        aVar.getClass();
        m92.e eVar = new m92.e();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.InputStream C = com.tencent.mm.vfs.w6.C(aVar.f393449a);
            kotlin.jvm.internal.o.f(C, "openRead(...)");
            kotlin.Result.m521constructorimpl(eVar.parseFrom(vz5.a.c(C)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        hVar.f324982e = eVar;
        pm0.v.X(new m92.g(hVar, eVar));
        return hVar;
    }
}
