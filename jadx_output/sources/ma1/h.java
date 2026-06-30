package ma1;

/* loaded from: classes7.dex */
public class h extends ma1.f {
    public static final int CTRL_INDEX = 669;
    public static final java.lang.String NAME = "editGameRecorderVideo";

    @Override // ma1.f
    public void G(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, ma1.c cVar, java.lang.String str, org.json.JSONArray jSONArray, ta1.n0 n0Var, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: wc start edit screen recorder, with result is %s", n0Var);
        int a17 = cf.b.a(this);
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(1);
        if (jSONArray == null || jSONArray.length() <= 0) {
            arrayList.add(new com.tencent.mm.plugin.game.api.GameShareOption(0, c0Var.getF147807d().getString(com.tencent.mm.R.string.f490633a23), false));
        } else {
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                try {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                    arrayList.add(new com.tencent.mm.plugin.game.api.GameShareOption(jSONObject2.getInt(dm.i4.COL_ID), jSONObject2.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), jSONObject2.optBoolean("needExtUrl", false)));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderEditWC", e17, "hy: json exception!", new java.lang.Object[0]);
                    arrayList.clear();
                    arrayList.add(new com.tencent.mm.plugin.game.api.GameShareOption(0, c0Var.getF147807d().getString(com.tencent.mm.R.string.f490633a23), false));
                }
            }
        }
        nf.g.a(Z0).f(new ma1.g(this, a17, c0Var, i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("k_ext_wording", str);
        bundle.putParcelableArrayList("k_ext_share_options", arrayList);
        ta1.b bVar = ta1.q0.b(c0Var.getAppId(), c0Var).f416666b;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = bVar != null ? ((ta1.f) bVar).f416616e : null;
        videoTransPara.f71198n = 64000;
        videoTransPara.f71199o = n0Var.f416649b;
        videoTransPara.f71200p = 1;
        bundle.putParcelable("k_preferred_trans_param", videoTransPara);
        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Bi(Z0, c0Var.getAppId(), (c0Var.t3() == null || c0Var.t3().E0() == null) ? "" : c0Var.t3().E0().f305841d, cVar.f325152a, a17, bundle);
    }
}
