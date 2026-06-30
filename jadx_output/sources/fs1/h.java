package fs1;

/* loaded from: classes7.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mu4.h0 f266287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f266288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mu4.h0 h0Var, yz5.p pVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266287e = h0Var;
        this.f266288f = pVar;
        this.f266289g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fs1.h(this.f266287e, this.f266288f, this.f266289g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fs1.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[Catch: Exception -> 0x00ea, TryCatch #0 {Exception -> 0x00ea, blocks: (B:9:0x001d, B:19:0x002a, B:20:0x00c6, B:22:0x00d9, B:23:0x00e3, B:26:0x002f, B:27:0x00bb, B:30:0x0034, B:31:0x008f, B:33:0x00aa, B:34:0x00b4, B:37:0x0038, B:38:0x0064, B:40:0x007e, B:41:0x0088, B:45:0x003f, B:47:0x0053, B:48:0x005d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: Exception -> 0x00ea, TryCatch #0 {Exception -> 0x00ea, blocks: (B:9:0x001d, B:19:0x002a, B:20:0x00c6, B:22:0x00d9, B:23:0x00e3, B:26:0x002f, B:27:0x00bb, B:30:0x0034, B:31:0x008f, B:33:0x00aa, B:34:0x00b4, B:37:0x0038, B:38:0x0064, B:40:0x007e, B:41:0x0088, B:45:0x003f, B:47:0x0053, B:48:0x005d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fs1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
