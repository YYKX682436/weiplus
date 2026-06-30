package pz0;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f359129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f359130e;

    /* renamed from: f, reason: collision with root package name */
    public int f359131f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pz0.m f359133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f359134i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359136n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359137o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pz0.m mVar, byte[] bArr, java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359133h = mVar;
        this.f359134i = bArr;
        this.f359135m = str;
        this.f359136n = str2;
        this.f359137o = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pz0.j jVar = new pz0.j(this.f359133h, this.f359134i, this.f359135m, this.f359136n, this.f359137o, continuation);
        jVar.f359132g = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
