package df2;

/* loaded from: classes10.dex */
public final class en extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ln f230074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(df2.ln lnVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230074e = lnVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.en(this.f230074e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.en) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        if (r15 == r1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.en.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
