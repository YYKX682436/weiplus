package qf2;

/* loaded from: classes.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362517d;

    /* renamed from: e, reason: collision with root package name */
    public int f362518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f362519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z17, qf2.q3 q3Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362519f = z17;
        this.f362520g = q3Var;
        this.f362521h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.o3(this.f362519f, this.f362520g, this.f362521h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.o3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
