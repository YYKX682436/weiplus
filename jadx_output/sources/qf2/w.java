package qf2;

/* loaded from: classes.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362621d;

    /* renamed from: e, reason: collision with root package name */
    public int f362622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f362623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(km2.q qVar, qf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362623f = qVar;
        this.f362624g = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.w(this.f362623f, this.f362624g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cf  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
