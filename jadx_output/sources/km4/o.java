package km4;

/* loaded from: classes11.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f309300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f309301e;

    /* renamed from: f, reason: collision with root package name */
    public int f309302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km4.q f309303g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.j20 f309304h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f309305i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f309306m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f309307n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f309308o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f309309p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f309310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w71.t0 f309311r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.p f309312s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(km4.q qVar, bw5.j20 j20Var, java.util.Map map, boolean z17, boolean z18, java.util.Map map2, java.lang.Class cls, java.lang.Integer num, w71.t0 t0Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f309303g = qVar;
        this.f309304h = j20Var;
        this.f309305i = map;
        this.f309306m = z17;
        this.f309307n = z18;
        this.f309308o = map2;
        this.f309309p = cls;
        this.f309310q = num;
        this.f309311r = t0Var;
        this.f309312s = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new km4.o(this.f309303g, this.f309304h, this.f309305i, this.f309306m, this.f309307n, this.f309308o, this.f309309p, this.f309310q, this.f309311r, this.f309312s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((km4.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0175  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km4.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
