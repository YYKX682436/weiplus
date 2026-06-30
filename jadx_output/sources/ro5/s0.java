package ro5;

/* loaded from: classes12.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398292d;

    /* renamed from: e, reason: collision with root package name */
    public int f398293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f398295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ro5.m1 m1Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398294f = m1Var;
        this.f398295g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.s0(this.f398294f, this.f398295g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro5.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
