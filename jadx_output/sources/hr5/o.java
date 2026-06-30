package hr5;

/* loaded from: classes15.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.p f284428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hr5.p pVar) {
        super(0);
        this.f284428d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        hr5.p pVar = this.f284428d;
        if (pVar.f284432b) {
            arrayList.add("containerSize");
        }
        if (pVar.f284433c) {
            arrayList.add("contentSize");
        }
        if (pVar.f284434d) {
            arrayList.add("contentOriginSize");
        }
        if (pVar.f284435e) {
            arrayList.add("rotation");
        }
        if (pVar.f284436f) {
            arrayList.add("contentScale");
        }
        if (pVar.f284437g) {
            arrayList.add("alignment");
        }
        if (pVar.f284438h) {
            arrayList.add("rtlLayoutDirection");
        }
        if (pVar.f284439i) {
            arrayList.add("readMode");
        }
        if (pVar.f284440j) {
            arrayList.add("scalesCalculator");
        }
        if (pVar.f284441k) {
            arrayList.add("limitOffsetWithinBaseVisibleRect");
        }
        if (pVar.f284442l) {
            arrayList.add("containerWhitespaceMultiple");
        }
        if (pVar.f284443m) {
            arrayList.add("containerWhitespace");
        }
        return kz5.n0.g0(kz5.n0.S0(arrayList), null, null, null, 0, null, null, 63, null);
    }
}
