package zv2;

/* loaded from: classes2.dex */
public final class t implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.w f476424a;

    public t(zv2.w wVar) {
        this.f476424a = wVar;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (kotlin.jvm.internal.o.b(str, "postChooseMusicAction")) {
            zv2.w wVar = this.f476424a;
            wVar.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    com.tencent.mars.xlog.Log.i("FinderMusicOrAudioWidget", "[postChooseMusicAction] data:" + obj);
                    org.json.JSONObject optJSONObject = ((org.json.JSONObject) obj).optJSONObject("jump_info_config");
                    org.json.JSONObject optJSONObject2 = ((org.json.JSONObject) obj).optJSONObject("lite_app_config");
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setRecommend_reason(optJSONObject != null ? optJSONObject.optString("recommend_reason") : null);
                    finderJumpInfo.setWording(optJSONObject != null ? optJSONObject.optString("wording") : null);
                    finderJumpInfo.setReport_info(optJSONObject != null ? optJSONObject.optString("report_info") : null);
                    finderJumpInfo.setBusiness_type(optJSONObject != null ? optJSONObject.optInt("business_type") : 0);
                    finderJumpInfo.setIcon_url(optJSONObject != null ? optJSONObject.optString("icon_url") : null);
                    finderJumpInfo.setExt_info(optJSONObject != null ? optJSONObject.optString("ext_buff_string") : null);
                    finderJumpInfo.setJumpinfo_type(6);
                    r45.k74 k74Var = new r45.k74();
                    k74Var.set(0, optJSONObject2 != null ? optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID) : null);
                    k74Var.set(1, optJSONObject2 != null ? optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) : null);
                    k74Var.set(2, optJSONObject2 != null ? optJSONObject2.optString("query") : null);
                    k74Var.set(3, optJSONObject2 != null ? optJSONObject2.optString("default_url") : null);
                    k74Var.set(4, java.lang.Integer.valueOf((int) ((optJSONObject2 != null ? (float) optJSONObject2.optDouble(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_HEIGHT_PERCENT) : 0.0f) * 100)));
                    k74Var.set(5, java.lang.Float.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("half_height") : 0.0f));
                    k74Var.set(6, java.lang.Integer.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("open_type") : 0));
                    k74Var.set(7, java.lang.Boolean.valueOf(optJSONObject2 != null && optJSONObject2.optInt("is_transparent") == 1));
                    k74Var.set(8, java.lang.Boolean.valueOf(optJSONObject2 != null && optJSONObject2.optInt("is_forbid_rightgesture") == 1));
                    java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA) : null;
                    if (optString == null) {
                        optString = "";
                    }
                    k74Var.set(9, com.tencent.mm.protobuf.g.c(optString));
                    k74Var.set(10, optJSONObject2 != null ? optJSONObject2.optString("mini_version") : null);
                    k74Var.set(11, java.lang.Integer.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("position") : 0));
                    finderJumpInfo.setLite_app_info(k74Var);
                    wVar.f476397f = finderJumpInfo;
                    wVar.i(finderJumpInfo);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("FinderMusicOrAudioWidget", java.lang.String.valueOf(e17.getMessage()));
                }
            }
        }
        return true;
    }
}
