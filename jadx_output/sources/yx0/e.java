package yx0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467260d;

    /* renamed from: e, reason: collision with root package name */
    public int f467261e;

    /* renamed from: f, reason: collision with root package name */
    public long f467262f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f467263g;

    /* renamed from: h, reason: collision with root package name */
    public int f467264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467265i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAIGCParams f467266m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yx0.m f467267n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yx0.b8 b8Var, com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams, yx0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467265i = b8Var;
        this.f467266m = mJAIGCParams;
        this.f467267n = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.e(this.f467265i, this.f467266m, this.f467267n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:2)|(1:(1:(5:6|7|(1:10)|11|12)(2:14|15))(3:16|17|18))(21:72|73|74|(2:76|77)(2:108|109)|78|79|80|81|82|83|84|85|86|87|(1:89)(1:101)|90|(1:92)(1:100)|93|(1:95)(1:99)|96|(1:98))|19|20|21|22|23|24|25|26|27|28|29|30|(1:32)(1:35)|33|11|12|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:1|2|(1:(1:(5:6|7|(1:10)|11|12)(2:14|15))(3:16|17|18))(21:72|73|74|(2:76|77)(2:108|109)|78|79|80|81|82|83|84|85|86|87|(1:89)(1:101)|90|(1:92)(1:100)|93|(1:95)(1:99)|96|(1:98))|19|20|21|22|23|24|25|26|27|28|29|30|(1:32)(1:35)|33|11|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x019e, code lost:
    
        r2 = r4;
        r9 = r8;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a4, code lost:
    
        r6 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0056: MOVE (r7 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:114:0x004e */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
