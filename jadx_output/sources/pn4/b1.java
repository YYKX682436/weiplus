package pn4;

/* loaded from: classes14.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357048d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f357050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(pn4.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357050f = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pn4.b1 b1Var = new pn4.b1(this.f357050f, continuation);
        b1Var.f357049e = obj;
        return b1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2 A[Catch: all -> 0x010e, TryCatch #1 {all -> 0x010e, blocks: (B:6:0x0016, B:7:0x0072, B:12:0x00b2, B:13:0x00b8, B:16:0x00c8, B:18:0x00cc, B:20:0x00d2, B:21:0x00d4, B:22:0x0109, B:29:0x00ef, B:32:0x009e, B:35:0x00a3, B:39:0x0029), top: B:2:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8 A[Catch: all -> 0x010e, TRY_ENTER, TryCatch #1 {all -> 0x010e, blocks: (B:6:0x0016, B:7:0x0072, B:12:0x00b2, B:13:0x00b8, B:16:0x00c8, B:18:0x00cc, B:20:0x00d2, B:21:0x00d4, B:22:0x0109, B:29:0x00ef, B:32:0x009e, B:35:0x00a3, B:39:0x0029), top: B:2:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef A[Catch: all -> 0x010e, TryCatch #1 {all -> 0x010e, blocks: (B:6:0x0016, B:7:0x0072, B:12:0x00b2, B:13:0x00b8, B:16:0x00c8, B:18:0x00cc, B:20:0x00d2, B:21:0x00d4, B:22:0x0109, B:29:0x00ef, B:32:0x009e, B:35:0x00a3, B:39:0x0029), top: B:2:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
