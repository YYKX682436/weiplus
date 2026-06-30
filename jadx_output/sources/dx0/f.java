package dx0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx0.g f244431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f244432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dx0.g gVar, com.tencent.maas.base.MJID mjid, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244431d = gVar;
        this.f244432e = mjid;
        this.f244433f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dx0.f(this.f244431d, this.f244432e, this.f244433f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dx0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
