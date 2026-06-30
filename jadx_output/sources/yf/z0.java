package yf;

/* loaded from: classes7.dex */
public class z0 implements zf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f461483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf.f f461484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.d1 f461485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f461486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461487f;

    public z0(yf.i0 i0Var, int i17, org.json.JSONObject jSONObject, sf.f fVar, yf.d1 d1Var, org.json.JSONObject jSONObject2) {
        this.f461487f = i0Var;
        this.f461482a = i17;
        this.f461483b = jSONObject;
        this.f461484c = fVar;
        this.f461485d = d1Var;
        this.f461486e = jSONObject2;
    }

    @Override // zf.a
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.w(this.f461487f.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoadFailure#" + this.f461482a);
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        final sf.f fVar = this.f461484c;
        yf.i0 i0Var = this.f461487f;
        java.lang.String x17 = i0Var.x();
        final int i17 = this.f461482a;
        com.tencent.mars.xlog.Log.i(x17, "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, path: %s, localPath: %s", java.lang.Integer.valueOf(i17), str, str2);
        try {
            this.f461483b.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
            yf.d1 d1Var = this.f461485d;
            d1Var.f461335a--;
            com.tencent.mars.xlog.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, pendingConvertCount: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d1Var.f461335a));
            if (d1Var.f461335a == 0) {
                final org.json.JSONObject jSONObject = this.f461486e;
                i0Var.G(new java.lang.Runnable() { // from class: yf.z0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yf.i0 i0Var2 = yf.z0.this.f461487f;
                        yf.o oVar = i0Var2.f461362i;
                        int i18 = i17;
                        if (oVar == null) {
                            com.tencent.mars.xlog.Log.w(i0Var2.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, adapter is null", java.lang.Integer.valueOf(i18));
                            return;
                        }
                        sc1.k1 h17 = oVar.h("applySticker", jSONObject);
                        com.tencent.mars.xlog.Log.i(i0Var2.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, type:applySticker, error:[%s, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(h17.f405688a), h17.f405689b);
                        fVar.b(h17.f405688a == 0 ? jc1.f.f298912a : jc1.f.f298915d, h17.f405690c);
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, put fail since %s", java.lang.Integer.valueOf(i17), e17);
            fVar.a(jc1.f.f298915d);
        }
    }
}
