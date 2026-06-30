package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310197d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310198e;

    /* renamed from: f, reason: collision with root package name */
    public int f310199f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310200g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f310202i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310203m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yz5.l lVar, kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f310202i = lVar;
        this.f310203m = jVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.b0 b0Var = new kotlinx.coroutines.flow.b0(this.f310202i, this.f310203m, (kotlin.coroutines.Continuation) obj3);
        b0Var.f310200g = (kotlinx.coroutines.y0) obj;
        b0Var.f310201h = (kotlinx.coroutines.flow.k) obj2;
        return b0Var.invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:57|26|30|31|32|33|(1:35)|36|37|(1:39)(3:40|7|(10:9|(5:11|(1:13)|14|(1:16)(1:29)|(2:27|28)(1:(5:19|(1:21)|22|(1:24)|26)))|30|31|32|33|(0)|36|37|(0)(0))(2:53|54))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (r12.B() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r12.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        if ((r0 instanceof java.util.concurrent.CancellationException) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        r11 = r12.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        if ((r11 instanceof kotlinx.coroutines.e0) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        kotlinx.coroutines.u0.a(r12.getContext(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:33:0x00d9, B:35:0x00dd, B:36:0x00e7), top: B:32:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x012b -> B:7:0x0073). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
