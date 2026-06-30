package o72;

/* loaded from: classes9.dex */
public class r2 extends dm.n3 implements z30.v {
    public static final l75.e0 F1 = dm.n3.initAutoDBInfo(o72.r2.class);
    public static final o72.q2 G1 = new o72.o2();
    public static final o72.q2 H1 = new o72.p2();
    public boolean B1 = false;
    public o72.r2 C1 = null;
    public java.lang.String D1 = "";
    public java.lang.String E1 = "";

    public r2() {
        this.field_flag = -1;
        this.field_fromUser = "";
        this.field_toUser = "";
        this.field_id = -1;
        this.field_realChatName = "";
        this.field_sourceType = -1;
        this.field_updateTime = -1L;
        this.field_type = -1;
        this.field_updateSeq = -1;
        this.field_xml = "";
        this.field_itemStatus = 0;
        W0();
    }

    public static void A0(java.lang.String str, o72.q2 q2Var, r45.aq0 aq0Var) {
        if (aq0Var == null) {
            return;
        }
        q2Var.a(str + " ----product item----");
        q2Var.a(str + "  title: " + aq0Var.f370188d);
        q2Var.a(str + "  desc: " + aq0Var.f370190f);
        q2Var.a(str + "  thumbUrl: " + aq0Var.f370192h);
        q2Var.a(str + "  type: " + aq0Var.f370196o);
    }

    public static void D0(java.lang.String str, o72.q2 q2Var, r45.mq0 mq0Var) {
        if (mq0Var == null) {
            return;
        }
        q2Var.a(str + " ----tv item----");
        q2Var.a(str + "  title: " + mq0Var.f380735d);
        q2Var.a(str + "  desc: " + mq0Var.f380737f);
        q2Var.a(str + "  thumbUrl: " + mq0Var.f380739h);
    }

    public static void F0(java.lang.String str, o72.q2 q2Var, r45.tq0 tq0Var) {
        if (tq0Var == null) {
            return;
        }
        q2Var.a(str + " ----url item----");
        q2Var.a(str + "  title: " + tq0Var.f386664d);
        q2Var.a(str + "  desc: " + tq0Var.f386666f);
        q2Var.a(str + "  cleanUrl: " + tq0Var.f386668h);
        q2Var.a(str + "  thumbUrl: " + tq0Var.f386670m);
        q2Var.a(str + "  opencache: " + tq0Var.f386672o);
        q2Var.a(str + "  topstory: " + tq0Var.f386678u);
    }

