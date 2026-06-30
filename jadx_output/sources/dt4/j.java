package dt4;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dt4.p f243243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dt4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243243e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dt4.j(this.f243243e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dt4.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0276, code lost:
    
        if (r14 > 0) goto L55;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt4.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
