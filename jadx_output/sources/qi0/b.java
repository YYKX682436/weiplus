package qi0;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363459e;

    /* renamed from: f, reason: collision with root package name */
    public int f363460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f363461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qi0.c f363462h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363463i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f363465n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.Map map, qi0.c cVar, java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363461g = map;
        this.f363462h = cVar;
        this.f363463i = str;
        this.f363464m = str2;
        this.f363465n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi0.b(this.f363461g, this.f363462h, this.f363463i, this.f363464m, this.f363465n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00db  */
    /* JADX WARN: Type inference failed for: r6v0, types: [yz5.l] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
