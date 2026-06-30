package pu;

/* loaded from: classes12.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358397d;

    /* renamed from: e, reason: collision with root package name */
    public int f358398e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f358400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f358401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ut.q0 q0Var, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358400g = q0Var;
        this.f358401h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pu.y yVar = new pu.y(this.f358400g, this.f358401h, continuation);
        yVar.f358399f = obj;
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0132  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
