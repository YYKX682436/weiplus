package yn1;

/* loaded from: classes12.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463892e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f463893f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f463894g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f463895h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f463896i;

    /* renamed from: m, reason: collision with root package name */
    public long f463897m;

    /* renamed from: n, reason: collision with root package name */
    public int f463898n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f463899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f463900p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f463901q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f463902r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463903s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f463904t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j17, long j18, boolean z17, java.util.ArrayList arrayList, yn1.r2 r2Var, long j19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463899o = j17;
        this.f463900p = j18;
        this.f463901q = z17;
        this.f463902r = arrayList;
        this.f463903s = r2Var;
        this.f463904t = j19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.w1(this.f463899o, this.f463900p, this.f463901q, this.f463902r, this.f463903s, this.f463904t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a8  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009b -> B:5:0x00a4). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
