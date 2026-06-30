package qb4;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        r45.jj4 d17 = com.tencent.mm.plugin.sns.model.s5.d(snsInfo, str);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(snsInfo.field_snsId), str);
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", snsInfo.getUserName());
        jq0Var.e(snsInfo.getUserName());
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(snsInfo.getCreateTime() * 1000);
        jq0Var.d(snsInfo.getSnsId() + "");
        jq0Var.i(format);
        gp0Var.g0(format);
        gp0Var.A0(com.tencent.mm.plugin.sns.model.i1.l(d17));
        if (snsInfo.getTimeLine() != null) {
            gp0Var.Z(snsInfo.getTimeLine().canvasInfo);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().canvasInfo)) {
                java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(snsInfo.getTimeLine().canvasInfo, dm.n.COL_ADXML, null);
                if (d18.size() > 0) {
                    java.lang.String str2 = (java.lang.String) d18.get(".adxml.adCanvasInfo.shareTitle");
                    if (str2 == null) {
                        str2 = "";
                    }
                    gp0Var.O0(str2);
                    java.lang.String str3 = (java.lang.String) d18.get(".adxml.adCanvasInfo.shareDesc");
                    gp0Var.m0(str3 != null ? str3 : "");
                }
            }
        }
        h(gp0Var, snsInfo);
        java.lang.String str4 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), d17.f377855d) + ca4.z0.U(d17);
        if (!com.tencent.mm.vfs.w6.j(gp0Var.V) && snsInfo.getUserName().endsWith(com.tencent.mm.plugin.sns.model.l4.sj())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.tencent.mm.vfs.w6.j(str4)) {
            gp0Var.B0(str4);
        } else {
            gp0Var.z0(true);
            gp0Var.o0(d17.f377860i);
            r45.tq0 tq0Var = new r45.tq0();
            tq0Var.o(d17.f377860i);
            bq0Var.r(tq0Var);
        }
        gp0Var.h0(2);
        bq0Var.f370964f.add(gp0Var);
        bq0Var.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return true;
    }

    public static boolean b(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || com.tencent.mm.plugin.sns.storage.w2.f(str) || i17 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cau;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        r45.jj4 c17 = com.tencent.mm.plugin.sns.model.s5.c(k17, i17);
        if (c17 != null) {
            boolean a17 = a(doFavoriteEvent, k17, c17.f377855d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return a17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
        doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return false;
    }

    public static boolean c(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        boolean z17 = false;
        if (doFavoriteEvent == null || !com.tencent.mm.plugin.sns.storage.w2.h(str2) || str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            boolean Xj = com.tencent.mm.plugin.sns.model.l4.Xj();
            am.c4 c4Var = doFavoriteEvent.f54090g;
            if (Xj) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                c4Var.f6326l = com.tencent.mm.R.string.cau;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            } else {
                com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(str2);
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                    c4Var.f6326l = com.tencent.mm.R.string.cad;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                } else if (b17.getTimeLine().ContentObj == null || b17.getTimeLine().ContentObj.f369837e != 26) {
                    r45.jj4 c17 = com.tencent.mm.plugin.sns.model.s5.c(b17, 0);
                    java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(b17.field_snsId), c17 != null ? c17.f377855d : "0");
                    r45.bq0 bq0Var = new r45.bq0();
                    r45.jq0 jq0Var = new r45.jq0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", b17.getUserName());
                    jq0Var.e(b17.getUserName());
                    jq0Var.j(c01.z1.r());
                    jq0Var.g(2);
                    jq0Var.c(b17.getCreateTime() * 1000);
                    jq0Var.d(b17.getSnsId() + "");
                    jq0Var.i(format);
                    jq0Var.f(str);
                    r45.gp0 gp0Var = new r45.gp0();
                    gp0Var.g0(format);
                    z17 = true;
                    if (c17 != null) {
                        java.lang.String str3 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), c17.f377855d) + ca4.z0.U(c17);
                        if (com.tencent.mm.vfs.w6.j(str3)) {
                            gp0Var.B0(str3);
                        } else {
                            gp0Var.z0(true);
                            gp0Var.o0(c17.f377860i);
                            r45.tq0 tq0Var = new r45.tq0();
                            tq0Var.o(c17.f377860i);
                            bq0Var.r(tq0Var);
                        }
                    } else {
                        gp0Var.z0(true);
                    }
                    gp0Var.h0(5);
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = b17.getTimeLine();
                    gp0Var.O0(timeLine.ContentObj.f369838f);
                    gp0Var.m0(timeLine.ContentObj.f369836d);
                    gp0Var.Z(timeLine.canvasInfo);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLine.canvasInfo)) {
                        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(timeLine.canvasInfo, dm.n.COL_ADXML, null);
                        if (d17.size() > 0) {
                            java.lang.String str4 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareTitle");
                            if (str4 == null) {
                                str4 = "";
                            }
                            gp0Var.O0(str4);
                            java.lang.String str5 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareDesc");
                            gp0Var.m0(str5 != null ? str5 : "");
                        }
                    }
                    i(gp0Var, timeLine);
                    gp0Var.x0(true);
                    bq0Var.f370964f.add(gp0Var);
                    r45.tq0 tq0Var2 = new r45.tq0();
                    tq0Var2.f386674q = timeLine.contentattr;
                    tq0Var2.f386675r = true;
                    tq0Var2.p(gp0Var.f375404d);
                    r45.y97 y97Var = timeLine.webSearchInfo;
                    if (y97Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(y97Var.f390898d)) {
                        su4.l2 l2Var = new su4.l2();
                        r45.y97 y97Var2 = timeLine.webSearchInfo;
                        l2Var.f412983b = y97Var2.f390898d;
                        l2Var.f412984c = y97Var2.f390899e;
                        l2Var.f412985d = y97Var2.f390900f;
                        l2Var.f412986e = y97Var2.f390901g;
                        l2Var.f412987f = y97Var2.f390902h;
                        l2Var.f412988g = y97Var2.f390904m;
                        l2Var.f412989h = y97Var2.f390905n;
                        l2Var.f412990i = y97Var2.f390906o;
                        l2Var.f412991j = y97Var2.f390907p;
                        l2Var.f412992k = y97Var2.f390908q;
                        l2Var.f412993l = y97Var2.f390909r;
                        l2Var.f412994m = y97Var2.f390910s;
                        l2Var.f412995n = y97Var2.f390911t;
                        l2Var.f412996o = y97Var2.f390903i;
                        l2Var.f412997p = y97Var2.f390912u;
                        l2Var.f412998q = y97Var2.f390913v;
                        l2Var.f412999r = y97Var2.f390914w;
                        l2Var.f413000s = y97Var2.f390915x;
                        l2Var.f413001t = y97Var2.f390916y;
                        l2Var.f413002u = y97Var2.f390917z;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        l2Var.c(sb6, null, null, null, 0, 0);
                        tq0Var2.q(sb6.toString());
                    }
                    bq0Var.r(tq0Var2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    r45.hh4 hh4Var = timeLine.ContentObj.f369843n;
                    if (hh4Var == null || hh4Var.f376149d == -1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    } else {
                        r45.qp0 qp0Var = new r45.qp0();
                        bq0Var.k(qp0Var);
                        qp0Var.f384163e = timeLine.ContentObj.f369843n.f376150e;
                        qp0Var.f384162d = hh4Var.f376149d;
                        qp0Var.f384176u = hh4Var.f376159q;
                        qp0Var.f384166h = hh4Var.f376154i;
                        qp0Var.f384167i = hh4Var.f376155m;
                        qp0Var.f384171p = hh4Var.f376157o;
                        qp0Var.f384168m = hh4Var.f376156n;
                        qp0Var.f384164f = hh4Var.f376152g;
                        qp0Var.f384165g = hh4Var.f376153h;
                        qp0Var.f384169n = timeLine.publicUserName;
                        qp0Var.f384170o = timeLine.sourceNickName;
                        qp0Var.f384173r = hh4Var.f376158p;
                        tq0Var2.j(hh4Var.f376151f);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    }
                    bq0Var.o(jq0Var);
                    c4Var.f6315a = bq0Var;
                    c4Var.f6319e = timeLine.ContentObj.f369838f;
                    c4Var.f6317c = 5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                } else {
                    z17 = g(doFavoriteEvent, str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return z17;
    }

    public static boolean d(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cau;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (snsInfo != null) {
            boolean a17 = a(doFavoriteEvent, snsInfo, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return a17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
        doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(com.tencent.mm.autogen.events.DoFavoriteEvent r18, com.tencent.mm.plugin.sns.storage.SnsInfo r19) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb4.a.e(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public static boolean f(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, java.lang.CharSequence charSequence, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || com.tencent.mm.plugin.sns.storage.w2.f(str) || charSequence == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cau;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        long j17 = k17.field_snsId;
        if (0 == j17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cab;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        java.lang.String format = java.lang.String.format("%s#%d_%d", ca4.z0.t0(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s, startOffset %d, endOffset %d", k17.getUserName(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        jq0Var.e(k17.getUserName());
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(k17.getCreateTime() * 1000);
        jq0Var.d(k17.getSnsId() + "");
        jq0Var.i(format);
        bq0Var.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6315a = bq0Var;
        c4Var.f6319e = charSequence.toString();
        doFavoriteEvent.f54090g.f6317c = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return true;
    }

    public static boolean g(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || !com.tencent.mm.plugin.sns.storage.w2.h(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cau;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cad;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        r45.jj4 c17 = com.tencent.mm.plugin.sns.model.s5.c(b17, 0);
        java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(b17.field_snsId), c17 != null ? c17.f377855d : "0");
        r45.jq0 jq0Var = new r45.jq0();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = b17.getTimeLine();
        if (timeLine == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, tlObj is null , return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, from %s", b17.getUserName());
        jq0Var.e(b17.getUserName());
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(b17.getCreateTime() * 1000);
        jq0Var.d(b17.getSnsId() + "");
        jq0Var.i(format);
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 30;
        z9Var.f8540m = 4;
        z9Var.f8530c = timeLine.ContentObj.f369842m;
        favoriteOperationEvent.e();
        z9Var.f8531d.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        r45.bq0 bq0Var = z9Var.f8531d;
        c4Var.f6315a = bq0Var;
        if (bq0Var != null && (linkedList = bq0Var.f370964f) != null) {
            for (int i17 = 0; i17 < linkedList.size(); i17++) {
                r45.gp0 gp0Var = (r45.gp0) linkedList.get(i17);
                if (gp0Var != null) {
                    gp0Var.x0(true);
                    gp0Var.z0(true);
                }
            }
        }
        java.lang.String str2 = timeLine.ContentObj.f369838f;
        am.c4 c4Var2 = doFavoriteEvent.f54090g;
        c4Var2.f6319e = str2;
        c4Var2.f6317c = 18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return true;
    }

    public static void h(r45.gp0 gp0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (gp0Var != null && snsInfo != null) {
            i(gp0Var, snsInfo.getTimeLine());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
    }

    public static void i(r45.gp0 gp0Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (gp0Var != null && timeLineObject != null && !com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.statExtStr)) {
            gp0Var.H0(timeLineObject.statExtStr);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(com.tencent.mm.autogen.events.DoFavoriteEvent r16, com.tencent.mm.plugin.sns.storage.SnsInfo r17, r45.jj4 r18, com.tencent.mm.protocal.protobuf.TimeLineObject r19, r45.xs4 r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb4.a.j(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, com.tencent.mm.protocal.protobuf.TimeLineObject, r45.xs4, java.lang.String):boolean");
    }
}
