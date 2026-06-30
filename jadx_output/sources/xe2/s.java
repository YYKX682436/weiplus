package xe2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453898d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453899e;

    /* renamed from: f, reason: collision with root package name */
    public int f453900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ug2.a f453901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453902h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ug2.a aVar, xe2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453901g = aVar;
        this.f453902h = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.s(this.f453901g, this.f453902h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
