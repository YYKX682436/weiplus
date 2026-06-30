package mz0;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f333046d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f333047e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f333048f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f333049g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f333050h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f333051i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f333052m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f333053n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f333054o;

    /* renamed from: p, reason: collision with root package name */
    public int f333055p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f333056q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(mz0.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333056q = x2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.s2(this.f333056q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0100 A[Catch: RuntimeException -> 0x00a6, TryCatch #0 {RuntimeException -> 0x00a6, blocks: (B:91:0x009f, B:93:0x0118, B:114:0x00f3, B:116:0x0100), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlinx.coroutines.y0] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.s2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
