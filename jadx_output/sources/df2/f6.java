package df2;

/* loaded from: classes3.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230111d;

    /* renamed from: e, reason: collision with root package name */
    public int f230112e;

    /* renamed from: f, reason: collision with root package name */
    public long f230113f;

    /* renamed from: g, reason: collision with root package name */
    public long f230114g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f230115h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f230116i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f230117m;

    /* renamed from: n, reason: collision with root package name */
    public int f230118n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230119o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230120p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f230121q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f230122r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(df2.t6 t6Var, java.lang.String str, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230119o = t6Var;
        this.f230120p = str;
        this.f230121q = j17;
        this.f230122r = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.f6(this.f230119o, this.f230120p, this.f230121q, this.f230122r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.f6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0129  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
