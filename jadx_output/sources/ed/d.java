package ed;

/* loaded from: classes9.dex */
public final class d {
    public static final void a(ed.d dVar, java.lang.String str, ed.a aVar) {
        dVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", ed.b.f251198f);
        jSONObject.put("msg", str);
        com.tencent.mars.xlog.Log.e("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", str);
        aVar.onCall(jSONObject);
    }

    public static final void b(ed.d dVar, byte[] bArr, ed.a aVar) {
        dVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", ed.b.f251196d);
        jSONObject.put("msg", ya.b.SUCCESS);
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.parseFrom(bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back, source=%s", wv3Var.toString());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("corpName", wv3Var.f389498d);
        jSONObject2.put("subType", wv3Var.f389499e);
        jSONObject2.put("materialId", wv3Var.f389500f);
        jSONObject2.put("expire_desc", wv3Var.f389502h);
        jSONObject2.put("is_expired", wv3Var.f389503i);
        jSONObject2.put("is_selected", wv3Var.f389504m);
        jSONObject2.put("obtain_time", wv3Var.f389505n);
        jSONObject2.put("material_flag", wv3Var.f389506o);
        jSONObject2.put("user_flag", wv3Var.f389507p);
        jSONObject2.put("leave_text", wv3Var.f389508q);
        jSONObject2.put("temp_text", wv3Var.f389509r);
        jSONObject2.put("detail_link_type", wv3Var.f389510s);
        jSONObject2.put("detail_link_appname", wv3Var.f389511t);
        jSONObject2.put("detail_link_url", wv3Var.f389512u);
        jSONObject2.put("detail_link_title", wv3Var.f389513v);
        jSONObject2.put("exchange_title", wv3Var.f389514w);
        jSONObject2.put("exchange_url", wv3Var.f389515x);
        jSONObject2.put("exchange_title", wv3Var.f389514w);
        jSONObject2.put("has_source", wv3Var.f389516y);
        jSONObject2.put("last_obtain_time", wv3Var.f389517z);
        jSONObject2.put("disable", wv3Var.A);
        jSONObject2.put("disable_text", wv3Var.B);
        jSONObject2.put("timelimit_promo_text", wv3Var.C);
        jSONObject2.put("timelimit_promo_signature", wv3Var.D);
        r45.xv3 xv3Var = wv3Var.f389501g;
        if (xv3Var != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("corpLogo", xv3Var.f390477d);
            jSONObject3.put("bubbleImage", xv3Var.f390478e);
            jSONObject3.put("coverImage", xv3Var.f390479f);
            jSONObject3.put("detailImage", xv3Var.f390480g);
            jSONObject3.put("bubbleImageMd5", xv3Var.f390481h);
            jSONObject3.put("coverImageMd5", xv3Var.f390482i);
            jSONObject3.put("detailImageMd5", xv3Var.f390483m);
            jSONObject3.put("corpLogoMd5", xv3Var.f390484n);
            jSONObject3.put("coverWidgetImage", xv3Var.f390485o);
            jSONObject3.put("coverWidgetImageMd5", xv3Var.f390486p);
            jSONObject3.put("bubbleWidgetImage", xv3Var.f390487q);
            jSONObject3.put("bubbleWidgetImageMd5", xv3Var.f390488r);
            jSONObject3.put("receiverC2cWidgetImage", xv3Var.f390489s);
            jSONObject3.put("receiverC2cWidgetImageMd5", xv3Var.f390490t);
            jSONObject3.put("StatusFlag", java.lang.Integer.valueOf(xv3Var.f390491u));
            jSONObject3.put("corpLogoDynamic", xv3Var.f390492v);
            jSONObject3.put("bubbleImageDynamic", xv3Var.f390493w);
            jSONObject3.put("coverImageDynamic", xv3Var.f390494x);
            jSONObject3.put("detailImageDynamic", xv3Var.f390495y);
            jSONObject3.put("corpLogoDynamicMd5", xv3Var.f390496z);
            jSONObject3.put("bubbleImageDynamicMd5", xv3Var.A);
            jSONObject3.put("coverImageDynamicMd5", xv3Var.B);
            jSONObject3.put("detailImageDynamicMd5", xv3Var.C);
            jSONObject3.put("coverImageDynamicType", java.lang.Integer.valueOf(xv3Var.D));
            jSONObject2.putOpt("sourceObject", jSONObject3);
        }
        r45.r74 r74Var = wv3Var.E;
        if (r74Var != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("appid", r74Var.f384585d);
            jSONObject4.put("query", r74Var.f384586e);
            jSONObject4.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, r74Var.f384587f);
            jSONObject4.put("default_url", r74Var.f384588g);
            jSONObject2.putOpt("cover_set_liteapp_info", jSONObject4);
        }
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back success, result: %s", jSONObject.toString());
        aVar.onCall(jSONObject);
    }
}
