package ft1;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ft1.j f266480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xg3.s f266481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, ft1.j jVar, xg3.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266479e = str;
        this.f266480f = jVar;
        this.f266481g = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ft1.e(this.f266479e, this.f266480f, this.f266481g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ft1.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00b5 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:6:0x001d, B:8:0x00b5, B:13:0x002a, B:14:0x007b, B:16:0x009a, B:19:0x00be, B:21:0x00e3, B:24:0x00ec, B:26:0x0034), top: B:2:0x0017 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft1.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
