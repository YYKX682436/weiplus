package wj;

/* loaded from: classes12.dex */
public final class b0 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xj.l f446376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f446377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446378c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446380e;

    public b0(java.lang.String str, java.lang.String str2, java.lang.String str3, xj.l lVar, wj.j0 j0Var) {
        this.f446379d = str;
        this.f446380e = str2;
        this.f446378c = str3;
        this.f446376a = lVar;
        this.f446377b = j0Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "handleAdOpen, launchAppByWeChat, launchSuccess: " + z17 + ", launchCancel: " + z18);
        java.lang.String str = this.f446379d;
        if (str.length() == 0) {
            str = "EMPTY";
        }
        java.lang.String concat = "scheme=".concat(str);
        java.lang.String str2 = this.f446378c;
        wj.j0 j0Var = this.f446377b;
        xj.l lVar = this.f446376a;
        if (z17) {
            fk.d.b(wj.q0.A, this.f446380e, this.f446378c, 0, concat, null, 32, null);
            if (lVar != null) {
                lVar.onJumpAppSuccess();
            }
            j0Var.fj(str2, wj.p0.f446471o, null);
            return;
        }
        if (z18) {
            if (lVar != null) {
                lVar.onJumpAppCancel();
            }
            j0Var.fj(str2, wj.p0.f446472p, null);
        } else {
            fk.d.b(wj.q0.A, this.f446380e, this.f446378c, 1, concat, null, 32, null);
            if (lVar != null) {
                lVar.onJumpAppFail();
            }
        }
    }
}
