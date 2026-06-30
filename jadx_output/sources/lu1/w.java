package lu1;

/* loaded from: classes9.dex */
public abstract class w {
    public static java.lang.String a(android.content.Context context, int i17, com.tencent.mm.plugin.card.model.CardInfo cardInfo) {
        int i18 = i17 % 10;
        if (i18 == 0) {
            return context.getString(com.tencent.mm.R.string.avy);
        }
        if (i18 == 1) {
            return context.getString(com.tencent.mm.R.string.avx);
        }
        if (i18 == 2) {
            return context.getString(com.tencent.mm.R.string.avw);
        }
        if (i18 == 3) {
            return context.getString(com.tencent.mm.R.string.avv);
        }
        if (i18 != 4) {
            return null;
        }
        return cardInfo.field_label_wording;
    }

    public static r45.ow b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.ow owVar = new r45.ow();
        owVar.f382571e = jSONObject.optString("announcement");
        owVar.f382570d = jSONObject.optString("card_id");
        owVar.f382572f = jSONObject.optInt("end_time", 0);
        owVar.f382573g = jSONObject.optInt("update_time", 0);
        owVar.f382574h = jSONObject.optString("label_wording");
        return owVar;
    }

    public static r45.pw c(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
            return null;
        }
        r45.pw pwVar = new r45.pw();
        pwVar.f383424d = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(ya.b.ITEM_LIST);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                r45.ow b17 = b(jSONArray.getJSONObject(i17));
                if (b17 == null || (b17.f382572f <= com.tencent.mm.sdk.platformtools.t8.i1() && b17.f382572f != 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
                } else {
                    pwVar.f383424d.add(b17);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardStickyHelper", e17, "", new java.lang.Object[0]);
        }
        return pwVar;
    }

    public static void d(java.util.LinkedList linkedList, int i17) {
        if (linkedList == null) {
            return;
        }
        int size = linkedList.size();
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            r45.ow owVar = (r45.ow) linkedList.get(i18);
            xt1.e cj6 = xt1.t0.cj();
            java.lang.String str = owVar.f382570d;
            int i19 = ((size - i18) * 10) + i17;
            java.lang.String str2 = owVar.f382571e;
            int i27 = owVar.f382572f;
            cj6.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CardInfoStorage", "cardId null");
            } else {
                cj6.f456461d.A("UserCardInfo", "update UserCardInfo set stickyIndex=" + i19 + ", stickyAnnouncement='" + str2 + "', stickyEndTime=" + i27 + " where card_id='" + str + "'");
            }
        }
    }

    public static void e(java.util.LinkedList linkedList, int i17) {
        if (linkedList == null) {
            return;
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            r45.ow owVar = (r45.ow) linkedList.get(i18);
            xt1.e cj6 = xt1.t0.cj();
            java.lang.String str = owVar.f382570d;
            java.lang.String str2 = owVar.f382574h;
            if (str2 == null) {
                str2 = "";
            }
            cj6.getClass();
            cj6.f456461d.A("UserCardInfo", "update UserCardInfo set stickyIndex=" + i17 + ", label_wording='" + str2 + "' where card_id='" + str + "'");
        }
    }
}
