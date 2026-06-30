package nr2;

/* loaded from: classes2.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339241d;

    /* renamed from: e, reason: collision with root package name */
    public int f339242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f339244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f339245h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nr2.l lVar, so2.q6 q6Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339243f = lVar;
        this.f339244g = q6Var;
        this.f339245h = finderRefreshLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.k(this.f339243f, this.f339244g, this.f339245h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
