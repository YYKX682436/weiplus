package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static bt3.l0 f188954a;

    public static int A(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(f9Var.getMsgId(), f9Var.Q0());
        if (J0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            return -1;
        }
        long j17 = J0.field_status;
        if (j17 != 105) {
            m(true);
            if (j17 != 101) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + J0.field_status);
                return -1;
            }
        }
        m(true);
        J0.field_status = 101;
        J0.field_lastModifyTime = c01.id.e();
        com.tencent.mm.pluginsdk.model.app.u5.wi().update(J0, new java.lang.String[0]);
        dk5.w.f234966a.b(f9Var, "file_resend_attach");
        return 0;
    }

    public static java.lang.String B(com.tencent.mm.storage.f9 f9Var, byte[] bArr, boolean z17, android.graphics.Bitmap.CompressFormat compressFormat, boolean z18) {
        java.lang.String V3;
        if (z18) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            V3 = m11.b1.Di().L0(f9Var, bm5.f0.f22564i, bArr, null);
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            V3 = m11.b1.Di().V3(f9Var, bArr, z17, compressFormat, false, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "saveAppMsgDirThumb directSave:" + z18 + "  path:" + V3);
        return V3;
    }

    public static java.lang.String C(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " attachBuf is null");
            return null;
        }
        java.lang.String str = c01.d9.b().d() + "ua_" + java.lang.System.currentTimeMillis();
        fp.k.c();
        if (com.tencent.mm.vfs.w6.S(str, bArr, 0, bArr.length) == 0) {
            return str;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " writeFile error file:" + str);
        return null;
    }

    public static int D(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        return E(wXMediaMessage, str, str2, str3, i17, str4, null, 0, null);
    }

    public static int E(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, int i18, com.tencent.mm.pluginsdk.model.app.a aVar) {
        return F(wXMediaMessage, str, str2, str3, i17, str4, str5, i18, aVar, null, null, null, null, null);
    }

    public static int F(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, int i18, com.tencent.mm.pluginsdk.model.app.a aVar, java.util.Map map, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        ot0.q qVar = new ot0.q();
        qVar.f348646d = str;
        qVar.H = str2;
        qVar.f348706s = i17;
        return H(qVar, wXMediaMessage, str3, str4, str5, i18, aVar, map, str6, str7, str8, str9);
    }

    public static int G(ot0.q qVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.pluginsdk.model.app.a aVar) {
        return H(qVar, wXMediaMessage, str, str2, null, i17, aVar, null, null, null, null, null);
    }

    public static int H(ot0.q qVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.pluginsdk.model.app.a aVar, java.util.Map map, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.tencent.mm.pluginsdk.model.app.d dVar;
        java.lang.String str8;
        java.lang.Object obj;
        java.lang.String str9;
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.pluginsdk.model.app.d dVar2;
        java.lang.Object obj2;
        java.lang.String B;
        if (i17 == 1) {
            com.tencent.mm.pluginsdk.ui.tools.k0 k0Var = new com.tencent.mm.pluginsdk.ui.tools.k0();
            k0Var.f191741b = 1;
            qVar.f(k0Var);
        }
        java.lang.String w17 = w(qVar, wXMediaMessage, str2, aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", fp.k.c() + "summerbig content url:" + qVar.f348674k + " lowUrl:" + qVar.f348678l + " attachlen:" + qVar.f348682m + " attachid:" + qVar.f348694p + " attach file:" + w17 + " webViewReqId: " + str4 + " msgSvrId: " + str5 + " talkerUsername: " + str6 + " snsLocalId: " + str7);
        c01.h7 h7Var = new c01.h7();
        h7Var.f37229d = str6;
        h7Var.f37228c = str5;
        h7Var.f37230e = str7;
        java.lang.String str10 = "MicroMsg.AppMsgLogic";
        java.lang.String str11 = str7;
        java.lang.String str12 = str6;
        int i18 = 0;
        if (S(new com.tencent.mm.pluginsdk.model.app.s0(qVar, str, wXMediaMessage.thumbData, str3, aVar, h7Var, false, null))) {
            return 0;
        }
        java.lang.String str13 = java.lang.System.currentTimeMillis() + "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
            dVar = null;
        } else {
            com.tencent.mm.pluginsdk.model.app.d a17 = a(str13, qVar, w17);
            if (a17 == null) {
                return 0 - fp.k.a();
            }
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(w17);
            if (n07 != null) {
                qVar.S = n07.outWidth;
                qVar.R = n07.outHeight;
            }
            dVar = a17;
        }
        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
        if (dVar != null) {
            qVar.f348694p = "" + dVar.systemRowid;
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(qVar.f348666i)) && com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348710t)) {
                qVar.f348710t = com.tencent.mm.modelcdntran.s1.cj().e(dVar.field_fileFullPath);
            }
        }
        qVar.f348698q = str2;
        qVar.M1 = str4;
        f9Var2.d1(ot0.q.u(qVar, null, null));
        boolean z17 = true;
        f9Var2.r1(1);
        f9Var2.j1(1);
        f9Var2.setType(p(qVar));
        c01.h7 n17 = n(str5, str6);
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(str.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str14 = (java.lang.String) it.next();
            f9Var2.u1(str14);
            f9Var2.e1(c01.w9.o(str14));
            java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(f9Var2);
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && !com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                wi6 = ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Bi(f9Var2, wi6, str5, str12);
                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                qx.f0 f0Var = (qx.f0) i95.n0.c(qx.f0.class);
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f37230e = str11;
                wi6 = ((px.b0) f0Var).Ai(f9Var2, wi6, h7Var2);
                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                f9Var2.u3(wi6);
            }
            if (aVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar2.R)) {
                ((et.k2) ((ft.n4) i95.n0.c(ft.n4.class))).Bi(f9Var2, aVar2.R);
            }
            if (qVar.f348666i == 5 && qVar.f348634J == 0) {
                f9Var2.d1(com.tencent.mm.pluginsdk.model.app.w0.b(i18, str14, z17, f9Var2.j()));
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(map != null ? ((java.lang.Long) map.get(str14)).longValue() : -1L);
            if (valueOf == null || valueOf.longValue() < 0) {
                str8 = str10;
                valueOf = java.lang.Long.valueOf(((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var2));
            } else {
                str8 = str10;
                com.tencent.mars.xlog.Log.i(str8, "sendAppMsg, updateById, existMsgId:%d ", valueOf);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(valueOf.longValue(), f9Var2, z17);
            }
            if (valueOf.longValue() < 0) {
                com.tencent.mars.xlog.Log.e(str8, fp.k.c() + " summerbig insert msg failed :" + valueOf);
                return 0 - fp.k.a();
            }
            byte[] bArr = wXMediaMessage.thumbData;
            if (bArr != null && bArr.length > 0) {
                if (bArr.length <= 65536 || wXMediaMessage.getType() == 36 || wXMediaMessage.getType() == 46 || wXMediaMessage.getType() == 101) {
                    B = B(f9Var2, wXMediaMessage.thumbData, false, android.graphics.Bitmap.CompressFormat.JPEG, z17);
                } else {
                    B = B(f9Var2, wXMediaMessage.thumbData, qVar.f348666i == 2 ? z17 : false, android.graphics.Bitmap.CompressFormat.JPEG, false);
                }
                fp.k.c();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(B)) {
                    pt0.e0 e0Var = pt0.f0.f358209b1;
                    if (!e0Var.c(bm5.d1.b(f9Var2.getType(), null))) {
                        f9Var2.i1(B);
                        e0Var.s(f9Var2.Q0(), valueOf.longValue(), f9Var2);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(str8, fp.k.a() + " summerbig new msg inserted to db , local id = " + valueOf);
            f9Var2.setMsgId(valueOf.longValue());
            ot0.t tVar = new ot0.t();
            tVar.field_xml = f9Var2.j();
            tVar.field_title = wXMediaMessage.title;
            tVar.field_type = wXMediaMessage.mediaObject.type();
            tVar.field_description = wXMediaMessage.description;
            tVar.field_msgId = valueOf.longValue();
            tVar.field_source = qVar.H;
            tVar.field_msgSvrId = f9Var2.I0();
            tVar.field_msgTalker = f9Var2.Q0();
            com.tencent.mm.pluginsdk.model.app.u5.Ri().insert(tVar);
            java.lang.String str15 = f9Var2.G;
            int i19 = c01.ia.f37254a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str15)) {
                obj = null;
                str9 = null;
            } else {
                obj = null;
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str15, "msgsource", null);
                str9 = d17 != null ? (java.lang.String) d17.get(".msgsource.alnode.fr") : null;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(str14, valueOf);
            }
            if (dVar != null) {
                dVar.field_msgInfoId = valueOf.longValue();
                dVar.field_msgInfoTalker = f9Var2.Q0();
                com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", "getFileSendStatus: isSend = true, stack = " + new com.tencent.mm.sdk.platformtools.z3());
                dVar.field_status = (long) 101;
                com.tencent.mars.xlog.Log.i(str8, "summerbig sendAppMsg update attInfo field_msgInfoId[%d], field_status[%d], systemRowid[%d], type[%d]", java.lang.Long.valueOf(dVar.field_msgInfoId), java.lang.Long.valueOf(dVar.field_status), java.lang.Long.valueOf(dVar.systemRowid), java.lang.Integer.valueOf(tVar.field_type));
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mm.pluginsdk.model.app.u5.Ni().f189069d.put(java.lang.Long.valueOf(dVar.field_msgInfoId), str3);
                }
                T(f9Var2, dVar, n17);
                f9Var = f9Var2;
                dVar2 = dVar;
                obj2 = obj;
            } else {
                com.tencent.mars.xlog.Log.i(str8, "summerbig sendAppMsg dosceneSendAppMsg attInfo[%s], msgId[%d], sessionId[%s], type[%d]", dVar, valueOf, str3, java.lang.Integer.valueOf(tVar.field_type));
                com.tencent.mm.pluginsdk.model.app.s5 Ni = com.tencent.mm.pluginsdk.model.app.u5.Ni();
                long longValue = valueOf.longValue();
                Ni.getClass();
                f9Var = f9Var2;
                dVar2 = dVar;
                obj2 = obj;
                c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.c4(str14, longValue, str3, null, i17, aVar));
            }
            str12 = str6;
            str11 = str7;
            str10 = str8;
            dVar = dVar2;
            f9Var2 = f9Var;
            i18 = 0;
            z17 = true;
        }
        return i18;
    }

    public static android.util.Pair I(ot0.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr) {
        return J(qVar, str, str2, str3, str4, bArr, null);
    }

    public static android.util.Pair J(ot0.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, java.lang.String str5) {
        return K(qVar, str, str2, str3, str4, bArr, str5, "", "", com.tencent.mm.plugin.msg.MsgIdTalker.f149479g);
    }

    public static android.util.Pair K(ot0.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        return L(qVar, str, str2, str3, str4, bArr, str5, str6, str7, msgIdTalker, msgIdTalker.f149480d > 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair L(ot0.q r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, byte[] r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.tencent.mm.plugin.msg.MsgIdTalker r35, boolean r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.k0.L(ot0.q, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.msg.MsgIdTalker, boolean, java.lang.String):android.util.Pair");
    }

    public static void M(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        try {
            if (((qx.e0) i95.n0.c(qx.e0.class)) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "sendAppMsgViaBypPipeline: ICgiBypService is null");
                f9Var.r1(5);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                return;
            }
            g75.z zVar = new g75.z();
            zVar.l(qx.k0.class.getName(), new qx.k0(24, f9Var, str, str));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(jt1.e.class);
            g75.r rVar = new g75.r(kz5.n0.X0(arrayList), zVar, "SendBypAppMsg_WeClaw", null, false, 24, null);
            rVar.d();
            new java.lang.ref.WeakReference(rVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "sendAppMsgViaBypPipeline started for weclaw msg, msgId=%d, toUser=%s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMsgLogic", e17, "sendAppMsgViaBypPipeline error", new java.lang.Object[0]);
            f9Var.r1(5);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        }
    }

    public static void N(long j17, bu.b bVar) {
        com.tencent.mm.pluginsdk.model.app.u5.wi().b1(j17, 198L);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "setError rowid:%s, stack:%s", java.lang.Long.valueOf(j17), new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        com.tencent.mm.pluginsdk.model.app.u5.wi().get(j17, dVar);
        long j18 = dVar.field_msgInfoId;
        if (j18 <= 0) {
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, j18);
        if (Li.getMsgId() != dVar.field_msgInfoId) {
            return;
        }
        if (Li.P0() == 2 && Li.getType() == 1090519089 && Li.Z1() == 0) {
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, dVar, 100, true);
            ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(null, Li, 3));
        } else {
            Li.r1(5);
        }
        if (Li.getMsgId() > 0 && Li.A0() == 1 && bVar != null) {
            bu.a.e(Li.getMsgId(), bVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "record err msg, %s, %s, %s", java.lang.Long.valueOf(Li.getMsgId()), java.lang.Integer.valueOf(bVar.f24474a), bVar.f24475b);
        }
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
    }

    public static void O(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (pt0.f0.f358209b1.h() || f9Var == null) {
            return;
        }
        f9Var.Q = str;
        f9Var.f236178r = true;
    }

    public static void P(final yb5.d dVar, final com.tencent.mm.storage.f9 f9Var, int i17, int i18, java.util.function.Consumer consumer) {
        db5.e1.A(dVar.g(), dVar.s().getString(i17), "", dVar.s().getString(com.tencent.mm.R.string.f490484wd), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                com.tencent.mm.pluginsdk.model.app.k0.z(com.tencent.mm.storage.f9.this);
                dVar.L(true);
            }
        }, new com.tencent.mm.plugin.account.ui.sa$$a());
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.getMsgId());
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, null, 101, true);
        Li.r1(5);
        bu.a.e(Li.getMsgId(), bu.a.d(-1));
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), Li, true);
        if (consumer != null) {
            consumer.accept(Li);
        }
    }

    public static void Q(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        db5.e1.A(dVar.g(), dVar.s().getString(i17), "", dVar.s().getString(com.tencent.mm.R.string.f490484wd), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.pluginsdk.model.app.l0(f9Var), new com.tencent.mm.pluginsdk.model.app.m0());
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.getMsgId());
        Li.r1(5);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), Li, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean R(java.lang.String r26, com.tencent.mm.storage.f9 r27) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.k0.R(java.lang.String, com.tencent.mm.storage.f9):boolean");
    }

    public static boolean S(com.tencent.mm.pluginsdk.model.app.s0 s0Var) {
        pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
        int i17 = s0Var.f189058a.f348666i;
        c01.h7 h7Var = s0Var.f189063f;
        if (h7Var != null && h7Var.f37227b > 0 && ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).Ni(s0Var.f189059b, h7Var.f37229d, h7Var.f37227b, null) && qi3.m.b(i17)) {
            return true;
        }
        final ot.g gVar = (ot.g) g0Var;
        java.lang.String toUser = s0Var.f189059b;
        if (gVar.sj(i17, toUser)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$a(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$c
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar) {
                    av.b params = (av.b) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new av.a(params);
                }
            });
            return true;
        }
        if (gVar.qj(i17, toUser)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$d(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$e
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar) {
                    qt.e params = (qt.e) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new qt.d(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{51, 129, 63, 50}).contains(java.lang.Integer.valueOf(i17)) && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendFinder()) == 1)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$f(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$g
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar) {
                    vt.e params = (vt.e) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new vt.d(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (i17 == 68 && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendLiteApp()) == 1)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$h(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$i
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar) {
                    au.b params = (au.b) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new au.a(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{92, 93, 3, 76}).contains(java.lang.Integer.valueOf(i17)) && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendTing()) == 1)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$j(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$k
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar) {
                    su.d params = (su.d) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new su.b(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (i17 == 118 && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendTing()) == 1)) {
            l15.c cVar = new l15.c();
            e15.k kVar = new e15.k();
            kVar.fromXml(ot0.q.u(s0Var.f189058a, null, null));
            cVar.q(kVar.j());
            su.c cVar2 = new su.c(toUser, cVar, s0Var.f189060c);
            cVar2.f412187i = s0Var.f189061d;
            com.tencent.mm.pluginsdk.model.app.a aVar = s0Var.f189062e;
            if (aVar != null) {
                cVar2.f412186h = aVar;
            }
            if (h7Var != null) {
                cVar2.f412182d = h7Var;
            }
            if (s0Var.f189064g) {
                cVar2.f412185g = true;
                cVar2.f412188j = s0Var.f189065h;
            }
            gVar.uj(new su.a(cVar2));
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (i17 == 82 && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendFinder()) == 1)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$l(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$p
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    vt.b params = (vt.b) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new vt.a(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (i17 == 57 && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendQuote()) == 1)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$q(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$r
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    fu.a params = (fu.a) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new fu.d(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (i17 == 69 && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendGameCard()) == 1)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$s(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$t
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    xt.a params = (xt.a) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new yt.a(params);
                }
            });
            return true;
        }
        if (gVar.rj(i17, toUser)) {
            e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$u(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$v
                @Override // com.tencent.mm.pluginsdk.model.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    qu.c params = (qu.c) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    kotlin.jvm.internal.o.g(params, "params");
                    return new qu.b(params);
                }
            });
            return true;
        }
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (!(i17 == 132 && (com.tencent.mm.storage.z3.J3(toUser) || ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()))) {
            return false;
        }
        e(s0Var, gVar, new com.tencent.mm.pluginsdk.model.app.k0$$w(), new com.tencent.mm.pluginsdk.model.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$b
            @Override // com.tencent.mm.pluginsdk.model.app.t0
            public final qi3.b0 a(st.a aVar2) {
                rt.c params = (rt.c) aVar2;
                ((ot.g) pt.g0.this).getClass();
                kotlin.jvm.internal.o.g(params, "params");
                return new rt.b(params);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0241  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T(com.tencent.mm.storage.f9 r13, com.tencent.mm.pluginsdk.model.app.d r14, c01.h7 r15) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.k0.T(com.tencent.mm.storage.f9, com.tencent.mm.pluginsdk.model.app.d, c01.h7):void");
    }

    public static com.tencent.mm.pluginsdk.model.app.d a(java.lang.String str, ot0.q qVar, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", fp.k.c() + " summerbig buildUploadAttachInfo clientAppDataId:" + str + " attach file :" + str2);
        java.lang.String replace = str2.replace("//", "/");
        if (!com.tencent.mm.vfs.q7.e(replace) && replace.startsWith(lp0.b.X())) {
            ez.v0 v0Var = ez.v0.f257777a;
            java.lang.String o17 = ((com.tencent.mm.vfs.r6) ((jz5.n) ez.v0.f257778b).getValue()).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            if (!r26.i0.y(replace, o17, false)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "summerbig Error attach path:%s", replace);
                return null;
            }
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_totalLen = qVar.f348682m;
        dVar.field_fileFullPath = str2;
        dVar.field_sdkVer = qVar.f348650e;
        dVar.field_appId = qVar.f348646d;
        dVar.field_clientAppDataId = str;
        dVar.field_type = qVar.f348666i;
        dVar.field_status = 200L;
        dVar.field_isUpload = true;
        dVar.field_createTime = c01.id.a();
        dVar.field_lastModifyTime = c01.id.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        dVar.field_mediaSvrId = sb6.toString();
        dVar.field_isUseCdn = 0;
        com.tencent.mm.pluginsdk.model.app.u5.wi().insert(dVar);
        fp.k.c();
        if (dVar.systemRowid >= 0) {
            return dVar;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " summerbig uploadAttach insert appattach info failed :" + dVar.systemRowid);
        return null;
    }

    public static boolean b(java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.equals("0:0")) ? false : true;
    }

    public static int c(int i17) {
        switch (i17) {
            case -2130706383:
            case -2113929167:
            case -2097151951:
            case -1879048191:
            case -1879048190:
            case -1879048189:
            case -1879048186:
            case -1879048185:
            case -1879048183:
            case -1879048176:
            case 74:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case 87:
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SEEK /* 95 */:
            case 102:
            case 103:
            case 131:
            case 132:
            case 1048625:
            case 16777265:
            case 268435505:
            case 285212721:
            case 301989937:
            case 318767153:
            case 335544369:
            case 352321585:
            case 369098801:
            case 385876017:
            case 402653233:
            case 419430449:
            case 436207665:
            case 452984881:
            case 469762097:
            case 486539313:
            case 503316529:
            case 520093745:
            case 536870961:
            case 536936497:
            case 553648177:
            case 587202609:
            case 603979825:
            case 687865905:
            case 704643121:
            case 738197553:
            case 754974769:
            case 771751985:
            case 805306417:
            case 822083633:
            case 838860849:
            case 855638065:
            case 905969713:
            case 922746929:
            case 939524145:
            case 973078577:
            case 974127153:
            case 975175729:
            case 976224305:
            case 977272881:
            case 978321457:
            case 979370033:
            case 1040187441:
            case 1077936177:
            case 1090519089:
            case 1107296305:
            case 1124073521:
            case 1140850737:
            case 1157627953:
            case 1174405169:
            case 1191182385:
            case 1207959601:
            case 1224736817:
            case 1241514033:
            case 1409286193:
            case 1426063409:
            case 1442840625:
            case 1627390001:
            case 1895825457:
                return 49;
            default:
                return i17;
        }
    }

    public static void d(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pluginsdk.model.app.r0 r0Var) {
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", f9Var.j());
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348694p) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.L)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", f9Var.j());
            v17.f348694p = "" + v17.L.hashCode();
        }
        java.lang.String str = v17.f348694p;
        if (u(f9Var, g(str, f9Var.getMsgId(), f9Var.Q0())) || !R(str, f9Var)) {
            return;
        }
        f188954a = new bt3.l0(f9Var.getMsgId(), f9Var.Q0(), str, new com.tencent.mm.pluginsdk.model.app.n0(r0Var));
        c01.d9.e().g(f188954a);
    }

    public static boolean e(com.tencent.mm.pluginsdk.model.app.s0 s0Var, pt.g0 g0Var, com.tencent.mm.pluginsdk.model.app.u0 u0Var, com.tencent.mm.pluginsdk.model.app.t0 t0Var) {
        ot0.a aVar;
        l15.c cVar = new l15.c();
        cVar.fromXml(ot0.q.u(s0Var.f189058a, null, null));
        byte[] bArr = s0Var.f189060c;
        java.lang.String str = s0Var.f189059b;
        st.a a17 = u0Var.a(str, cVar, bArr);
        a17.f412187i = s0Var.f189061d;
        com.tencent.mm.pluginsdk.model.app.a aVar2 = s0Var.f189062e;
        if (aVar2 != null) {
            a17.f412186h = aVar2;
        }
        c01.h7 h7Var = s0Var.f189063f;
        if (h7Var != null) {
            a17.f412182d = h7Var;
        }
        if (s0Var.f189064g) {
            a17.f412185g = true;
            a17.f412188j = s0Var.f189065h;
        }
        ot0.q qVar = s0Var.f189058a;
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem = qVar.f348725w2;
        if (msgQuoteItem != null && msgQuoteItem.f149489n != null) {
            p15.e eVar = new p15.e();
            eVar.fromXml(qVar.f348725w2.f149489n);
            a17.f412183e = eVar;
        }
        if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).qj(qVar.f348666i, str) && (aVar = (ot0.a) qVar.y(ot0.a.class)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.R)) {
            p15.e eVar2 = a17.f412183e;
            if (eVar2 == null) {
                eVar2 = new p15.e();
            }
            eVar2.F(aVar.R);
            a17.f412183e = eVar2;
        }
        ((ot.g) g0Var).uj(t0Var.a(a17));
        return true;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str5 = a17.f213279f;
        if (str5 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str4 = str + "da_" + java.lang.System.currentTimeMillis();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                str4 = str4 + "." + str3;
            }
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !str2.endsWith(str3)) {
                str2 = str2 + "." + str3;
            }
            str4 = str + str2;
            if (com.tencent.mm.vfs.w6.j(str4)) {
                int i17 = 1;
                while (true) {
                    if (i17 >= 20) {
                        break;
                    }
                    if (!com.tencent.mm.vfs.w6.j(str + i17 + "_" + str2)) {
                        str4 = str + i17 + "_" + str2;
                        break;
                    }
                    i17++;
                }
                if (i17 == 20) {
                    str4 = str + "da_" + java.lang.System.currentTimeMillis();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        str4 = str4 + "." + str3;
                    }
                }
            }
        }
        try {
            if (new com.tencent.mm.vfs.r6(str4).s().o().equalsIgnoreCase(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).o())) {
                return str4;
            }
            java.lang.String str6 = str + "da_" + java.lang.System.currentTimeMillis();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str6 = str6 + str2;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                str6 = str6 + "." + str3;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", str6);
            return str6;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMsgLogic", e17, "", new java.lang.Object[0]);
            java.lang.String str7 = str + "da_" + java.lang.System.currentTimeMillis();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return str7;
            }
            return str7 + "." + str3;
        }
    }

    public static com.tencent.mm.pluginsdk.model.app.d g(java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mm.pluginsdk.model.app.d h17 = h(str);
        if (h17 == null) {
            h17 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(j17, str2);
        }
        if (h17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", h17, java.lang.Long.valueOf(h17.systemRowid), java.lang.Boolean.valueOf(h17.field_isUpload), h17.field_fileFullPath, java.lang.Long.valueOf(h17.field_totalLen), java.lang.Long.valueOf(h17.field_offset), h17.field_mediaSvrId, h17.field_mediaId, java.lang.Long.valueOf(h17.field_msgInfoId), java.lang.Long.valueOf(h17.field_type), new com.tencent.mm.sdk.platformtools.z3());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new com.tencent.mm.sdk.platformtools.z3());
        }
        return h17;
    }

    public static com.tencent.mm.pluginsdk.model.app.d h(java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", str);
        long V = com.tencent.mm.sdk.platformtools.t8.V(str, -1L);
        if (V == -1) {
            dVar = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(str);
            if (dVar == null || !dVar.field_mediaSvrId.equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
                dVar = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
            return dVar;
        }
        com.tencent.mm.pluginsdk.model.app.u5.wi().get(V, dVar);
        if (dVar.systemRowid != V && ((dVar = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(str)) == null || !dVar.field_mediaSvrId.equals(str))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
            dVar = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
        return dVar;
    }

    public static com.tencent.mm.pluginsdk.model.app.d i(java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, long j18, boolean z17) {
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_fileFullPath = str;
        dVar.field_appId = str3;
        dVar.field_sdkVer = i17;
        dVar.field_mediaSvrId = str4;
        dVar.field_totalLen = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = c01.id.a();
        dVar.field_lastModifyTime = c01.id.e();
        dVar.field_msgInfoId = j17;
        dVar.field_msgInfoTalker = str2;
        dVar.field_netTimes = 0L;
        return dVar;
    }

    public static com.tencent.mm.pluginsdk.model.app.d j(com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", f9Var.j());
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348694p) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.L)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", f9Var.j());
            v17.f348694p = "" + v17.L.hashCode();
        }
        java.lang.String str = v17.f348694p;
        com.tencent.mm.pluginsdk.model.app.d g17 = g(str, f9Var.getMsgId(), f9Var.Q0());
        if (g17 != null) {
            return g17;
        }
        R(str, f9Var);
        return g(str, f9Var.getMsgId(), f9Var.Q0());
    }

    public static java.lang.String k() {
        return com.tencent.mm.vfs.q7.c("attachment") + '/';
    }

    public static java.lang.String l(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(f9Var.j());
        int i17 = bVar.f432315e;
        return (((l15.d) bVar.getCustom(i17 + 30)) == null || ((l15.d) bVar.getCustom(i17 + 30)).k() == null) ? "" : ((l15.d) bVar.getCustom(i17 + 30)).k().j();
    }

    public static int m(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    public static c01.h7 n(java.lang.String str, java.lang.String str2) {
        c01.h7 h7Var = new c01.h7();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str2, java.lang.Long.parseLong(str));
                h7Var.f37229d = o27.Q0();
                h7Var.f37227b = o27.getMsgId();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgLogic", "parseLong error, %s", str);
            }
        }
        return h7Var;
    }

    public static com.tencent.mm.pluginsdk.model.app.d o(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.d h17 = h(str);
        if (h17 != null) {
            return h17;
        }
        s(f9Var.getMsgId(), f9Var.Q0(), f9Var.j(), null);
        return h(str);
    }

    public static int p(ot0.q qVar) {
        int i17;
        if (qVar == null) {
            return 49;
        }
        int i18 = qVar.f348666i;
        int i19 = qVar.f348634J;
        int i27 = qVar.f348635a0;
        int i28 = qVar.f348639b0;
        int i29 = qVar.A1;
        int i37 = qVar.G1;
        if (i18 == 76) {
            return 1040187441;
        }
        if (i18 == 92) {
            return 1409286193;
        }
        if (i18 == 93) {
            return 1426063409;
        }
        if (i18 == 118) {
            return 1442840625;
        }
        if (i18 == 133) {
            return 1476395057;
        }
        if (i18 == 3) {
            ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
            java.lang.String str = qVar.f348646d;
            ((ja0.o0) r0Var).getClass();
            if (ll3.j2.i(str) || "wx485a97c844086dc9".equals(qVar.f348646d)) {
                return 1040187441;
            }
        }
        if (i18 == 116) {
            return 1191182385;
        }
        if (i18 == 41) {
            return 1124073521;
        }
        if (i27 == 4 || i28 != 0) {
            return 318767153;
        }
        if (i18 == 2001) {
            if (i19 == 1 || i37 == 1) {
                return 469762097;
            }
            return i29 == 4 ? 503316529 : 436207665;
        }
        if (i18 == 2002) {
            return 536870961;
        }
        if (i18 == 2003) {
            return 536936497;
        }
        if (i18 == 66) {
            return 905969713;
        }
        if (i19 == 1) {
            return i18 == 21 ? -1879048185 : 285212721;
        }
        if (i19 == 2) {
            return i18 == 21 ? -1879048183 : 301989937;
        }
        if (i19 == 3) {
            return i18 == 21 ? -1879048176 : -1879048189;
        }
        if (i19 == 4) {
            return i18 == 21 ? -1879048183 : -1879048190;
        }
        if (i19 == 5) {
            return -1879048191;
        }
        if (i19 == 17) {
            return -1879048186;
        }
        switch (i18) {
            case 1:
                return 16777265;
            case 2:
                return 268435505;
            case 6:
            case 74:
            case 130:
            case 131:
                return 1090519089;
            case 8:
                return 1048625;
            case 10:
                return 335544369;
            case 13:
                return 369098801;
            case 16:
                return 452984881;
            case 17:
                return -1879048186;
            case 20:
                return 402653233;
            case 33:
            case 36:
                ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
                if (aVar != null && aVar.f348346b && ((i17 = qVar.f348681l2) == 2 || i17 == 3)) {
                    return 553648177;
                }
                return (aVar == null || !((aVar.f348349e || aVar.Q) && qVar.f348681l2 == 3)) ? 49 : 587202609;
            case 34:
                return 520093745;
            case 46:
                return 687865905;
            case 47:
                return 704643121;
            case 48:
                return 738197553;
            case 50:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 771751985;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 771751985;
            case 51:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 754974769;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 754974769;
            case 52:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 788529201;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 788529201;
            case 53:
                return 805306417;
            case 54:
                ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
                return (fVar == null || fVar.f348465l == null) ? 49 : 486539313;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                return 822083633;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 838860849;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 838860849;
            case 60:
                return 855638065;
            case 62:
                return 922746929;
            case 63:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 973078577;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 973078577;
            case 65:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 989855793;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 989855793;
            case 69:
                return 939524145;
            case 72:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1006633009;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1006633009;
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 956301361;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 956301361;
            case 75:
                int b17 = zy2.d5.b(qVar.G2, qVar.D2);
                if (b17 == 2) {
                    return 1057030193;
                }
                if (b17 == 3) {
                    return 1023541297;
                }
                if (b17 == 4 || b17 == 5) {
                    return 1023606833;
                }
                if (b17 != 6) {
                    return b17 != 100000000 ? 49 : 1023475761;
                }
                return 1023672369;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                return 1074790449;
            case 80:
                return 1075839025;
            case 81:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1076887601;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1076887601;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                return 974127153;
            case 87:
                return 1107296305;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                return 975175729;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_CHECK_STATE /* 89 */:
                return 1078984753;
            case 94:
                return 976224305;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SEEK /* 95 */:
                return 1080033329;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT /* 96 */:
                return 977272881;
            case 101:
                return 1140850737;
            case 105:
                return 1157627953;
            case 106:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1174405169;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1174405169;
            case 109:
                return 1627390001;
            case 111:
                return 978321457;
            case 112:
                return 1081081905;
            case 113:
                return 979370033;
            case 114:
                return 1895825457;
            case 115:
                return -2130706383;
            case 119:
                return 1207959601;
            case 120:
                return 1224736817;
            case 124:
                return -2113929167;
            case 126:
                return -2097151951;
            case 128:
                return -2080374735;
            case 129:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1241514033;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1241514033;
            case 2000:
            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION /* 2011 */:
                return 419430449;
            case 671088689:
                return 671088689;
            default:
                return 49;
        }
    }

    public static android.util.Pair q(java.lang.String str) {
        ot0.q v17 = ot0.q.v(str);
        if (v17 == null) {
            return new android.util.Pair(0, "");
        }
        int i17 = v17.f348666i;
        if (i17 == 2000 || i17 == 2001) {
            java.lang.String str2 = v17.f348712t1;
            if (str2 != null && !str2.isEmpty()) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), v17.f348712t1);
            }
            java.lang.String str3 = v17.L0;
            if (str3 != null && !str3.isEmpty()) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), v17.K0);
            }
            java.lang.String str4 = v17.f348736z1;
            if (str4 != null && !str4.isEmpty()) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), v17.f348736z1);
            }
        } else if (i17 == 115) {
            l15.c cVar = new l15.c();
            cVar.fromXml(str);
            v05.b k17 = cVar.k();
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "getMsgKey, ecsGiftAppMsg is null");
                return new android.util.Pair(0, "");
            }
            w05.d dVar = (w05.d) k17.getCustom(k17.f432315e + 66);
            if (dVar != null) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), dVar.t());
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "getMsgKey, ecsGiftAppMsgInfo is null");
            return new android.util.Pair(0, "");
        }
        return new android.util.Pair(0, "");
    }

    public static int r(java.lang.String str) {
        ot0.q v17 = ot0.q.v(str);
        if (v17 == null || !b(v17.f348694p)) {
            return -1;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        long V = com.tencent.mm.sdk.platformtools.t8.V(v17.f348694p, -1L);
        if (V != -1) {
            com.tencent.mm.pluginsdk.model.app.u5.wi().get(V, dVar);
            if (dVar.systemRowid != V && ((dVar = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p)) == null || !dVar.field_mediaSvrId.equals(v17.f348694p))) {
                return -1;
            }
        } else {
            dVar = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
            if (dVar == null || !dVar.field_mediaSvrId.equals(v17.f348694p)) {
                return -1;
            }
        }
        long j17 = dVar.field_totalLen;
        if (j17 == 0) {
            return -1;
        }
        return (int) ((dVar.field_offset * 100) / j17);
    }

    public static java.lang.String s(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", java.lang.Long.valueOf(j17), str2, str4);
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            return null;
        }
        if (str4 == null) {
            str4 = f(com.tencent.mm.vfs.q7.c("attachment") + '/', v17.n(), v17.f348690o);
        }
        java.lang.String str5 = str4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348694p) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.L)) {
            v17.f348694p = "" + v17.L.hashCode();
        }
        int i17 = v17.f348650e;
        java.lang.String str6 = v17.f348646d;
        java.lang.String str7 = v17.f348694p;
        t(str5, j17, str, i17, str6, str7, v17.f348682m, v17.f348666i, v17.T, v17.f348714u);
        return str7;
    }

    public static java.lang.String t(java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, long j18, int i18, java.lang.String str5, int i19) {
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_fileFullPath = str;
        dVar.field_appId = str3;
        dVar.field_sdkVer = i17;
        dVar.field_mediaSvrId = str4;
        dVar.field_totalLen = j18;
        m(false);
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = c01.id.a();
        dVar.field_lastModifyTime = c01.id.e();
        dVar.field_msgInfoId = j17;
        dVar.field_msgInfoTalker = str2;
        dVar.field_netTimes = 0L;
        dVar.field_type = i18;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.pluginsdk.model.app.u5.wi().insert(dVar));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(dVar.systemRowid);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(dVar.field_totalLen);
        java.lang.Long valueOf4 = java.lang.Long.valueOf(dVar.field_type);
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(i19);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], msgLocalId[%s], stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, str, valueOf6, new com.tencent.mm.sdk.platformtools.z3());
        return str4;
    }

    public static boolean u(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pluginsdk.model.app.d dVar) {
        if (dVar == null || !com.tencent.mm.vfs.w6.j(dVar.field_fileFullPath)) {
            return false;
        }
        return dVar.t0() || (f9Var.A0() == 1 && dVar.field_isUpload);
    }

    public static boolean v(int i17) {
        switch (i17) {
            case -1879048191:
            case -1879048190:
            case -1879048189:
                return true;
            default:
                return false;
        }
    }

    public static java.lang.String w(ot0.q qVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, com.tencent.mm.pluginsdk.model.app.a aVar) {
        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var;
        int i17;
        fp.k.c();
        int i18 = wXMediaMessage.sdkVer;
        wXMediaMessage.mediaObject.type();
        qVar.f348650e = wXMediaMessage.sdkVer;
        qVar.f348654f = wXMediaMessage.title;
        qVar.f348658g = wXMediaMessage.description;
        qVar.X = wXMediaMessage.mediaTagName;
        qVar.Y = wXMediaMessage.messageAction;
        qVar.Z = wXMediaMessage.messageExt;
        if (aVar != null) {
            if (!android.text.TextUtils.isEmpty(aVar.f188797h)) {
                qVar.f348722w = aVar.f188797h;
            }
            if (!android.text.TextUtils.isEmpty(aVar.f188798i)) {
                qVar.f348726x = aVar.f188798i;
            }
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        qVar.f348666i = iMediaObject.type();
        if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f188793d)) {
            ot0.l lVar = (ot0.l) qVar.y(ot0.l.class);
            ot0.l lVar2 = lVar != null ? lVar : new ot0.l();
            lVar2.f348569d = aVar.f188793d;
            lVar2.f348567b = wXMediaMessage.thumbDataHash;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject2 = wXMediaMessage.mediaObject;
            if (iMediaObject2 instanceof com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) {
                lVar2.f348568c = ((com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) iMediaObject2).hdAlbumThumbFileHash;
            }
            if (lVar == null) {
                qVar.f(lVar2);
            }
        }
        int i19 = qVar.f348666i;
        if (i19 == 7) {
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = (com.tencent.mm.opensdk.modelmsg.WXAppExtendObject) iMediaObject;
            qVar.f348702r = wXAppExtendObject.extInfo;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(wXAppExtendObject.fileData)) {
                fp.k.c();
                byte[] bArr = wXAppExtendObject.fileData;
                int length = bArr.length;
                qVar.f348682m = bArr.length;
                return C(bArr);
            }
            qVar.f348682m = com.tencent.mm.vfs.w6.k(wXAppExtendObject.filePath);
            fp.k.c();
            java.lang.String str2 = wXAppExtendObject.filePath;
            if (qVar.f348682m <= 0) {
                return null;
            }
            qVar.f348690o = com.tencent.mm.vfs.w6.n(str2);
            return wXAppExtendObject.filePath;
        }
        if (i19 == 49) {
            int i27 = ((com.tencent.mm.opensdk.modelmsg.WXWeWorkObject) iMediaObject).subType;
            qVar.f348666i = (i27 == 1 || i27 == 2) ? 19 : -1;
            return null;
        }
        if (ez.v0.f257777a.j(java.lang.Integer.valueOf(i19))) {
            com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = (com.tencent.mm.opensdk.modelmsg.WXFileObject) iMediaObject;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(wXFileObject.fileData)) {
                fp.k.c();
                byte[] bArr2 = wXFileObject.fileData;
                int length2 = bArr2.length;
                qVar.f348682m = bArr2.length;
                return C(bArr2);
            }
            qVar.f348682m = com.tencent.mm.vfs.w6.k(wXFileObject.filePath);
            fp.k.c();
            java.lang.String str3 = wXFileObject.filePath;
            if (qVar.f348682m <= 0) {
                return null;
            }
            java.lang.String n17 = com.tencent.mm.vfs.w6.n(str3);
            qVar.f348690o = n17;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                qVar.f348690o = com.tencent.mm.vfs.w6.n(wXMediaMessage.title);
            }
            return wXFileObject.filePath;
        }
        int i28 = qVar.f348666i;
        if (i28 == 2) {
            com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(wXImageObject.imageData)) {
                fp.k.c();
                byte[] bArr3 = wXImageObject.imageData;
                int length3 = bArr3.length;
                qVar.f348682m = bArr3.length;
                return C(bArr3);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(wXImageObject.imagePath)) {
                return null;
            }
            qVar.f348682m = com.tencent.mm.vfs.w6.k(wXImageObject.imagePath);
            fp.k.c();
            java.lang.String str4 = wXImageObject.imagePath;
            if (qVar.f348682m > 0) {
                qVar.f348690o = com.tencent.mm.vfs.w6.n(str4);
                java.lang.String o17 = new com.tencent.mm.vfs.r6(c01.d9.b().d(), "appmsg_img_" + java.lang.System.currentTimeMillis()).o();
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(wXImageObject.imagePath);
                if (n07 != null && n07.outWidth > 0 && n07.outHeight > 0) {
                    if (c01.z1.a(wXImageObject.imagePath, "", true)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "this picture can send raw image but must copy [%s] to [%s]", wXImageObject.imagePath, o17);
                        if (com.tencent.mm.vfs.w6.d(wXImageObject.imagePath, o17, false) >= 0) {
                            return o17;
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgLogic", "copy file error path[%s, %s]", wXImageObject.imagePath, o17);
                        return null;
                    }
                    if (n07.outWidth > 960 || n07.outHeight > 960) {
                        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(wXImageObject.imagePath, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, false);
                        if (T == null) {
                            return null;
                        }
                        try {
                            com.tencent.mm.sdk.platformtools.x.D0(T, 100, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMsgLogic", e17, "", new java.lang.Object[0]);
                            return null;
                        }
                    } else if (com.tencent.mm.vfs.w6.d(wXImageObject.imagePath, o17, false) < 0) {
                        return null;
                    }
                    return o17;
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(n07 == null);
                objArr[1] = java.lang.Integer.valueOf(n07 == null ? -1 : n07.outWidth);
                objArr[2] = java.lang.Integer.valueOf(n07 == null ? -1 : n07.outHeight);
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "options is null! %B, bitmapWidth = %d, bitmapHeight = %d", objArr);
            }
            return null;
        }
        if (i28 == 3) {
            com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = (com.tencent.mm.opensdk.modelmsg.WXMusicObject) iMediaObject;
            qVar.f348674k = wXMusicObject.musicUrl;
            qVar.f348678l = wXMusicObject.musicLowBandUrl;
            qVar.V = wXMusicObject.musicDataUrl;
            qVar.W = wXMusicObject.musicLowBandDataUrl;
            com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = new com.tencent.mm.pluginsdk.ui.tools.i0();
            i0Var.f191690b = wXMusicObject.songAlbumUrl;
            i0Var.f191691c = wXMusicObject.songLyric;
            qVar.f(i0Var);
            return null;
        }
        if (i28 == 76) {
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) iMediaObject;
            java.lang.String str5 = wXMusicVideoObject.hdAlbumThumbFilePath;
            if (com.tencent.mm.vfs.w6.j(str5)) {
                byte[] Ai = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ai(com.tencent.mm.vfs.w6.N(str5, 0, -1));
                if (Ai != null) {
                    wXMediaMessage.thumbData = Ai;
                }
            }
            qVar.f348674k = wXMusicVideoObject.musicUrl;
            qVar.V = wXMusicVideoObject.musicDataUrl;
            com.tencent.mm.pluginsdk.ui.tools.i0 i0Var2 = new com.tencent.mm.pluginsdk.ui.tools.i0();
            i0Var2.f191690b = aVar != null ? aVar.f188792c : "";
            i0Var2.f191696h = wXMusicVideoObject.singerName;
            i0Var2.f191697i = wXMusicVideoObject.albumName;
            i0Var2.f191691c = wXMusicVideoObject.songLyric;
            i0Var2.f191698j = wXMusicVideoObject.musicGenre;
            i0Var2.f191699k = java.lang.String.valueOf(wXMusicVideoObject.issueDate);
            i0Var2.f191700l = wXMusicVideoObject.identification;
            i0Var2.f191702n = wXMusicVideoObject.duration;
            i0Var2.f191701m = qVar.Z;
            i0Var2.f191703o = wXMusicVideoObject.musicOperationUrl;
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
            i0Var2.f191704p = wXMusicVipInfo != null ? b21.m.e(wXMusicVipInfo.musicId) : "";
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = wXMusicVideoObject.singerName;
            objArr2[1] = java.lang.Boolean.valueOf(wXMusicVideoObject.musicVipInfo != null);
            objArr2[2] = wXMusicVideoObject.identification;
            objArr2[3] = qVar.Z;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "share music mv to chatting, singerName:%s, musicVipInfo is valid:%b, identification: %s, extInfo: %s", objArr2);
            qVar.f(i0Var2);
            return null;
        }
        if (i28 == 4) {
            com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = (com.tencent.mm.opensdk.modelmsg.WXVideoObject) iMediaObject;
            qVar.f348674k = wXVideoObject.videoUrl;
            qVar.f348678l = wXVideoObject.videoLowBandUrl;
            return null;
        }
        if (i28 == 5 || i28 == 54 || i28 == 69) {
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = (com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject;
            qVar.f348674k = wXWebpageObject.webpageUrl;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wXWebpageObject.extInfo)) {
                qVar.f348702r = wXWebpageObject.extInfo;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wXWebpageObject.canvasPageXml)) {
                qVar.C2 = wXWebpageObject.canvasPageXml;
            }
            if (qVar.f348666i != 69 || !(wXWebpageObject instanceof c53.b)) {
                return null;
            }
            c53.b bVar = (c53.b) wXWebpageObject;
            c53.a aVar2 = new c53.a();
            aVar2.f38644b = bVar.f38653a;
            aVar2.f38645c = bVar.f38654b;
            aVar2.f38646d = bVar.f38655c;
            aVar2.f38647e = bVar.f38656d;
            aVar2.f38648f = bVar.f38657e;
            aVar2.f38649g = bVar.f38658f;
            aVar2.f38650h = bVar.f38659g;
            aVar2.f38651i = bVar.f38660h;
            aVar2.f38652j = bVar.f38661i;
            qVar.f(aVar2);
            return null;
        }
        if (i28 == 36 || i28 == 46 || i28 == 48) {
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) iMediaObject;
            qVar.f348673j2 = wXMiniProgramObject.userName;
            qVar.f348669i2 = wXMiniProgramObject.path;
            qVar.f348674k = wXMiniProgramObject.webpageUrl;
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(wXMiniProgramObject.userName);
            if (Bi == null) {
                return null;
            }
            if (Bi.w0() != null) {
                qVar.A2 = Bi.w0().f77444d;
            }
            qVar.B2 = Bi.field_brandIconURL;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "add appbrand version and appbrand icon url : %d, %s", java.lang.Integer.valueOf(qVar.A2), qVar.B2);
            return null;
        }
        if (i28 == 1) {
            qVar.f348654f = ((com.tencent.mm.opensdk.modelmsg.WXTextObject) iMediaObject).text;
            if (aVar == null || (i17 = aVar.f188796g) <= 0) {
                return null;
            }
            rt0.c cVar = new rt0.c();
            cVar.f399374b = i17;
            qVar.f(cVar);
            return null;
        }
        if (i28 == 8) {
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject wXEmojiObject = (com.tencent.mm.opensdk.modelmsg.WXEmojiObject) iMediaObject;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(wXEmojiObject.emojiData)) {
                fp.k.c();
                byte[] bArr4 = wXEmojiObject.emojiData;
                int length4 = bArr4.length;
                qVar.f348682m = bArr4.length;
                return C(bArr4);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(wXEmojiObject.emojiPath)) {
                qVar.f348698q = str;
                return null;
            }
            qVar.f348682m = com.tencent.mm.vfs.w6.k(wXEmojiObject.emojiPath);
            fp.k.c();
            java.lang.String str6 = wXEmojiObject.emojiPath;
            if (qVar.f348682m <= 0) {
                return null;
            }
            qVar.f348690o = com.tencent.mm.vfs.w6.n(str6);
            return wXEmojiObject.emojiPath;
        }
        if (i28 == 15) {
            com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject wXEmojiSharedObject = (com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject) iMediaObject;
            qVar.f348734z = wXEmojiSharedObject.thumburl;
            qVar.f348679l0 = wXEmojiSharedObject.packageflag;
            qVar.f348675k0 = wXEmojiSharedObject.packageid;
            qVar.f348634J = 8;
            qVar.f348674k = wXEmojiSharedObject.url;
            return null;
        }
        if (i28 == 13) {
            com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject wXEmojiSharedObject2 = (com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject) iMediaObject;
            qVar.f348734z = wXEmojiSharedObject2.thumburl;
            qVar.f348679l0 = wXEmojiSharedObject2.packageflag;
            qVar.f348675k0 = wXEmojiSharedObject2.packageid;
            qVar.f348634J = 8;
            qVar.f348674k = wXEmojiSharedObject2.url;
            return null;
        }
        if (i28 == 68) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXLiteAppObject) {
                com.tencent.mm.opensdk.modelmsg.WXLiteAppObject wXLiteAppObject = (com.tencent.mm.opensdk.modelmsg.WXLiteAppObject) iMediaObject;
                h0Var = new com.tencent.mm.pluginsdk.ui.tools.h0();
                h0Var.f191665b = wXLiteAppObject.userName;
                h0Var.f191666c = wXLiteAppObject.path;
                h0Var.f191667d = wXLiteAppObject.query;
                h0Var.f191668e = wXLiteAppObject.source;
                if (iMediaObject instanceof ja3.a) {
                    ja3.a aVar3 = (ja3.a) wXLiteAppObject;
                    h0Var.f191669f = aVar3.f298612a;
                    h0Var.f191670g = aVar3.f298613b;
                    h0Var.f191671h = aVar3.f298614c;
                    h0Var.f191672i = aVar3.f298615d;
                    h0Var.f191673j = aVar3.f298616e;
                    h0Var.f191675l = aVar3.f298617f;
                }
            } else {
                h0Var = null;
            }
            if (h0Var != null) {
                qVar.f348674k = ((com.tencent.mm.opensdk.modelmsg.WXLiteAppObject) iMediaObject).webpageUrl;
                qVar.f(h0Var);
            }
            qVar.f348634J = 0;
            return null;
        }
        if (i28 == 25) {
            com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject wXDesignerSharedObject = (com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject) iMediaObject;
            qVar.f348734z = wXDesignerSharedObject.thumburl;
            qVar.f348674k = wXDesignerSharedObject.url;
            qVar.N1 = wXDesignerSharedObject.designerUIN;
            qVar.O1 = wXDesignerSharedObject.designerName;
            qVar.P1 = wXDesignerSharedObject.designerRediretctUrl;
            qVar.f348634J = 18;
            return null;
        }
        if (i28 == 27 || i28 == 26) {
            com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject wXEmojiPageSharedObject = (com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject) iMediaObject;
            java.lang.String str7 = wXEmojiPageSharedObject.iconUrl;
            qVar.f348734z = str7;
            qVar.f348674k = wXEmojiPageSharedObject.url;
            qVar.Q1 = wXEmojiPageSharedObject.tid;
            qVar.R1 = wXEmojiPageSharedObject.title;
            qVar.S1 = wXEmojiPageSharedObject.desc;
            qVar.T1 = str7;
            qVar.U1 = wXEmojiPageSharedObject.secondUrl;
            qVar.V1 = wXEmojiPageSharedObject.pageType;
            qVar.f348634J = 20;
            return null;
        }
        if (i28 == 97) {
            android.support.v4.media.f.a(iMediaObject);
            throw null;
        }
        if (i28 != 101) {
            return null;
        }
        com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject wXNativeGamePageObject = (com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject) iMediaObject;
        com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = new com.tencent.mm.pluginsdk.ui.tools.g0();
        qVar.f348674k = "https://support.weixin.qq.com/update/";
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = aVar.f188795f;
        if (liteAppBizDataInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "johnjh msg gamepageobject or liteappbizdatainfo is null");
            return null;
        }
        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var2 = new com.tencent.mm.pluginsdk.ui.tools.h0();
        h0Var2.f191665b = liteAppBizDataInfo.f142116d;
        h0Var2.f191666c = liteAppBizDataInfo.f142117e;
        h0Var2.f191667d = liteAppBizDataInfo.f142118f;
        h0Var2.f191668e = liteAppBizDataInfo.f142120h.intValue();
        qVar.f(h0Var2);
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo2 = aVar.f188795f;
        g0Var.f191630b = liteAppBizDataInfo2.f142119g;
        g0Var.f191631c = liteAppBizDataInfo2.f142121i;
        if (wXNativeGamePageObject.isVideo) {
            g0Var.f191635g = 1;
        } else {
            g0Var.f191635g = 0;
        }
        g0Var.f191636h = wXNativeGamePageObject.videoDuration;
        g0Var.f191634f = wXNativeGamePageObject.shareData;
        g0Var.f191633e = aVar.f188794e;
        g0Var.f191637i = 0;
        qVar.f(g0Var);
        return null;
    }

    public static int x(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(j17, str);
        if (J0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str2);
            return -1;
        }
        long j18 = J0.field_status;
        m(true);
        if (j18 != 101) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + str2 + " status:" + J0.field_status);
            return -1;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(J0.field_clientAppDataId) || com.tencent.mm.sdk.platformtools.t8.K0(J0.field_mediaSvrId)) {
            J0.field_status = 105L;
        } else {
            J0.field_status = 102L;
        }
        J0.field_lastModifyTime = c01.id.e();
        com.tencent.mm.pluginsdk.model.app.u5.wi().update(J0, new java.lang.String[0]);
        pt.h0 h0Var = (pt.h0) i95.n0.c(pt.h0.class);
        java.lang.String str3 = J0.field_clientAppDataId;
        if (str3 == null) {
            str3 = "";
        }
        ((ot.i) h0Var).getClass();
        if (r26.i0.y(str3, "newSendFile", false)) {
            pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(j17, str);
            ((ot.g) g0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "cancelTask " + msgIdTalker);
            pu.f0 a17 = pu.f0.f358300m.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.FileAsyncSendFSC", "cancelTask " + msgIdTalker);
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            d75.c cVar = (d75.c) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) pu.f0.f358301n).getValue()).get(msgIdTalker.toString());
            qi3.b0 b0Var = cVar != null ? (qi3.b0) cVar.get() : null;
            h0Var2.f310123d = b0Var;
            if (b0Var != null) {
                b0Var.x();
            }
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) a17.f358304h).getValue(), null, new pu.u(msgIdTalker, h0Var2, null), 1, null);
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) pu.k.f358320i.a().f358324h).getValue(), null, new pu.c(msgIdTalker, null), 1, null);
        }
        return 0;
    }

    public static int y(long j17, java.lang.String str, java.lang.String str2, dn.h hVar, boolean z17) {
        int a17;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() != j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " getmsgFailed id:" + j17);
            a17 = fp.k.a();
        } else {
            ot0.q v17 = ot0.q.v(Li.j());
            if (v17 != null) {
                if (ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i)) && Li.getType() == 10000) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "rebuildXMLAtUploadFin: stop send revoke msg(%s)", java.lang.Long.valueOf(Li.getMsgId()));
                    return -1;
                }
                v17.f348694p = str2;
                if (z17 && hVar != null) {
                    v17.T = hVar.field_aesKey.equals("") ? v17.T : hVar.field_aesKey;
                    v17.L = hVar.field_fileId.equals("") ? v17.L : hVar.field_fileId;
                    v17.f348710t = hVar.field_filemd5.equals("") ? v17.f348710t : hVar.field_filemd5;
                    long j18 = hVar.field_fileLength;
                    if (j18 == 0) {
                        j18 = v17.f348682m;
                    }
                    v17.f348682m = j18;
                    v17.M = hVar.field_thumbUrl.equals("") ? v17.M : hVar.field_thumbUrl;
                }
                Li.d1(ot0.q.u(v17, v17.f348694p, hVar));
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
                ot0.t y07 = com.tencent.mm.pluginsdk.model.app.u5.Ri().y0(str, j17);
                if (y07 != null) {
                    y07.field_xml = Li.j();
                    com.tencent.mm.pluginsdk.model.app.u5.Ri().update(y07, "msgId");
                }
                if (z17) {
                    com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(j17, str);
                    J0.field_mediaSvrId = str2;
                    J0.field_offset = J0.field_totalLen;
                    com.tencent.mm.pluginsdk.model.app.u5.wi().update(J0, new java.lang.String[0]);
                }
                return 0;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " getmsgFailed id:" + j17);
            a17 = fp.k.a();
        }
        return 0 - a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (kotlin.jvm.internal.o.b(r7, (r8 == null || (r8 = (v05.a) r8.getCustom(r8.f432315e + 8)) == null) ? null : r8.getString(r8.f368364d + 1)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair z(com.tencent.mm.storage.f9 r24) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.k0.z(com.tencent.mm.storage.f9):android.util.Pair");
    }
}
