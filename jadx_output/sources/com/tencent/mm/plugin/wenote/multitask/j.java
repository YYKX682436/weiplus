package com.tencent.mm.plugin.wenote.multitask;

/* loaded from: classes12.dex */
public final class j implements hh4.j {
    @Override // hh4.j
    public void k0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        o72.r2 F;
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        r45.sw4 sw4Var = new r45.sw4();
        try {
            sw4Var.parseFrom(multiTaskInfo.field_data);
            r45.w60 w60Var = new r45.w60();
            w60Var.set(2, java.lang.Boolean.TRUE);
            int integer = sw4Var.getInteger(0);
            java.lang.String string = sw4Var.getString(1);
            am.zl zlVar = null;
            iz4.r rVar = null;
            am.sn snVar = null;
            if (integer == 1) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    am.zl zlVar2 = new am.zl();
                    zlVar2.f8578a = jSONObject.getInt("type");
                    zlVar2.f8579b = jSONObject.getString("editorId");
                    zlVar2.field_localId = jSONObject.getLong("field_localId");
                    zlVar2.f8582e = jSONObject.getString("insertJsonData");
                    zlVar2.f8583f = jSONObject.getString("exportJsonData");
                    zlVar2.f8584g = jSONObject.getBoolean("isInsert");
                    java.lang.String string2 = jSONObject.getString("bundleData");
                    if (kotlin.jvm.internal.o.b(string2, "")) {
                        zlVar2.f8585h = null;
                    } else {
                        kotlin.jvm.internal.o.d(string2);
                        android.os.Bundle bundle = new android.os.Bundle();
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string2);
                            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                            kotlin.jvm.internal.o.f(keys, "keys(...)");
                            while (keys.hasNext()) {
                                java.lang.String next = keys.next();
                                kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String str = next;
                                bundle.putString(str, jSONObject2.getString(str));
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoteMultiTaskHelper", e17, "jsonToBundle", new java.lang.Object[0]);
                            bundle = null;
                        }
                        zlVar2.f8585h = bundle;
                    }
                    zlVar2.f8586i = jSONObject.getInt("itemType");
                    zlVar2.f8587j = jSONObject.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    zlVar2.f8588k = jSONObject.getInt("intdata");
                    zlVar2.f8589l = jSONObject.getBoolean("showShare");
                    zlVar2.field_favProto = new r45.bq0();
                    java.lang.String string3 = jSONObject.getString("field_favProto");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                        zlVar2.field_favProto.parseFrom(android.util.Base64.decode(string3, 0));
                    }
                    zlVar2.f8590m = new r45.dq0();
                    java.lang.String string4 = jSONObject.getString("reportInfo");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                        zlVar2.f8590m.parseFrom(android.util.Base64.decode(string4, 0));
                    }
                    zlVar2.f8581d = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    zlVar = zlVar2;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoteMultiTaskHelper", e18, "parse NotifyWNNoteOperationEvent", new java.lang.Object[0]);
                }
                if (zlVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NoteMultiTaskHelper", "NotifyWNNoteOperationEvent data is null");
                    return;
                }
                try {
                    zlVar.f8585h.putByteArray("key_multi_task_common_info", w60Var.toByteArray());
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebMultiTaskHelper", e19, "onTaskBarItemClicked", new java.lang.Object[0]);
                }
                if (zlVar.f8578a == 9 && (F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(zlVar.field_localId)) != null) {
                    zlVar.f8579b = F.field_xml;
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    r45.sp0 sp0Var = F.field_favProto.G;
                    kotlin.jvm.internal.o.f(sp0Var, "getNoteInfo(...)");
                    bundle2.putString("noteauthor", sp0Var.f385891d);
                    bundle2.putString("noteeditor", sp0Var.f385892e);
                    bundle2.putLong("edittime", F.field_updateTime);
                    zlVar.f8585h = bundle2;
                    zlVar.field_favProto = F.field_favProto;
                    zlVar.f8578a = 2;
                }
                com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
                notifyWNNoteOperationEvent.f54554g = zlVar;
                notifyWNNoteOperationEvent.e();
                return;
            }
            if (integer == 2) {
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(string);
                    am.sn snVar2 = new am.sn();
                    snVar2.f7904a = jSONObject3.getLong("msgId");
                    snVar2.f7909f = jSONObject3.getString("talker");
                    snVar2.f7905b = jSONObject3.getString("noteXmlStr");
                    snVar2.f7907d = jSONObject3.getBoolean("showShare");
                    snVar2.f7910g = jSONObject3.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    snVar2.f7906c = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    snVar = snVar2;
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoteMultiTaskHelper", e27, "parseOpenNoteFromSessionEventData", new java.lang.Object[0]);
                }
                if (snVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NoteMultiTaskHelper", "OpenNoteFromSessionEvent data is null");
                    return;
                }
                android.os.Bundle bundle3 = new android.os.Bundle();
                snVar.f7911h = bundle3;
                bundle3.putByteArray("key_multi_task_common_info", w60Var.toByteArray());
                com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
                openNoteFromSessionEvent.f54599g = snVar;
                openNoteFromSessionEvent.e();
                return;
            }
            if (integer != 3) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "click WNNoteBanner");
            try {
                iz4.r rVar2 = new iz4.r();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject(string);
                rVar2.f296139d = jSONObject4.getBoolean("topIsOpenFromSession");
                rVar2.f296140e = jSONObject4.getLong("topLocalId");
                rVar2.f296141f = jSONObject4.getLong("topMsgId");
                rVar2.f296142g = jSONObject4.getString("topMsgTalker");
                rVar2.f296143h = jSONObject4.getBoolean("isChatRoom");
                rVar2.f296144i = jSONObject4.getString("topTitle");
                rVar2.f296145m = jSONObject4.getString("topNoteXml");
                rVar2.f296146n = jSONObject4.getInt("topLastPosition");
                rVar2.f296147o = jSONObject4.getInt("topLastOffset");
                rVar2.f296142g = jSONObject4.getString("topMsgTalker");
                rVar = rVar2;
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoteMultiTaskHelper", e28, "parseWNNoteKeepTopItem", new java.lang.Object[0]);
            }
            if (rVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NoteMultiTaskHelper", "WNNoteKeepTopItem data is null");
                return;
            }
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putByteArray("key_multi_task_common_info", w60Var.toByteArray());
            if (rVar.f296139d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "isOpenFromSession: true");
                hz4.w wVar = new hz4.w();
                wVar.f286422p = cz4.f.x0(rVar);
                wVar.f286423q = 3;
                wVar.f286418i.f286426b = rVar.f296143h ? 3 : 2;
                ((hz4.f) hz4.f.wi()).f286407d = wVar;
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f372653d = 8;
                wVar.t(rVar.f296145m, java.lang.Long.valueOf(rVar.f296141f), rVar.f296142g, true, com.tencent.mm.sdk.platformtools.x2.f193071a, rVar.f296146n, rVar.f296147o, dq0Var, bundle4);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "isOpenFromSession: false");
            hz4.p pVar = new hz4.p();
            pVar.f286422p = cz4.f.x0(rVar);
            pVar.f286423q = 3;
            pVar.f286418i.f286426b = 1;
            ((hz4.f) hz4.f.wi()).f286407d = pVar;
            r45.dq0 dq0Var2 = new r45.dq0();
            dq0Var2.f372653d = 8;
            pVar.w(rVar.f296140e, com.tencent.mm.sdk.platformtools.x2.f193071a, rVar.f296145m, java.lang.Boolean.TRUE, rVar.f296146n, rVar.f296147o, dq0Var2, null, bundle4.getByteArray("key_multi_task_common_info"), false);
        } catch (java.lang.Exception e29) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteMultiTaskHelper", e29.getMessage());
        }
    }

    @Override // hh4.j
    public void p0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
    }
}
