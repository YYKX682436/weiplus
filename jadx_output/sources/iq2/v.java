package iq2;

/* loaded from: classes2.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f293770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f293771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f293772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f293773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f293774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(iq2.d0 d0Var, com.tencent.mm.modelbase.f fVar, boolean z17, long j17, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f293769d = d0Var;
        this.f293770e = fVar;
        this.f293771f = z17;
        this.f293772g = j17;
        this.f293773h = lVar;
        this.f293774i = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iq2.v(this.f293769d, this.f293770e, this.f293771f, this.f293772g, this.f293773h, this.f293774i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        iq2.v vVar = (iq2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0235 A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
