package j00;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296897d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f296898e;

    /* renamed from: f, reason: collision with root package name */
    public int f296899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f296900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296901h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296902i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f296903m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.Map map, java.lang.String str, android.content.Context context, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296900g = map;
        this.f296901h = str;
        this.f296902i = context;
        this.f296903m = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j00.u(this.f296900g, this.f296901h, this.f296902i, this.f296903m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0285 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0286  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
