package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes15.dex */
public final class ka implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186319e;

    public ka(nw4.k kVar, nw4.y2 y2Var) {
        this.f186318d = kVar;
        this.f186319e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.pigeon.biz.BizImagePreviewActionReplyInfo replyInfo;
        com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo praiseInfo;
        com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo srcCommentInfo;
        com.tencent.pigeon.biz.BizImagePreviewActionIdentity identity;
        java.lang.String resp;
        java.lang.String action;
        java.util.List<? extends java.lang.Object> list = (java.util.List) obj;
        nw4.k kVar = this.f186318d;
        nw4.y2 y2Var = this.f186319e;
        if (list == null) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return;
        }
        try {
            com.tencent.pigeon.biz.BizImagePreviewActionResult fromList = com.tencent.pigeon.biz.BizImagePreviewActionResult.INSTANCE.fromList(list);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Long curIdentityType = fromList.getCurIdentityType();
            if (curIdentityType != null) {
                hashMap.put("curIdentityType", java.lang.Long.valueOf(curIdentityType.longValue()));
            }
            java.lang.String curIdentityName = fromList.getCurIdentityName();
            if (curIdentityName != null) {
                hashMap.put("curIdentityName", curIdentityName);
            }
            java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> actions = fromList.getActions();
            if (actions != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.tencent.pigeon.biz.BizImagePreviewAction bizImagePreviewAction : actions) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (bizImagePreviewAction != null && (action = bizImagePreviewAction.getAction()) != null) {
                        jSONObject.put("action", action);
                    }
                    if (bizImagePreviewAction != null && (resp = bizImagePreviewAction.getResp()) != null) {
                        jSONObject.put("resp", resp);
                    }
                    if (bizImagePreviewAction != null && (identity = bizImagePreviewAction.getIdentity()) != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("head_img", identity.getHeadImg());
                        jSONObject2.put("nickname", identity.getNickName());
                        jSONObject2.put("identity_type", identity.getIdentityType());
                        jSONObject2.put("identity_name", identity.getIdentityName());
                        jSONObject.put("identity", jSONObject2);
                    }
                    if (bizImagePreviewAction != null && (srcCommentInfo = bizImagePreviewAction.getSrcCommentInfo()) != null) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("type", srcCommentInfo.getType());
                        jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_CONTENT_ID, srcCommentInfo.getContentId());
                        jSONObject3.put("replyid", srcCommentInfo.getReplyId());
                        jSONObject.put("targetCmt", jSONObject3);
                    }
                    if (bizImagePreviewAction != null && (praiseInfo = bizImagePreviewAction.getPraiseInfo()) != null) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("praise_status", praiseInfo.getPraiseStatus());
                        jSONObject.put("praiseInfo", jSONObject4);
                    }
                    if (bizImagePreviewAction != null && (replyInfo = bizImagePreviewAction.getReplyInfo()) != null) {
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        jSONObject5.put("content", replyInfo.getContent());
                        jSONObject5.put("time", replyInfo.getTime());
                        jSONObject5.put("pictures", replyInfo.getReplyImgUrl());
                        jSONObject.put("replyInfo", jSONObject5);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("actions", jSONArray);
            }
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreviewAppMsgCommentImage", "parse preview ret info error: " + com.tencent.mm.sdk.platformtools.t8.H(e17, true));
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
    }
}
