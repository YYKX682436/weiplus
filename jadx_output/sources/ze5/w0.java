package ze5;

/* loaded from: classes9.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f472270d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f472274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472275i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f472276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, ze5.n8 n8Var, java.lang.String str, ze5.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472272f = f9Var;
        this.f472273g = dVar;
        this.f472274h = n8Var;
        this.f472275i = str;
        this.f472276m = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ze5.w0 w0Var = new ze5.w0(this.f472272f, this.f472273g, this.f472274h, this.f472275i, this.f472276m, continuation);
        w0Var.f472271e = obj;
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00eb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
