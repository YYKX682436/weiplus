package pk2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355685e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f355686f;

    /* renamed from: g, reason: collision with root package name */
    public int f355687g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f355688h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.f f355689i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355690m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f355691n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355692o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355693p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355694q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f355695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355696s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pk2.f fVar, android.view.View view, int i17, android.view.View view2, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355689i = fVar;
        this.f355690m = view;
        this.f355691n = i17;
        this.f355692o = view2;
        this.f355693p = loadingSwitchBtn;
        this.f355694q = o9Var;
        this.f355695r = j17;
        this.f355696s = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.e eVar = new pk2.e(this.f355689i, this.f355690m, this.f355691n, this.f355692o, this.f355693p, this.f355694q, this.f355695r, this.f355696s, continuation);
        eVar.f355688h = ((java.lang.Boolean) obj).booleanValue();
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.e) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
