package we0;

/* loaded from: classes11.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ we0.c1 f445101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f445102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(we0.c1 c1Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445101e = c1Var;
        this.f445102f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new we0.b1(this.f445101e, this.f445102f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((we0.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we0.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
