package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gq {
    public gq(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.String str;
        r45.nw1 nw1Var;
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "bannerJumpImpl business_type:%d", java.lang.Integer.valueOf(jumpInfo.getBusiness_type()));
        int jumpinfo_type = jumpInfo.getJumpinfo_type();
        if (jumpinfo_type != 1) {
            java.lang.Object obj = "";
            if (jumpinfo_type == 2) {
                com.tencent.mm.protocal.protobuf.Html5Info html5_info = jumpInfo.getHtml5_info();
                if (html5_info == null || (str = html5_info.getUrl()) == null) {
                    str = "";
                }
                com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "jump half h5 url:%s", str);
                if (jumpInfo.getHtml5_info() == null || android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mars.xlog.Log.e("FinderLiveH5HalfBubble", "jumpToHalfScreenH5 html5_info is null or url is empty");
                    return;
                }
                com.tencent.mm.protocal.protobuf.Html5Info html5_info2 = jumpInfo.getHtml5_info();
                if (html5_info2 != null && html5_info2.getStyle() == 1) {
                    com.tencent.mm.protocal.protobuf.Html5Info html5_info3 = jumpInfo.getHtml5_info();
                    int height_percent = html5_info3 != null ? html5_info3.getHeight_percent() : 0;
                    com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "show HalfScreenWebView heightPercent:" + height_percent);
                    if (height_percent < df2.lt.Y || height_percent > df2.lt.Z) {
                        height_percent = 75;
                    }
                    float f17 = height_percent / 100;
                    com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "realScreenHeightPercent:" + f17);
                    boolean z17 = jumpInfo.getSupport_share() != 2;
                    com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "canShowMenu:" + z17);
                    i95.m c17 = i95.n0.c(zg0.u2.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zg0.u2 u2Var = (zg0.u2) c17;
                    gk2.e eVar = dk2.ef.I;
                    java.lang.String str3 = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null;
                    if (zl2.r4.f473950a.w1()) {
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        str3 = xy2.c.e(context2);
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject2.putOpt("finderId", str3);
                    gk2.e eVar2 = dk2.ef.I;
                    if (eVar2 != null && (nw1Var = ((mm2.e1) eVar2.a(mm2.e1.class)).f328988r) != null) {
                        obj = java.lang.Long.valueOf(nw1Var.getLong(0));
                    }
                    jSONObject2.putOpt("liveId", obj);
                    com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "getBannerHalfParam:%s", jSONObject2.toString());
                    java.lang.String jSONObject3 = jSONObject2.toString();
                    kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                    java.lang.Object K2 = zg0.u2.K2(u2Var, context, str, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(f17, 0.0f, jSONObject3, false, z17, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388586, null), 4, null);
                    com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.m1) K2;
                    m1Var.show();
                    m1Var.R(new com.tencent.mm.plugin.finder.live.plugin.eq());
                    ((hg5.d) K2).f281406o = com.tencent.mm.plugin.finder.live.plugin.fq.f112588d;
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "show FullScreenWebView");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("convertActivityFromTranslucent", true);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                }
            } else if (jumpinfo_type == 3) {
                com.tencent.mm.protocal.protobuf.NativeInfo native_info = jumpInfo.getNative_info();
                java.lang.Integer valueOf = native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null;
                com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = jumpInfo.getNative_info();
                if (native_info2 == null || (str2 = native_info2.getNecessary_params()) == null) {
                    str2 = "";
                }
                com.tencent.mars.xlog.Log.i("FinderLiveH5HalfBubble", "jump native necessary_params:%s", str2);
                try {
                    jSONObject = new org.json.JSONObject(str2);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveH5HalfBubble", e17, "", new java.lang.Object[0]);
                    jSONObject = null;
                }
                org.json.JSONObject jSONObject4 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
                com.tencent.mm.plugin.finder.live.util.v vVar = com.tencent.mm.plugin.finder.live.util.v.f115719a;
                if (valueOf != null && valueOf.intValue() == 1) {
                    vVar.a(context, jSONObject4);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    vVar.b(context, jSONObject4);
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
                    xc2.y2.f453343a.U(context, 0L, jSONObject4, 0);
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    vVar.c(context, jSONObject4);
                } else {
                    if (valueOf != null && valueOf.intValue() == 5) {
                        try {
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            jSONObject4.put("action", "openFinderMultiMoreLive");
                            jSONObject5.put("extInfo", jSONObject4);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            zy2.ta.d(ya2.e1.f460472a, context, jSONObject5.toString(), null, null, 12, null);
                            return;
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveH5HalfBubble", e18, "openFinderView", new java.lang.Object[0]);
                            return;
                        }
                    }
                    if (valueOf != null && valueOf.intValue() == 9) {
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
                        kotlin.jvm.internal.o.f(a17, "get(...)");
                        pl2.x xVar = (pl2.x) a17;
                        pl2.s sVar = xVar.f356684g;
                        if (sVar != null) {
                            sVar.i(false, null);
                        }
                        xVar.f356687m.c();
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveH5HalfBubble", "jump mini app not implement");
        }
        nk2.l.f338021a.b(nk2.a.f337957m);
    }
}
