package df2;

/* loaded from: classes3.dex */
public final class fr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230160e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230161f;

    /* renamed from: g, reason: collision with root package name */
    public int f230162g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.gr f230164i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.k74 f230165m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(df2.gr grVar, r45.k74 k74Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230164i = grVar;
        this.f230165m = k74Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.fr frVar = new df2.fr(this.f230164i, this.f230165m, continuation);
        frVar.f230163h = obj;
        return frVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.fr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02ee  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.fr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
