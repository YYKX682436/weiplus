package f53;

/* loaded from: classes8.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259697d;

    public y(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259697d = postCommentDialogUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        f53.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.G;
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259697d;
        postCommentDialogUI.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = postCommentDialogUI.f140023s;
        jSONObject.put("gamecenter_identifier", gameInputConfig != null ? gameInputConfig.identifier : null);
        com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, mMEditText.getText());
        f53.s sVar2 = postCommentDialogUI.D;
        jSONObject.put("atUserNameList", new org.json.JSONArray((java.util.Collection) sVar2.f259689c));
        java.lang.String str = postCommentDialogUI.f140025u;
        if (str == null || str.length() == 0) {
            sVar = sVar2;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = postCommentDialogUI.f140024t;
            if (iEmojiInfo != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("emoticonMd5", iEmojiInfo.getMd5());
                jSONObject3.put("productId", iEmojiInfo.getGroupId());
                jSONObject3.put("encryptUrl", iEmojiInfo.J1());
                jSONObject3.put("aesKey", iEmojiInfo.getAesKey());
                jSONObject3.put("designerId", iEmojiInfo.X0());
                jSONObject2.put("emojiInfo", jSONObject3);
                jSONArray.put(jSONObject2);
                jSONObject.put("imageArray", jSONArray);
            } else {
                jSONObject.put("imageArray", "[]");
            }
        } else {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            java.util.ArrayList d17 = kz5.c0.d(postCommentDialogUI.f140025u);
            java.lang.String str2 = g53.a.f268902a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                f53.s sVar3 = sVar2;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str4 = g53.a.f268902a;
                sb6.append(str4);
                java.util.Iterator it6 = it;
                sb6.append("microMsg.image.");
                sb6.append(elapsedRealtime);
                sb6.append(".");
                sb6.append(str3.hashCode() & 65535);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str5 = str4 + "microMsg.thumb." + elapsedRealtime + "." + (str3.hashCode() & 65535);
                if ((((com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.compatible.util.Exif.fromFile(str3).getOrientationInDegree() == 0) ? false : true) && com.tencent.mm.sdk.platformtools.x.k(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)), new com.tencent.mm.vfs.r6(sb7), android.graphics.Bitmap.CompressFormat.PNG)) || com.tencent.mm.vfs.w6.d(str3, sb7, false) > 0) {
                    str3 = sb7;
                }
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e17 = com.tencent.mm.plugin.webview.model.m4.e(str3, str5);
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str3);
                e17.f182744p = n07.outWidth;
                e17.f182745q = n07.outHeight;
                ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e17).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str3);
                java.lang.String str6 = e17.f182736e;
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e17);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "now filepath is : %s, local id is : %s", str3, str6);
                arrayList2.add(str6);
                it = it6;
                sVar2 = sVar3;
            }
            sVar = sVar2;
            java.lang.String str7 = "";
            if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
                org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
                try {
                    jSONStringer.array();
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        java.lang.String str8 = (java.lang.String) it7.next();
                        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str8);
                        if (b17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) {
                            jSONStringer.object();
                            jSONStringer.key(dm.i4.COL_LOCALID);
                            jSONStringer.value(str8);
                            jSONStringer.key("height");
                            jSONStringer.value(b17.f182745q + "");
                            jSONStringer.key("width");
                            jSONStringer.value(b17.f182744p + "");
                            jSONStringer.key("isGif");
                            jSONStringer.value(((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) b17).f182751w);
                            jSONStringer.endObject();
                        }
                    }
                    jSONStringer.endArray();
                    str7 = jSONStringer.toString();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameCenterUtil", e18, "", new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "after parse to json data : %s", str7);
            jSONObject4.put("imageInfo", new org.json.JSONArray(str7));
            jSONArray2.put(jSONObject4);
            jSONObject.put("imageArray", jSONArray2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PostCommentDialogUI", "setResultAndFinish jsonData = " + jSONObject);
        if (postCommentDialogUI.B) {
            java.lang.String str9 = com.tencent.mm.sdk.platformtools.w9.f193055c;
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig2 = postCommentDialogUI.f140023s;
            bundle.putString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, gameInputConfig2 != null ? gameInputConfig2.identifier : null);
            bundle.putString("jsonData", jSONObject.toString());
            com.tencent.mm.ipcinvoker.d0.d(str9, bundle, com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.b.class, null);
        } else {
            m33.y0 y0Var = m33.x0.f323344a;
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig3 = postCommentDialogUI.f140023s;
            y0Var.a(gameInputConfig3 != null ? gameInputConfig3.identifier : null, jSONObject);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List list = sVar.f259689c;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
        hashMap.put("comment_is_at", java.lang.String.valueOf(arrayList3.size() != 0 ? 1 : 2));
        hashMap.put("mention_num", java.lang.String.valueOf(arrayList3.size()));
        hashMap.put("comment_at_list", new org.json.JSONArray((java.util.Collection) list).toString());
        com.tencent.mm.game.report.l.c(postCommentDialogUI.getContext(), 101, 2, 1, 48, 0, com.tencent.mm.game.report.l.b(hashMap));
        postCommentDialogUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
