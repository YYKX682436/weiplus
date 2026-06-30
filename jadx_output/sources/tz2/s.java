package tz2;

/* loaded from: classes13.dex */
public abstract class s {
    public static byte[] a(java.lang.String str, java.lang.String str2) {
        return com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface.encrypt(str, str2, str2.getBytes().length);
    }

    public static byte[] b(java.lang.String str, byte[] bArr, boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String faceMd5 = com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface.faceMd5(bArr, bArr.length);
        jSONObject.put("face_lib_version", 3);
        jSONObject.put("md5", faceMd5);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashDataUtil", "getBioHeader md5:%s", faceMd5);
        return z17 ? tz2.t.a(str, jSONObject.toString()) : a(str, jSONObject.toString());
    }

    public static org.json.JSONArray c(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("camera_config");
            } catch (org.json.JSONException unused) {
                jSONArray = new org.json.JSONArray();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "LIVE_REFLECTION cameraData : JSONException");
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            return jSONArray;
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "LIVE_REFLECTION does not have cameraData");
        return jSONArray2;
    }

    public static byte[] d(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("livedata");
        jSONObject2.put("time_point_list", new org.json.JSONArray());
        org.json.JSONArray jSONArray = jSONObject2.getJSONArray("frames");
        jSONObject2.remove("frames");
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject3 = (org.json.JSONObject) jSONArray.get(i17);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("face_image", jSONObject3.get("image"));
            org.json.JSONArray jSONArray3 = jSONObject3.getJSONArray("x_coordinates");
            org.json.JSONArray jSONArray4 = jSONObject3.getJSONArray("y_coordinates");
            org.json.JSONArray jSONArray5 = new org.json.JSONArray();
            for (int i18 = 0; i18 < jSONArray3.length(); i18++) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("x", jSONArray3.get(i18));
                jSONObject5.put("y", jSONArray4.get(i18));
                jSONArray5.put(jSONObject5);
            }
            jSONObject4.put("coordinate_list", jSONArray5);
            jSONArray2.put(jSONObject4);
        }
        jSONObject2.put("face_live_pic_list_new", jSONArray2);
        if (jSONObject2.has("select_data")) {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("select_data", jSONObject2.optJSONObject("select_data").toString());
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("onetwinkle_data", jSONObject6);
            jSONObject2.put("livedata", jSONObject7);
        }
        java.lang.String string = jSONArray.getJSONObject(0).getString("image");
        java.lang.String string2 = jSONObject2.getString("mouth_lip_reading");
        org.json.JSONArray jSONArray6 = new org.json.JSONArray();
        org.json.JSONObject jSONObject8 = new org.json.JSONObject();
        jSONObject8.put("face_image", com.tencent.mm.plugin.facedetect.FaceProNative.addVerifyData2Jpg(str, string2, string));
        jSONObject8.put("coordinate_list", jSONArray2.getJSONObject(0).get("coordinate_list"));
        jSONArray6.put(jSONObject8);
        jSONObject2.put("face_frame_list", jSONArray6);
        return a(str, jSONObject2.toString());
    }

    public static org.json.JSONObject e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str2);
        jSONObject3.put("business_name", str3);
        jSONObject3.put("person_id", str4);
        jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE, i17);
        jSONObject3.put("req_type", "live");
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        if (i17 == 2) {
            jSONObject2 = jSONObject.getJSONObject("livedata");
            if (jSONObject2 == null) {
                jSONObject2 = new org.json.JSONObject();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "LIVE_REFLECTION does not have livedata");
            }
            if (jSONObject2.has("select_data")) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("select_data", jSONObject2.optJSONObject("select_data").toString());
                jSONObject5.put("camera_config", c(jSONObject));
                jSONObject2.put("onetwinkle_data", jSONObject5);
            }
        } else if (i17 != 3) {
            jSONObject2 = new org.json.JSONObject();
        } else {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("reflect_data", jSONObject.optJSONObject("reflect_data"));
            jSONObject6.put("color_data", jSONObject.optString("color_data"));
            jSONObject6.put("platform", 2);
            jSONObject4.put("live_image", jSONObject.optJSONObject("live_image"));
            jSONObject4.put("eye_image", jSONObject.optJSONObject("eye_image"));
            jSONObject4.put("mouth_image", jSONObject.optJSONObject("mouth_image"));
            jSONObject4.put("action_video", jSONObject.getString("action_video"));
            jSONObject4.put("select_data", jSONObject.optJSONObject("select_data").toString());
            jSONObject4.put("action_str", jSONObject.optString("action_str", ""));
            jSONObject4.put("check_conf", jSONObject.optJSONObject("check_conf"));
            jSONObject4.put("mode", jSONObject.optInt("mode"));
            jSONObject4.put("camera_config", c(jSONObject));
            jSONObject6.put("onetwinkle_data", jSONObject4);
            jSONObject2 = jSONObject6;
        }
        jSONObject3.put("livedata", jSONObject2);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
        if (i17 == 2) {
            jSONObject7.put("face_image", com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface.verifyDataToJpg(str, jSONObject.getJSONObject("livedata").getJSONArray("frames").getJSONObject(0).getString("image")));
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i18 = 0; i18 < 90; i18 = i18 + 1 + 1) {
                org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                jSONObject8.put("x", 0);
                jSONObject8.put("y", 0);
                jSONArray2.put(jSONObject8);
            }
            jSONObject7.put("coordinate_list", jSONArray2);
        } else if (i17 == 3) {
            jSONObject7.put("face_image", com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface.verifyDataToJpg(str, jSONObject.getJSONObject("live_image").getString("image")));
            org.json.JSONArray jSONArray3 = jSONObject.getJSONObject("live_image").getJSONArray("five_points");
            org.json.JSONArray jSONArray4 = new org.json.JSONArray();
            for (int i19 = 0; i19 < jSONArray3.length(); i19 = i19 + 1 + 1) {
                org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                jSONObject9.put("x", com.tencent.mm.sdk.platformtools.t8.L(java.lang.String.valueOf(jSONArray3.get(i19)), 0.0f));
                jSONObject9.put("y", com.tencent.mm.sdk.platformtools.t8.L(java.lang.String.valueOf(jSONArray3.get(r9)), 0.0f));
                jSONArray4.put(jSONObject9);
            }
            jSONObject7.put("coordinate_list", jSONArray4);
        }
        jSONArray.put(jSONObject7);
        jSONObject3.put("face_frame_list", jSONArray);
        return jSONObject3;
    }
}
