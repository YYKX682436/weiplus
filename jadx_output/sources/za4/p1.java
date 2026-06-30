package za4;

/* loaded from: classes4.dex */
public class p1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ za4.q1 f471182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471183g;

    public p1(java.lang.String str, int i17, za4.q1 q1Var, java.lang.String str2) {
        this.f471180d = str;
        this.f471181e = i17;
        this.f471182f = q1Var;
        this.f471183g = str2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
        za4.q1 q1Var = this.f471182f;
        java.lang.String str3 = this.f471180d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("OpenCanvasMgr", "cgi fail pageid %s,preLoad %d, errType %d,errCode %d", str3, java.lang.Integer.valueOf(this.f471181e), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (q1Var != null) {
                ((com.tencent.mm.plugin.sns.ui.va) q1Var).a(false, "");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
            return 0;
        }
        java.lang.String i19 = ((r45.oj3) oVar.f70711b.f70700a).f382301d.i();
        com.tencent.mars.xlog.Log.i("OpenCanvasMgr", "getCanvasInfo pageid %s ,xml %s", str3, i19);
        if (q1Var != null) {
            ((com.tencent.mm.plugin.sns.ui.va) q1Var).a(true, i19);
        }
        if (!android.text.TextUtils.isEmpty(i19)) {
            za4.s1 b17 = za4.s1.b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addUxCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
            if (!android.text.TextUtils.isEmpty(i19) && !android.text.TextUtils.isEmpty(str3)) {
                java.lang.String str4 = this.f471183g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    str2 = str3;
                } else {
                    str2 = str3 + str4;
                }
                ((java.util.HashMap) b17.f471195e).put(str2, i19);
                com.tencent.mm.plugin.sns.storage.a3 a3Var = new com.tencent.mm.plugin.sns.storage.a3();
                a3Var.field_canvasId = str3;
                a3Var.field_canvasXml = i19;
                a3Var.field_canvasExt = str4;
                com.tencent.mm.plugin.sns.storage.b3 b3Var = b17.f471194d;
                b3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                if (com.tencent.mm.sdk.platformtools.t8.K0(a3Var.field_canvasXml)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                } else {
                    a3Var.field_createTime = java.lang.System.currentTimeMillis();
                    if (!b3Var.insert(a3Var)) {
                        b3Var.update(a3Var, new java.lang.String[0]);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUxCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
        return 0;
    }
}
