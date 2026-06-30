package ef0;

/* loaded from: classes11.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f252177d;

    /* renamed from: e, reason: collision with root package name */
    public int f252178e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ef0.f2 f252180g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.l80 f252181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ il4.e f252182i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ef0.f2 f2Var, bw5.l80 l80Var, il4.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252180g = f2Var;
        this.f252181h = l80Var;
        this.f252182i = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ef0.c2 c2Var = new ef0.c2(this.f252180g, this.f252181h, this.f252182i, continuation);
        c2Var.f252179f = obj;
        return c2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ef0.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef0.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
