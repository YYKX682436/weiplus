package y35;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f459242d;

    /* renamed from: e, reason: collision with root package name */
    public long f459243e;

    /* renamed from: f, reason: collision with root package name */
    public int f459244f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f459245g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f459246h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f459247i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f459248m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f459249n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f459250o;

    /* renamed from: p, reason: collision with root package name */
    public int f459251p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459252q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f459253r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f459252q = str;
        this.f459253r = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y35.s(this.f459252q, this.f459253r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y35.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0209 -> B:5:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0239 -> B:6:0x0235). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y35.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
