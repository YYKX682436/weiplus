package hk4;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281948e;

    /* renamed from: f, reason: collision with root package name */
    public int f281949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hk4.n f281950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f281951h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hk4.n nVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281950g = nVar;
        this.f281951h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk4.i(this.f281950g, this.f281951h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hk4.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
