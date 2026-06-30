package gx0;

/* loaded from: classes5.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f276655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276657g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(java.util.List list, ex0.a0 a0Var, gx0.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276655e = list;
        this.f276656f = a0Var;
        this.f276657g = u2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.l2(this.f276655e, this.f276656f, this.f276657g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0353 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x035a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
