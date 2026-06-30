package f31;

/* loaded from: classes9.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final f31.f a(java.lang.String username, java.lang.String appId, java.lang.String subscribeUrl, java.util.List templateIds, java.lang.String extInfo, f31.e eVar) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(subscribeUrl, "subscribeUrl");
        kotlin.jvm.internal.o.g(templateIds, "templateIds");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        f31.f fVar = new f31.f(username, appId, 2);
        e(extInfo, fVar);
        fVar.f259277f = eVar;
        fVar.f259279h = subscribeUrl;
        java.util.Iterator it = templateIds.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.List list = fVar.f259275d;
            r45.th6 th6Var = new r45.th6();
            th6Var.f386442d = str;
            ((java.util.ArrayList) list).add(th6Var);
        }
        return fVar;
    }

    public final f31.f b(java.lang.String username, java.lang.String appId, java.util.List templates, java.lang.String extInfo, f31.e eVar, boolean z17, byte[] byteArray, com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(templates, "templates");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(byteArray, "byteArray");
        return c(username, appId, z17, eVar, templates, 6, byteArray, subscribeMsgRequestDialogUiData, extInfo);
    }

    public final f31.f c(java.lang.String str, java.lang.String str2, boolean z17, f31.e eVar, java.util.List list, int i17, byte[] bArr, com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData, java.lang.String str3) {
        f31.f fVar = new f31.f(str, i17, z17);
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        fVar.f259273b = str2;
        fVar.f259277f = eVar;
        kotlin.jvm.internal.o.g(bArr, "<set-?>");
        fVar.f259284m = bArr;
        fVar.f259280i = subscribeMsgRequestDialogUiData;
        e(str3, fVar);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
            java.util.List list2 = fVar.f259275d;
            r45.th6 th6Var = new r45.th6();
            th6Var.f386442d = subscribeMsgTmpItem.f71803f;
            th6Var.f386443e = subscribeMsgTmpItem.f71804g;
            th6Var.f386447i = subscribeMsgTmpItem.f71807m;
            th6Var.f386455t = subscribeMsgTmpItem.f71815u ? 1 : 0;
            th6Var.f386458w = subscribeMsgTmpItem.f71818x ? 1 : 0;
            th6Var.C = subscribeMsgTmpItem.A ? 1 : 0;
            th6Var.f386449n = subscribeMsgTmpItem.f71808n ? 1 : 0;
            th6Var.f386460y = subscribeMsgTmpItem.f71819y;
            th6Var.B = subscribeMsgTmpItem.C ? 1 : 0;
            ((java.util.ArrayList) list2).add(th6Var);
        }
        return fVar;
    }

    public final void e(java.lang.String str, f31.f fVar) {
        if (str.length() > 0) {
            fVar.f259283l = str;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                fVar.f259281j = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                java.lang.String optString = jSONObject.optString("sessionid");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                fVar.f259282k = optString;
                java.lang.String optString2 = jSONObject.optString(dm.i4.COL_USERNAME);
                kotlin.jvm.internal.o.d(optString2);
                if (optString2.length() > 0) {
                    fVar.f259272a = optString2;
                }
                com.tencent.mars.xlog.Log.i("NetSceneSubscribeMsg", "parseExtInfo scene: %s, sessionId: %s, username: %s, extInfo: %s", java.lang.Integer.valueOf(fVar.f259281j), fVar.f259282k, fVar.f259272a, str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("NetSceneSubscribeMsg", e17, "parse extInfo exception", new java.lang.Object[0]);
            }
        }
    }
}
