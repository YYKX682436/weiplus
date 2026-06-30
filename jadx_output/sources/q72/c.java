package q72;

/* loaded from: classes9.dex */
public abstract class c {
    public static r45.bq0 a(r45.bq0 bq0Var) {
        if (bq0Var == null) {
            return null;
        }
        r45.bq0 bq0Var2 = new r45.bq0();
        if (bq0Var.f370963e) {
            bq0Var2.o(bq0Var.f370962d);
        }
        if (bq0Var.f370965g) {
            bq0Var2.d(bq0Var.f370964f);
        }
        if (bq0Var.f370967i) {
            bq0Var2.j(bq0Var.f370966h);
        }
        if (bq0Var.f370969n) {
            bq0Var2.r(bq0Var.f370968m);
        }
        if (bq0Var.f370971p) {
            bq0Var2.f370970o = bq0Var.f370970o;
            bq0Var2.f370971p = true;
        }
        if (bq0Var.f370973r) {
            bq0Var2.p(bq0Var.f370972q);
        }
        if (bq0Var.f370975t) {
            bq0Var2.e(bq0Var.f370974s);
        }
        if (bq0Var.f370977v) {
            bq0Var2.f370976u = bq0Var.f370976u;
            bq0Var2.f370977v = true;
        }
        if (bq0Var.f370979x) {
            bq0Var2.c(bq0Var.f370978w);
        }
        if (bq0Var.f370981z) {
            bq0Var2.n(bq0Var.f370980y);
        }
        if (bq0Var.B) {
            bq0Var2.g(bq0Var.A);
        }
        if (bq0Var.D) {
            bq0Var2.q(bq0Var.C);
        }
        if (bq0Var.F) {
            bq0Var2.s(bq0Var.E);
        }
        if (bq0Var.S) {
            bq0Var2.f(bq0Var.R);
        }
        if (bq0Var.H) {
            bq0Var2.l(bq0Var.G);
        }
        if (bq0Var.f370961J) {
            bq0Var2.b(bq0Var.I);
        }
        if (bq0Var.L) {
            bq0Var2.k(bq0Var.K);
        }
        if (bq0Var.N) {
            bq0Var2.i(bq0Var.M);
        }
        return bq0Var2;
    }

