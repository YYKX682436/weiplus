package t00;

/* loaded from: classes8.dex */
public final class v1 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.u f414361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414365h;

    public v1(yz5.u uVar, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f414361d = uVar;
        this.f414362e = context;
        this.f414363f = i17;
        this.f414364g = str;
        this.f414365h = n3Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f414361d.K(this.f414362e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent, java.lang.Integer.valueOf(this.f414363f), this.f414364g, this.f414365h);
    }
}
