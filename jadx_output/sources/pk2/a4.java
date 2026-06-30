package pk2;

/* loaded from: classes3.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355542d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355543e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f355544f;

    /* renamed from: g, reason: collision with root package name */
    public int f355545g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f355546h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.b4 f355547i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355548m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355549n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355550o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(pk2.b4 b4Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355547i = b4Var;
        this.f355548m = view;
        this.f355549n = loadingSwitchBtn;
        this.f355550o = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.a4 a4Var = new pk2.a4(this.f355547i, this.f355548m, this.f355549n, this.f355550o, continuation);
        a4Var.f355546h = ((java.lang.Boolean) obj).booleanValue();
        return a4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.a4) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.a4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
