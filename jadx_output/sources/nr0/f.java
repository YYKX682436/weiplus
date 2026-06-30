package nr0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f339075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f339077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f339078h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.Surface surface, nr0.x xVar, java.lang.Integer num, java.lang.Integer num2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339075e = surface;
        this.f339076f = xVar;
        this.f339077g = num;
        this.f339078h = num2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.f(this.f339075e, this.f339076f, this.f339077g, this.f339078h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        if (r14 == r0) goto L41;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
