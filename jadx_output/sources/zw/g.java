package zw;

/* loaded from: classes7.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476508d;

    /* renamed from: e, reason: collision with root package name */
    public int f476509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f476511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, qc0.m1 m1Var, android.content.Context context, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476510f = list;
        this.f476511g = m1Var;
        this.f476512h = context;
        this.f476513i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zw.g(this.f476510f, this.f476511g, this.f476512h, this.f476513i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zw.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0369 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
