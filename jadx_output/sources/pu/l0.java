package pu;

/* loaded from: classes12.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358330d;

    /* renamed from: e, reason: collision with root package name */
    public int f358331e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f358333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f358334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qi3.c f358335i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.h0 h0Var, qi3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358333g = r2Var;
        this.f358334h = h0Var;
        this.f358335i = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pu.l0 l0Var = new pu.l0(this.f358333g, this.f358334h, this.f358335i, continuation);
        l0Var.f358332f = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
