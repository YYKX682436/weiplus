package il2;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f292053e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f292054f;

    /* renamed from: g, reason: collision with root package name */
    public int f292055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ il2.r f292056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f292057i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f292058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(il2.r rVar, long j17, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292056h = rVar;
        this.f292057i = j17;
        this.f292058m = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new il2.f(this.f292056h, this.f292057i, this.f292058m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((il2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
