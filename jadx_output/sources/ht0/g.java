package ht0;

/* loaded from: classes10.dex */
public class g implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.s f284695d;

    public g(ht0.s sVar) {
        this.f284695d = sVar;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        ht0.s sVar = this.f284695d;
        if (!sVar.A() || bArr == null || bArr.length == 0) {
            return false;
        }
        long longValue = ((java.lang.Long) sVar.F().first).longValue();
        ht0.e eVar = new ht0.e(sVar);
        ls0.k kVar = sVar.I;
        kVar.getClass();
        kVar.d(new ls0.f(kVar, bArr, longValue, eVar));
        return false;
    }
}
