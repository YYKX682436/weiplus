package ut;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430613d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430614e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f430615f;

    /* renamed from: g, reason: collision with root package name */
    public long f430616g;

    /* renamed from: h, reason: collision with root package name */
    public int f430617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430618i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ut.u0 f430619m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ut.q0 q0Var, ut.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f430618i = q0Var;
        this.f430619m = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ut.e0(this.f430618i, this.f430619m, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((ut.e0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x043b, code lost:
    
        if (r2 != null) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x071c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 2574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
