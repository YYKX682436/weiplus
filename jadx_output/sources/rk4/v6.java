package rk4;

/* loaded from: classes11.dex */
public final class v6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397022d;

    /* renamed from: e, reason: collision with root package name */
    public int f397023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f397024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f397025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.x9 f397026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f397027i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397028m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f397029n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(rk4.k8 k8Var, bw5.ar0 ar0Var, qk.x9 x9Var, java.util.List list, android.content.Context context, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397024f = k8Var;
        this.f397025g = ar0Var;
        this.f397026h = x9Var;
        this.f397027i = list;
        this.f397028m = context;
        this.f397029n = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.v6(this.f397024f, this.f397025g, this.f397026h, this.f397027i, this.f397028m, this.f397029n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.v6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0118 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.v6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
