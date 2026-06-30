package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class v implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.a0 f181681d;

    public v(com.tencent.mm.plugin.websearch.a0 a0Var) {
        this.f181681d = a0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f351158c;
        com.tencent.mm.plugin.websearch.a0 a0Var = this.f181681d;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(((java.lang.Integer) a0Var.f181436s.f351070m).intValue(), "");
            return;
        }
        if (i17 != 0) {
            return;
        }
        java.util.List list = vVar.f351160e;
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "local contact search size 0");
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(((java.lang.Integer) a0Var.f181436s.f351070m).intValue(), "");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (p13.y yVar : vVar.f351160e) {
                if (yVar.f351184b == 131072) {
                    jSONArray2.put(com.tencent.mm.plugin.websearch.a0.a(yVar, vVar.f351159d));
                }
            }
            jSONObject2.put("items", jSONArray2);
            jSONObject2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492172fh2));
            jSONObject2.put("count", jSONArray2.length());
            jSONObject2.put("type", 3);
            jSONArray.put(jSONObject2);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray);
            jSONObject.put("ret", 0);
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(((java.lang.Integer) a0Var.f181436s.f351070m).intValue(), jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e17, "onSearchDone", new java.lang.Object[0]);
        }
    }
}
