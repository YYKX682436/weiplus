package py0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f359023d;

    /* renamed from: e, reason: collision with root package name */
    public int f359024e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359025f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f359026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ py0.y f359027h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ry0.e f359028i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(py0.y yVar, ry0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359027h = yVar;
        this.f359028i = eVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        py0.x xVar = new py0.x(this.f359027h, this.f359028i, (kotlin.coroutines.Continuation) obj3);
        xVar.f359025f = (java.lang.String) obj;
        xVar.f359026g = booleanValue;
        return xVar.invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00de  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: py0.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
