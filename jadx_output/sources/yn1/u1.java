package yn1;

/* loaded from: classes12.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463858d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463859e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f463860f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f463861g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f463862h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f463863i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f463864m;

    /* renamed from: n, reason: collision with root package name */
    public long f463865n;

    /* renamed from: o, reason: collision with root package name */
    public int f463866o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f463867p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f463868q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f463869r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463870s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f463871t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j17, long j18, boolean z17, yn1.r2 r2Var, long j19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463867p = j17;
        this.f463868q = j18;
        this.f463869r = z17;
        this.f463870s = r2Var;
        this.f463871t = j19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.u1(this.f463867p, this.f463868q, this.f463869r, this.f463870s, this.f463871t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a5 -> B:5:0x00a8). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
