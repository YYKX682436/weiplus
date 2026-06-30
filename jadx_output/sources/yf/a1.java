package yf;

/* loaded from: classes7.dex */
public class a1 implements zf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f461295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f461296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf.f f461297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.d1 f461298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f461299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461300g;

    public a1(yf.i0 i0Var, int i17, org.json.JSONObject jSONObject, java.lang.String[] strArr, sf.f fVar, yf.d1 d1Var, org.json.JSONObject jSONObject2) {
        this.f461300g = i0Var;
        this.f461294a = i17;
        this.f461295b = jSONObject;
        this.f461296c = strArr;
        this.f461297d = fVar;
        this.f461298e = d1Var;
        this.f461299f = jSONObject2;
    }

    @Override // zf.a
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.w(this.f461300g.x(), "convertPathAndApplyMakeupInner#onLoadFailure#" + this.f461294a);
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        final sf.f fVar = this.f461297d;
        yf.i0 i0Var = this.f461300g;
        java.lang.String x17 = i0Var.x();
        final int i17 = this.f461294a;
        com.tencent.mars.xlog.Log.i(x17, "convertPathAndApplyMakeupInner#onLoad#%d, path: %s, localPath: %s", java.lang.Integer.valueOf(i17), str, str2);
        try {
            this.f461295b.put(this.f461296c[i17], str2);
            yf.d1 d1Var = this.f461298e;
            d1Var.f461335a--;
            com.tencent.mars.xlog.Log.i(i0Var.x(), "convertPathAndApplyMakeupInner#onLoad#%d, pendingConvertCount: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d1Var.f461335a));
            if (d1Var.f461335a == 0) {
                final org.json.JSONObject jSONObject = this.f461299f;
                i0Var.G(new java.lang.Runnable() { // from class: yf.a1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yf.i0 i0Var2 = yf.a1.this.f461300g;
                        yf.o oVar = i0Var2.f461362i;
                        int i18 = i17;
                        if (oVar == null) {
                            com.tencent.mars.xlog.Log.w(i0Var2.x(), "convertPathAndApplyMakeupInner#onLoad#%d, adapter is null", java.lang.Integer.valueOf(i18));
                            return;
                        }
                        sc1.k1 h17 = oVar.h("applyMakeup", jSONObject);
                        com.tencent.mars.xlog.Log.i(i0Var2.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, type:applyMakeup, error:[%s, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(h17.f405688a), h17.f405689b);
                        fVar.b(h17.f405688a == 0 ? jc1.f.f298912a : jc1.f.f298915d, h17.f405690c);
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(i0Var.x(), "convertPathAndApplyMakeupInner#onLoad#%d, put fail since %s", java.lang.Integer.valueOf(i17), e17);
            fVar.a(jc1.f.f298915d);
        }
    }
}
