package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class c7 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143527g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143528h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143529i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f143530m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f143531n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f143532o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f143533p = "";

    /* renamed from: q, reason: collision with root package name */
    public org.json.JSONObject f143534q = null;

    /* renamed from: r, reason: collision with root package name */
    public org.json.JSONObject f143535r = null;

    public java.lang.String A(java.lang.String str) {
        return str.isEmpty() ? "" : ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(str).f182736e;
    }

    public void B(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        boolean z17;
        java.lang.String gifPath = str;
        this.f143527g = gifPath;
        this.f143528h = str2;
        this.f143529i = str4;
        this.f143530m = str3;
        str5 = "";
        if (str4.equals("image")) {
            if (!com.tencent.mm.sdk.platformtools.y1.f(str)) {
                com.tencent.mars.xlog.Log.w("LiteAppJsApiSendFileMessage", "sendFileMessage, %s is not image", str);
                this.f143443f.a("sendFileMessage fail, not image file");
                return;
            }
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = null;
            android.app.Activity activity = c() instanceof android.app.Activity ? (android.app.Activity) c() : null;
            if (com.tencent.mm.sdk.platformtools.y1.c(str)) {
                com.tencent.mars.xlog.Log.i("LiteAppJsApiSendFileMessage", "sendFileMessage, gif");
                com.tencent.mm.plugin.lite.jsapi.comms.i8 i8Var = new com.tencent.mm.plugin.lite.jsapi.comms.i8();
                com.tencent.mm.plugin.lite.jsapi.comms.z6 z6Var = new com.tencent.mm.plugin.lite.jsapi.comms.z6(this, activity);
                kotlin.jvm.internal.o.g(activity, "activity");
                kotlin.jvm.internal.o.g(gifPath, "gifPath");
                if (!((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ri()) {
                    iEmojiInfo = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(com.tencent.mm.vfs.w6.p(str));
                    if (iEmojiInfo == null) {
                        iEmojiInfo = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, gifPath));
                    }
                }
                boolean z18 = (iEmojiInfo == null ? 0L : com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).N0())) > ((long) ip.c.a());
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (iEmojiInfo != null) {
                    gifPath = ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).N0();
                }
                boolean z19 = (com.tencent.mm.sdk.platformtools.x.J(gifPath, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
                if (z18 || z19) {
                    com.tencent.mars.xlog.Log.i("LiteAppSendGifToConversation", "doShare, fail since gif illegal");
                    db5.e1.y(activity, activity.getString(com.tencent.mm.R.string.bvm), "", activity.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.lite.jsapi.comms.f8(z6Var));
                    return;
                }
                nf.g.a(activity).f(new com.tencent.mm.plugin.lite.jsapi.comms.g8(i8Var, new com.tencent.mm.plugin.lite.jsapi.comms.h8(z6Var)));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_File_Name", iEmojiInfo != null ? ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).getMd5() : "");
                intent.putExtra("Retr_Msg_Type", 5);
                intent.putExtra("Retr_MsgImgScene", 1);
                intent.putExtra("Retr_show_success_tips", false);
                intent.putExtra("content_type_forward_to_wework", 14);
                j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, i8Var.f143617a);
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, gifPath);
        hashMap.put(dm.i4.COL_LOCALID, str2);
        hashMap.put("type", str4);
        hashMap.put("thumbPath", str3);
        org.json.JSONObject jSONObject = this.f143535r;
        if (jSONObject != null) {
            try {
                jSONObject.put("appId", this.f143442e.f299025b);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", e17.getMessage());
            }
            hashMap.put("tailInfo", this.f143535r.toString());
        }
        org.json.JSONObject jSONObject2 = this.f143534q;
        if (jSONObject2 != null ? jSONObject2.optBoolean("isRecentForward", false) : false) {
            java.lang.String optString = this.f143534q.optString("content");
            int optInt = this.f143534q.optInt(ya.b.INDEX);
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            java.util.ArrayList Ui = new com.tencent.mm.pluginsdk.forward.m().Ui();
            for (int i17 = 0; !com.tencent.mm.sdk.platformtools.t8.L0(Ui) && i17 < Ui.size(); i17++) {
                java.lang.String str6 = ((o25.m2) Ui.get(i17)).f342560a;
                if (com.tencent.mm.sdk.platformtools.w2.a(str6).equalsIgnoreCase(optString) && i17 == optInt) {
                    z17 = true;
                    str5 = str6;
                    break;
                }
            }
        }
        z17 = false;
        if (!(c() instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", "sendfile after close activity");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent2.putExtra("proxyui_action_code_key", 15);
        intent2.putExtra("send_file_message_params", hashMap);
        int i18 = m93.j.E + 1;
        m93.j.E = i18;
        m93.j.F.put(java.lang.Integer.valueOf(i18), this);
        intent2.putExtra("callback_id", m93.j.E);
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            intent2.putExtra("Select_Conv_User", str5);
        }
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void C(java.lang.String videoPath, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f143442e;
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) g0Var).zj(cVar.f299025b, cVar.f299024a, str2);
            if (com.tencent.mm.vfs.w6.j(zj6)) {
                str2 = zj6;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.startsWith("http")) {
                ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str2, new com.tencent.mm.plugin.lite.jsapi.comms.a7(this, videoPath, str, str3));
                return;
            }
        }
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(videoPath.concat(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG));
            try {
                ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(videoPath);
                if (p17 != null) {
                    com.tencent.mm.sdk.platformtools.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.PNG, r6Var.o(), true);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("LiteAppSendVideoMessage", "createThumbFile, fail since " + e17);
                r6Var = null;
            }
            str2 = r6Var != null ? r6Var.o() : null;
        }
        B(videoPath, str, str2, str3);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        this.f143533p = com.tencent.mm.plugin.lite.logic.y2.f(str, "bundle", null);
        java.lang.String optString = jSONObject.optString("type");
        if (optString.equals("file")) {
            try {
                ra3.b0.f393489a.c(c(), str, this.f143442e.f299024a, jSONObject.getJSONArray("fileList"));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject());
                jSONObject2.put("result", true);
                this.f143443f.c(jSONObject2, false);
                return;
            } catch (java.lang.Exception e17) {
                java.lang.String str2 = "sendFileMessage(type='file') failed\n" + e17.getMessage();
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", str2);
                this.f143443f.a(str2);
                return;
            }
        }
        java.lang.String optString2 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        java.lang.String optString3 = jSONObject.optString(dm.i4.COL_LOCALID);
        java.lang.String optString4 = jSONObject.optString("base64ImgStr");
        java.lang.String optString5 = jSONObject.optString("thumbPath");
        if (optString5 == null) {
            optString5 = "";
        }
        this.f143535r = jSONObject.optJSONObject("tailInfo");
        this.f143534q = jSONObject.optJSONObject("extra");
        if (android.text.TextUtils.isEmpty(optString2) && android.text.TextUtils.isEmpty(optString3) && android.text.TextUtils.isEmpty(optString4)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", "sendFileMessage fail, filePath is null");
            this.f143443f.a("sendFileMessage fail, filePath is null");
            return;
        }
        if (!optString.equals("image") && !optString.equals("video")) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", "sendFileMessage fail, the file is not image or video");
            this.f143443f.a("sendFileMessage fail, the file is not image or video");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString4) || !optString.equals("image")) {
            if (android.text.TextUtils.isEmpty(optString2)) {
                optString2 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString3);
            } else if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString2)) {
                optString2 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString2);
            } else if (optString.equals("image")) {
                if (!com.tencent.mm.vfs.w6.j(optString2)) {
                    if (!optString2.startsWith("http")) {
                        this.f143443f.a("sendFileMessage fail, file not found");
                        return;
                    }
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString2, new com.tencent.mm.plugin.lite.jsapi.comms.x6(this));
                    return;
                }
            } else if (optString.equals("video") && !com.tencent.mm.vfs.w6.j(optString2)) {
                if (optString2.startsWith("http")) {
                    com.tencent.mm.plugin.lite.jsapi.comms.d.a(str, optString2, new com.tencent.mm.plugin.lite.jsapi.comms.y6(this, optString5, optString));
                    return;
                } else {
                    this.f143443f.a("sendFileMessage fail, file not found");
                    return;
                }
            }
            if (android.text.TextUtils.isEmpty(optString3)) {
                optString3 = A(optString2);
            }
            if (optString.equals("image")) {
                B(optString2, optString3, "", optString);
                return;
            } else {
                if (optString.equals("video")) {
                    C(optString2, optString3, optString5, optString);
                    return;
                }
                return;
            }
        }
        int indexOf = optString4.indexOf(";base64,");
        if (indexOf != -1) {
            optString4 = optString4.substring(indexOf + 8);
        }
        try {
            byte[] decode = android.util.Base64.decode(optString4, 2);
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendFileMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                this.f143443f.a("error base64");
                return;
            }
            java.lang.String str3 = this.f143533p + java.lang.String.format("MMImage_%d_%d.jpg", java.lang.Long.valueOf(this.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (!ra3.h0.c(decodeByteArray, str3)) {
                this.f143443f.a("error base64, save fail");
                return;
            }
            ra3.h0.d(str3, decode);
            java.lang.String A = A(str3);
            this.f143531n = str3;
            B(str3, A, "", "image");
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", "error base64, decode failed %s", e18.getMessage());
            this.f143443f.a("error base64");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void y(int i17, int i18, android.content.Intent intent) {
        int i19;
        android.app.Activity activity;
        java.lang.String str;
        boolean z17;
        boolean z18;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendFileMessage", "onActivityResult: data null");
            this.f143443f.a("data is null");
            return;
        }
        if (this.f143531n.length() > 0) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.lite.jsapi.comms.b7 b7Var = new com.tencent.mm.plugin.lite.jsapi.comms.b7(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b7Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, false);
        }
        if (i18 != -1) {
            this.f143443f.a("cancel");
            return;
        }
        if (this.f143529i.equals("image")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.COL_LOCALID, this.f143528h);
            hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f143527g);
            hashMap.put("err_msg", "sendFileMessage:ok");
            this.f143443f.b(hashMap);
            return;
        }
        if (this.f143529i.equals("video")) {
            com.tencent.mm.plugin.lite.jsapi.comms.p8 p8Var = new com.tencent.mm.plugin.lite.jsapi.comms.p8();
            android.app.Activity activity2 = (android.app.Activity) c();
            com.tencent.mm.plugin.lite.api.o invokeCallback = this.f143443f;
            java.lang.String filePath = this.f143527g;
            java.lang.String thumbPath = this.f143530m;
            kotlin.jvm.internal.o.g(activity2, "activity");
            kotlin.jvm.internal.o.g(invokeCallback, "invokeCallback");
            kotlin.jvm.internal.o.g(filePath, "filePath");
            kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
            com.tencent.mm.plugin.lite.jsapi.comms.l8 l8Var = new com.tencent.mm.plugin.lite.jsapi.comms.l8(invokeCallback, thumbPath, p8Var);
            try {
                gp.d dVar = new gp.d();
                dVar.setDataSource(filePath);
                long V = com.tencent.mm.sdk.platformtools.t8.V(dVar.extractMetadata(9), 0L);
                dVar.release();
                i19 = com.tencent.mm.sdk.platformtools.t8.V1(V);
            } catch (java.lang.Exception unused) {
                i19 = 0;
            }
            com.tencent.mars.xlog.Log.i("LiteAppSendVideoMessage", "parseVideoDurationS, duration: " + i19);
            if (i19 <= 0) {
                com.tencent.mars.xlog.Log.w("LiteAppSendVideoMessage", "isVideoLegal2Share, durationS: " + i19);
                l8Var.invoke(java.lang.Boolean.FALSE, null);
            } else {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(filePath));
                java.lang.Long valueOf = r6Var.m() ? java.lang.Long.valueOf(r6Var.C()) : null;
                if (valueOf == null || 0 >= valueOf.longValue()) {
                    db5.e1.y(activity2, activity2.getString(com.tencent.mm.R.string.fje), "", activity2.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.lite.jsapi.comms.m8(l8Var));
                } else if (ip.c.l() < valueOf.longValue()) {
                    db5.e1.y(activity2, activity2.getString(com.tencent.mm.R.string.fjz), "", activity2.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.lite.jsapi.comms.n8(l8Var));
                } else {
                    l8Var.invoke(java.lang.Boolean.TRUE, new com.tencent.mm.plugin.lite.jsapi.comms.j8(i19));
                }
            }
            com.tencent.mm.plugin.lite.api.o invokeCallback2 = this.f143443f;
            android.app.Activity activity3 = (android.app.Activity) c();
            java.lang.String filePath2 = this.f143527g;
            java.lang.String thumbPath2 = this.f143530m;
            java.lang.String localId = this.f143528h;
            java.lang.String tempThumbPath = this.f143532o;
            kotlin.jvm.internal.o.g(invokeCallback2, "invokeCallback");
            kotlin.jvm.internal.o.g(activity3, "activity");
            kotlin.jvm.internal.o.g(filePath2, "filePath");
            kotlin.jvm.internal.o.g(thumbPath2, "thumbPath");
            kotlin.jvm.internal.o.g(localId, "localId");
            kotlin.jvm.internal.o.g(tempThumbPath, "tempThumbPath");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = filePath2;
            if (filePath2.length() == 0) {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                jd.c cVar = invokeCallback2.f143440a;
                activity = activity3;
                str = "LiteAppSendVideoMessage";
                java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) g0Var).zj(cVar.f299025b, cVar.f299024a, localId);
                kotlin.jvm.internal.o.f(zj6, "getFilePathByBothLocalId(...)");
                h0Var.f310123d = zj6;
            } else {
                activity = activity3;
                str = "LiteAppSendVideoMessage";
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            if (!stringArrayListExtra.isEmpty()) {
                p8Var.a((java.lang.String) h0Var.f310123d, tempThumbPath);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, h0Var.f310123d);
                hashMap2.put(dm.i4.COL_LOCALID, localId);
                hashMap2.put("err_msg", "sendFileMessage:ok");
                invokeCallback2.b(hashMap2);
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.i(str, "doShare, fail since selectedUsers is empty 1");
                invokeCallback2.a("sendFileMessage fail, selectedUsers is empty 1");
                p8Var.a((java.lang.String) h0Var.f310123d, tempThumbPath);
                return;
            }
            java.lang.String str2 = str;
            java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",");
            if (O1 == null || O1.isEmpty()) {
                com.tencent.mars.xlog.Log.i(str2, "doShare, fail since selectedUsers is empty 2");
                invokeCallback2.a("sendFileMessage fail, selectedUsers is empty 2");
                p8Var.a((java.lang.String) h0Var.f310123d, tempThumbPath);
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            com.tencent.mm.plugin.lite.jsapi.comms.j8 j8Var = p8Var.f143719a;
            if (j8Var == null) {
                kotlin.jvm.internal.o.o("mVideoInfo");
                throw null;
            }
            if (j8Var == null) {
                kotlin.jvm.internal.o.o("mVideoInfo");
                throw null;
            }
            int i27 = j8Var.f143627a;
            java.lang.String str3 = (java.lang.String) h0Var.f310123d;
            kotlin.jvm.internal.o.d(O1);
            com.tencent.mm.plugin.lite.jsapi.comms.o8 o8Var = new com.tencent.mm.plugin.lite.jsapi.comms.o8(p8Var, h0Var, tempThumbPath, localId, invokeCallback2);
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = O1.size();
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                z17 = true;
                z18 = true;
            } else {
                z17 = true;
                z18 = false;
            }
            boolean z19 = z17 ^ z18;
            for (java.lang.String str4 : O1) {
                ((dk5.s5) tg3.t1.a()).oj(activity, str4, str3, thumbPath2, 1, i27, false, false, "", "", null, "", new com.tencent.mm.plugin.lite.jsapi.comms.k8(str4, f0Var, o8Var));
                if (z19) {
                    ((dk5.s5) tg3.t1.a()).fj(str4, stringExtra2, c01.e2.C(str4), 0);
                }
            }
        }
    }
}
