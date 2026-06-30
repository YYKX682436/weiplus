package qf2;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362460d;

    /* renamed from: e, reason: collision with root package name */
    public int f362461e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362463g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362464h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f362465i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f362466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362467n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(qf2.v0 v0Var, java.lang.String str, boolean z17, boolean z18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362463g = v0Var;
        this.f362464h = str;
        this.f362465i = z17;
        this.f362466m = z18;
        this.f362467n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qf2.l0 l0Var = new qf2.l0(this.f362463g, this.f362464h, this.f362465i, this.f362466m, this.f362467n, continuation);
        l0Var.f362462f = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0287  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
