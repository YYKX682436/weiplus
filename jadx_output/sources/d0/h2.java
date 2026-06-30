package d0;

/* loaded from: classes14.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1[] f225128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.s f225129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f225132i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0.t1 f225133m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0.k2[] f225134n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d0.p0 f225135o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f225136p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f225137q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(java.util.List list, s1.o1[] o1VarArr, yz5.s sVar, int i17, s1.x0 x0Var, int[] iArr, d0.t1 t1Var, d0.k2[] k2VarArr, d0.p0 p0Var, int i18, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f225127d = list;
        this.f225128e = o1VarArr;
        this.f225129f = sVar;
        this.f225130g = i17;
        this.f225131h = x0Var;
        this.f225132i = iArr;
        this.f225133m = t1Var;
        this.f225134n = k2VarArr;
        this.f225135o = p0Var;
        this.f225136p = i18;
        this.f225137q = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        d0.t1 t1Var;
        d0.t1 t1Var2;
        s1.o1[] o1VarArr;
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        int size = this.f225127d.size();
        int[] iArr = new int[size];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            t1Var = d0.t1.Horizontal;
            t1Var2 = this.f225133m;
            o1VarArr = this.f225128e;
            if (i18 >= size) {
                break;
            }
            s1.o1 o1Var = o1VarArr[i18];
            kotlin.jvm.internal.o.d(o1Var);
            iArr[i18] = t1Var2 == t1Var ? o1Var.f402050d : o1Var.f402051e;
            i18++;
        }
        yz5.s sVar = this.f225129f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f225130g);
        s1.x0 x0Var = this.f225131h;
        sVar.v(valueOf, iArr, x0Var.getLayoutDirection(), this.f225131h, this.f225132i);
        int length = o1VarArr.length;
        int i19 = 0;
        while (i17 < length) {
            s1.o1 o1Var2 = o1VarArr[i17];
            int i27 = i19 + 1;
            kotlin.jvm.internal.o.d(o1Var2);
            d0.k2 k2Var = this.f225134n[i19];
            d0.p0 p0Var = k2Var != null ? k2Var.f225158c : null;
            if (p0Var == null) {
                p0Var = this.f225135o;
            }
            int a17 = p0Var.a(this.f225136p - (t1Var2 == t1Var ? o1Var2.f402051e : o1Var2.f402050d), t1Var2 == t1Var ? p2.s.Ltr : x0Var.getLayoutDirection(), o1Var2, this.f225137q.f310116d);
            int[] iArr2 = this.f225132i;
            if (t1Var2 == t1Var) {
                s1.n1.b(layout, o1Var2, iArr2[i19], a17, 0.0f, 4, null);
            } else {
                s1.n1.b(layout, o1Var2, a17, iArr2[i19], 0.0f, 4, null);
            }
            i17++;
            i19 = i27;
        }
        return jz5.f0.f302826a;
    }
}
