package df5;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.d f232043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(df5.d dVar) {
        super(0);
        this.f232043d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        df5.d dVar = this.f232043d;
        df5.v vVar = dVar.f232064d;
        if (vVar == null || (i17 = vVar.f232241l - vVar.f232240k) < 0) {
            i17 = 0;
        }
        java.util.Iterator it = ((java.util.ArrayList) dVar.f232066f).iterator();
        int i19 = 0;
        while (it.hasNext()) {
            df5.o1 o1Var = (df5.o1) it.next();
            if (o1Var instanceof df5.m1) {
                df5.m1 m1Var = (df5.m1) o1Var;
                i18 = m1Var.f232167a.f232079b.length() - m1Var.f232167a.f232080c;
                if (i18 >= 0) {
                    i19 += i18;
                }
                i18 = 0;
                i19 += i18;
            } else {
                if (!(o1Var instanceof df5.n1)) {
                    if (!(o1Var instanceof df5.l1)) {
                        throw new jz5.j();
                    }
                    i18 = ((df5.l1) o1Var).f232163a;
                    i19 += i18;
                }
                i18 = 0;
                i19 += i18;
            }
        }
        return java.lang.Integer.valueOf(i17 + i19);
    }
}
