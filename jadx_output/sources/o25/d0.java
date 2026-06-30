package o25;

/* loaded from: classes9.dex */
public class d0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.h f342494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f342495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o25.k0 f342496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f342498h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f342499i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f342500m;

    public d0(de0.h hVar, boolean z17, o25.k0 k0Var, java.lang.String str, android.os.Bundle bundle, android.content.Context context, int i17) {
        this.f342494d = hVar;
        this.f342495e = z17;
        this.f342496f = k0Var;
        this.f342497g = str;
        this.f342498h = bundle;
        this.f342499i = context;
        this.f342500m = i17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f342494d != m1Var) {
            return;
        }
        gm0.j1.d().q(1200, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: errType = %s; errCode = %s; errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof de0.h) {
            if (!this.f342495e) {
                ((ku5.t0) ku5.t0.f312615d).a(new o25.c0(this, m1Var, i17, i18, str));
            } else {
                o25.k0 k0Var = this.f342496f;
                if (k0Var != null) {
                    k0Var.b(i17, i18, str, m1Var, true);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.DeepLinkHelper", "doTicketsDeepLink justGetTranslateLinkResult, return");
            }
        }
    }
}
