package vu0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vu0.b f440048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru0.d f440049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yu0.t f440050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vu0.b bVar, ru0.d dVar, yu0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440048e = bVar;
        this.f440049f = dVar;
        this.f440050g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vu0.a(this.f440048e, this.f440049f, this.f440050g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vu0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
