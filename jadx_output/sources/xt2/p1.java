package xt2;

/* loaded from: classes10.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456939d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f456941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f456942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(xt2.u1 u1Var, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456941f = u1Var;
        this.f456942g = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xt2.p1 p1Var = new xt2.p1(this.f456941f, this.f456942g, continuation);
        p1Var.f456940e = obj;
        return p1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:63|64|65|66) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:56|(1:58)(1:100)|59|60|61|(4:63|64|65|66)(1:96)|67) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0152, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0157, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveShoppingAutoScrollCommentView", r0, "", new java.lang.Object[0]);
        r0 = new com.tencent.mm.pluginsdk.ui.span.f0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0154, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0155, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02fe -> B:8:0x0301). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02ea -> B:9:0x02ed). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
