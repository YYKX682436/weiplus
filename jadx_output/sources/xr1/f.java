package xr1;

/* loaded from: classes8.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456187d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456188e;

    /* renamed from: f, reason: collision with root package name */
    public int f456189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f456190g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xr1.g f456191h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f456192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ym3.c cVar, xr1.g gVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456190g = cVar;
        this.f456191h = gVar;
        this.f456192i = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xr1.f(this.f456190g, this.f456191h, this.f456192i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xr1.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
