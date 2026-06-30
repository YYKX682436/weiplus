package zd1;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f471563d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471564e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f471565f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f471566g;

    /* renamed from: h, reason: collision with root package name */
    public int f471567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f471568i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f471569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f471570n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zd1.s f471571o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f471572p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471573q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471574r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471575s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471576t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f471577u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.appbrand.y yVar, boolean z17, int i17, zd1.s sVar, boolean z18, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471568i = yVar;
        this.f471569m = z17;
        this.f471570n = i17;
        this.f471571o = sVar;
        this.f471572p = z18;
        this.f471573q = f0Var;
        this.f471574r = f0Var2;
        this.f471575s = f0Var3;
        this.f471576t = f0Var4;
        this.f471577u = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd1.r(this.f471568i, this.f471569m, this.f471570n, this.f471571o, this.f471572p, this.f471573q, this.f471574r, this.f471575s, this.f471576t, this.f471577u, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zd1.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd1.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
