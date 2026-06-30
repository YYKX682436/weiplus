package xu;

/* loaded from: classes9.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457175d;

    /* renamed from: e, reason: collision with root package name */
    public int f457176e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xu.g f457178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xu.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457178g = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xu.f fVar = new xu.f(this.f457178g, continuation);
        fVar.f457177f = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xu.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0130, code lost:
    
        if (r4 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0158  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
