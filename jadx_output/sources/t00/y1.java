package t00;

/* loaded from: classes9.dex */
public final class y1 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t00.e2 f414372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414376h;

    public y1(t00.e2 e2Var, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f414372d = e2Var;
        this.f414373e = context;
        this.f414374f = i17;
        this.f414375g = str;
        this.f414376h = n3Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        t00.e2.h(this.f414372d, this.f414373e, i17, i18, intent, this.f414374f, this.f414375g, this.f414376h);
    }
}
