package df2;

/* loaded from: classes.dex */
public final class nh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230857d;

    /* renamed from: e, reason: collision with root package name */
    public int f230858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.oh f230859f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(df2.oh ohVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230859f = ohVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.nh(this.f230859f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.nh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0106  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.nh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
