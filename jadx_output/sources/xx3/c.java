package xx3;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457997d;

    /* renamed from: e, reason: collision with root package name */
    public int f457998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f458000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457999f = str;
        this.f458000g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx3.c(this.f457999f, this.f458000g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e7 A[Catch: Exception -> 0x0113, TryCatch #1 {Exception -> 0x0113, blocks: (B:9:0x00de, B:11:0x00e7, B:12:0x00f1, B:14:0x00fd, B:16:0x0103, B:19:0x010b, B:26:0x009c, B:28:0x00a5, B:29:0x00af, B:31:0x00bb, B:33:0x00c1, B:36:0x00cb, B:42:0x0063, B:44:0x008a, B:51:0x005c), top: B:50:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: Exception -> 0x0113, TryCatch #1 {Exception -> 0x0113, blocks: (B:9:0x00de, B:11:0x00e7, B:12:0x00f1, B:14:0x00fd, B:16:0x0103, B:19:0x010b, B:26:0x009c, B:28:0x00a5, B:29:0x00af, B:31:0x00bb, B:33:0x00c1, B:36:0x00cb, B:42:0x0063, B:44:0x008a, B:51:0x005c), top: B:50:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb A[Catch: Exception -> 0x0113, TryCatch #1 {Exception -> 0x0113, blocks: (B:9:0x00de, B:11:0x00e7, B:12:0x00f1, B:14:0x00fd, B:16:0x0103, B:19:0x010b, B:26:0x009c, B:28:0x00a5, B:29:0x00af, B:31:0x00bb, B:33:0x00c1, B:36:0x00cb, B:42:0x0063, B:44:0x008a, B:51:0x005c), top: B:50:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xx3.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
