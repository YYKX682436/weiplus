package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q8 extends com.tencent.mm.ui.component.UIComponent implements zy2.h6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.q8 q8Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18, int i19, int i27, java.lang.String str) {
        java.lang.Object obj;
        q8Var.getClass();
        if (baseFinderFeed.getFeedObject().getFeedObject().getAdFlag() == 0) {
            baseFinderFeed.getFeedObject().getFeedObject().setAdFlag(100000);
            android.app.Activity context = q8Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            sc2.r7.d7((sc2.r7) a17, baseFinderFeed, s0Var, null, false, null, 28, null);
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setWording(str);
        finderJumpInfo.setIcon_url("http:");
        finderJumpInfo.setBusiness_type(i27);
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        r45.wf6 wf6Var = new r45.wf6();
        wf6Var.set(1, java.lang.Integer.valueOf(i18));
        wf6Var.set(2, java.lang.Integer.valueOf(i19));
        style.add(wf6Var);
        xc2.k0 k0Var = (xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        long itemId = baseFinderFeed.getItemId();
        java.lang.String w17 = baseFinderFeed.w();
        k0Var.getClass();
        androidx.lifecycle.j0 W6 = k0Var.W6(itemId, i17, w17);
        java.lang.Object value = W6.getValue();
        java.util.HashSet hashSet = value instanceof java.util.HashSet ? (java.util.HashSet) value : null;
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
        }
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((xc2.t) obj).f453301c == i18) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        xc2.t tVar = (xc2.t) obj;
        if (tVar == null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(finderJumpInfo);
            hashSet.add(new xc2.t(i17, itemId, i18, linkedList, false, null, 48, null));
            W6.postValue(hashSet);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = tVar.f453302d;
        for (java.lang.Object obj2 : list) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj2;
            if (finderJumpInfo2.getBusiness_type() == finderJumpInfo.getBusiness_type() && r26.i0.q(finderJumpInfo2.getWording(), finderJumpInfo.getWording(), false, 2, null)) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            return;
        }
        ((java.util.LinkedList) list).add(finderJumpInfo);
        W6.postValue(hashSet);
    }

    public static final java.lang.String Q6(in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.itemView.findViewById(com.tencent.mm.R.id.e_k);
        if (!((finderVideoLayout != null ? finderVideoLayout.getVideoView() : null) instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy)) {
            return "档位选择";
        }
        cw2.da videoView = finderVideoLayout.getVideoView();
        kotlin.jvm.internal.o.e(videoView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
        return "目前播放档位: " + ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView).T.f223937h;
    }

    public final void P6(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, mn2.g4 g4Var, in5.s0 holder) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, false);
        long itemId = item.getItemId();
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.tencent.mm.plugin.finder.storage.FeedData.Companion.a(item).getMediaList());
        boolean z17 = mb4Var != null && mb4Var.getInteger(2) == 4;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject put = jSONObject.put("tag", "ClickMoreDebug");
        com.tencent.mm.protocal.protobuf.FinderContact contact = item.getFeedObject().getFeedObject().getContact();
        if (contact == null || (str = contact.getNickname()) == null) {
            str = "";
        }
        org.json.JSONObject put2 = put.put("nickname", str).put("feedId", pm0.v.u(item.getFeedObject().getId())).put("signedFeedId", item.getFeedObject().getId()).put("feedTime", com.tencent.mm.sdk.platformtools.t8.v(item.getFeedObject().getCreateTime() * 1)).put("isVideo", z17).put("file_format", g4Var != null ? g4Var.g() : null).put(dm.i4.COL_USERNAME, item.getFeedObject().field_username);
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str2 = item.getFeedObject().field_username;
        r45.xk bizInfo = item.getFeedObject().getBizInfo();
        org.json.JSONObject put3 = put2.put("isFollow", ya2.g.h(gVar, str2, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null)).put("mediaType", item.getFeedObject().getMediaType());
        java.lang.String debugMessage = item.getFeedObject().getFeedObject().getDebugMessage();
        if (debugMessage == null) {
            debugMessage = "";
        }
        org.json.JSONObject put4 = put3.put("debugMessage", debugMessage);
        r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
        put4.put("attr_func_flag", object_extend != null ? java.lang.Integer.valueOf(object_extend.getInteger(13)) : "").put("description", item.getFeedObject().getDescription());
        if (mb4Var != null) {
            org.json.JSONObject put5 = jSONObject.put("videoDuration", mb4Var.getInteger(3));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getFloat(4));
            sb6.append(':');
            sb6.append(mb4Var.getFloat(5));
            org.json.JSONObject put6 = put5.put("mediaWH", sb6.toString());
            float f17 = mb4Var.getFloat(5);
            float f18 = mb4Var.getFloat(4);
            if (1.0f >= f18) {
                f18 = 1.0f;
            }
            org.json.JSONObject put7 = put6.put("mediaRadio", java.lang.String.valueOf(f17 / f18));
            java.lang.String string = mb4Var.getString(0);
            if (string == null) {
                string = "";
            }
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            org.json.JSONObject put8 = put7.put("mediaId", com.tencent.mm.sdk.platformtools.w2.b(string.getBytes())).put("url", mb4Var.getString(0)).put("thumbUrl", mb4Var.getString(1)).put("thumbUrlToken", mb4Var.getString(19)).put("fullThumbUrl", mb4Var.getString(25)).put("fullThumbUrlToken", mb4Var.getString(26)).put("coverUrl", mb4Var.getString(16)).put("coverUrlToken", mb4Var.getString(20));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(mb4Var.getString(0));
            java.lang.String string2 = mb4Var.getString(18);
            if (string2 == null) {
                string2 = "";
            }
            sb7.append(string2);
            org.json.JSONObject put9 = put8.put("longUrl", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb8.append(string3 != null ? string3 : "");
            put9.put("longThumbUrl", sb8.toString());
        }
        java.lang.String b17 = r26.b0.b("content=" + pm0.b0.g(item.getFeedObject().getFeedObject()));
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderDebugUIC", "START####################################################START");
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderDebugUIC", "long click more button! " + jSONObject);
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderDebugUIC", "long click more button allInfo! ".concat(b17));
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderDebugUIC", "END  ####################################################  END");
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            k0Var.f211872n = new com.tencent.mm.plugin.finder.viewmodel.component.k8(z17);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.viewmodel.component.m8(context, jSONObject, item, mb4Var, this, holder, b17, itemId);
            k0Var.v();
        }
    }
}
