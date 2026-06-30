package fn5;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264669d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.g0(this.f264669d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r8.f264669d + "hd") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r9) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        r9 = false;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn5.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
