package re2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394380d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394381e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f394382f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f394383g;

    /* renamed from: h, reason: collision with root package name */
    public int f394384h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394385i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f394386m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394387n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394386m = list;
        this.f394387n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        re2.e eVar = new re2.e(this.f394386m, this.f394387n, continuation);
        eVar.f394385i = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((re2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a4 A[Catch: all -> 0x002e, TryCatch #3 {all -> 0x002e, blocks: (B:6:0x0024, B:8:0x00a0, B:10:0x00a4, B:13:0x00c1, B:15:0x0104, B:17:0x011b, B:18:0x0078, B:21:0x0082, B:25:0x0124, B:92:0x0065), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1 A[Catch: all -> 0x002e, TryCatch #3 {all -> 0x002e, blocks: (B:6:0x0024, B:8:0x00a0, B:10:0x00a4, B:13:0x00c1, B:15:0x0104, B:17:0x011b, B:18:0x0078, B:21:0x0082, B:25:0x0124, B:92:0x0065), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #3 {all -> 0x002e, blocks: (B:6:0x0024, B:8:0x00a0, B:10:0x00a4, B:13:0x00c1, B:15:0x0104, B:17:0x011b, B:18:0x0078, B:21:0x0082, B:25:0x0124, B:92:0x0065), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:6:0x0024, B:8:0x00a0, B:10:0x00a4, B:13:0x00c1, B:15:0x0104, B:17:0x011b, B:18:0x0078, B:21:0x0082, B:25:0x0124, B:92:0x0065), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:27:0x0126, B:29:0x0130, B:34:0x013c, B:35:0x0142, B:38:0x0159, B:41:0x016e), top: B:26:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009b -> B:8:0x00a0). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
