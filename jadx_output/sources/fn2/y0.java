package fn2;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264447d;

    /* renamed from: e, reason: collision with root package name */
    public int f264448e;

    /* renamed from: f, reason: collision with root package name */
    public int f264449f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f264451h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f264452i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264453m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(fn2.h1 h1Var, int i17, fn2.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264451h = h1Var;
        this.f264452i = i17;
        this.f264453m = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fn2.y0 y0Var = new fn2.y0(this.f264451h, this.f264452i, this.f264453m, continuation);
        y0Var.f264450g = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.y0) create((com.tencent.mm.protobuf.g) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
