package df5;

/* loaded from: classes11.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df5.j1 f232122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f232123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int[] f232124h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v11.q f232125i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f232126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f232127n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17, int i18, df5.j1 j1Var, int i19, int[] iArr, v11.q qVar, int i27, java.util.List list) {
        super(0);
        this.f232120d = i17;
        this.f232121e = i18;
        this.f232122f = j1Var;
        this.f232123g = i19;
        this.f232124h = iArr;
        this.f232125i = qVar;
        this.f232126m = i27;
        this.f232127n = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f232120d;
        int i18 = this.f232121e;
        boolean z17 = i17 + i18 <= 1;
        df5.j1 j1Var = this.f232122f;
        j1Var.f232140x = z17;
        int i19 = this.f232123g;
        java.util.ArrayList arrayList = new java.util.ArrayList(i19);
        for (int i27 = 0; i27 < i19; i27++) {
            arrayList.add(null);
        }
        int[] iArr = this.f232124h;
        java.util.List list = this.f232125i.f432456c;
        int i28 = i17 - 1;
        int i29 = this.f232126m;
        j1Var.c(arrayList, iArr, list, false, i29 == i28);
        return df5.j1.b(j1Var, this.f232127n, i18, i29);
    }
}
