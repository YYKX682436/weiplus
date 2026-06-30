package df2;

/* loaded from: classes3.dex */
public final class pe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231061d;

    /* renamed from: e, reason: collision with root package name */
    public int f231062e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.qe f231064g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(df2.qe qeVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231064g = qeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.pe peVar = new df2.pe(this.f231064g, continuation);
        peVar.f231063f = obj;
        return peVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.pe) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01cf, code lost:
    
        if (r3 == pz5.a.f359186d) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0202, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0203, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ff, code lost:
    
        if (r3 == pz5.a.f359186d) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x029f, code lost:
    
        if (r3 == pz5.a.f359186d) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02d0, code lost:
    
        if (r3 == pz5.a.f359186d) goto L98;
     */
    /* JADX WARN: Path cross not found for [B:50:0x01d2, B:39:0x018a], limit reached: 99 */
    /* JADX WARN: Path cross not found for [B:63:0x0242, B:35:0x0180], limit reached: 99 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02d5 -> B:6:0x02d8). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
