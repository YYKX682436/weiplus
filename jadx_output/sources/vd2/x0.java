package vd2;

/* loaded from: classes3.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f435983d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f435984e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f435985f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f435986g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f435987h;

    /* renamed from: i, reason: collision with root package name */
    public int f435988i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f435990n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f435991o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435992p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f435993q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f435994r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f435995s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Intent intent, r45.m84 m84Var, boolean z17, android.content.Context context, vd2.f1 f1Var, ss5.d0 d0Var, r45.wk0 wk0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435989m = intent;
        this.f435990n = m84Var;
        this.f435991o = z17;
        this.f435992p = context;
        this.f435993q = f1Var;
        this.f435994r = d0Var;
        this.f435995s = wk0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd2.x0(this.f435989m, this.f435990n, this.f435991o, this.f435992p, this.f435993q, this.f435994r, this.f435995s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:37|(1:39)|40|(1:42)|43|(3:45|(1:47)(1:82)|(5:49|(5:53|21|22|(1:24)|(2:29|30)(1:28))|54|55|(9:57|(1:59)(1:76)|(1:61)(1:75)|(1:63)(1:74)|64|65|(1:69)|70|(1:72)(1:73))(2:77|78)))|83|54|55|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
    
        com.tencent.mars.xlog.Log.e(r10.f435725d, "enterLiveB commentScene err = " + r0.getMessage());
        r25 = 65;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:55:0x00a5, B:57:0x00b0, B:63:0x00de, B:77:0x00eb, B:78:0x00f6), top: B:54:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:55:0x00a5, B:57:0x00b0, B:63:0x00de, B:77:0x00eb, B:78:0x00f6), top: B:54:0x00a5 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
