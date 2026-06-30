package eq1;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.h f255812a = new eq1.h();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f255813b = new kk.l(50);

    /* renamed from: c, reason: collision with root package name */
    public static final kk.j f255814c = new kk.l(50);

    /* renamed from: d, reason: collision with root package name */
    public static final int f255815d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f255816e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f255817f = 3;

    public final boolean a(r45.nw1 nw1Var) {
        if (nw1Var == null) {
            return false;
        }
        return nw1Var.getInteger(31) == 1 || nw1Var.getInteger(31) == 4 || nw1Var.getInteger(31) == 2 || nw1Var.getInteger(31) == 6 || nw1Var.getInteger(31) == 5;
    }

    public final boolean b(java.lang.String msgContent, int i17) {
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        ot0.q0 e17 = e(msgContent, i17);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(e17.f348740f);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(e17.f348741g);
        boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(e17.f348750s);
        com.tencent.mars.xlog.Log.i("BizChatUtil", "nonceIdOk = " + z17 + ", exportIdOk = " + z18 + ", coverOk = " + z19);
        return z17 && z18 && z19;
    }

    public final void c(java.lang.String str, java.lang.String str2, yz5.l lVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "exportId = " + str2 + ", nonceId = " + str);
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        if (((com.tencent.mm.sdk.platformtools.r2) f255814c).k(str2)) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "get finderObject in cache");
            if (lVar != null) {
                lVar.invoke(d(str2, str));
                return;
            }
            return;
        }
        m40.h0 h0Var = (m40.h0) i95.n0.c(m40.h0.class);
        kotlin.jvm.internal.o.d(str2);
        kotlin.jvm.internal.o.d(h0Var);
        m40.h0.ci(h0Var, 0L, str, 26, 2, "", false, null, null, 0L, null, false, false, str2, null, 0, null, 53216, null).l().K(new eq1.d(str2, lVar));
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject d(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "exportId = " + str + ", nonceId = " + str2);
            return null;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("test_biz_finder_live");
        boolean i17 = M.i("clear", false);
        java.lang.Object obj = f255814c;
        if (i17) {
            ((kk.l) f255813b).clear();
            ((kk.l) obj).clear();
            M.G("clear", false);
            com.tencent.mars.xlog.Log.i("BizChatUtil", "clear bizFinderObjectCache");
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((com.tencent.mm.sdk.platformtools.r2) obj).get(str);
        if (finderObject == null) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "finder object get from cgi");
            c(str2, str, null);
        }
        return finderObject;
    }

    public final ot0.q0 e(java.lang.String msgContent, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        byte[] bytes = msgContent.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.Object obj = f255813b;
        if (((com.tencent.mm.sdk.platformtools.r2) obj).k(g17)) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "get liveXmlObject from cache");
            java.lang.Object obj2 = ((com.tencent.mm.sdk.platformtools.r2) obj).get(g17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            return (ot0.q0) obj2;
        }
        java.lang.String tagPrefix = ".msg.appmsg.mmreader.category.item" + (i17 == 0 ? "" : java.lang.String.valueOf(i17)) + ".finder_live";
        com.tencent.mars.xlog.Log.i("BizChatUtil", "get liveXmlObject from parse, prefix = " + tagPrefix);
        kotlin.jvm.internal.o.g(tagPrefix, "tagPrefix");
        java.util.Map x17 = ot0.q.x(msgContent);
        ot0.q0 q0Var = new ot0.q0();
        try {
            kotlin.jvm.internal.o.d(x17);
            if (!x17.isEmpty()) {
                java.lang.String str2 = (java.lang.String) x17.get(tagPrefix.concat(".category"));
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                q0Var.f348738d = str2;
                java.lang.String str3 = (java.lang.String) x17.get(tagPrefix.concat(".finder_username"));
                if (str3 == null) {
                    str3 = "";
                }
                q0Var.f348739e = str3;
                java.lang.String str4 = (java.lang.String) x17.get(tagPrefix.concat(".finder_nonce_id"));
                if (str4 == null) {
                    str4 = "";
                }
                q0Var.f348740f = str4;
                java.lang.String str5 = (java.lang.String) x17.get(tagPrefix.concat(".export_id"));
                if (str5 == null) {
                    str5 = "";
                }
                q0Var.f348741g = str5;
                java.lang.String str6 = (java.lang.String) x17.get(tagPrefix.concat(".nickname"));
                if (str6 == null) {
                    str6 = "";
                }
                q0Var.f348742h = str6;
                java.lang.String str7 = (java.lang.String) x17.get(tagPrefix.concat(".head_url"));
                if (str7 == null) {
                    str7 = "";
                }
                q0Var.f348743i = str7;
                java.lang.String str8 = (java.lang.String) x17.get(tagPrefix.concat(".desc"));
                if (str8 == null) {
                    str8 = "";
                }
                q0Var.f348744m = str8;
                q0Var.f348745n = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".live_status")), 0);
                java.lang.String str9 = (java.lang.String) x17.get(tagPrefix.concat(".live_source_type_str"));
                if (str9 == null) {
                    str9 = "";
                }
                q0Var.f348746o = str9;
                q0Var.f348747p = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".ext_flag")), 0);
                java.lang.String str10 = (java.lang.String) x17.get(tagPrefix.concat(".auth_icon_url"));
                if (str10 == null) {
                    str10 = "";
                }
                q0Var.f348748q = str10;
                java.lang.String str11 = (java.lang.String) x17.get(tagPrefix.concat(".auth_icon_type_str"));
                if (str11 == null) {
                    str11 = "";
                }
                q0Var.f348749r = str11;
                java.lang.String str12 = (java.lang.String) x17.get(tagPrefix.concat(".media.cover_url"));
                q0Var.f348750s = str12 == null ? "" : str12;
                q0Var.f348751t = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".media.height")), 0);
                q0Var.f348752u = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".media.width")), 0);
            }
            str = "BizChatUtil";
        } catch (java.lang.Exception e17) {
            str = "BizChatUtil";
            com.tencent.mars.xlog.Log.e(str, "parse error! %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i(str, "parse ok, desc = " + q0Var.f348744m);
        ((com.tencent.mm.sdk.platformtools.r2) obj).put(g17, q0Var);
        return q0Var;
    }

    public final void f(java.lang.String str, java.lang.String str2, s40.t0 statusCallback) {
        kotlin.jvm.internal.o.g(statusCallback, "statusCallback");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            c(str, str2, new eq1.e(statusCallback, str2));
            return;
        }
        com.tencent.mars.xlog.Log.i("BizChatUtil", "exportId = " + str2 + ", nonceId = " + str);
    }

    public final void g(int i17, java.lang.String str, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        r45.nw1 liveInfo;
        cl0.g gVar = new cl0.g();
        try {
            gVar.h("exportId", str);
            gVar.h("liveid", (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? null : java.lang.Long.valueOf(liveInfo.getLong(0)));
            gVar.h("feedid", com.tencent.mm.sdk.platformtools.t8.r0(finderObject != null ? finderObject.getId() : 0L));
            gVar.h("finder_username", str2);
            gVar.h("wx_username", str3);
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("BizChatUtil", e17.getMessage());
        }
        switch (i17) {
            case 11:
                str4 = "service_card_one_big";
                break;
            case 12:
                str4 = "service_card_first";
                break;
            case 13:
                str4 = "service_card_second";
                break;
            case 14:
                str4 = "service_card_his_message";
                break;
            default:
                str4 = "";
                break;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        finderBroadcastEidClickStruct.s(str4);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderBroadcastEidClickStruct.t(r26.i0.t(gVar2, ",", ";", false));
        finderBroadcastEidClickStruct.k();
    }

    public final void h(android.widget.ImageView rightCoverIv, android.widget.ImageView blurCoverIv, java.lang.String str, o11.g gVar) {
        kotlin.jvm.internal.o.g(rightCoverIv, "rightCoverIv");
        kotlin.jvm.internal.o.g(blurCoverIv, "blurCoverIv");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "coverUrl == null");
            return;
        }
        android.content.Context context = rightCoverIv.getContext();
        fq1.e.h(fq1.e.f265507a, rightCoverIv, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4), false, false, 12, null);
        int b17 = i65.a.b(context, 220);
        int B = i65.a.B(context) - i65.a.b(context, 16);
        com.tencent.mars.xlog.Log.i("BizChatUtil", "setCover, coverUrl = " + str + ", cardHeight = " + b17 + ", cardWidth = " + B);
        if (gVar == null) {
            o11.f fVar = new o11.f();
            fVar.f342077a = true;
            fVar.f342079c = true;
            fVar.f342091o = com.tencent.mm.R.color.f478816i1;
            fVar.f342082f = tv.a.b(str);
            fVar.f342086j = B;
            fVar.f342087k = b17;
            gVar = fVar.a();
        }
        n11.a.b().i(str, rightCoverIv, gVar, new eq1.g(blurCoverIv, str, B, b17));
    }

    public final void i(boolean z17, java.lang.String str, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget2) {
        if (z17) {
            finderLiveOnliveWidget.setVisibility(0);
            finderLiveOnliveWidget2.setVisibility(8);
            finderLiveOnliveWidget.setText(str);
        } else {
            finderLiveOnliveWidget.setVisibility(8);
            finderLiveOnliveWidget2.setVisibility(0);
            finderLiveOnliveWidget2.setText(str);
        }
    }

    public final void j(r45.nw1 nw1Var, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget liveOnIcon, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget liveEndIcon) {
        kotlin.jvm.internal.o.g(liveOnIcon, "liveOnIcon");
        kotlin.jvm.internal.o.g(liveEndIcon, "liveEndIcon");
        java.lang.Integer valueOf = nw1Var != null ? java.lang.Integer.valueOf(nw1Var.getInteger(2)) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLiveStatusIcon: live status = ");
        sb6.append(valueOf);
        sb6.append(", replay = ");
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.getInteger(31)) : null);
        com.tencent.mars.xlog.Log.i("BizChatUtil", sb6.toString());
        kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.ajo), "getString(...)");
        kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.ajn), "getString(...)");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.ajm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.ajk);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.aji);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        if (nw1Var == null) {
            i(false, string2, liveOnIcon, liveEndIcon);
            return;
        }
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            i(true, string, liveOnIcon, liveEndIcon);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 2) {
            i(false, string2, liveOnIcon, liveEndIcon);
            return;
        }
        if (a(nw1Var)) {
            i(false, string3, liveOnIcon, liveEndIcon);
            return;
        }
        if (nw1Var.getInteger(31) == 3) {
            i(false, string2, liveOnIcon, liveEndIcon);
        } else {
            i(false, string2, liveOnIcon, liveEndIcon);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r2 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e5, code lost:
    
        r12 = com.tencent.mm.R.drawable.f480977bx1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        r12 = com.tencent.mm.R.drawable.bwz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        if (r2 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
    
        r12 = com.tencent.mm.R.drawable.f480978bx2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        r12 = com.tencent.mm.R.drawable.f480976bx0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00de, code lost:
    
        if (r2 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e9, code lost:
    
        if (r2 != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(r45.nw1 r12, com.tencent.mm.ui.widget.MMNeat7extView r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.h.k(r45.nw1, com.tencent.mm.ui.widget.MMNeat7extView, java.lang.String):void");
    }

    public final void l(android.widget.ImageView coverIv, java.lang.String str, o11.g gVar) {
        kotlin.jvm.internal.o.g(coverIv, "coverIv");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "coverUrl == null");
            return;
        }
        if (gVar == null) {
            o11.f fVar = new o11.f();
            fVar.f342077a = true;
            fVar.f342079c = true;
            fVar.f342091o = com.tencent.mm.R.color.f478816i1;
            fVar.f342082f = tv.a.b(str);
            gVar = fVar.a();
        }
        n11.a.b().h(str, coverIv, gVar);
    }
}
