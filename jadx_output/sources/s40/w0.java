package s40;

/* loaded from: classes3.dex */
public interface w0 extends i95.m {
    static void Fa(s40.w0 w0Var, long j17, long j18, java.lang.String anchorUsername, java.lang.String str, com.tencent.mm.protobuf.g gVar, java.util.LinkedList stockIds, java.lang.String str2, android.content.Context context, boolean z17, yz5.q qVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runCgiFinderLiveReceiveCoupon");
        }
        java.lang.String noticeId = (i17 & 64) != 0 ? "" : str2;
        boolean z18 = (i17 & 256) != 0 ? true : z17;
        yz5.q qVar2 = (i17 & 512) != 0 ? null : qVar;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(stockIds, "stockIds");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        kotlin.jvm.internal.o.g(context, "context");
        new db2.d2(j17, j18, anchorUsername, str, gVar, stockIds, new com.tencent.mm.feature.finder.live.s4(qVar2, context, z18), noticeId).l().f((com.tencent.mm.ui.MMActivity) context);
    }

    static /* synthetic */ void Gb(s40.w0 w0Var, android.view.View view, boolean z17, int i17, r45.g92 g92Var, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFinderLiveTagNewText");
        }
        if ((i18 & 8) != 0) {
            g92Var = null;
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Gk(view, z17, i17, g92Var);
    }

    static /* synthetic */ void J9(s40.w0 w0Var, android.content.Context context, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFinderLive");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).hj(context, str, i17);
    }

    static /* synthetic */ void O1(s40.w0 w0Var, android.view.View view, qs5.n nVar, boolean z17, r45.g92 g92Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFinderLiveTagText");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Hk(view, nVar, z17, g92Var);
    }

    static /* synthetic */ void S2(s40.w0 w0Var, android.widget.ImageView imageView, java.lang.String str, float f17, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillTailTagIcon");
        }
        if ((i17 & 4) != 0) {
            f17 = 1.0f;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Aj(imageView, str, f17, lVar);
    }

    static com.tencent.mm.modelbase.i U9(s40.w0 w0Var, long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.tencent.mm.protobuf.g gVar, long j18, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, r45.qt2 qt2Var, int i19, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
        }
        boolean z27 = (i27 & 32) != 0 ? false : z17;
        com.tencent.mm.protobuf.g gVar2 = (i27 & 64) != 0 ? null : gVar;
        long j19 = (i27 & 128) != 0 ? 0L : j18;
        java.lang.String username = (i27 & 256) != 0 ? "" : str2;
        boolean z28 = (i27 & 512) != 0 ? true : z18;
        boolean z29 = (i27 & 1024) != 0 ? false : z19;
        java.lang.String encryptedObjectId = (i27 & 2048) != 0 ? "" : str3;
        int i28 = (i27 & 8192) != 0 ? 6 : i19;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return c61.yb.W3((c61.yb) c17, j17, str, i17, i18, feedUsername, z27, gVar2, null, j19, username, z28, z29, encryptedObjectId, qt2Var, i28, null, 32768, null);
    }

    static void X4(s40.w0 w0Var, java.lang.String source, kotlinx.coroutines.y0 scope, android.widget.TextView text, java.util.List list, java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27, int i17, int i18, yz5.a aVar, java.lang.Float f17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertImageSpanToText");
        }
        boolean z28 = (i19 & 256) != 0 ? true : z27;
        int b17 = (i19 & 512) != 0 ? i65.a.b(text.getContext(), 16) : i17;
        int b18 = (i19 & 1024) != 0 ? i65.a.b(text.getContext(), 4) : i18;
        yz5.a aVar2 = (i19 & 2048) != 0 ? null : aVar;
        java.lang.Float valueOf = (i19 & 4096) != 0 ? java.lang.Float.valueOf(1.0f) : f17;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(str, "str");
        st2.g3.f412326a.t(source, scope, text, list, str, z17, z18, z19, z28, b17, b18, valueOf, aVar2);
    }

    static void ba(s40.w0 w0Var, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, android.content.Intent intent, int i17, java.lang.Object obj) {
        java.lang.String str;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpLongFeed");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            intent = null;
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_CACHE_OBJECT_ID", finderObject != null ? finderObject.getId() : 0L);
        if (finderObject == null || (str = finderObject.getObjectNonceId()) == null) {
            str = "";
        }
        intent.putExtra("KEY_CACHE_OBJECT_NONCE_ID", str);
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("enter_page_type", "live_finish");
            intent.putExtra("key_extra_info", jSONObject.toString());
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class));
        i0Var.getClass();
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
            i0Var.xl(context, intent);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.tencent.mm.plugin.finder.assist.d0 d0Var = new com.tencent.mm.plugin.finder.assist.d0(i0Var, context, intent);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 34359738368L, null, d0Var, 3);
    }

    static void d2(s40.w0 w0Var, long j17, byte[] bArr, long j18, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, r45.qt2 qt2Var, int i19, r45.jc1 jc1Var, java.lang.String str4, java.lang.String str5, int i27, java.lang.String str6, r45.o72 o72Var, long j19, int i28, java.lang.String str7, com.tencent.mm.protobuf.g gVar, int i29, java.lang.String str8, yz5.l lVar, int i37, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinLiveRequest");
        }
        byte[] bArr2 = (i37 & 2) != 0 ? null : bArr;
        long j27 = (i37 & 4) != 0 ? 0L : j18;
        int i38 = (i37 & 8) != 0 ? 2 : i17;
        java.lang.String str9 = (i37 & 16) != 0 ? "" : str;
        java.lang.String str10 = (i37 & 32) != 0 ? "" : str2;
        java.lang.String shareUserName = (i37 & 64) != 0 ? "" : str3;
        int i39 = (i37 & 128) != 0 ? 0 : i18;
        r45.qt2 qt2Var2 = (i37 & 256) != 0 ? null : qt2Var;
        int i47 = (i37 & 512) != 0 ? 0 : i19;
        r45.jc1 jc1Var2 = (i37 & 1024) != 0 ? null : jc1Var;
        java.lang.String str11 = (i37 & 2048) != 0 ? null : str4;
        java.lang.String str12 = (i37 & 4096) != 0 ? null : str5;
        int i48 = (i37 & 8192) != 0 ? 0 : i27;
        java.lang.String str13 = (i37 & 16384) != 0 ? null : str6;
        r45.o72 o72Var2 = (32768 & i37) != 0 ? null : o72Var;
        long j28 = (65536 & i37) != 0 ? 0L : j19;
        int i49 = (131072 & i37) != 0 ? 0 : i28;
        java.lang.String sourceUrl = (262144 & i37) != 0 ? "" : str7;
        com.tencent.mm.protobuf.g gVar2 = (524288 & i37) != 0 ? null : gVar;
        int i57 = (1048576 & i37) != 0 ? 0 : i29;
        java.lang.String legacyCommentScene = (2097152 & i37) != 0 ? "" : str8;
        yz5.l lVar2 = (i37 & 4194304) == 0 ? lVar : null;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(shareUserName, "shareUserName");
        kotlin.jvm.internal.o.g(sourceUrl, "sourceUrl");
        kotlin.jvm.internal.o.g(legacyCommentScene, "legacyCommentScene");
        java.lang.String str14 = legacyCommentScene;
        ek2.e0 e0Var = new ek2.e0(j17, bArr2, xy2.c.f(qt2Var2), j27, i38, str9, null, str10, shareUserName, i39, qt2Var2, i47, jc1Var2, str11, str12, i48, str13, o72Var2, j28, i49, sourceUrl, gVar2, null, false, 0, 29360128, null);
        r45.gc1 gc1Var = e0Var.f253439w;
        r45.kv0 kv0Var = (r45.kv0) gc1Var.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i57));
        }
        if (str14.length() > 0) {
            if (((r45.o72) gc1Var.getCustom(19)) == null) {
                gc1Var.set(19, new r45.o72());
            }
            r45.o72 o72Var3 = (r45.o72) gc1Var.getCustom(19);
            if (o72Var3 != null) {
                o72Var3.set(19, str14);
            }
        }
        e0Var.l().K(new com.tencent.mm.feature.finder.live.y3(lVar2));
    }

    static void g6(s40.w0 w0Var, android.view.View view, qs5.n cardStatus, boolean z17, r45.g92 g92Var, int i17, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.Long j17;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFinderLiveTagNewText");
        }
        if ((i17 & 8) != 0) {
            g92Var = null;
        }
        com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) w0Var;
        v4Var.getClass();
        kotlin.jvm.internal.o.g(cardStatus, "cardStatus");
        jz5.l Ij = v4Var.Ij((g92Var == null || (string2 = g92Var.getString(0)) == null || (j17 = r26.h0.j(string2)) == null) ? 0L : j17.longValue());
        java.lang.Integer num = Ij != null ? (java.lang.Integer) Ij.f302833d : null;
        int ordinal = cardStatus.ordinal();
        if (ordinal == 0) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9p);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    string = pm0.v.z(g92Var != null ? g92Var.getInteger(38) : 0, 1048576) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egz) : pm0.v.z(g92Var != null ? g92Var.getInteger(38) : 0, 2097152) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lvm) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_4);
                } else if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new jz5.j();
                    }
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491708mm2);
                }
            }
            string = pm0.v.z(num != null ? num.intValue() : 0, 4) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.mio) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcj);
        } else {
            string = pm0.v.z(num != null ? num.intValue() : 0, 2) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.mna) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_1);
        }
        kotlin.jvm.internal.o.d(string);
        if (view instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) {
            ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view).setText(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    static /* synthetic */ void u9(s40.w0 w0Var, long j17, boolean z17, im5.b bVar, s40.t0 t0Var, int i17, java.lang.String str, r45.s74 s74Var, r45.m71 m71Var, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveInfo");
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Xj(j17, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? null : bVar, t0Var, (i18 & 16) != 0 ? 0 : i17, (i18 & 32) != 0 ? "" : str, (i18 & 64) != 0 ? null : s74Var, (i18 & 128) != 0 ? null : m71Var);
    }

    static void z5(s40.w0 w0Var, android.content.Context context, r45.m70 ticketInfo, r45.qt2 qt2Var, java.lang.String str, java.lang.String enterScene, int i17, java.lang.Object obj) {
        android.content.Context context2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToGetConcertTicket");
        }
        if ((i17 & 4) != 0) {
            qt2Var = null;
        }
        if ((i17 & 8) != 0) {
            str = null;
        }
        if ((i17 & 16) != 0) {
            enterScene = "";
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ticketInfo, "ticketInfo");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        if ((context instanceof android.app.Activity) || (context2 = ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) == null) {
            context2 = context;
        }
        if (qt2Var == null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        }
        java.lang.String valueOf = java.lang.String.valueOf(qt2Var.getInteger(5));
        java.lang.String string = qt2Var.getString(1);
        java.lang.String str2 = string != null ? string : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "jumpToTicket commentScene: " + valueOf + ", contextId: " + str2);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context2, com.tencent.mm.plugin.finder.feed.ui.FinderLiveConcertUI.class);
        intent.putExtra("concert_ticket_info_enter_scene", enterScene);
        intent.putExtra("concert_ticket_info_data", ticketInfo.toByteArray());
        intent.putExtra("concert_ticket_info_comment_scene", valueOf);
        intent.putExtra("concert_ticket_info_context_id", str2);
        intent.putExtra("concert_ticket_info_anchor_name", str);
        intent.putExtra("concert_ticket_info_enter_scene", enterScene);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        android.content.Context context3 = context2;
        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "jumpToGetConcertTicket", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/ConcertTicketInfo;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context3, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "jumpToGetConcertTicket", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/ConcertTicketInfo;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
