package vd0;

/* loaded from: classes11.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f435447d;

    /* renamed from: e, reason: collision with root package name */
    public int f435448e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f435449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f435450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f435451h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(vd0.v1 v1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435450g = v1Var;
        this.f435451h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vd0.k1 k1Var = new vd0.k1(this.f435450g, this.f435451h, continuation);
        k1Var.f435449f = obj;
        return k1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2 A[Catch: Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:7:0x001c, B:9:0x00be, B:15:0x00e2, B:16:0x00eb, B:20:0x00e7), top: B:6:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[Catch: Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:7:0x001c, B:9:0x00be, B:15:0x00e2, B:16:0x00eb, B:20:0x00e7), top: B:6:0x001c }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
