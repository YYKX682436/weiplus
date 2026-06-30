package id2;

/* loaded from: classes3.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f290529d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f290530e;

    /* renamed from: f, reason: collision with root package name */
    public int f290531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f290533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290534i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f290535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290536n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(android.content.Context context, long j17, id2.u3 u3Var, long j18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290532g = context;
        this.f290533h = j17;
        this.f290534i = u3Var;
        this.f290535m = j18;
        this.f290536n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.d3(this.f290532g, this.f290533h, this.f290534i, this.f290535m, this.f290536n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
