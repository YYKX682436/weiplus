package nu0;

/* loaded from: classes5.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340106d;

    /* renamed from: e, reason: collision with root package name */
    public int f340107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f340108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(kotlin.jvm.internal.h0 h0Var, nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340108f = h0Var;
        this.f340109g = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.u2(this.f340108f, this.f340109g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x029e, code lost:
    
        if (r2 == pz5.a.f359186d) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.u2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
