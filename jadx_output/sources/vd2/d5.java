package vd2;

@j95.b
/* loaded from: classes3.dex */
public final class d5 extends i95.w implements ss5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f435705d = "FinderReplayFeatureService";

    public void Ai(r45.nw1 nw1Var, android.content.Intent intent, android.content.Context context, long j17, long j18, java.lang.String anchorUserName, java.lang.String nonceId, java.lang.String str) {
        r45.nw1 nw1Var2;
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        so2.p2 p2Var = so2.q2.f410546p;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        if (nw1Var == null) {
            nw1Var2 = new r45.nw1();
            nw1Var2.set(0, java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : 0L));
        } else {
            nw1Var2 = nw1Var;
        }
        finderObject.setLiveInfo(nw1Var2);
        finderObject.setObjectNonceId(nonceId);
        finderObject.setId(j17);
        finderObject.setUsername(anchorUserName);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
        finderObjectDesc.setDescription(str);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> linkedList2 = new java.util.LinkedList<>();
        finderObjectDesc.setMediaType(9);
        finderObjectDesc.setMedia(linkedList2);
        finderObject.setObjectDesc(finderObjectDesc);
        linkedList.add(new so2.q2(finderObject, 0));
        intent2.putExtra("KEY_PARAMS_KEY_VALUE", so2.p2.b(p2Var, linkedList, null, 0, 0, 14, null).toByteArray());
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        kotlin.jvm.internal.o.d(context2);
        c61.zb.U7(zbVar, context2, intent2, false, 4, null);
    }

    public boolean Bi(int i17, r45.nw1 nw1Var) {
        r45.i72 i72Var;
        r45.j72 j72Var = (nw1Var == null || (i72Var = (r45.i72) nw1Var.getCustom(44)) == null) ? null : (r45.j72) i72Var.getCustom(5);
        if (j72Var != null && j72Var.getInteger(5) == 0) {
            r45.gv gvVar = (r45.gv) zl2.r4.f473950a.S0(i17, nw1Var, ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Rj().z0(nw1Var.getLong(0))).f302834e;
            java.lang.String str = gvVar != null ? gvVar.f375537e : null;
            if (!(str == null || str.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public boolean Di(java.lang.String str, int i17, java.lang.String str2) {
        return i17 == 4 || i17 == 6 || bj(str2, ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(pm0.v.Z(str)));
    }

    public boolean Ni(r45.g92 shareObject) {
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        return Di(shareObject.getString(0), shareObject.getInteger(22), shareObject.getString(1));
    }

    public boolean Ri(r45.nw1 nw1Var) {
        if (nw1Var != null && nw1Var.getInteger(31) == 3) {
            if (cm2.a.i(cm2.a.f43328a, nw1Var, "replayAuditing", false, 2, null).length() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean Ui(r45.nw1 nw1Var) {
        if (nw1Var != null && nw1Var.getInteger(31) == 1) {
            if (!(cm2.a.i(cm2.a.f43328a, nw1Var, "replayReadyToPlay", false, 2, null).length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public void Vi(boolean z17, long j17, java.lang.String pageType, int i17, int i18) {
        kotlin.jvm.internal.o.g(pageType, "pageType");
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("object_id", pm0.v.u(j17));
            jSONObject.put("page_type", pageType);
            jSONObject.put("object_type", i17);
            jSONObject.put("page_sub_type", i18);
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_expose", jSONObject2);
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("object_id", pm0.v.u(j17));
        jSONObject3.put("page_type", pageType);
        jSONObject3.put("object_type", i17);
        jSONObject3.put("page_sub_type", i18);
        zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr2 = ml2.o3.f327773d;
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        ((ml2.j0) zbVar2).Wj("watch_live_record", jSONObject4);
    }

    public boolean Zi(java.lang.String str, android.view.View view, android.view.View view2, long j17) {
        r45.nw1 Gj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(j17);
        if (Gj != null) {
            return aj(str, Gj);
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        qs5.d dVar = qs5.d.f366426e;
        s40.w0.u9(w0Var, j17, false, null, null, 4, null, null, null, 224, null);
        boolean z17 = view2 instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget;
        java.lang.String str2 = this.f435705d;
        if (z17 && ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view2).getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i(str2, "routerToReplayUI liveEndTag visible!");
        } else {
            if (view instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) {
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view;
                if (finderLiveOnliveWidget.getVisibility() == 0) {
                    java.lang.String f131216x = finderLiveOnliveWidget.getF131216x();
                    com.tencent.mars.xlog.Log.i(str2, "routerToReplayUI liveTag visible,text:" + f131216x + '!');
                    if (com.tencent.mm.sdk.platformtools.t8.D0(f131216x, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_1)) || com.tencent.mm.sdk.platformtools.t8.D0(f131216x, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_0))) {
                        return true;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(str2, "routerToReplayUI all tag invisible!");
        }
        return false;
    }

    public boolean aj(java.lang.String str, r45.nw1 nw1Var) {
        if (nw1Var == null) {
            return false;
        }
        boolean bj6 = bj(str, nw1Var);
        boolean z17 = nw1Var.getInteger(2) == 2;
        boolean Bi = Bi(4, nw1Var);
        com.tencent.mars.xlog.Log.i(this.f435705d, "routerToReplayUI liveId:" + nw1Var.getLong(0) + " is replay:" + bj6 + ",liveEnd:" + z17 + ", isReplayTransition:" + Bi);
        return bj6 || (z17 && Bi);
    }

    public boolean bj(java.lang.String str, r45.nw1 nw1Var) {
        if (Ui(nw1Var)) {
            return true;
        }
        if (nw1Var != null && nw1Var.getInteger(31) == 4) {
            return true;
        }
        if (nw1Var != null && nw1Var.getInteger(31) == 2) {
            return true;
        }
        if (nw1Var != null && nw1Var.getInteger(31) == 6) {
            return true;
        }
        if (nw1Var != null && nw1Var.getInteger(31) == 5) {
            if (!(str == null || str.length() == 0)) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (kotlin.jvm.internal.o.b(str, xy2.c.e(context))) {
                    if (!(cm2.a.i(cm2.a.f43328a, nw1Var, "showReplay", false, 2, null).length() == 0)) {
                        return true;
                    }
                }
            }
        }
        return (nw1Var != null && nw1Var.getInteger(31) == 1) && pm0.v.z(nw1Var.getInteger(37), 524288);
    }

    public void wi(android.content.Intent intent, android.content.Context context, long j17, long j18, java.lang.String anchorUserName, java.lang.String nonceId, java.lang.String str, java.lang.String contextId, boolean z17) {
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        com.tencent.mars.xlog.Log.i(this.f435705d, "enterFinderLiveReplayUI objectId:" + j17 + ",liveId:" + j18 + ",anchorUserName:" + anchorUserName + ",nonceId:" + nonceId + ",desc:" + str + ",contextId:" + contextId + ",forceCheckTeenMode:" + z17);
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi() && z17) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        vd2.c5 c5Var = new vd2.c5(this, anchorUserName, contextId, intent, context, j17, nonceId, str);
        qs5.d dVar = qs5.d.f366426e;
        s40.w0.u9(w0Var, j18, true, null, c5Var, 4, null, null, null, 228, null);
    }
}
