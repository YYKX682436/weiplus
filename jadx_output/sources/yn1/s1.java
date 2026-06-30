package yn1;

/* loaded from: classes9.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f463824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f463825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463827i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f463828m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(int i17, byte[] bArr, byte[] bArr2, java.lang.String str, yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463823e = i17;
        this.f463824f = bArr;
        this.f463825g = bArr2;
        this.f463826h = str;
        this.f463827i = r2Var;
        this.f463828m = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.s1(this.f463823e, this.f463824f, this.f463825g, this.f463826h, this.f463827i, this.f463828m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
