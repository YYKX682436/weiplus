package df2;

/* loaded from: classes3.dex */
public final class gh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hh f230219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(df2.hh hhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230219e = hhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.gh(this.f230219e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.Continuation, java.util.concurrent.CancellationException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.gh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
