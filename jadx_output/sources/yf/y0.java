package yf;

/* loaded from: classes7.dex */
public class y0 implements zf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f461474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf.f f461475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461477d;

    public y0(yf.i0 i0Var, org.json.JSONObject jSONObject, sf.f fVar, java.lang.String str) {
        this.f461477d = i0Var;
        this.f461474a = jSONObject;
        this.f461475b = fVar;
        this.f461476c = str;
    }

    @Override // zf.a
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.w(this.f461477d.x(), "convertResourcePathAndOperateLivePusher#onLoadFailure");
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        final sf.f fVar = this.f461475b;
        final org.json.JSONObject jSONObject = this.f461474a;
        yf.i0 i0Var = this.f461477d;
        com.tencent.mars.xlog.Log.i(i0Var.x(), "convertResourcePathAndOperateLivePusher#onLoad, path: %s, localPath: %s", str, str2);
        try {
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
            final java.lang.String str3 = this.f461476c;
            i0Var.G(new java.lang.Runnable() { // from class: yf.y0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.y0.this.f461477d;
                    yf.o oVar = i0Var2.f461362i;
                    if (oVar == null) {
                        com.tencent.mars.xlog.Log.w(i0Var2.x(), "convertResourcePathAndOperateLivePusher#onLoad, adapter is null");
                        return;
                    }
                    java.lang.String str4 = str3;
                    sc1.k1 h17 = oVar.h(str4, jSONObject);
                    com.tencent.mars.xlog.Log.i(i0Var2.x(), "convertResourcePathAndOperateLivePusher#onLoad, type:%s, error:[%s, %s]", str4, java.lang.Integer.valueOf(h17.f405688a), h17.f405689b);
                    fVar.b(h17.f405688a == 0 ? jc1.f.f298912a : jc1.f.f298915d, h17.f405690c);
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathAndOperateLivePusher#onLoad, put fail since " + e17);
            fVar.a(jc1.f.f298915d);
        }
    }
}
