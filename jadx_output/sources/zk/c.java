package zk;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473351d;

    /* renamed from: e, reason: collision with root package name */
    public int f473352e;

    /* renamed from: f, reason: collision with root package name */
    public long f473353f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f473354g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f473355h;

    /* renamed from: i, reason: collision with root package name */
    public int f473356i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473357m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f473358n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473357m = shareableChatRecordsProvider;
        this.f473358n = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zk.c(this.f473357m, this.f473358n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:6:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a7 -> B:5:0x00ae). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
