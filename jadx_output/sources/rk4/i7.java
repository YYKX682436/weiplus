package rk4;

/* loaded from: classes11.dex */
public final class i7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396724d;

    /* renamed from: e, reason: collision with root package name */
    public int f396725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f396726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f396727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396729i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396730m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f396731n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396732o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f396733p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396734q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yz5.a f396735r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(boolean z17, int i17, java.lang.String str, java.lang.String str2, rk4.k8 k8Var, bw5.o50 o50Var, bw5.ar0 ar0Var, boolean z18, android.content.Context context, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396726f = z17;
        this.f396727g = i17;
        this.f396728h = str;
        this.f396729i = str2;
        this.f396730m = k8Var;
        this.f396731n = o50Var;
        this.f396732o = ar0Var;
        this.f396733p = z18;
        this.f396734q = context;
        this.f396735r = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.i7(this.f396726f, this.f396727g, this.f396728h, this.f396729i, this.f396730m, this.f396731n, this.f396732o, this.f396733p, this.f396734q, this.f396735r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.i7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0146  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.i7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
