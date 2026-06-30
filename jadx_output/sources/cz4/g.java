package cz4;

/* loaded from: classes12.dex */
public class g extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        o72.r2 F;
        if (ballInfo == null || ballInfo.G == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked, openNote ballInfo:%s", ballInfo);
        java.lang.String string = ballInfo.G.getString("eventData");
        int i17 = ballInfo.G.getInt("eventType");
        am.zl zlVar = null;
        iz4.r rVar = null;
        am.sn snVar = null;
        if (i17 != 1) {
            if (i17 == 2) {
                try {
                    cl0.g gVar = new cl0.g(string);
                    am.sn snVar2 = new am.sn();
                    snVar2.f7904a = gVar.getLong("msgId");
                    snVar2.f7909f = gVar.getString("talker");
                    snVar2.f7905b = gVar.getString("noteXmlStr");
                    snVar2.f7907d = gVar.getBoolean("showShare");
                    snVar2.f7910g = gVar.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    snVar2.f7906c = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    snVar = snVar2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e17, "parseOpenNoteFromSessionEventData", new java.lang.Object[0]);
                }
                if (snVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "OpenNoteFromSessionEvent data is null");
                    return;
                }
                if (qz4.d.a(snVar)) {
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(ballInfo);
                    com.tencent.mars.xlog.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked deleted msginfo");
                    return;
                } else {
                    com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
                    openNoteFromSessionEvent.f54599g = snVar;
                    openNoteFromSessionEvent.e();
                    return;
                }
            }
            if (i17 != 3) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NoteFloatBallHelper", "click WNNoteBanner");
            try {
                iz4.r rVar2 = new iz4.r();
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                rVar2.f296139d = jSONObject.getBoolean("topIsOpenFromSession");
                rVar2.f296140e = jSONObject.getLong("topLocalId");
                rVar2.f296141f = jSONObject.getLong("topMsgId");
                rVar2.f296142g = jSONObject.getString("topMsgTalker");
                rVar2.f296143h = jSONObject.getBoolean("isChatRoom");
                rVar2.f296144i = jSONObject.getString("topTitle");
                rVar2.f296145m = jSONObject.getString("topNoteXml");
                rVar2.f296146n = jSONObject.getInt("topLastPosition");
                rVar2.f296147o = jSONObject.getInt("topLastOffset");
                rVar2.f296142g = jSONObject.getString("topMsgTalker");
                rVar = rVar2;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e18, "parseWNNoteKeepTopItem", new java.lang.Object[0]);
            }
            if (rVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "WNNoteKeepTopItem data is null");
                return;
            } else {
                cz4.f.w0(rVar, true);
                return;
            }
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string);
            am.zl zlVar2 = new am.zl();
            zlVar2.f8578a = jSONObject2.getInt("type");
            zlVar2.f8579b = jSONObject2.getString("editorId");
            zlVar2.field_localId = jSONObject2.getLong("field_localId");
            zlVar2.f8582e = jSONObject2.getString("insertJsonData");
            zlVar2.f8583f = jSONObject2.getString("exportJsonData");
            zlVar2.f8584g = jSONObject2.getBoolean("isInsert");
            java.lang.String string2 = jSONObject2.getString("bundleData");
            if (string2.equals("")) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("openFormFloatBall", true);
                zlVar2.f8585h = bundle;
            } else {
                zlVar2.f8585h = cz4.f.v0(string2);
            }
            zlVar2.f8586i = jSONObject2.getInt("itemType");
            zlVar2.f8587j = jSONObject2.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            zlVar2.f8588k = jSONObject2.getInt("intdata");
            zlVar2.f8589l = jSONObject2.getBoolean("showShare");
            zlVar2.field_favProto = new r45.bq0();
            java.lang.String string3 = jSONObject2.getString("field_favProto");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                zlVar2.field_favProto.parseFrom(android.util.Base64.decode(string3, 0));
            }
            zlVar2.f8590m = new r45.dq0();
            java.lang.String string4 = jSONObject2.getString("reportInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                zlVar2.f8590m.parseFrom(android.util.Base64.decode(string4, 0));
            }
            zlVar2.f8581d = com.tencent.mm.sdk.platformtools.x2.f193071a;
            zlVar = zlVar2;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e19, "parse NotifyWNNoteOperationEvent", new java.lang.Object[0]);
        }
        if (zlVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "NotifyWNNoteOperationEvent data is null");
            return;
        }
        if (zlVar.f8578a == 9 && (F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(zlVar.field_localId)) != null) {
            zlVar.f8579b = F.field_xml;
            android.os.Bundle bundle2 = new android.os.Bundle();
            r45.sp0 sp0Var = F.field_favProto.G;
            if (sp0Var != null) {
                bundle2.putString("noteauthor", sp0Var.f385891d);
                bundle2.putString("noteeditor", sp0Var.f385892e);
            }
            bundle2.putLong("edittime", F.field_updateTime);
            zlVar.f8585h = bundle2;
            zlVar.field_favProto = F.field_favProto;
            zlVar.f8578a = 2;
        }
        if (qz4.d.b(zlVar)) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(ballInfo);
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked deleted snsInfo");
            return;
        }
        o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(zlVar.field_localId);
        long j17 = zlVar.field_localId;
        if (j17 != -1 && F2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.NoteFloatBallHelper", "handleBallInfoClicked deleted favItemInfo %s", java.lang.Long.valueOf(j17));
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h_s, 0).show();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(ballInfo);
        } else {
            if (j17 == -1) {
                zlVar.f8588k = 4;
            }
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
            notifyWNNoteOperationEvent.f54554g = zlVar;
            notifyWNNoteOperationEvent.e();
        }
    }
}