    public static java.lang.String G0(o72.r2 r2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String sb6;
        java.util.List<r45.np0> list;
        java.util.LinkedList linkedList;
        java.lang.String str9;
        o72.d3 d3Var = o72.d3.f343321a;
        if (o72.d3.f343322b) {
            r72.k kVar = new r72.k();
            r72.l.a(kVar, r2Var);
            java.lang.String xml = kVar.toXml();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavItemInfo", "[getXml] newXml = " + xml);
            return xml;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemInfo", "[getXml] old xml serial logic");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<favitem type='");
        stringBuffer.append(r2Var.field_type);
        stringBuffer.append("'>");
        r45.bq0 bq0Var = r2Var.field_favProto;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (bq0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavProtoItemParser", "FavProtoItem null, info localid:" + r2Var.field_localId + ", type:" + r2Var.field_type);
            jx3.f.INSTANCE.d(22021, 20251031, java.lang.Integer.valueOf(r2Var.field_type), "FavProtoItem null");
            sb6 = "";
            str3 = sb6;
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bq0Var.f370972q)) {
                sb7.append("<title>");
                sb7.append(com.tencent.mm.sdk.platformtools.t8.p(bq0Var.f370972q));
                sb7.append("</title>");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bq0Var.f370974s)) {
                sb7.append("<desc>");
                sb7.append(com.tencent.mm.sdk.platformtools.t8.p(bq0Var.f370974s));
                sb7.append("</desc>");
            }
            if (bq0Var.A > 0) {
                sb7.append("<edittime>");
                sb7.append(bq0Var.A);
                sb7.append("</edittime>");
            }
            r45.sp0 sp0Var = bq0Var.G;
            if (sp0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(sp0Var.f385892e)) {
                sb7.append("<editusr>");
                sb7.append(bq0Var.G.f385892e);
                sb7.append("</editusr>");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bq0Var.f370970o)) {
                sb7.append("<remark ");
                if (bq0Var.f370976u > 0) {
                    sb7.append(" time ='");
                    sb7.append(bq0Var.f370976u);
                    sb7.append("'");
                }
                sb7.append(">");
                sb7.append(com.tencent.mm.sdk.platformtools.t8.p(bq0Var.f370970o));
                sb7.append("</remark>");
            }
            if (bq0Var.f370979x) {
                sb7.append("<ctrlflag>");
                sb7.append(bq0Var.f370978w);
                sb7.append("</ctrlflag>");
            }
            if (bq0Var.F) {
                sb7.append("<version>");
                sb7.append(bq0Var.E);
                sb7.append("</version>");
            } else if (r2Var.field_type == 18) {
                sb7.append("<version>1</version>");
            }
            if (bq0Var.S && !com.tencent.mm.sdk.platformtools.t8.K0(bq0Var.R)) {
                sb7.append("<deviceid>");
                sb7.append(bq0Var.R);
                sb7.append("</deviceid>");
            }
            r45.jq0 jq0Var = bq0Var.f370962d;
            if (jq0Var == null || jq0Var.computeSize() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavSourceItemParser", "klem toXml, source item empty");
                str = "";
            } else {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<source");
                if (jq0Var.f378035e) {
                    stringBuffer2.append(" sourcetype='");
                    stringBuffer2.append(jq0Var.f378034d);
                    stringBuffer2.append("'");
                }
                if (jq0Var.f378041n) {
                    stringBuffer2.append(" sourceid='");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378040m));
                    stringBuffer2.append("'");
                }
                stringBuffer2.append(">");
                if (jq0Var.f378037g) {
                    stringBuffer2.append("<fromusr>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378036f));
                    stringBuffer2.append("</fromusr>");
                }
                if (jq0Var.f378039i) {
                    stringBuffer2.append("<tousr>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378038h));
                    stringBuffer2.append("</tousr>");
                }
                if (jq0Var.f378043p) {
                    stringBuffer2.append("<realchatname>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378042o));
                    stringBuffer2.append("</realchatname>");
                }
                if (jq0Var.f378047t) {
                    stringBuffer2.append("<msgid>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378046s));
                    stringBuffer2.append("</msgid>");
                }
                if (jq0Var.f378049v) {
                    stringBuffer2.append("<eventid>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378048u));
                    stringBuffer2.append("</eventid>");
                }
                if (jq0Var.f378051x) {
                    stringBuffer2.append("<appid>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378050w));
                    stringBuffer2.append("</appid>");
                }
                if (jq0Var.f378041n) {
                    stringBuffer2.append("<sourceid>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378040m));
                    stringBuffer2.append("</sourceid>");
                }
                if (jq0Var.f378053z) {
                    stringBuffer2.append("<link>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.f378052y));
                    stringBuffer2.append("</link>");
                }
                if (jq0Var.C) {
                    stringBuffer2.append("<brandid>");
                    stringBuffer2.append(com.tencent.mm.sdk.platformtools.t8.p(jq0Var.B));
                    stringBuffer2.append("</brandid>");
                }
                stringBuffer2.append("</source>");
                str = stringBuffer2.toString();
            }
            sb7.append(str);
            sb7.append(q72.a.f(bq0Var.f370964f));
            r45.pp0 pp0Var = r2Var.field_favProto.f370966h;
            if (pp0Var == null || pp0Var.computeSize() == 0) {
                str2 = "";
            } else {
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("<locitem>");
                if (pp0Var.f383273n) {
                    stringBuffer3.append("<label>");
                    stringBuffer3.append(com.tencent.mm.sdk.platformtools.t8.p(pp0Var.f383272m));
                    stringBuffer3.append("</label>");
                }
                if (pp0Var.f383269g) {
                    stringBuffer3.append("<lat>");
                    stringBuffer3.append(pp0Var.f383268f);
                    stringBuffer3.append("</lat>");
                }
                if (pp0Var.f383267e) {
                    stringBuffer3.append("<lng>");
                    stringBuffer3.append(pp0Var.f383266d);
                    stringBuffer3.append("</lng>");
                }
                if (pp0Var.f383271i) {
                    stringBuffer3.append("<scale>");
                    stringBuffer3.append(pp0Var.f383270h);
                    stringBuffer3.append("</scale>");
                }
                if (pp0Var.f383275p) {
                    stringBuffer3.append("<poiname>");
                    stringBuffer3.append(com.tencent.mm.sdk.platformtools.t8.p(pp0Var.f383274o));
                    stringBuffer3.append("</poiname>");
                }
                if (pp0Var.f383277r) {
                    stringBuffer3.append("<poiid>");
                    stringBuffer3.append(com.tencent.mm.sdk.platformtools.t8.p(pp0Var.f383276q));
                    stringBuffer3.append("</poiid>");
                }
                if (pp0Var.f383279t) {
                    stringBuffer3.append("<poiCategoryTips>");
                    stringBuffer3.append(com.tencent.mm.sdk.platformtools.t8.p(pp0Var.f383278s));
                    stringBuffer3.append("</poiCategoryTips>");
                }
                if (pp0Var.f383281v) {
                    stringBuffer3.append("<poiBusinessHour>");
                    stringBuffer3.append(pp0Var.f383280u);
                    stringBuffer3.append("</poiBusinessHour>");
                }
                if (pp0Var.f383283x) {
                    stringBuffer3.append("<poiPhone>");
                    stringBuffer3.append(pp0Var.f383282w);
                    stringBuffer3.append("</poiPhone>");
                }
                if (pp0Var.f383285z) {
                    stringBuffer3.append("<poiPriceTips>");
                    stringBuffer3.append(pp0Var.f383284y);
                    stringBuffer3.append("</poiPriceTips>");
                }
                if (pp0Var.B) {
                    stringBuffer3.append("<isfrompoilist>");
                    stringBuffer3.append(pp0Var.A ? "1" : "0");
                    stringBuffer3.append("</isfrompoilist>");
                }
                if (pp0Var.D) {
                    stringBuffer3.append("<buildingId>");
                    stringBuffer3.append(pp0Var.C);
                    stringBuffer3.append("</buildingId>");
                }
                if (pp0Var.F) {
                    stringBuffer3.append("<floorName>");
                    stringBuffer3.append(com.tencent.mm.sdk.platformtools.t8.p(pp0Var.E));
                    stringBuffer3.append("</floorName>");
                }
                stringBuffer3.append("</locitem>");
                str2 = stringBuffer3.toString();
            }
            sb7.append(str2);
            r45.tq0 tq0Var = r2Var.field_favProto.f370968m;
            if (tq0Var == null || tq0Var.computeSize() == 0) {
                str3 = "";
                str4 = str3;
            } else {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("<weburlitem>");
                if (tq0Var.f386669i) {
                    stringBuffer4.append("<clean_url>");
                    stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(tq0Var.f386668h));
                    stringBuffer4.append("</clean_url>");
                }
                if (tq0Var.f386667g) {
                    stringBuffer4.append("<pagedesc>");
                    stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(tq0Var.f386666f));
                    stringBuffer4.append("</pagedesc>");
                }
                if (tq0Var.f386671n) {
                    stringBuffer4.append("<pagethumb_url>");
                    stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(tq0Var.f386670m));
                    stringBuffer4.append("</pagethumb_url>");
                }
                if (tq0Var.f386665e) {
                    stringBuffer4.append("<pagetitle>");
                    stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(tq0Var.f386664d));
                    stringBuffer4.append("</pagetitle>");
                }
                if (tq0Var.f386673p) {
                    stringBuffer4.append("<opencache>");
                    stringBuffer4.append(tq0Var.f386672o);
                    stringBuffer4.append("</opencache>");
                }
                if (tq0Var.f386675r) {
                    stringBuffer4.append("<contentattr>");
                    stringBuffer4.append(tq0Var.f386674q);
                    stringBuffer4.append("</contentattr>");
                }
                if (tq0Var.f386677t) {
                    stringBuffer4.append("<canvasPageXml>");
                    stringBuffer4.append(tq0Var.f386676s);
                    stringBuffer4.append("</canvasPageXml>");
                }
                if (tq0Var.B) {
                    stringBuffer4.append("<extraparam>");
                    stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(tq0Var.A));
                    stringBuffer4.append("</extraparam>");
                }
                if (tq0Var.f386679v) {
                    stringBuffer4.append("<wsVideoFlowXml>");
                    stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(tq0Var.f386678u));
                    stringBuffer4.append("</wsVideoFlowXml>");
                }
                stringBuffer4.append("<forwardflag>");
                stringBuffer4.append(tq0Var.f386680w);
                stringBuffer4.append("</forwardflag>");
                if (!tq0Var.f386683z || (linkedList = tq0Var.f386682y) == null || linkedList.size() == 0) {
                    str3 = "";
                } else {
                    stringBuffer4.append("<excerptlist>");
                    str3 = "";
                    int i17 = 0;
                    while (i17 < tq0Var.f386682y.size()) {
                        r45.np0 np0Var = (r45.np0) tq0Var.f386682y.get(i17);
                        stringBuffer4.append("<excerptitem><content>");
                        stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(np0Var.f381565e));
                        stringBuffer4.append("</content><excerptkey>");
                        stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(np0Var.f381564d));
                        stringBuffer4.append("</excerptkey><excerpturl>");
                        stringBuffer4.append(com.tencent.mm.sdk.platformtools.t8.p(np0Var.f381566f));
                        stringBuffer4.append("</excerpturl></excerptitem>");
                        i17++;
                        tq0Var = tq0Var;
                    }
                    stringBuffer4.append("</excerptlist>");
                }
                stringBuffer4.append(q72.b.c(r2Var.field_favProto.K));
                stringBuffer4.append("</weburlitem>");
                str4 = stringBuffer4.toString();
            }
            sb7.append(str4);
            r45.aq0 aq0Var = r2Var.field_favProto.f370980y;
            if (aq0Var == null || aq0Var.computeSize() == 0) {
                str5 = str3;
            } else {
                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("<productitem");
                if (aq0Var.f370197p) {
                    stringBuffer5.append(" type='");
                    stringBuffer5.append(aq0Var.f370196o);
                    stringBuffer5.append("'");
                }
                stringBuffer5.append(">");
                if (aq0Var.f370189e) {
                    stringBuffer5.append("<producttitle>");
                    stringBuffer5.append(com.tencent.mm.sdk.platformtools.t8.p(aq0Var.f370188d));
                    stringBuffer5.append("</producttitle>");
                }
                if (aq0Var.f370191g) {
                    stringBuffer5.append("<productdesc>");
                    stringBuffer5.append(com.tencent.mm.sdk.platformtools.t8.p(aq0Var.f370190f));
                    stringBuffer5.append("</productdesc>");
                }
                if (aq0Var.f370193i) {
                    stringBuffer5.append("<productthumb_url>");
                    stringBuffer5.append(com.tencent.mm.sdk.platformtools.t8.p(aq0Var.f370192h));
                    stringBuffer5.append("</productthumb_url>");
                }
                if (aq0Var.f370195n) {
                    stringBuffer5.append("<productinfo>");
                    stringBuffer5.append(com.tencent.mm.sdk.platformtools.t8.p(aq0Var.f370194m));
                    stringBuffer5.append("</productinfo>");
                }
                stringBuffer5.append("</productitem>");
                str5 = stringBuffer5.toString();
            }
            sb7.append(str5);
            r45.mq0 mq0Var = r2Var.field_favProto.C;
            if (mq0Var == null || mq0Var.computeSize() == 0) {
                str6 = str3;
            } else {
                java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("<tvitem>");
                if (mq0Var.f380736e) {
                    stringBuffer6.append("<tvtitle>");
                    stringBuffer6.append(com.tencent.mm.sdk.platformtools.t8.p(mq0Var.f380735d));
                    stringBuffer6.append("</tvtitle>");
                }
                if (mq0Var.f380738g) {
                    stringBuffer6.append("<tvdesc>");
                    stringBuffer6.append(com.tencent.mm.sdk.platformtools.t8.p(mq0Var.f380737f));
                    stringBuffer6.append("</tvdesc>");
                }
                if (mq0Var.f380740i) {
                    stringBuffer6.append("<tvthumb_url>");
                    stringBuffer6.append(com.tencent.mm.sdk.platformtools.t8.p(mq0Var.f380739h));
                    stringBuffer6.append("</tvthumb_url>");
                }
                if (mq0Var.f380742n) {
                    stringBuffer6.append("<tvinfo>");
                    stringBuffer6.append(com.tencent.mm.sdk.platformtools.t8.p(mq0Var.f380741m));
                    stringBuffer6.append("</tvinfo>");
                }
                stringBuffer6.append("</tvitem>");
                str6 = stringBuffer6.toString();
            }
            sb7.append(str6);
            r45.sp0 sp0Var2 = bq0Var.G;
            if (sp0Var2 == null || sp0Var2.computeSize() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavNoteInfoItemParser", "klem toXml, source item empty");
                str7 = str3;
            } else {
                java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer("<noteinfo><noteauthor>");
                stringBuffer7.append(com.tencent.mm.sdk.platformtools.t8.p(sp0Var2.f385891d));
                stringBuffer7.append("</noteauthor><noteeditor>");
                stringBuffer7.append(com.tencent.mm.sdk.platformtools.t8.p(sp0Var2.f385892e));
                stringBuffer7.append("</noteeditor></noteinfo>");
                str7 = stringBuffer7.toString();
            }
            sb7.append(str7);
            sb7.append(zy2.d5.f(bq0Var.M));
            sb7.append(zy2.d5.e(bq0Var.Q));
            r45.dp0 dp0Var = r2Var.field_favProto.I;
            sb7.append(dp0Var == null ? str3 : "<appbranditem><username>" + com.tencent.mm.sdk.platformtools.t8.p(dp0Var.f372634d) + "</username><appid>" + com.tencent.mm.sdk.platformtools.t8.p(dp0Var.f372635e) + "</appid><pkgtype>" + dp0Var.f372636f + "</pkgtype><iconurl>" + com.tencent.mm.sdk.platformtools.t8.p(dp0Var.f372637g) + "</iconurl><type>" + dp0Var.f372638h + "</type><pagepath>" + com.tencent.mm.sdk.platformtools.t8.p(dp0Var.f372639i) + "</pagepath><sourcedisplayname>" + com.tencent.mm.sdk.platformtools.t8.p(dp0Var.f372640m) + "</sourcedisplayname><version>" + dp0Var.f372641n + "</version><disableforward>" + dp0Var.f372642o + "</disableforward><tradingguaranteeflag>" + dp0Var.f372643p + "</tradingguaranteeflag><showRelievedBuyFlag>" + dp0Var.f372646s + "</showRelievedBuyFlag><messageextradata>" + java.lang.String.format("<![CDATA[%s]]>", dp0Var.f372644q) + "</messageextradata><subtype>" + dp0Var.f372645r + "</subtype></appbranditem>");
            r45.op0 op0Var = r2Var.field_favProto.P;
            if (op0Var == null || op0Var.computeSize() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavAskItemParser", "klem toXml, ask item empty");
                str8 = str3;
            } else {
                java.lang.StringBuffer stringBuffer8 = new java.lang.StringBuffer("<liteappitem><fallbackurl>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382407d));
                stringBuffer8.append("</fallbackurl><subtype>");
                stringBuffer8.append(op0Var.f382408e);
                stringBuffer8.append("</subtype><nickname>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382410g));
                stringBuffer8.append("</nickname><des>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382413m));
                stringBuffer8.append("</des><title>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382412i));
                stringBuffer8.append("</title><jumptype>");
                stringBuffer8.append(op0Var.f382414n);
                stringBuffer8.append("</jumptype><mediatype>");
                stringBuffer8.append(op0Var.f382411h);
                stringBuffer8.append("</mediatype><query>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382416p));
                stringBuffer8.append("</query><pagepath>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382415o));
                stringBuffer8.append("</pagepath><appid>");
                stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382417q));
                stringBuffer8.append("</appid><istransparent>");
                stringBuffer8.append(op0Var.f382419s ? 1 : 0);
                stringBuffer8.append("</istransparent><forbidforward>");
                stringBuffer8.append(op0Var.f382420t ? 1 : 0);
                stringBuffer8.append("</forbidforward>");
                java.lang.String str10 = op0Var.f382409f;
                if (str10 != null && str10.length() > 0) {
                    stringBuffer8.append("<thumburl>");
                    stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(op0Var.f382409f));
                    stringBuffer8.append("</thumburl>");
                }
                java.util.LinkedList favLineExcerptList = op0Var.f382421u;
                kotlin.jvm.internal.o.f(favLineExcerptList, "favLineExcerptList");
                if (favLineExcerptList.isEmpty()) {
                    list = kz5.p0.f313996d;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : favLineExcerptList) {
                        r45.np0 np0Var2 = (r45.np0) obj;
                        if ((com.tencent.mm.sdk.platformtools.t8.K0(np0Var2.f381564d) || com.tencent.mm.sdk.platformtools.t8.K0(np0Var2.f381565e) || com.tencent.mm.sdk.platformtools.t8.K0(np0Var2.f381566f)) ? false : true) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                }
                if (!list.isEmpty()) {
                    stringBuffer8.append("<excerptlist>");
                    for (r45.np0 np0Var3 : list) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(np0Var3.f381564d) && !com.tencent.mm.sdk.platformtools.t8.K0(np0Var3.f381565e) && !com.tencent.mm.sdk.platformtools.t8.K0(np0Var3.f381566f)) {
                            stringBuffer8.append("<excerptitem><excerptkey>");
                            stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(np0Var3.f381564d));
                            stringBuffer8.append("</excerptkey><excerpturl>");
                            stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(np0Var3.f381566f));
                            stringBuffer8.append("</excerpturl><content>");
                            stringBuffer8.append(com.tencent.mm.sdk.platformtools.t8.p(np0Var3.f381565e));
                            stringBuffer8.append("</content></excerptitem>");
                        }
                    }
                    stringBuffer8.append("</excerptlist>");
                }
                stringBuffer8.append("</liteappitem>");
                str8 = stringBuffer8.toString();
                kotlin.jvm.internal.o.f(str8, "toString(...)");
            }
            sb7.append(str8);
            sb6 = sb7.toString();
        }
        stringBuffer.append(sb6);
        r45.rq0 rq0Var = r2Var.field_tagProto;
        if (rq0Var != null) {
            java.util.LinkedList linkedList2 = rq0Var.f385096e;
            boolean isEmpty = linkedList2.isEmpty();
            java.util.LinkedList linkedList3 = rq0Var.f385095d;
            if (!isEmpty || !linkedList3.isEmpty()) {
                java.lang.StringBuffer stringBuffer9 = new java.lang.StringBuffer("<taglist count='");
                int size = linkedList2.size();
                stringBuffer9.append(size);
                stringBuffer9.append("'>");
                for (int i18 = 0; i18 < size; i18++) {
                    stringBuffer9.append("<tag>");
                    stringBuffer9.append(com.tencent.mm.sdk.platformtools.t8.p((java.lang.String) linkedList2.get(i18)));
                    stringBuffer9.append("</tag>");
                }
                stringBuffer9.append("</taglist><recommendtaglist count='");
                int size2 = linkedList3.size();
                stringBuffer9.append(size2);
                stringBuffer9.append("'>");
                for (int i19 = 0; i19 < size2; i19++) {
                    stringBuffer9.append("<tag>");
                    stringBuffer9.append(com.tencent.mm.sdk.platformtools.t8.p((java.lang.String) linkedList3.get(i19)));
                    stringBuffer9.append("</tag>");
                }
                stringBuffer9.append("</recommendtaglist>");
                str9 = stringBuffer9.toString();
                stringBuffer.append(str9);
                stringBuffer.append("</favitem>");
                java.lang.String stringBuffer10 = stringBuffer.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.FavItemInfo", "[getXml] oldXml = " + stringBuffer10);
                return stringBuffer10;
            }
        }
        str9 = str3;
        stringBuffer.append(str9);
        stringBuffer.append("</favitem>");
        java.lang.String stringBuffer102 = stringBuffer.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemInfo", "[getXml] oldXml = " + stringBuffer102);
        return stringBuffer102;
    }

    public static void y0(java.lang.String str, o72.q2 q2Var, r45.pp0 pp0Var) {
        if (pp0Var == null) {
            return;
        }
        q2Var.a(str + " ----loc item----");
        q2Var.a(str + "  lng: " + pp0Var.f383266d);
        q2Var.a(str + "  lat: " + pp0Var.f383268f);
        q2Var.a(str + "  scale: " + pp0Var.f383270h);
        q2Var.a(str + "  label: " + pp0Var.f383272m);
        q2Var.a(str + "  poiname: " + pp0Var.f383274o);
    }

    public static void z0(java.lang.String str, o72.q2 q2Var, r45.sp0 sp0Var) {
        if (sp0Var == null) {
            return;
        }
        q2Var.a(str + " ----noteInfoItem item----");
        q2Var.a(str + "  author: " + sp0Var.f385891d);
        q2Var.a(str + "  editor: " + sp0Var.f385892e);
    }

    public boolean I0() {
        return this.field_itemStatus == 10;
    }

    public boolean J0() {
        return this.field_itemStatus == 7;
    }

    public boolean L0() {
        int i17 = this.field_itemStatus;
        return i17 == 15 || i17 == 16;
    }

    public boolean P0() {
        int i17 = this.field_itemStatus;
        return i17 == 3 || i17 == 6 || i17 == 11 || i17 == 14 || i17 == 16 || i17 == 18;
    }

    public boolean Q0() {
        int i17 = this.field_itemStatus;
        return i17 == 1 || i17 == 4 || i17 == 9 || i17 == 12 || i17 == 13 || i17 == 15 || i17 == 17;
    }

    public boolean R0() {
        int i17 = this.field_itemStatus;
        return i17 == 12 || i17 == 13 || i17 == 14;
    }

    public java.util.Set T0(java.util.Collection collection) {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.field_tagProto.f385096e);
        this.field_tagProto.f385096e.clear();
        if (collection != null && !collection.isEmpty()) {
            this.field_tagProto.f385096e.addAll(collection);
            hashSet.removeAll(collection);
        }
        return hashSet;
    }

    public boolean U0(java.lang.String str) {
        if (str == null || str.equals("")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavItemInfo", "klem, FavItemInfo xml null");
            return false;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "favitem", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavItemInfo", "klem, FavItemInfo maps null");
            return false;
        }
        o72.d3 d3Var = o72.d3.f343321a;
        if (o72.d3.f343322b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavItemInfo", "open new xml serial logic");
            r72.k kVar = new r72.k();
            kVar.fromXml(str);
            r72.l.b(kVar, this);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemInfo", "use old version xml serial logic");
        try {
            W0();
            boolean c17 = q72.c.c(str, d17, this.field_favProto);
            r45.bq0 bq0Var = this.field_favProto;
            r45.jq0 jq0Var = bq0Var.f370962d;
            if (jq0Var != null) {
                this.field_sourceId = jq0Var.f378040m;
                this.field_sourceType = jq0Var.f378034d;
                this.field_fromUser = jq0Var.f378036f;
                this.field_toUser = jq0Var.f378038h;
                this.field_realChatName = jq0Var.f378042o;
            }
            this.field_edittime = bq0Var.A;
            q72.d.a(d17, this.field_tagProto);
            return c17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavItemInfo", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.FavItemInfo", "klem , FavItemInfo exception:+%s", e17.toString());
            return false;
        }
    }

    public void W0() {
        this.field_favProto = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.g(1);
        this.field_favProto.o(jq0Var);
        this.field_favProto.r(new r45.tq0());
        this.field_favProto.k(new r45.qp0());
        this.field_favProto.j(new r45.pp0());
        this.field_favProto.n(new r45.aq0());
        this.field_favProto.q(new r45.mq0());
        this.field_favProto.i(new r45.kv2());
        this.field_favProto.Q = new r45.ev2();
        this.field_favProto.c(-1);
        this.field_favProto.P = new r45.op0();
        this.field_tagProto = new r45.rq0();
        this.field_favProto.l(new r45.sp0());
    }

    @Override // dm.n3, l75.f0
    public l75.e0 getDBInfo() {
        return F1;
    }

    public long getLocalId() {
        return this.field_localId;
    }

    public int getType() {
        return this.field_type;
    }

    public boolean t0() {
        return (this.field_favProto.f370978w & 1) != 0;
    }

    public boolean u0() {
        return (this.field_favProto.f370978w & 2) != 0;
    }

    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public o72.r2 clone() {
        o72.r2 r2Var = new o72.r2();
        r2Var.field_favProto = this.field_favProto;
        r2Var.field_sourceId = this.field_sourceId;
        r2Var.field_edittime = this.field_edittime;
        r2Var.field_ext = this.field_ext;
        r2Var.field_flag = this.field_flag;
        r2Var.field_fromUser = this.field_fromUser;
        r2Var.field_id = this.field_id;
        r2Var.field_itemStatus = this.field_itemStatus;
        r2Var.field_localId = this.field_localId;
        r2Var.field_localSeq = this.field_localSeq;
        r2Var.field_realChatName = this.field_realChatName;
        r2Var.field_tagProto = this.field_tagProto;
        r2Var.field_sourceCreateTime = this.field_sourceCreateTime;
        r2Var.field_updateSeq = this.field_updateSeq;
        r2Var.field_toUser = this.field_toUser;
        r2Var.field_updateTime = this.field_updateTime;
        r2Var.field_type = this.field_type;
        r2Var.field_xml = this.field_xml;
        r2Var.field_datatotalsize = this.field_datatotalsize;
        r2Var.B1 = this.B1;
        r2Var.C1 = this.C1;
        r2Var.D1 = this.D1;
        return r2Var;
    }

    public final void w0(java.lang.String str, o72.q2 q2Var) {
        q2Var.a("----dump favitem from[" + str + "] beg----");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type: ");
        sb6.append(this.field_type);
        q2Var.a(sb6.toString());
        q2Var.a("favId: " + this.field_id);
        q2Var.a("localId: " + this.field_localId);
        q2Var.a("itemStatus: " + this.field_itemStatus);
        q2Var.a("localSeq: " + this.field_localSeq);
        q2Var.a("updateSeq: " + this.field_updateSeq);
        q2Var.a("ctrlFlag: " + this.field_flag);
        q2Var.a("sourceId: " + this.field_sourceId);
        q2Var.a("sourceType: " + this.field_sourceType);
        q2Var.a("sourceCreateTime: " + this.field_sourceCreateTime);
        q2Var.a("updateTime: " + this.field_updateTime);
        q2Var.a("editTime: " + this.field_edittime);
        q2Var.a("fromuser: " + this.field_fromUser);
        q2Var.a("toUser: " + this.field_toUser);
        q2Var.a("realChatName: " + this.field_realChatName);
        if (this.field_favProto != null) {
            q2Var.a("remarktime: " + this.field_favProto.f370976u);
            q2Var.a("dataitemCount: " + this.field_favProto.f370964f.size());
            if (this.field_favProto.f370962d != null) {
                q2Var.a(" ----source item----");
                r45.jq0 jq0Var = this.field_favProto.f370962d;
                q2Var.a("  sourceType: " + jq0Var.f378034d);
                q2Var.a("  fromUser: " + jq0Var.f378036f);
                q2Var.a("  toUser: " + jq0Var.f378038h);
                q2Var.a("  sourceId: " + jq0Var.f378040m);
                q2Var.a("  realChatName: " + jq0Var.f378042o);
                q2Var.a("  createTime: " + jq0Var.f378044q);
                q2Var.a("  msgId: " + jq0Var.f378046s);
                q2Var.a("  eventId: " + jq0Var.f378048u);
                q2Var.a("  appId: " + jq0Var.f378050w);
                q2Var.a("  link: " + jq0Var.f378052y);
                q2Var.a("  mediaId: " + jq0Var.A);
                q2Var.a("  brandId: " + jq0Var.B);
            }
            java.util.Iterator it = this.field_favProto.f370964f.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" ----data item ");
                int i18 = i17 + 1;
                sb7.append(i17);
                sb7.append("----");
                q2Var.a(sb7.toString());
                q2Var.a("  dataId: " + gp0Var.T);
                q2Var.a("  dataType: " + gp0Var.I);
                q2Var.a("  dataSouceId: " + gp0Var.f375446x1);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("  desc: ");
                boolean b17 = q2Var.b();
                java.lang.String str2 = gp0Var.f375408f;
                if (!com.tencent.mars.xlog.Log.isDebug() && b17) {
                    str2 = com.tencent.mm.sdk.platformtools.t8.G1(str2);
                }
                sb8.append(str2);
                q2Var.a(sb8.toString());
                q2Var.a("  svrDataStatus: " + gp0Var.F1);
                q2Var.a("  notCheckThumbCDN: " + gp0Var.D1);
                q2Var.a("  cdnThumbUrl: " + gp0Var.f375412h);
                q2Var.a("  cdnThumbKey: " + gp0Var.f375420m);
                q2Var.a("  notCheckDataCDN: " + gp0Var.B1);
                q2Var.a("  cdnDataUrl: " + gp0Var.f375434s);
                q2Var.a("  cdnDataKey: " + gp0Var.f375438u);
                q2Var.a("  cdnEncryVer: " + gp0Var.f375442w);
                q2Var.a("  fullmd5: " + gp0Var.M);
                q2Var.a("  head256md5: " + gp0Var.P);
                q2Var.a("  fullsize: " + gp0Var.R);
                q2Var.a("  thumbMd5: " + gp0Var.Z);
                q2Var.a("  thumbHead256md5: " + gp0Var.f375445x0);
                q2Var.a("  thumbfullsize: " + gp0Var.f375418l1);
                q2Var.a("  duration: " + gp0Var.f375448y);
                q2Var.a("  datafmt: " + gp0Var.K);
                q2Var.a("  streamWebUrl: " + gp0Var.A);
                q2Var.a("  streamDataUrl: " + gp0Var.C);
                q2Var.a("  streamLowBandUrl: " + gp0Var.E);
                q2Var.a("  ext: " + gp0Var.G);
                q2Var.a("  msgUuid: " + gp0Var.f375431q2);
                if (gp0Var.J1 != null) {
                    q2Var.a("  remarktime: " + gp0Var.J1.f376361o);
                    q2Var.a("  ctrlflag: " + gp0Var.J1.f376363q);
                    q2Var.a("  edittime: " + gp0Var.J1.f376365s);
                    if (gp0Var.J1.f376353d != null) {
                        q2Var.a("   ----data source item----");
                        r45.ip0 ip0Var = gp0Var.J1.f376353d;
                        q2Var.a("    sourceType: " + ip0Var.f377229d);
                        q2Var.a("    fromUser: " + ip0Var.f377231f);
                        q2Var.a("    toUser: " + ip0Var.f377233h);
                        q2Var.a("    realChatName: " + ip0Var.f377237o);
                        q2Var.a("    createTime: " + ip0Var.f377239q);
                        q2Var.a("    msgId: " + ip0Var.f377241s);
                        q2Var.a("    eventId: " + ip0Var.f377243u);
                        q2Var.a("    appId: " + ip0Var.f377245w);
                        q2Var.a("    link: " + ip0Var.f377247y);
                        q2Var.a("    mediaId: " + ip0Var.A);
                        q2Var.a("    brandId: " + ip0Var.B);
                    }
                    y0("  ", q2Var, gp0Var.J1.f376354e);
                    F0("  ", q2Var, gp0Var.J1.f376355f);
                    A0("  ", q2Var, gp0Var.J1.f376356g);
                    D0("  ", q2Var, gp0Var.J1.f376357h);
                    z0("  ", q2Var, gp0Var.J1.f376367u);
                }
                i17 = i18;
            }
            y0("", q2Var, this.field_favProto.f370966h);
            F0("", q2Var, this.field_favProto.f370968m);
            A0("", q2Var, this.field_favProto.f370980y);
            D0("", q2Var, this.field_favProto.C);
            z0("  ", q2Var, this.field_favProto.G);
        }
        q2Var.a("----dump favitem end----");
    }
}
