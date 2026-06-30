package j2;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f297215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f297216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.text.Spannable spannable, yz5.r rVar) {
        super(3);
        this.f297215d = spannable;
        this.f297216e = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a2.g1 spanStyle = (a2.g1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(spanStyle, "spanStyle");
        f2.r rVar = spanStyle.f725c;
        if (rVar == null) {
            rVar = f2.r.f258822i;
        }
        f2.p pVar = spanStyle.f726d;
        f2.p pVar2 = new f2.p(pVar != null ? pVar.f258816a : 0);
        f2.q qVar = spanStyle.f727e;
        this.f297215d.setSpan(new d2.k((android.graphics.Typeface) this.f297216e.C(spanStyle.f728f, rVar, pVar2, new f2.q(qVar != null ? qVar.f258817a : 1))), intValue, intValue2, 33);
        return jz5.f0.f302826a;
    }
}
