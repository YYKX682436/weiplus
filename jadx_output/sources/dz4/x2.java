package dz4;

/* loaded from: classes12.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245453d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245454e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f245455f;

    /* renamed from: g, reason: collision with root package name */
    public int f245456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz4.i f245457h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f245458i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(dz4.i iVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245457h = iVar;
        this.f245458i = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.x2(this.f245457h, this.f245458i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.x2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0250  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.x2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
