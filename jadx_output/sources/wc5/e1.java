package wc5;

/* loaded from: classes10.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f444556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f444557f;

    /* renamed from: g, reason: collision with root package name */
    public int f444558g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444559h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f444560i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f444561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xm3.t0 f444562n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f444563o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, wc5.k1 k1Var, xm3.t0 t0Var, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444560i = mvvmList;
        this.f444561m = k1Var;
        this.f444562n = t0Var;
        this.f444563o = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wc5.e1 e1Var = new wc5.e1(this.f444560i, this.f444561m, this.f444562n, this.f444563o, continuation);
        e1Var.f444559h = obj;
        return e1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(1:(1:(1:(2:9|10)(2:12|13))(6:14|15|16|17|(2:19|(1:21))|10))(2:25|26))(9:46|47|48|40|(1:42)|28|29|30|(6:43|(1:45)|16|17|(0)|10)(2:32|(6:34|(1:36)|28|29|30|(0)(0))(8:37|(1:39)|40|(0)|28|29|30|(0)(0)))))(2:49|50)|27|28|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f8, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:16:0x00ef, B:30:0x0088, B:32:0x008c, B:34:0x0092, B:37:0x00ac, B:40:0x00bd, B:43:0x00d5), top: B:29:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:16:0x00ef, B:30:0x0088, B:32:0x008c, B:34:0x0092, B:37:0x00ac, B:40:0x00bd, B:43:0x00d5), top: B:29:0x0088 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a7 -> B:28:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d2 -> B:28:0x00aa). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
