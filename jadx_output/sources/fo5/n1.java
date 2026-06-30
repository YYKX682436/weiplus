package fo5;

/* loaded from: classes11.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f265031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f265032e;

    /* renamed from: f, reason: collision with root package name */
    public int f265033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f265034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f265035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f265036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.util.Map map, boolean z17, android.app.Activity activity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265034g = map;
        this.f265035h = z17;
        this.f265036i = activity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.n1(this.f265034g, this.f265035h, this.f265036i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