    public static boolean b(java.lang.String str, r45.bq0 bq0Var) {
        org.w3c.dom.NodeList childNodes;
        bq0Var.f370964f.clear();
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("datalist");
            boolean z17 = true;
            if (elementsByTagName != null && elementsByTagName.getLength() > 0 && elementsByTagName.item(0) != null && (childNodes = elementsByTagName.item(0).getChildNodes()) != null && childNodes.getLength() > 0) {
                int length = childNodes.getLength();
                for (int i17 = 0; i17 < length; i17++) {
                    try {
                        org.w3c.dom.Node item = childNodes.item(i17);
                        java.lang.String c17 = com.tencent.mm.sdk.platformtools.aa.c(item);
                        if (item instanceof org.w3c.dom.Element) {
                            org.w3c.dom.NodeList elementsByTagName2 = ((org.w3c.dom.Element) item).getElementsByTagName("recordxml");
                            java.lang.String c18 = (elementsByTagName2 == null || elementsByTagName2.getLength() <= 0) ? null : com.tencent.mm.sdk.platformtools.aa.c(elementsByTagName2.item(0).getFirstChild());
                            java.util.Map d17 = c17.trim().startsWith("<dataitem") ? com.tencent.mm.sdk.platformtools.aa.d(c17, "dataitem", null) : null;
                            if (d17 != null) {
                                bq0Var.f370964f.add(q72.a.g(str, d17, c18));
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavProtoItemParser", e17, "parse data item xml exception", new java.lang.Object[0]);
                        z17 = false;
                    }
                }
            }
            return z17;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavProtoItemParser", "[parser] parseXML exception:%s", e18.toString());
            return false;
        }
    }

    public static boolean c(java.lang.String originXml, java.util.Map map, r45.bq0 bq0Var) {
        int i17;
        int i18;
        org.w3c.dom.NodeList nodeList;
        bq0Var.p((java.lang.String) map.get(".favitem.title"));
        bq0Var.e((java.lang.String) map.get(".favitem.desc"));
        bq0Var.f370970o = (java.lang.String) map.get(".favitem.remark");
        bq0Var.f370971p = true;
        bq0Var.f370976u = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".favitem.remark.$time"), 0L);
        bq0Var.f370977v = true;
        java.lang.String str = (java.lang.String) map.get(".favitem.edittime");
        bq0Var.s(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.version"), 0));
        bq0Var.f((java.lang.String) map.get(".favitem.deviceid"));
        bq0Var.g(com.tencent.mm.sdk.platformtools.t8.V(str, 0L));
        bq0Var.c(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.ctrlflag"), -1));
        r45.jq0 jq0Var = bq0Var.f370962d;
        jq0Var.g(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.source.$sourcetype"), 0));
        jq0Var.i((java.lang.String) map.get(".favitem.source.$sourceid"));
        if (com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.f378040m)) {
            jq0Var.i((java.lang.String) map.get(".favitem.source.sourceid"));
        }
        jq0Var.e((java.lang.String) map.get(".favitem.source.fromusr"));
        jq0Var.j((java.lang.String) map.get(".favitem.source.tousr"));
        jq0Var.f378042o = (java.lang.String) map.get(".favitem.source.realchatname");
        jq0Var.f378043p = true;
        jq0Var.c(com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".favitem.source.createtime"), 0L));
        jq0Var.f378046s = (java.lang.String) map.get(".favitem.source.msgid");
        jq0Var.f378047t = true;
        jq0Var.d((java.lang.String) map.get(".favitem.source.eventid"));
        jq0Var.b((java.lang.String) map.get(".favitem.source.appid"));
        jq0Var.f((java.lang.String) map.get(".favitem.source.link"));
        jq0Var.B = (java.lang.String) map.get(".favitem.source.brandid");
        jq0Var.C = true;
        boolean b17 = b(originXml, bq0Var);
        r45.pp0 pp0Var = bq0Var.f370966h;
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".favitem.locitem.label"))) {
            pp0Var.t((java.lang.String) map.get(".favitem.locitem.label"));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".favitem.locitem.poiname"))) {
            pp0Var.C((java.lang.String) map.get(".favitem.locitem.poiname"));
        }
        java.lang.String str2 = (java.lang.String) map.get(".favitem.locitem.lng");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            pp0Var.w(com.tencent.mm.sdk.platformtools.t8.F(str2, 0.0d));
        }
        java.lang.String str3 = (java.lang.String) map.get(".favitem.locitem.lat");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            pp0Var.u(com.tencent.mm.sdk.platformtools.t8.F(str3, 0.0d));
        }
        java.lang.String str4 = (java.lang.String) map.get(".favitem.locitem.scale");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            if (str4.indexOf(46) != -1) {
                pp0Var.E(com.tencent.mm.sdk.platformtools.t8.P(str4.substring(0, str4.indexOf(46)), -1));
            } else {
                pp0Var.E(com.tencent.mm.sdk.platformtools.t8.P(str4, -1));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".favitem.locitem.poiid"))) {
            pp0Var.B((java.lang.String) map.get(".favitem.locitem.poiid"));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".favitem.locitem.poiCategoryTips"))) {
            pp0Var.y((java.lang.String) map.get(".favitem.locitem.poiCategoryTips"));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".favitem.locitem.poiBusinessHour"))) {
            pp0Var.x((java.lang.String) map.get(".favitem.locitem.poiBusinessHour"));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".favitem.locitem.poiPhone"))) {
            pp0Var.z((java.lang.String) map.get(".favitem.locitem.poiPhone"));
        }
        java.lang.String str5 = (java.lang.String) map.get(".favitem.locitem.poiPriceTips");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            pp0Var.A(com.tencent.mm.sdk.platformtools.t8.L(str5, 0.0f));
        }
        java.lang.String str6 = (java.lang.String) map.get(".favitem.locitem.isfrompoilist");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            pp0Var.s(com.tencent.mm.sdk.platformtools.t8.P(str6, 0) == 1);
        }
        pp0Var.q((java.lang.String) map.get(".favitem.locitem.buildingId"));
        pp0Var.r((java.lang.String) map.get(".favitem.locitem.floorName"));
        r45.tq0 tq0Var = bq0Var.f370968m;
        tq0Var.i((java.lang.String) map.get(".favitem.weburlitem.clean_url"));
        tq0Var.j((java.lang.String) map.get(".favitem.weburlitem.pagedesc"));
        tq0Var.o((java.lang.String) map.get(".favitem.weburlitem.pagethumb_url"));
        tq0Var.p((java.lang.String) map.get(".favitem.weburlitem.pagetitle"));
        tq0Var.n(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.weburlitem.opencache"), 0));
        tq0Var.f386674q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.weburlitem.contentattr"), 0);
        tq0Var.f386675r = true;
        tq0Var.f386676s = (java.lang.String) map.get(".favitem.weburlitem.canvasPageXml");
        tq0Var.f386677t = true;
        tq0Var.q((java.lang.String) map.get(".favitem.weburlitem.wsVideoFlowXml"));
        tq0Var.l(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.weburlitem.forwardflag"), 0));
        tq0Var.k((java.lang.String) map.get(".favitem.weburlitem.extraparam"));
        javax.xml.parsers.DocumentBuilderFactory newInstance = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            org.w3c.dom.Document parse = newInstance.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(originXml.getBytes())));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("excerptlist");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0 && elementsByTagName.item(0) != null) {
                org.w3c.dom.NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                int length = childNodes.getLength();
                int i19 = 0;
                while (i19 < length) {
                    try {
                        org.w3c.dom.Node item = childNodes.item(i19);
                        java.lang.String c17 = com.tencent.mm.sdk.platformtools.aa.c(item);
                        if (item instanceof org.w3c.dom.Element) {
                            nodeList = childNodes;
                            try {
                                java.util.Map d17 = c17.trim().startsWith("<excerptitem") ? com.tencent.mm.sdk.platformtools.aa.d(c17, "excerptitem", null) : null;
                                if (d17 != null) {
                                    r45.np0 np0Var = new r45.np0();
                                    np0Var.f381565e = (java.lang.String) d17.get(".excerptitem.content");
                                    np0Var.f381564d = (java.lang.String) d17.get(".excerptitem.excerptkey");
                                    np0Var.f381566f = (java.lang.String) d17.get(".excerptitem.excerpturl");
                                    linkedList.add(np0Var);
                                }
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavUrlItemParser", e, null, new java.lang.Object[0]);
                                i19++;
                                childNodes = nodeList;
                            }
                        } else {
                            nodeList = childNodes;
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        nodeList = childNodes;
                    }
                    i19++;
                    childNodes = nodeList;
                }
            }
            tq0Var.f386682y = linkedList;
            tq0Var.f386683z = true;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavUrlItemParser", "[setUrlItem] parseXML exception:%s", e19.toString());
        }
        kotlin.jvm.internal.o.g(originXml, "originXml");
        r45.op0 op0Var = bq0Var.P;
        op0Var.f382407d = (java.lang.String) map.get(".favitem.liteappitem.fallbackurl");
        java.lang.String str7 = (java.lang.String) map.get(".favitem.liteappitem.bizId");
        if (str7 == null) {
            str7 = (java.lang.String) map.get(".favitem.liteappitem.subtype");
        }
        op0Var.f382408e = com.tencent.mm.sdk.platformtools.t8.P(str7, -1);
        op0Var.f382410g = (java.lang.String) map.get(".favitem.liteappitem.nickname");
        op0Var.f382412i = (java.lang.String) map.get(".favitem.liteappitem.title");
        op0Var.f382413m = (java.lang.String) map.get(".favitem.liteappitem.des");
        op0Var.f382414n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.liteappitem.jumptype"), -1);
        op0Var.f382416p = (java.lang.String) map.get(".favitem.liteappitem.query");
        op0Var.f382415o = (java.lang.String) map.get(".favitem.liteappitem.page");
        if (((java.lang.String) map.get(".favitem.liteappitem.mediatype")) == null) {
        }
        op0Var.f382411h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.liteappitem.mediatype"), 0);
        java.lang.String str8 = (java.lang.String) map.get(".favitem.liteappitem.pagepath");
        if (str8 == null) {
            str8 = (java.lang.String) map.get(".favitem.liteappitem.page");
        }
        op0Var.f382415o = str8;
        java.lang.String str9 = (java.lang.String) map.get(".favitem.liteappitem.thumburl");
        if (str9 == null) {
            str9 = (java.lang.String) map.get(".favitem.liteappitem.thumbUrl");
        }
        op0Var.f382409f = str9;
        java.lang.String str10 = (java.lang.String) map.get(".favitem.liteappitem.appid");
        if (str10 == null) {
            str10 = (java.lang.String) map.get(".favitem.liteappitem.appId");
        }
        java.lang.String str11 = (java.lang.String) map.get(".favitem.liteappitem.istransparent");
        if (str11 != null) {
            i17 = 0;
            i18 = 1;
            op0Var.f382419s = com.tencent.mm.sdk.platformtools.t8.P(str11, 0) == 1;
        } else {
            i17 = 0;
            i18 = 1;
        }
        java.lang.String str12 = (java.lang.String) map.get(".favitem.liteappitem.forbidforward");
        if (str12 != null) {
            op0Var.f382420t = com.tencent.mm.sdk.platformtools.t8.P(str12, i17) == i18;
        }
        op0Var.f382417q = str10;
        java.lang.String str13 = "";
        int i27 = 0;
        while (true) {
            if (map.get(".favitem.liteappitem.excerptlist.excerptitem" + str13) == null) {
                break;
            }
            r45.np0 np0Var2 = new r45.np0();
            np0Var2.f381564d = (java.lang.String) map.get(".favitem.liteappitem.excerptlist.excerptitem" + str13 + ".excerptkey");
            np0Var2.f381566f = (java.lang.String) map.get(".favitem.liteappitem.excerptlist.excerptitem" + str13 + ".excerpturl");
            np0Var2.f381565e = (java.lang.String) map.get(".favitem.liteappitem.excerptlist.excerptitem" + str13 + ".content");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(np0Var2.f381564d) && !com.tencent.mm.sdk.platformtools.t8.K0(np0Var2.f381565e) && !com.tencent.mm.sdk.platformtools.t8.K0(np0Var2.f381566f)) {
                op0Var.f382421u.add(np0Var2);
            }
            i27++;
            if (i27 > 0) {
                str13 = java.lang.String.valueOf(i27);
            }
        }
        bq0Var.i(zy2.d5.j(".favitem", map));
        bq0Var.Q = zy2.d5.n(".favitem", map);
        if (bq0Var.K != null) {
            bq0Var.k(q72.b.a(".favitem.weburlitem.appmsgshareitem", map));
        }
        r45.aq0 aq0Var = bq0Var.f370980y;
        aq0Var.g((java.lang.String) map.get(".favitem.productitem.producttitle"));
        aq0Var.d((java.lang.String) map.get(".favitem.productitem.productdesc"));
        aq0Var.f((java.lang.String) map.get(".favitem.productitem.productthumb_url"));
        aq0Var.e((java.lang.String) map.get(".favitem.productitem.productinfo"));
        aq0Var.i(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.productitem.$type"), 0));
        r45.mq0 mq0Var = bq0Var.C;
        mq0Var.g((java.lang.String) map.get(".favitem.tvitem.tvtitle"));
        mq0Var.d((java.lang.String) map.get(".favitem.tvitem.tvdesc"));
        mq0Var.f((java.lang.String) map.get(".favitem.tvitem.tvthumb_url"));
        mq0Var.e((java.lang.String) map.get(".favitem.tvitem.tvinfo"));
        r45.sp0 sp0Var = bq0Var.G;
        sp0Var.f385891d = (java.lang.String) map.get(".favitem.noteinfo.noteauthor");
        sp0Var.f385892e = (java.lang.String) map.get(".favitem.noteinfo.noteeditor");
        if (map.containsKey(".favitem.appbranditem")) {
            r45.dp0 dp0Var = new r45.dp0();
            dp0Var.f372634d = (java.lang.String) map.get(".favitem.appbranditem.username");
            dp0Var.f372635e = (java.lang.String) map.get(".favitem.appbranditem.appid");
            dp0Var.f372636f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.pkgtype"), 0);
            dp0Var.f372637g = (java.lang.String) map.get(".favitem.appbranditem.iconurl");
            dp0Var.f372638h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.type"), 0);
            dp0Var.f372639i = (java.lang.String) map.get(".favitem.appbranditem.pagepath");
            dp0Var.f372640m = (java.lang.String) map.get(".favitem.appbranditem.sourcedisplayname");
            dp0Var.f372641n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.version"), 0);
            dp0Var.f372642o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.disableforward"), 0);
            dp0Var.f372643p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.tradingguaranteeflag"), 0);
            dp0Var.f372646s = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.showRelievedBuyFlag"), 0);
            dp0Var.f372644q = (java.lang.String) map.get(".favitem.appbranditem.messageextradata");
            dp0Var.f372645r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".favitem.appbranditem.subtype"), 0);
            bq0Var.b(dp0Var);
        }
        if (bq0Var.K != null) {
            bq0Var.k(q72.b.a(".favitem.weburlitem.appmsgshareitem", map));
        }
        return b17;
    }
}
