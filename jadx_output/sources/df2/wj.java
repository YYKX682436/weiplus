package df2;

/* loaded from: classes3.dex */
public final class wj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.pk f231696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.pk pkVar) {
        super(2, continuation);
        this.f231695d = hVar;
        this.f231696e = pkVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.wj(this.f231695d, continuation, this.f231696e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.wj wjVar = (df2.wj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wjVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if ((r11 == null || r11.length() == 0) == false) goto L26;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
