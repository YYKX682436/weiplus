package dp2;

/* loaded from: classes2.dex */
public final class b implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f242186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242188d;

    public b(java.lang.String str, long j17, java.lang.String str2, yz5.l lVar) {
        this.f242185a = str;
        this.f242186b = j17;
        this.f242187c = str2;
        this.f242188d = lVar;
    }

    @Override // ss5.d0
    public void a() {
        pp2.a aVar = pp2.a.f357466a;
        long j17 = this.f242186b;
        aVar.a(this.f242185a, 0, java.lang.String.valueOf(j17), dp2.e.a(dp2.e.f242192a, j17, this.f242187c));
    }

    @Override // ss5.d0
    public void onFailed(int i17) {
        yz5.l lVar = this.f242188d;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        pp2.a aVar = pp2.a.f357466a;
        long j17 = this.f242186b;
        aVar.a(this.f242185a, i17, java.lang.String.valueOf(j17), dp2.e.a(dp2.e.f242192a, j17, this.f242187c));
    }
}
