package us3;

@j95.b
/* loaded from: classes9.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f430568d = null;

    public static us3.e Ai() {
        return (us3.e) i95.n0.c(us3.e.class);
    }

    public static vs3.a Di() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return new vs3.a(str, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kxw), 3);
    }

    public java.util.List Bi() {
        java.util.List list = this.f430568d;
        if (list != null) {
            return list;
        }
        this.f430568d = new java.util.LinkedList();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(270337, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRecharge", "empty history");
            return this.f430568d;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i17 = 0; i17 < java.lang.Math.min(jSONArray.length(), 100); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                java.lang.String optString2 = jSONObject.optString("record");
                vs3.a aVar = !com.tencent.mm.sdk.platformtools.t8.K0(optString2) ? new vs3.a(optString2, optString, jSONObject.optString(ya.b.LOCATION), 2) : null;
                if (aVar != null) {
                    this.f430568d.add(aVar);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreRecharge", e17, "", new java.lang.Object[0]);
            java.lang.String[] split = str.split("&");
            if (split != null && split.length > 0) {
                for (int i18 = 0; i18 < java.lang.Math.min(split.length, 100); i18++) {
                    java.lang.String[] split2 = split[i18].split("=");
                    if (split2.length == 2) {
                        this.f430568d.add(new vs3.a(split2[0], split2[1], 2));
                    } else if (split2.length == 1) {
                        this.f430568d.add(new vs3.a(split2[0], "", 2));
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRecharge", "getMobileHistory : " + this.f430568d.size());
        return this.f430568d;
    }

    public void Ni(java.util.List list) {
        this.f430568d = list;
        if (list == null || list.size() == 0) {
            this.f430568d = new java.util.LinkedList();
        } else if (list.size() > 10) {
            for (int size = list.size() - 1; size >= 10; size--) {
                list.remove(size);
            }
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (vs3.a aVar : this.f430568d) {
            aVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.lang.String str = aVar.f439875a;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("record", str);
                java.lang.String str2 = aVar.f439876b;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str2);
                java.lang.String str3 = aVar.f439877c;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put(ya.b.LOCATION, str3);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallInputRecord", e17, "", new java.lang.Object[0]);
                jSONObject = null;
            }
            jSONArray.put(jSONObject);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRecharge", "number: %s", aVar.f439876b);
        }
        jSONArray.toString();
        gm0.j1.u().c().w(270337, jSONArray.toString());
        gm0.j1.u().c().i(true);
    }

    public boolean wi(vs3.a aVar) {
        if (aVar != null) {
            java.lang.String str = aVar.f439875a;
            if (android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(str)) {
                java.util.List Bi = Bi();
                java.util.Iterator it = Bi.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    vs3.a aVar2 = (vs3.a) it.next();
                    if (str.equals(aVar2.f439875a)) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b)) {
                            aVar.f439876b = aVar2.f439876b;
                        }
                        Bi.remove(aVar2);
                    }
                }
                Bi.add(0, aVar);
                Ni(Bi);
                return true;
            }
        }
        return false;
    }
}
