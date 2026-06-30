package gx0;

/* loaded from: classes5.dex */
public final class tf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277000d;

    /* renamed from: e, reason: collision with root package name */
    public int f277001e;

    /* renamed from: f, reason: collision with root package name */
    public int f277002f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f277003g;

    /* renamed from: h, reason: collision with root package name */
    public int f277004h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f277005i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f277006m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f277007n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f277008o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(gx0.gg ggVar, java.util.List list, yz5.a aVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277005i = ggVar;
        this.f277006m = list;
        this.f277007n = aVar;
        this.f277008o = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.tf(this.f277005i, this.f277006m, this.f277007n, this.f277008o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.tf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ab, code lost:
    
        r6 = r8;
        r15 = r10;
        r8 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[LOOP:1: B:148:0x0068->B:172:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d5  */
    /* JADX WARN: Type inference failed for: r8v3, types: [pu0.c] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [pu0.e] */
    /* JADX WARN: Type inference failed for: r8v6, types: [pu0.b] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02a0 -> B:7:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x02b6 -> B:8:0x02ab). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.tf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
