package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class m8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f135143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f135145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q8 f135146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135147i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f135149n;

    public m8(android.content.Context context, org.json.JSONObject jSONObject, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.mb4 mb4Var, com.tencent.mm.plugin.finder.viewmodel.component.q8 q8Var, in5.s0 s0Var, java.lang.String str, long j17) {
        this.f135142d = context;
        this.f135143e = jSONObject;
        this.f135144f = baseFinderFeed;
        this.f135145g = mb4Var;
        this.f135146h = q8Var;
        this.f135147i = s0Var;
        this.f135148m = str;
        this.f135149n = j17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0024. Please report as an issue. */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        r45.mb4 mb4Var = this.f135145g;
        android.content.Context context = this.f135142d;
        com.tencent.mm.plugin.finder.viewmodel.component.q8 q8Var = this.f135146h;
        in5.s0 holder = this.f135147i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f135144f;
        lu2.j jVar = lu2.j.f321376a;
        switch (itemId) {
            case 1:
                android.content.Context context2 = this.f135142d;
                java.lang.String jSONObject = this.f135143e.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                lu2.j.b(jVar, context2, jSONObject, null, 4, null);
                return;
            case 2:
                java.lang.String str = this.f135148m;
                com.tencent.mm.sdk.platformtools.b0.e(str);
                dp.a.makeText(holder.f293121e, "debug info " + str, 1).show();
                return;
            case 3:
                android.content.Context context3 = this.f135142d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("后台配置:\n");
                r45.b21 enhanceTriggerConfig = feed.getFeedObject().getEnhanceTriggerConfig();
                sb6.append(enhanceTriggerConfig != null ? enhanceTriggerConfig.toJSON() : null);
                lu2.j.b(jVar, context3, sb6.toString(), null, 4, null);
                return;
            case 4:
                if (mb4Var != null) {
                    android.content.Context context4 = this.f135142d;
                    mn2.g4 c17 = ds2.h.f242866a.c(this.f135149n, mb4Var, false);
                    lu2.j.b(jVar, context4, "path:" + c17.getPath() + " \nsize:" + com.tencent.mm.sdk.platformtools.t8.f0(com.tencent.mm.vfs.w6.k(c17.getPath())) + "\nmediaId:" + c17.f330002e.getString(9) + "\nurl=" + mb4Var.getString(0) + " \n" + ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getSimpleMp4InfoVFS(c17.getPath()) + " \nisH265:" + ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).isH265VideoVFS(c17.getPath()), null, 4, null);
                    return;
                }
                return;
            case 5:
                if (mb4Var != null) {
                    mn2.g4 c18 = ds2.h.f242866a.c(feed.getItemId(), mb4Var, false);
                    java.lang.String str2 = "path:" + c18.getPath() + " \nsize:" + com.tencent.mm.sdk.platformtools.t8.f0(com.tencent.mm.vfs.w6.k(c18.getPath())) + "\nmediaId:" + c18.f330002e.getString(9) + "\nurl=" + mb4Var.getString(0);
                    android.content.Intent intent = new android.content.Intent();
                    com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = new com.tencent.mm.opensdk.modelmsg.WXFileObject();
                    wXFileObject.setFilePath(c18.getPath());
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
                    wXMediaMessage.mediaObject = wXFileObject;
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c18.getPath());
                    java.lang.String str3 = a17.f213279f;
                    if (str3 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (!a17.f213279f.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    java.lang.String str4 = a17.f213279f;
                    int lastIndexOf = str4.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str4 = str4.substring(lastIndexOf + 1);
                    }
                    wXMediaMessage.title = str4;
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                    long j17 = 0;
                    if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                        j17 = m17.f213233c;
                    }
                    wXMediaMessage.description = com.tencent.mm.sdk.platformtools.t8.f0(j17);
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("Retr_Msg_Type", 2);
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                    j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.SelectConversationUI", intent, 1004, new com.tencent.mm.plugin.finder.viewmodel.component.l8(wXMediaMessage, str2));
                    return;
                }
                return;
            case 6:
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("friendLikeCount=" + feed.getFeedObject().getFeedObject().getFriendLikeCount() + " incFriendLikeCount=" + feed.getFeedObject().getFeedObject().getIncFriendLikeCount() + '\n');
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = feed.getFeedObject().getFeedObject().getLikeList();
                kotlin.jvm.internal.o.f(likeList, "getLikeList(...)");
                for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : likeList) {
                    sb7.append(finderCommentInfo.getNickname());
                    sb7.append("=");
                    sb7.append(com.tencent.mm.sdk.platformtools.t8.v(finderCommentInfo.getCreatetime()));
                    sb7.append("\n");
                }
                android.content.Context context5 = this.f135142d;
                java.lang.String sb8 = sb7.toString();
                kotlin.jvm.internal.o.f(sb8, "toString(...)");
                lu2.j.b(jVar, context5, sb8, null, 4, null);
                return;
            case 7:
            default:
                return;
            case 8:
                if (mb4Var != null) {
                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
                    q8Var.getClass();
                    kotlin.jvm.internal.o.g(context, "context");
                    kotlin.jvm.internal.o.g(feedObject, "feedObject");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.LinkedList<r45.vf2> list = mb4Var.getList(44);
                    kotlin.jvm.internal.o.f(list, "getHdr_spec(...)");
                    for (r45.vf2 vf2Var : list) {
                        java.lang.String string = vf2Var.getString(0);
                        if (string == null) {
                            string = "unknown-hdr";
                        }
                        linkedList.add(string);
                        linkedList2.add(yr2.l.b(vf2Var));
                    }
                    java.util.LinkedList list2 = mb4Var.getList(15);
                    kotlin.jvm.internal.o.f(list2, "getSpec(...)");
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        java.lang.String str5 = "unknown-sdr";
                        if (it.hasNext()) {
                            r45.vf2 vf2Var2 = (r45.vf2) it.next();
                            java.lang.String string2 = vf2Var2.getString(0);
                            if (string2 != null) {
                                str5 = string2;
                            }
                            linkedList.add(str5);
                            linkedList2.add(yr2.l.b(vf2Var2));
                        } else {
                            java.util.LinkedList<r45.jb1> list3 = mb4Var.getList(43);
                            kotlin.jvm.internal.o.f(list3, "getHls_spec(...)");
                            for (r45.jb1 jb1Var : list3) {
                                java.lang.String string3 = jb1Var.getString(0);
                                if (string3 == null) {
                                    string3 = "unknown-sdr";
                                }
                                linkedList.add(string3);
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Spec[");
                                sb9.append(jb1Var.getString(0));
                                sb9.append(' ');
                                sb9.append(kotlin.jvm.internal.o.b(jb1Var.getString(3), "h266") ? "6" : kotlin.jvm.internal.o.b(jb1Var.getString(3), "h264") ? "4" : "5");
                                sb9.append("  ");
                                sb9.append(com.tencent.mm.sdk.platformtools.t8.f0(jb1Var.getInteger(1)));
                                sb9.append(' ');
                                sb9.append(jb1Var.getInteger(2));
                                sb9.append("  ");
                                sb9.append(jb1Var.getInteger(13));
                                sb9.append(']');
                                linkedList2.add(sb9.toString());
                            }
                            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                            h0Var.f310123d = lu2.j.c(jVar, context, linkedList2, com.tencent.mm.plugin.finder.viewmodel.component.q8.Q6(holder), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.p8(linkedList, holder, h0Var), 24, null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderDebugUIC", "handleSelectSpec :" + hc2.o0.n(feedObject, true));
                        }
                    }
                }
                return;
            case 9:
                q8Var.getClass();
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.itemView.findViewById(com.tencent.mm.R.id.e_k);
                if (finderVideoLayout != null && (finderVideoLayout.getVideoView() instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy)) {
                    cw2.da videoView = finderVideoLayout.getVideoView();
                    kotlin.jvm.internal.o.e(videoView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder("position:");
                    cw2.p6 p6Var = ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView).T;
                    sb11.append(p6Var.f223931b);
                    sb10.append(sb11.toString());
                    sb10.append("\n");
                    sb10.append("decodeType:" + p6Var.f223932c);
                    sb10.append("\n");
                    sb10.append("preloadType:" + p6Var.f223933d);
                    sb10.append("\n");
                    sb10.append("firstFrameTime:" + p6Var.f223934e);
                    sb10.append("\n");
                    sb10.append("viewType:" + p6Var.f223936g);
                    sb10.append("\n");
                    sb10.append("specType:" + p6Var.f223937h);
                    sb10.append("\n");
                    jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464701r.get(p6Var.f223930a);
                    sb10.append("preloadMaxBitRate:" + (oVar != null ? (int) ((java.lang.Number) oVar.f302843f).longValue() : 0));
                    sb10.append("\n");
                    sb10.append("videoBitRate:" + p6Var.f223938i);
                    sb10.append("\n");
                    ((c61.l7) i95.n0.c(c61.l7.class)).Uj().getClass();
                    long j18 = com.tencent.mm.sdk.platformtools.j8.f192789t;
                    long e17 = ((c61.l7) i95.n0.c(c61.l7.class)).Uj().e();
                    long j19 = ((c61.l7) i95.n0.c(c61.l7.class)).Uj().f313118d;
                    long j27 = ((c61.l7) i95.n0.c(c61.l7.class)).Uj().f313118d;
                    sb10.append("global rx:" + j18);
                    sb10.append("\n");
                    sb10.append("cdn    rx:" + e17 + " gap:" + (j18 - e17));
                    sb10.append("\n");
                    sb10.append("finder rx:" + j19 + " gap:" + (e17 - j19));
                    sb10.append("\n");
                    sb10.append("report rx:" + j27 + " gap:" + (j19 - j27));
                    android.app.Activity context6 = q8Var.getContext();
                    java.lang.String sb12 = sb10.toString();
                    kotlin.jvm.internal.o.f(sb12, "toString(...)");
                    lu2.j.b(jVar, context6, sb12, null, 4, null);
                }
                return;
            case 10:
                q8Var.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(feed, "feed");
                kotlin.jvm.internal.o.g(holder, "holder");
                gs2.c cVar = gs2.c.f275072a;
                java.util.List list4 = gs2.d.f275077a;
                int d17 = kz5.b1.d(kz5.d0.q(list4, 10));
                if (d17 < 16) {
                    d17 = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                for (java.lang.Object obj : list4) {
                    linkedHashMap.put(((gs2.b) obj).f275068a, obj);
                }
                java.util.List S0 = kz5.n0.S0(linkedHashMap.keySet());
                lu2.j.c(jVar, context, S0, "组件优先级", null, null, new com.tencent.mm.plugin.finder.viewmodel.component.o8(linkedHashMap, S0, context, q8Var, holder, feed), 24, null);
                return;
            case 11:
                q8Var.getClass();
                com.tencent.mm.plugin.finder.viewmodel.component.n8 n8Var = new com.tencent.mm.plugin.finder.viewmodel.component.n8(context, holder);
                kotlin.jvm.internal.o.g(context, "context");
                android.widget.EditText editText = new android.widget.EditText(context);
                editText.setGravity(3);
                editText.setTextSize(1, 14.0f);
                editText.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                editText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478714f5));
                editText.setTypeface(android.graphics.Typeface.MONOSPACE);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
                editText.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                db5.e1.r(context, "视频号测试", editText, "确定", "取消", new lu2.g(n8Var, editText), lu2.f.f321371d);
                return;
            case 12:
                lu2.j.b(jVar, this.f135142d, bd2.b.f19244a.i(this.f135142d, this.f135144f, 0L, 58), null, 4, null);
                return;
        }
    }
}
