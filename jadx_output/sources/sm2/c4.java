package sm2;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f409394d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f409395e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f409396f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f409397g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f409398h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f409399i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f409400m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f409401n;

    /* renamed from: o, reason: collision with root package name */
    public int f409402o;

    /* renamed from: p, reason: collision with root package name */
    public int f409403p;

    /* renamed from: q, reason: collision with root package name */
    public int f409404q;

    /* renamed from: r, reason: collision with root package name */
    public int f409405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ km2.q f409406s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f409407t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409408u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f409409v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f409410w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yz5.l f409411x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(km2.q qVar, boolean z17, sm2.o4 o4Var, int i17, boolean z18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409406s = qVar;
        this.f409407t = z17;
        this.f409408u = o4Var;
        this.f409409v = i17;
        this.f409410w = z18;
        this.f409411x = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm2.c4(this.f409406s, this.f409407t, this.f409408u, this.f409409v, this.f409410w, this.f409411x, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm2.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0124 -> B:12:0x012b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm2.c4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
