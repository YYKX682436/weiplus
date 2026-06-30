package wt3;

/* loaded from: classes5.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449488d;

    /* renamed from: e, reason: collision with root package name */
    public int f449489e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f449490f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f449491g;

    /* renamed from: h, reason: collision with root package name */
    public int f449492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wt3.t0 f449493i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(wt3.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449493i = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.s0(this.f449493i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x01d1 -> B:5:0x01d4). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt3.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
