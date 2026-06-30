package df2;

/* loaded from: classes3.dex */
public final class r7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231229d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231230e;

    /* renamed from: f, reason: collision with root package name */
    public int f231231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f231232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(df2.s8 s8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231232g = s8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.r7(this.f231232g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.r7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.r7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
