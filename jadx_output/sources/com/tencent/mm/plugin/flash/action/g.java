package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetTaskResult f137136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.h f137137e;

    public g(com.tencent.mm.plugin.flash.action.h hVar, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult) {
        this.f137137e = hVar;
        this.f137136d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http response");
        com.tencent.mm.plugin.flash.action.h hVar = this.f137137e;
        wu5.b bVar = hVar.f137142a.f137084x0;
        if (bVar != null) {
            bVar.b();
        }
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = this.f137136d;
        java.lang.String dataString = cronetTaskResult.getDataString();
        if (cronetTaskResult.statusCode != 200 || cronetTaskResult.errorCode != 0) {
            hVar.f137142a.f137067f.setVisibility(8);
            com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = hVar.f137142a;
            faceFlashActionPreviewLayout.f137078s.a7(faceFlashActionPreviewLayout.d(90037, i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.c7q)));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(dataString);
            int optInt = jSONObject.optInt("errcode");
            java.lang.String optString = jSONObject.optString("msg");
            vz2.c.k("rspVerify", java.lang.Integer.valueOf(optInt));
            vz2.c.c().f56208j = optInt;
            if (optInt == 0) {
                int optInt2 = jSONObject.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE);
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http ret_code: %s, ret_msg: %s, liveType: %s", java.lang.Integer.valueOf(optInt), optString, java.lang.Integer.valueOf(optInt2));
                hVar.f137142a.b(optInt2);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(optInt), optString);
                hVar.f137142a.f137067f.setVisibility(8);
                com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = hVar.f137142a;
                faceFlashActionPreviewLayout2.f137078s.a7(faceFlashActionPreviewLayout2.d(optInt, optString));
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http JSON error!");
            hVar.f137142a.f137067f.setVisibility(8);
            com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout3 = hVar.f137142a;
            faceFlashActionPreviewLayout3.f137078s.a7(faceFlashActionPreviewLayout3.d(90037, i65.a.r(faceFlashActionPreviewLayout3.getContext(), com.tencent.mm.R.string.c7q)));
        }
    }
}
