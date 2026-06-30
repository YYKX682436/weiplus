package t00;

/* loaded from: classes9.dex */
public final class z1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t00.e2 f414383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f414385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414387e;

    public z1(t00.e2 e2Var, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f414383a = e2Var;
        this.f414384b = context;
        this.f414385c = i17;
        this.f414386d = str;
        this.f414387e = n3Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        return t00.e2.h(this.f414383a, this.f414384b, i17, i18, intent, this.f414385c, this.f414386d, this.f414387e);
    }
}
