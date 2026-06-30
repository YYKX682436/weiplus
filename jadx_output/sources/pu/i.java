package pu;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358312d;

    /* renamed from: e, reason: collision with root package name */
    public int f358313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru.j f358314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu.k f358315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ru.j jVar, pu.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358314f = jVar;
        this.f358315g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.i(this.f358314f, this.f358315g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
