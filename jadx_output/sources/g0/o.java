package g0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f267356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f267357e;

    /* renamed from: f, reason: collision with root package name */
    public int f267358f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f267359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.r f267360h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.z f267361i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1.g f267362m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g0.r rVar, s1.z zVar, d1.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f267360h = rVar;
        this.f267361i = zVar;
        this.f267362m = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        g0.o oVar = new g0.o(this.f267360h, this.f267361i, this.f267362m, continuation);
        oVar.f267359g = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:76:0x0031, B:41:0x00d1, B:43:0x00d5), top: B:75:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Type inference failed for: r4v2, types: [jz5.l] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, jz5.l] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, jz5.l] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
