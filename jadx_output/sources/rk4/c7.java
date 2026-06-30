package rk4;

/* loaded from: classes11.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396583d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396584e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396585f;

    /* renamed from: g, reason: collision with root package name */
    public int f396586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f396588i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f396591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte[] f396592p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396593q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ bw5.pp0 f396594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396595s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qk.ja f396596t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f396597u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ yz5.a f396598v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(rk4.k8 k8Var, bw5.o50 o50Var, bw5.ar0 ar0Var, kotlin.jvm.internal.h0 h0Var, java.util.List list, byte[] bArr, java.lang.String str, bw5.pp0 pp0Var, android.content.Context context, qk.ja jaVar, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396587h = k8Var;
        this.f396588i = o50Var;
        this.f396589m = ar0Var;
        this.f396590n = h0Var;
        this.f396591o = list;
        this.f396592p = bArr;
        this.f396593q = str;
        this.f396594r = pp0Var;
        this.f396595s = context;
        this.f396596t = jaVar;
        this.f396597u = z17;
        this.f396598v = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.c7(this.f396587h, this.f396588i, this.f396589m, this.f396590n, this.f396591o, this.f396592p, this.f396593q, this.f396594r, this.f396595s, this.f396596t, this.f396597u, this.f396598v, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.c7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0259 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.c7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
