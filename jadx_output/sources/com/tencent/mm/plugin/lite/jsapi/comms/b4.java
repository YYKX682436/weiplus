package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class b4 extends com.tencent.mm.plugin.lite.api.p {
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0235 A[Catch: Exception -> 0x0294, TryCatch #0 {Exception -> 0x0294, blocks: (B:6:0x003c, B:8:0x0046, B:10:0x004c, B:12:0x0058, B:13:0x0086, B:15:0x008e, B:17:0x00a5, B:18:0x00b3, B:21:0x00c3, B:23:0x00db, B:25:0x00e1, B:28:0x00f7, B:31:0x0112, B:33:0x0127, B:35:0x013f, B:37:0x014f, B:38:0x0154, B:40:0x017a, B:61:0x0193, B:43:0x01b0, B:45:0x01b6, B:48:0x01d2, B:49:0x01d5, B:50:0x01ed, B:53:0x01f8, B:55:0x0235, B:58:0x027f, B:62:0x0189, B:63:0x0152, B:67:0x0103, B:71:0x0289, B:72:0x006e, B:42:0x018f), top: B:5:0x003c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027f A[Catch: Exception -> 0x0294, TryCatch #0 {Exception -> 0x0294, blocks: (B:6:0x003c, B:8:0x0046, B:10:0x004c, B:12:0x0058, B:13:0x0086, B:15:0x008e, B:17:0x00a5, B:18:0x00b3, B:21:0x00c3, B:23:0x00db, B:25:0x00e1, B:28:0x00f7, B:31:0x0112, B:33:0x0127, B:35:0x013f, B:37:0x014f, B:38:0x0154, B:40:0x017a, B:61:0x0193, B:43:0x01b0, B:45:0x01b6, B:48:0x01d2, B:49:0x01d5, B:50:0x01ed, B:53:0x01f8, B:55:0x0235, B:58:0x027f, B:62:0x0189, B:63:0x0152, B:67:0x0103, B:71:0x0289, B:72:0x006e, B:42:0x018f), top: B:5:0x003c, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(com.tencent.mm.plugin.lite.jsapi.comms.b4 r20, java.util.ArrayList r21, java.util.ArrayList r22) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.b4.A(com.tencent.mm.plugin.lite.jsapi.comms.b4, java.util.ArrayList, java.util.ArrayList):void");
    }

    public static java.lang.String B(java.lang.String str) {
        int lastIndexOf;
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (lastIndexOf = str.lastIndexOf(46)) > 0 && lastIndexOf < str.length() + (-1)) ? str.substring(lastIndexOf + 1) : "";
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiOpenFilePicker", "data is null");
            this.f143443f.a("invalid data");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "openFilePicker data:%s, appId:%s", jSONObject, str);
        int optInt = jSONObject.optInt("count", 1);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        java.lang.String optString = jSONObject.optString("confirm", "");
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("extension");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray2 != null) {
            for (int i17 = 0; i17 < optJSONArray2.length(); i17++) {
                try {
                    arrayList.add(optJSONArray2.getString(i17));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiOpenFilePicker", e17, "parse extension error", new java.lang.Object[0]);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (optJSONArray != null) {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                try {
                    arrayList2.add(optJSONArray.getString(i18));
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiOpenFilePicker", e18, "parse sourceType error", new java.lang.Object[0]);
                }
            }
        }
        int i19 = m93.j.O + 1;
        m93.j.O = i19;
        m93.j.P.put(java.lang.Integer.valueOf(i19), this);
        int i27 = m93.j.O;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("count", java.lang.String.valueOf(optInt));
        hashMap.put("confirm", optString);
        if (!arrayList.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb6.append((java.lang.CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb6.append((java.lang.CharSequence) ",");
                    }
                }
            }
            hashMap.put("extensions", sb6.toString());
        }
        if (!arrayList2.isEmpty()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.Iterator it6 = arrayList2.iterator();
            if (it6.hasNext()) {
                while (true) {
                    sb7.append((java.lang.CharSequence) it6.next());
                    if (!it6.hasNext()) {
                        break;
                    } else {
                        sb7.append((java.lang.CharSequence) ",");
                    }
                }
            }
            hashMap.put("sourceTypes", sb7.toString());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 20);
        intent.putExtra("callback_id", i27);
        intent.putExtra("open_file_picker_params", hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "startAppActivityForResult WxaLiteAppApiProxyUI");
        android.content.Context c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiOpenFilePicker", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiOpenFilePicker", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void p(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "onOpenFilePicker requestCode:%d, resultCode:%d, data:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        if (i17 != 1001) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiOpenFilePicker", "Unexpected request code: %d, expected: %d", java.lang.Integer.valueOf(i17), 1001);
            return;
        }
        if (i18 != -1) {
            if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "File selection canceled by user (clicked cancel button)");
                this.f143443f.a("cancel");
                return;
            } else if (i18 == -2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "User swiped back");
                this.f143443f.a("back");
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiOpenFilePicker", "Unknown result code: %d", java.lang.Integer.valueOf(i18));
                this.f143443f.a("unknown error");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "File selection successful (RESULT_OK)");
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiOpenFilePicker", "Data is null despite RESULT_OK");
            this.f143443f.a("no data");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "Data is not null, extracting file information");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("selected_file_lst");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_file_title_lst");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "Selected files: %s", stringArrayListExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "Selected titles: %s", stringArrayListExtra2);
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiOpenFilePicker", "No files selected or selectedFiles is null/empty");
            this.f143443f.a("no files selected");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenFilePicker", "Files selected successfully, processing files");
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.lite.jsapi.comms.z3(this, stringArrayListExtra, stringArrayListExtra2));
        }
    }
}
