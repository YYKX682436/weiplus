package cz4;

/* loaded from: classes12.dex */
public class f extends com.tencent.mm.plugin.ball.service.s4 {
    public f(dp1.a aVar) {
        super(aVar);
    }

    public static java.lang.String t0(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : bundle.keySet()) {
                jSONObject.put(str, org.json.JSONObject.wrap(bundle.get(str)));
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e17, "bundleToJson", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String u0(am.zl zlVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", zlVar.f8578a);
            java.lang.String str = zlVar.f8579b;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("editorId", str);
            jSONObject.put("field_localId", zlVar.field_localId);
            java.lang.String str3 = zlVar.f8582e;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("insertJsonData", str3);
            java.lang.String str4 = zlVar.f8583f;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("exportJsonData", str4);
            jSONObject.put("isInsert", zlVar.f8584g);
            android.os.Bundle bundle = zlVar.f8585h;
            jSONObject.put("bundleData", bundle == null ? "" : t0(bundle));
            jSONObject.put("itemType", zlVar.f8586i);
            java.lang.String str5 = zlVar.f8587j;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str5);
            jSONObject.put("intdata", zlVar.f8588k);
            jSONObject.put("showShare", zlVar.f8589l);
            r45.bq0 bq0Var = zlVar.field_favProto;
            jSONObject.put("field_favProto", bq0Var == null ? "" : android.util.Base64.encodeToString(bq0Var.toByteArray(), 0));
            r45.dq0 dq0Var = zlVar.f8590m;
            if (dq0Var != null) {
                str2 = android.util.Base64.encodeToString(dq0Var.toByteArray(), 0);
            }
            jSONObject.put("reportInfo", str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e17, "eventToJson NotifyWNNoteOperationEvent", new java.lang.Object[0]);
        }
        return jSONObject.toString();
    }

    public static android.os.Bundle v0(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            bundle.putBoolean("openFormFloatBall", true);
            return bundle;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e17, "jsonToBundle", new java.lang.Object[0]);
            return null;
        }
    }

    public static void w0(iz4.r rVar, boolean z17) {
        if (rVar.f296139d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "isOpenFromSession: true");
            hz4.w wVar = new hz4.w();
            wVar.f286422p = x0(rVar);
            wVar.f286423q = 3;
            ((hz4.f) hz4.f.wi()).f286407d = wVar;
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f372653d = 8;
            wVar.t(rVar.f296145m, java.lang.Long.valueOf(rVar.f296141f), rVar.f296142g, true, com.tencent.mm.sdk.platformtools.x2.f193071a, rVar.f296146n, rVar.f296147o, dq0Var, null);
            wVar.f286418i.f286426b = rVar.f296143h ? 3 : 2;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "isOpenFromSession: false");
        hz4.p pVar = new hz4.p();
        pVar.f286422p = x0(rVar);
        pVar.f286423q = 3;
        ((hz4.f) hz4.f.wi()).f286407d = pVar;
        r45.dq0 dq0Var2 = new r45.dq0();
        dq0Var2.f372653d = 8;
        pVar.w(rVar.f296140e, com.tencent.mm.sdk.platformtools.x2.f193071a, rVar.f296145m, java.lang.Boolean.TRUE, rVar.f296146n, rVar.f296147o, dq0Var2, null, null, z17);
        pVar.f286418i.f286426b = 1;
    }

    public static java.lang.String x0(iz4.r rVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("topIsOpenFromSession", rVar.f296139d);
            jSONObject.put("topLocalId", rVar.f296140e);
            jSONObject.put("topMsgId", rVar.f296141f);
            jSONObject.put("topMsgTalker", rVar.f296142g);
            jSONObject.put("isChatRoom", rVar.f296143h);
            java.lang.String str = rVar.f296144i;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("topTitle", str);
            java.lang.String str3 = rVar.f296145m;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("topNoteXml", str2);
            jSONObject.put("topLastPosition", rVar.f296146n);
            jSONObject.put("topLastOffset", rVar.f296147o);
            jSONObject.put("topMsgTalker", rVar.f296142g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e17, "topItemToJson", new java.lang.Object[0]);
        }
        return jSONObject.toString();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        this.f93239n.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        Q(1);
        t().f93086f = 5;
        t().f93085e = 6;
        t().f93089i = "";
        g();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        super.o0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean s0() {
        return w() && u() && this.f93246u && !this.f93239n.k();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return this.f93239n.t();
    }
}
