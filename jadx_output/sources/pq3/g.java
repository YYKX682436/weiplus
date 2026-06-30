package pq3;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, pq3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357627e = str;
        this.f357628f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pq3.g(this.f357627e, this.f357628f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pq3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
