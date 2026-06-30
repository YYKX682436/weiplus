package py0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f359002d;

    /* renamed from: e, reason: collision with root package name */
    public int f359003e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ py0.y f359005g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(py0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359005g = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        py0.o oVar = new py0.o(this.f359005g, continuation);
        oVar.f359004f = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((py0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x01d4  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: py0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
