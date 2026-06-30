package f0;

/* loaded from: classes14.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f258051d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f258052e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f258053f;

    /* renamed from: g, reason: collision with root package name */
    public float f258054g;

    /* renamed from: h, reason: collision with root package name */
    public float f258055h;

    /* renamed from: i, reason: collision with root package name */
    public int f258056i;

    /* renamed from: m, reason: collision with root package name */
    public int f258057m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f258058n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258059o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f258060p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f258061q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f258062r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f0.r1 r1Var, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258059o = r1Var;
        this.f258060p = i17;
        this.f258061q = i18;
        this.f258062r = i19;
    }

    public static final boolean a(boolean z17, f0.r1 r1Var, int i17, int i18) {
        return !z17 ? r1Var.d() >= i17 && (r1Var.d() != i17 || r1Var.e() >= i18) : r1Var.d() <= i17 && (r1Var.d() != i17 || r1Var.e() <= i18);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        f0.e1 e1Var = new f0.e1(this.f258059o, this.f258060p, this.f258061q, this.f258062r, continuation);
        e1Var.f258058n = obj;
        return e1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f0.e1) create((b0.p2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[Catch: e -> 0x01b9, TryCatch #4 {e -> 0x01b9, blocks: (B:20:0x0097, B:22:0x009f, B:24:0x00a9, B:27:0x00be, B:30:0x00cd, B:34:0x00ed, B:39:0x0136, B:42:0x013f), top: B:19:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0198 -> B:16:0x019e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
