package uc1;

/* loaded from: classes13.dex */
public class y extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getMapRotate";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapRotate", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapRotate", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapRotate", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, java.lang.Float.valueOf(((vc1.p1) E).f435068e.getMap().getCameraPosition().getBearing()));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapRotate", "getMapRotate ok, values:%s", hashMap.toString());
            C(lVar, i17, p("ok", hashMap), true, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
