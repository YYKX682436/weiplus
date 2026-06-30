package df5;

/* loaded from: classes11.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.j1 f232110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f232112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v11.q f232113g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f232114h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(df5.j1 j1Var, int i17, int[] iArr, v11.q qVar, java.util.List list) {
        super(0);
        this.f232110d = j1Var;
        this.f232111e = i17;
        this.f232112f = iArr;
        this.f232113g = qVar;
        this.f232114h = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df5.j1 j1Var = this.f232110d;
        int i17 = this.f232111e;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        int[] iArr = this.f232112f;
        v11.q qVar = this.f232113g;
        j1Var.c(arrayList, iArr, qVar.f432456c, true, qVar.f432455b.isEmpty());
        return df5.j1.b(this.f232110d, this.f232114h, 0, 0);
    }
}
