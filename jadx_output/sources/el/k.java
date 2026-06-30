package el;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lel/k;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class k extends com.tencent.mm.plugin.lite.api.p implements com.tencent.mm.modelbase.u0 {
    public final java.lang.String A(java.lang.String str) {
        if (str != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final com.tencent.mm.autogen.events.DoFavoriteEvent B(el.g action, android.app.Activity activity, com.tencent.mm.autogen.events.DoFavoriteEvent doFavEvent, r45.bq0 favProtoItem, r45.jq0 sourceItem, r45.op0 liteAppItem) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(doFavEvent, "doFavEvent");
        kotlin.jvm.internal.o.g(favProtoItem, "favProtoItem");
        kotlin.jvm.internal.o.g(sourceItem, "sourceItem");
        kotlin.jvm.internal.o.g(liteAppItem, "liteAppItem");
        am.c4 c4Var = doFavEvent.f54090g;
        java.lang.String str = action.f253699c;
        c4Var.f6319e = str;
        java.lang.String str2 = action.f253698b;
        c4Var.f6318d = str2;
        c4Var.f6317c = 24;
        c4Var.f6315a = favProtoItem;
        favProtoItem.o(sourceItem);
        c4Var.f6332r = action.f253709m;
        if (activity != null) {
            c4Var.f6323i = activity;
        }
        c4Var.f6333s = hashCode();
        int i17 = action.f253701e;
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 0;
                }
            }
        }
        c4Var.f6334t = i18;
        sourceItem.e(c01.z1.r());
        sourceItem.j(c01.z1.r());
        sourceItem.b(action.f253711o);
        sourceItem.g(37);
        sourceItem.i(action.f253700d);
        sourceItem.c(java.lang.System.currentTimeMillis());
        liteAppItem.f382414n = action.f253705i;
        liteAppItem.f382415o = action.f253706j;
        liteAppItem.f382409f = action.f253708l;
        liteAppItem.f382416p = action.f253707k;
        liteAppItem.f382407d = action.f253703g;
        liteAppItem.f382413m = str;
        liteAppItem.f382412i = str2;
        liteAppItem.f382410g = action.f253704h;
        liteAppItem.f382411h = action.f253702f;
        liteAppItem.f382408e = i17;
        liteAppItem.f382417q = action.f253697a;
        liteAppItem.f382419s = action.f253710n;
        liteAppItem.f382421u = action.f253712p;
        c4Var.f6315a.P = liteAppItem;
        return doFavEvent;
    }

    public final java.util.LinkedList C(org.json.JSONArray jSONArray) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    r45.np0 np0Var = new r45.np0();
                    np0Var.f381564d = jSONObject.optString("excerptKey", "");
                    np0Var.f381565e = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
                    np0Var.f381566f = jSONObject.optString("url", "");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(np0Var.f381564d) && !com.tencent.mm.sdk.platformtools.t8.K0(np0Var.f381565e) && !com.tencent.mm.sdk.platformtools.t8.K0(np0Var.f381566f)) {
                        linkedList.add(np0Var);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiFavoriteAction", "parse excerptList item error: " + e17.getMessage());
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:6:0x002e, B:8:0x0038, B:9:0x003c, B:11:0x0056, B:12:0x005a, B:14:0x006f, B:15:0x0073, B:17:0x0081, B:18:0x0085, B:20:0x0093, B:21:0x0097, B:23:0x00a5, B:26:0x00ac, B:27:0x00b3, B:29:0x00bd, B:31:0x00c3, B:32:0x00ca, B:34:0x00d5, B:35:0x00d9, B:37:0x00e8, B:38:0x00ec, B:40:0x00fa, B:42:0x0100, B:43:0x0107, B:46:0x0112, B:50:0x011e, B:52:0x0127, B:56:0x0133, B:58:0x013d, B:60:0x0143, B:61:0x014c, B:63:0x0157, B:66:0x0162, B:68:0x016c, B:70:0x0172, B:71:0x017b), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final el.g D(java.lang.String r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: el.k.D(java.lang.String, org.json.JSONObject):el.g");
    }

    public final jz5.l E(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        java.lang.Object obj = hashMap.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String A = A(obj instanceof java.lang.String ? (java.lang.String) obj : null);
        java.lang.Object obj2 = hashMap.get("query");
        return new jz5.l(A, A(obj2 != null ? obj2.toString() : null));
    }

    public final java.lang.String F(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        java.lang.Object obj = hashMap.get("appId");
        return A(obj instanceof java.lang.String ? (java.lang.String) obj : null);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        el.g D;
        if (jSONObject == null || (D = D(str, jSONObject)) == null) {
            return;
        }
        if (D.f253700d.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "identifier is null or empty");
            this.f143443f.a("identifier is empty");
            return;
        }
        int i17 = D.f253713q;
        if (i17 == 1 || i17 == 3) {
            ((ku5.t0) ku5.t0.f312615d).B(new el.i(this, D));
        } else if (i17 == 2) {
            ((ku5.t0) ku5.t0.f312615d).B(new el.j(this, D));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "actionType is illegal:%d", java.lang.Integer.valueOf(i17));
            this.f143443f.a("actionType is illegal");
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        o72.r2 r2Var;
        if ((m1Var instanceof o72.h5) && (r2Var = ((o72.h5) m1Var).f343346f) != null && r2Var.field_targetID == hashCode()) {
            gm0.j1.d().q(401, this);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i17 == 0 && i18 == 0) {
                jSONObject.put("result", true);
                jSONObject.put("errMsg", str);
                jSONObject.put(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, r2Var.field_sourceId);
            } else {
                jSONObject.put("result", false);
                jSONObject.put("errMsg", str);
                jSONObject.put(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, r2Var.field_sourceId);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "[onSceneEnd] errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", favId = " + r2Var.field_id + ", return json = " + jSONObject);
            this.f143443f.c(jSONObject, false);
        }
    }
}
