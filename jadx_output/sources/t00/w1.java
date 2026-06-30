package t00;

/* loaded from: classes8.dex */
public final class w1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.u f414367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f414369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414371e;

    public w1(yz5.u uVar, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f414367a = uVar;
        this.f414368b = context;
        this.f414369c = i17;
        this.f414370d = str;
        this.f414371e = n3Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        return ((java.lang.Boolean) this.f414367a.K(this.f414368b, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent, java.lang.Integer.valueOf(this.f414369c), this.f414370d, this.f414371e)).booleanValue();
    }
}
