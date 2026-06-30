package df2;

/* loaded from: classes3.dex */
public final class ou extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qu f231007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(df2.qu quVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231007e = quVar;
        this.f231008f = str;
        this.f231009g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ou(this.f231007e, this.f231008f, this.f231009g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ou) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ou.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
