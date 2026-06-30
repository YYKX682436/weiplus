package oh1;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes4.dex */
public class k2 extends i95.w implements k01.x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f345246d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f345247e = new java.util.HashMap();

    public tt0.e Ai(java.lang.String str) {
        tt0.f fVar = (tt0.f) com.tencent.mm.plugin.appbrand.app.r9.fj(tt0.f.class);
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgService", "shareKey is null, return");
            return null;
        }
        int hashCode = str.hashCode();
        tt0.e eVar = new tt0.e();
        eVar.field_shareKeyHash = hashCode;
        if (!fVar.get(eVar, "shareKeyHash")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgStorage", "WxaUpdateableMsg is null");
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, wxaUpdateableMsg is null", str, java.lang.Integer.valueOf(str.hashCode()));
        return null;
    }

    public boolean Bi(java.lang.String str, int i17, int i18) {
        tt0.f fVar = (tt0.f) com.tencent.mm.plugin.appbrand.app.r9.fj(tt0.f.class);
        boolean z17 = false;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null, err");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgStorage", "shareKey is null, err");
        } else {
            tt0.e eVar = new tt0.e();
            eVar.field_shareKeyHash = str.hashCode();
            boolean z18 = fVar.get(eVar, new java.lang.String[0]);
            eVar.field_btnState = i17;
            eVar.field_msgType = i18;
            z17 = z18 ? fVar.update(eVar, new java.lang.String[0]) : fVar.insert(eVar);
        }
        str.getClass();
        if (z17) {
            android.support.v4.media.f.a(((java.util.HashMap) f345246d).get(str));
        }
        return z17;
    }

    public synchronized void wi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, k01.w0 w0Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            java.util.Map map = f345247e;
            java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
            if (list == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatableMsgInfoChange token:%s", str);
                list = new java.util.ArrayList();
                ((java.util.HashMap) map).put(str, list);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatableMsgInfoChange shareKeyHash:%d msgType:%d", java.lang.Integer.valueOf(str3.hashCode()), java.lang.Integer.valueOf(i18));
            oh1.e2 e2Var = new oh1.e2(null);
            e2Var.f345204a = str2;
            e2Var.f345205b = str3;
            e2Var.f345206c = i17;
            e2Var.f345210g = w0Var;
            e2Var.f345208e = i18;
            e2Var.f345209f = str4;
            e2Var.a();
            list.add(e2Var);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaUpdateableMsgService", "token appId or shareKey is null, return");
    }
}
