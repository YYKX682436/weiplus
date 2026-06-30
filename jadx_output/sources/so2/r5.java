package so2;

/* loaded from: classes8.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410577d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f410580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f410581h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(java.lang.String str, so2.w5 w5Var, so2.k5 k5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410579f = str;
        this.f410580g = w5Var;
        this.f410581h = k5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        so2.r5 r5Var = new so2.r5(this.f410579f, this.f410580g, this.f410581h, continuation);
        r5Var.f410578e = obj;
        return r5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.r5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.r5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
