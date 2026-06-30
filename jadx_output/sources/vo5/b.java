package vo5;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f438708d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f438709e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f438710f;

    /* renamed from: g, reason: collision with root package name */
    public int f438711g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vo5.c f438712h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438713i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f438714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vo5.c cVar, yz5.l lVar, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438712h = cVar;
        this.f438713i = lVar;
        this.f438714m = byteBuffer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vo5.b(this.f438712h, this.f438713i, this.f438714m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vo5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo5.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
