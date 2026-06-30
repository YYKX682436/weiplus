package rx3;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f401057e;

    /* renamed from: f, reason: collision with root package name */
    public int f401058f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rx3.u f401060h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f401061i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rx3.u uVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401060h = uVar;
        this.f401061i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rx3.t tVar = new rx3.t(this.f401060h, this.f401061i, continuation);
        tVar.f401059g = obj;
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ee A[Catch: Exception -> 0x0109, LOOP:0: B:9:0x00e8->B:11:0x00ee, LOOP_END, TryCatch #0 {Exception -> 0x0109, blocks: (B:7:0x001a, B:8:0x00d7, B:9:0x00e8, B:11:0x00ee, B:13:0x0101, B:20:0x002b, B:21:0x0061, B:22:0x007e, B:24:0x0084, B:27:0x0098, B:32:0x009c, B:33:0x00ab, B:35:0x00b1, B:37:0x00c3, B:42:0x0036), top: B:2:0x0008 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
