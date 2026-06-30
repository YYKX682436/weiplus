package rt1;

/* loaded from: classes7.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f399465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(rt1.p1 p1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399464e = p1Var;
        this.f399465f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt1.o1(this.f399464e, this.f399465f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f7 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
