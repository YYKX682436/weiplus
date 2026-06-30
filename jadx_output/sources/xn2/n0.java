package xn2;

/* loaded from: classes2.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455534d;

    /* renamed from: e, reason: collision with root package name */
    public int f455535e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455537g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(xn2.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455537g = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xn2.n0 n0Var = new xn2.n0(this.f455537g, continuation);
        n0Var.f455536f = obj;
        return n0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xn2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: Exception -> 0x0073, TryCatch #1 {Exception -> 0x0073, blocks: (B:10:0x0045, B:12:0x004b, B:14:0x0051, B:16:0x006a, B:19:0x008f, B:23:0x009c, B:26:0x0075, B:28:0x0080), top: B:9:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: Exception -> 0x0073, TryCatch #1 {Exception -> 0x0073, blocks: (B:10:0x0045, B:12:0x004b, B:14:0x0051, B:16:0x006a, B:19:0x008f, B:23:0x009c, B:26:0x0075, B:28:0x0080), top: B:9:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[Catch: Exception -> 0x0073, TryCatch #1 {Exception -> 0x0073, blocks: (B:10:0x0045, B:12:0x004b, B:14:0x0051, B:16:0x006a, B:19:0x008f, B:23:0x009c, B:26:0x0075, B:28:0x0080), top: B:9:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[Catch: Exception -> 0x0073, TryCatch #1 {Exception -> 0x0073, blocks: (B:10:0x0045, B:12:0x004b, B:14:0x0051, B:16:0x006a, B:19:0x008f, B:23:0x009c, B:26:0x0075, B:28:0x0080), top: B:9:0x0045 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b2 -> B:9:0x0045). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn2.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
