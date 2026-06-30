package df5;

/* loaded from: classes11.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.j1 f232083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f232085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int[] f232086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v11.q f232087h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f232088i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f232089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f232090n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f232091o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(df5.j1 j1Var, int i17, int i18, int[] iArr, v11.q qVar, int i19, int i27, java.util.List list, int i28) {
        super(0);
        this.f232083d = j1Var;
        this.f232084e = i17;
        this.f232085f = i18;
        this.f232086g = iArr;
        this.f232087h = qVar;
        this.f232088i = i19;
        this.f232089m = i27;
        this.f232090n = list;
        this.f232091o = i28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f232084e <= 1;
        df5.j1 j1Var = this.f232083d;
        j1Var.f232140x = z17;
        int i17 = this.f232085f;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        int[] iArr = this.f232086g;
        java.util.List list = this.f232087h.f432456c;
        int i19 = this.f232089m - 1;
        int i27 = this.f232088i;
        j1Var.c(arrayList, iArr, list, false, i27 == i19);
        return df5.j1.b(j1Var, this.f232090n, this.f232091o, i27);
    }
}
