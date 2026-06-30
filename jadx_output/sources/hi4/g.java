package hi4;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi4.j f281547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hi4.j jVar) {
        super(0);
        this.f281547d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.String str;
        hj4.b i18 = ai4.m0.f5173a.i();
        if (i18.a() != 0 && ((java.lang.Number) ((jz5.n) this.f281547d.f281551d).getValue()).intValue() != 0) {
            if (i18.f281661b > 0) {
                str = i18.f281662c;
            } else {
                hj4.a aVar = i18.f281660a;
                if (aVar == null || (str = aVar.f281659a) == null) {
                    str = "";
                }
            }
            if (com.tencent.mm.storage.z3.H4(str)) {
                i17 = 1;
                return java.lang.Integer.valueOf(i17);
            }
        }
        i17 = 0;
        return java.lang.Integer.valueOf(i17);
    }
}
