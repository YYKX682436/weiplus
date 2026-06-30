package df2;

/* loaded from: classes3.dex */
public final class f5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.h5 f230110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(df2.h5 h5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230110e = h5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.f5(this.f230110e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.f5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.f5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
