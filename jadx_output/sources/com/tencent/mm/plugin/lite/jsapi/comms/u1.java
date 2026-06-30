package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/u1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class u1 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f143793m;

    /* renamed from: n, reason: collision with root package name */
    public int f143794n;

    /* renamed from: g, reason: collision with root package name */
    public final int f143790g = 300;

    /* renamed from: h, reason: collision with root package name */
    public int f143791h = 47;

    /* renamed from: i, reason: collision with root package name */
    public qk.z6 f143792i = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_PREVIEW;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f143795o = "";

    public final jz5.l A(int i17, int i18, android.graphics.Rect rect) {
        int width = rect.width();
        int i19 = this.f143790g;
        if (width > i19 || rect.height() > i19) {
            if (rect.width() > rect.height()) {
                float f17 = i17;
                int b17 = a06.d.b(f17 / (rect.width() / i19));
                i18 = a06.d.b(b17 / (f17 / i18));
                rm5.o.b(rect, i19 / rect.width());
                i17 = b17;
            } else {
                float f18 = i18;
                int b18 = a06.d.b(f18 / (rect.height() / i19));
                i17 = a06.d.b(b18 * (i17 / f18));
                rm5.o.b(rect, i19 / rect.height());
                i18 = b18;
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f8, code lost:
    
        if (r0 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010e, code lost:
    
        r9.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e4, code lost:
    
        if (r0 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010c, code lost:
    
        if (r0 == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0286: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:102:0x0286 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.u1.B(java.lang.String):void");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String msgContent;
        long j17;
        java.lang.String roomId;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "invoke: " + jSONObject);
        java.lang.String md52 = jSONObject != null ? jSONObject.optString("md5") : null;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("emojiInfoBuf") : null;
        this.f143794n = jSONObject != null ? jSONObject.optInt("opType", 0) : 0;
        this.f143791h = jSONObject != null ? jSONObject.optInt("emotionScene", 47) : 47;
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("hideOperateOK") : false;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("imageInfo") : null;
        if (!(str == null)) {
            this.f143795o = str;
        }
        if (md52 == null || md52.length() == 0) {
            if (optString2 == null || optString2.length() == 0) {
                this.f143443f.a("emoticonSingleOperation:fail_missing arguments");
                return;
            }
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.Object wj6 = g0Var != null ? ((com.tencent.mm.feature.lite.i) g0Var).wj(this.f143442e.f299024a, "EmotionMsgBrowseLogicData") : null;
        qk.l7 l7Var = wj6 instanceof qk.l7 ? (qk.l7) wj6 : null;
        if (l7Var != null) {
            msgContent = l7Var.f364230h;
            roomId = l7Var.f364228f;
            this.f143793m = l7Var.f364225c;
            j17 = l7Var.f364229g;
        } else {
            msgContent = "";
            j17 = 0;
            roomId = "";
        }
        int i17 = this.f143791h;
        if (i17 == 86) {
            this.f143792i = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_ADS_GENERATE;
        } else if (i17 == 100009) {
            this.f143792i = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_PREVIEW;
        } else if (i17 == 100041) {
            this.f143792i = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_FINDER_COMMENT;
        }
        if (!(optString2 == null || optString2.length() == 0)) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                java.lang.String optString3 = jSONObject2.optString(dm.i4.COL_LOCALID);
                java.lang.String optString4 = jSONObject2.optString("url");
                if (!(optString3 == null || optString3.length() == 0)) {
                    q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
                    if (g0Var2 != null) {
                        jd.c cVar = this.f143442e;
                        str2 = ((com.tencent.mm.feature.lite.i) g0Var2).zj(cVar.f299025b, cVar.f299024a, optString3);
                    } else {
                        str2 = null;
                    }
                    B(str2);
                    return;
                }
                if (optString4 == null || optString4.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "no localId or url");
                    this.f143443f.a("emoticonSingleOperation:fail_missing arguments");
                    return;
                }
                java.io.File cacheDir = c().getCacheDir();
                byte[] bytes = optString4.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(cacheDir, by5.x.d(bytes));
                if (r6Var.m()) {
                    B(r6Var.u());
                    return;
                }
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342082f = r6Var.o();
                fVar.f342102z = new java.lang.Object[]{r6Var.o()};
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Di().j(optString4, null, fVar.a(), new com.tencent.mm.plugin.lite.jsapi.comms.t1(optString4, this));
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "failed to parse imageInfo proto: " + e17.getMessage());
                this.f143443f.a("emoticonSingleOperation:fail_missing arguments");
                return;
            }
        }
        if (md52 == null || md52.length() == 0) {
            this.f143443f.a("emoticonSingleOperation:fail_missing arguments");
            return;
        }
        int i18 = this.f143794n;
        if (i18 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
            intent.putExtra("proxyui_action_code_key", 21);
            int i19 = m93.j.Q + 1;
            m93.j.Q = i19;
            m93.j.R.put(java.lang.Integer.valueOf(i19), this);
            intent.putExtra("callback_id", m93.j.Q);
            intent.putExtra("preview_page_save_md5", md52);
            intent.putExtra("preview_page_save_emojiInfoBuf", optString);
            intent.putExtra("preview_page_save_emotionScene", this.f143791h);
            intent.putExtra("preview_page_save_disableAutoShowSucToast", optBoolean);
            android.content.Context c17 = c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonSingleOperation", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            c17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonSingleOperation", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i18 == 2) {
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            android.content.Context c18 = c();
            kotlin.jvm.internal.o.f(c18, "getContext(...)");
            int ordinal = this.f143792i.ordinal();
            ((com.tencent.mm.feature.emoji.c4) o6Var).getClass();
            kotlin.jvm.internal.o.g(md52, "md5");
            lb5.a aVar = new lb5.a();
            aVar.n(md52);
            aVar.p(ordinal);
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 5;
            ((dk5.b0) b0Var).Bi(c18, aVar, rVar);
        } else if (i18 == 3) {
            com.tencent.mm.feature.emoji.api.o6 o6Var2 = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            android.content.Context c19 = c();
            kotlin.jvm.internal.o.f(c19, "getContext(...)");
            com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var2;
            c4Var.getClass();
            kotlin.jvm.internal.o.g(md52, "md5");
            com.tencent.mm.storage.emotion.EmojiInfo Ai = c4Var.Ai(md52, optString);
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(c19);
            e4Var.f211780g = 2;
            e4Var.f211776c = c19.getText(com.tencent.mm.R.string.ggc);
            new rr.e(c19, Ai, null, new com.tencent.mm.feature.emoji.n3(e4Var.c(), c19, Ai));
        } else {
            if (i18 != 4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "unable to handle unknown opType:" + this.f143794n);
                this.f143443f.a("emoticonSingleOperation:fail_missing arguments");
                return;
            }
            com.tencent.mm.feature.emoji.api.o6 o6Var3 = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            android.content.Context c27 = c();
            kotlin.jvm.internal.o.f(c27, "getContext(...)");
            java.lang.String str3 = this.f143793m;
            com.tencent.mm.feature.emoji.c4 c4Var2 = (com.tencent.mm.feature.emoji.c4) o6Var3;
            c4Var2.getClass();
            kotlin.jvm.internal.o.g(msgContent, "msgContent");
            kotlin.jvm.internal.o.g(roomId, "roomId");
            if (j62.e.g().l("clicfg_emoji_expose_config_switch_android", false, false, true)) {
                android.os.Bundle bundle = new android.os.Bundle();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                bundle.putString("query", "{\"scene\":51}");
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(msgContent);
                bundle2.putStringArrayList("k_outside_expose_proof_item_list", arrayList2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(roomId)) {
                    bundle2.putString("k_username", str3);
                } else {
                    bundle2.putString("k_username", roomId);
                }
                bundle2.putLong("k_expose_msg_id", j17);
                bundle2.putInt("k_expose_msg_type", 47);
                bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
                com.tencent.mars.xlog.Log.i(c4Var2.f66207d, "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                q80.g0 g0Var3 = (q80.g0) i95.n0.c(q80.g0.class);
                if (g0Var3 != null) {
                    ((com.tencent.mm.feature.lite.i) g0Var3).kk(c27, bundle, true, false, new com.tencent.mm.feature.emoji.x2(c4Var2, c27, msgContent, roomId, str3, j17));
                }
            } else {
                c4Var2.Di(c27, msgContent, roomId, str3, j17);
            }
        }
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void l(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "onEmojiPreviewPageSaveCompleted");
        if (i18 != -1) {
            return;
        }
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("extra_md5") : null;
        if (stringExtra == null || !(!r26.n0.N(stringExtra))) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("canAdd", 0);
        jSONObject.put(stringExtra, jSONObject2);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str = this.f143443f.f143440a.f299025b;
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.w.k(str, "onSingleEmojiDownloadUpdate", jSONObject);
    }
}
