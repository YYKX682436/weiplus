package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class e4 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, pt.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f188869d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f188870e;

    /* renamed from: f, reason: collision with root package name */
    public final long f188871f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f188872g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f188873h;

    /* renamed from: i, reason: collision with root package name */
    public final dn.h f188874i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.d f188875m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f188876n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f188877o;

    /* renamed from: p, reason: collision with root package name */
    public final int f188878p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.a f188879q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent f188880r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent f188881s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.d4 f188882t;

    public e4(java.lang.String str, long j17, boolean z17, dn.h hVar, com.tencent.mm.pluginsdk.model.app.d4 d4Var, java.lang.String str2, com.tencent.mm.pluginsdk.model.app.d dVar) {
        this.f188871f = 0L;
        this.f188872g = "";
        this.f188874i = null;
        this.f188875m = null;
        this.f188876n = null;
        this.f188877o = false;
        this.f188878p = 0;
        this.f188882t = null;
        this.f188871f = j17;
        this.f188872g = str;
        this.f188873h = str2;
        this.f188874i = hVar;
        this.f188882t = d4Var;
        this.f188877o = z17;
        this.f188875m = dVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.py5();
        lVar.f70665b = new r45.qy5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f70667d = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
        lVar.f70668e = 107;
        lVar.f70669f = 1000000107;
        this.f188869d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig NetSceneSendAppMsgForCdn msgId[%d], sceneResult[%s], sessionId[%s], attachInfo[%s]. stack[%s]", java.lang.Long.valueOf(j17), hVar, str2, dVar, new com.tencent.mm.sdk.platformtools.z3());
        ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.pluginsdk.model.app.u5.Ni().f189070e).put(java.lang.Integer.valueOf(hashCode()), new java.lang.Object());
    }

    @Override // pt.n0
    public long a() {
        return this.f188871f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        rt0.b bVar;
        this.f188870e = u0Var;
        java.lang.String str3 = this.f188872g;
        long j17 = this.f188871f;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str3, j17);
        this.f188876n = Li;
        long msgId = Li.getMsgId();
        com.tencent.mm.pluginsdk.model.app.d4 d4Var = this.f188882t;
        if (msgId != j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene msginfo null id:%d", java.lang.Long.valueOf(j17));
            d4Var.a(3, -1);
            return -1;
        }
        ot0.q v17 = ot0.q.v(this.f188876n.j());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene AppMessage.Content.parse null id:%d", java.lang.Long.valueOf(j17));
            d4Var.a(3, -1);
            return -1;
        }
        ez.v0 v0Var = ez.v0.f257777a;
        if (v0Var.j(java.lang.Integer.valueOf(v17.f348666i)) && this.f188876n.getType() == 10000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "stop send revoke msg(%s)", java.lang.Long.valueOf(this.f188876n.getMsgId()));
            return -1;
        }
        if (v0Var.j(java.lang.Integer.valueOf(v17.f348666i)) && ((this.f188876n.I0() <= 0 || this.f188876n.P0() != 2) && (bVar = (rt0.b) v17.y(rt0.b.class)) != null && (bVar.f399372b != 0 || !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f399373c)))) {
            bVar.f399372b = 0L;
            bVar.f399373c = "";
            this.f188876n.d1(ot0.q.u(v17, null, null));
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f188876n.getMsgId(), this.f188876n);
        }
        com.tencent.mm.modelbase.o oVar = this.f188869d;
        r45.py5 py5Var = (r45.py5) oVar.f70710a.f70684a;
        r45.b9 b9Var = new r45.b9();
        b9Var.set(1, v17.f348646d);
        b9Var.set(7, this.f188876n.Q0() + this.f188876n.getMsgId() + androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE + this.f188876n.getCreateTime());
        b9Var.set(6, java.lang.Integer.valueOf((int) com.tencent.mm.sdk.platformtools.t8.i1()));
        b9Var.set(3, this.f188876n.Q0());
        b9Var.set(0, c01.z1.r());
        b9Var.set(4, java.lang.Integer.valueOf(v17.f348666i));
        b9Var.set(2, java.lang.Integer.valueOf(v17.f348650e));
        b9Var.set(9, java.lang.Integer.valueOf(v17.f348706s));
        java.lang.String a17 = ((aq1.d1) po.a.f357279a).a(this.f188876n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            b9Var.set(11, c01.ia.a(this.f188876n.G));
        } else {
            b9Var.set(11, a17);
        }
        b9Var.set(12, v17.I1);
        b9Var.set(13, v17.J1);
        b9Var.set(14, v17.K1);
        com.tencent.mm.pluginsdk.model.app.a aVar = this.f188879q;
        if (aVar != null) {
            b9Var.set(15, java.lang.Integer.valueOf(aVar.f188790a));
            b9Var.set(16, aVar.f188791b);
        }
        py5Var.set(11, java.lang.Integer.valueOf(this.f188878p));
        c01.l2 a18 = dk5.a1.a(this.f188873h);
        if (a18 != null) {
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = new com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent();
            this.f188880r = webviewReportPublisherIdEvent;
            java.lang.String str4 = v17.f348674k;
            am.r20 r20Var = webviewReportPublisherIdEvent.f54990g;
            r20Var.f7769e = str4;
            r20Var.f7765a = a18.f("prePublishId", "");
            this.f188880r.f54990g.f7767c = a18.f("preUsername", "");
            this.f188880r.f54990g.f7768d = a18.f("preChatName", "");
            this.f188880r.f54990g.f7770f = a18.e("preMsgIndex", 0);
            this.f188880r.f54990g.f7774j = a18.e("sendAppMsgScene", 0);
            this.f188880r.f54990g.f7775k = a18.e("getA8KeyScene", 0);
            this.f188880r.f54990g.f7776l = a18.f("referUrl", null);
            this.f188880r.f54990g.f7777m = a18.f("adExtStr", null);
            this.f188880r.f54990g.f7771g = this.f188876n.Q0();
            this.f188880r.f54990g.f7778n = v17.n();
            this.f188880r.f54990g.f7779o = v17.f348658g;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f188876n.Q0(), true);
            if (n17 != null) {
                this.f188880r.f54990g.f7772h = n17.f2();
            }
            this.f188880r.f54990g.f7773i = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(this.f188876n.Q0());
            if (v17.Y1 != null) {
                r45.td6 td6Var = new r45.td6();
                try {
                    td6Var.parseFrom(android.util.Base64.decode(v17.Y1, 0));
                    r45.rd6 rd6Var = td6Var.f386331f;
                    str2 = rd6Var != null ? rd6Var.f384752d : "";
                } catch (java.lang.Exception unused) {
                }
                java.util.Locale locale = java.util.Locale.US;
                am.r20 r20Var2 = this.f188880r.f54990g;
                java.lang.String str5 = r20Var2.f7765a;
                java.lang.String str6 = r20Var2.f7767c;
                java.lang.String str7 = r20Var2.f7768d;
                py5Var.set(7, java.lang.String.format(locale, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", str5, str6, str7, java.lang.Integer.valueOf(c01.h2.a(str6, str7)), java.lang.Integer.valueOf(this.f188880r.f54990g.f7775k), str2));
            }
            str2 = "";
            java.util.Locale locale2 = java.util.Locale.US;
            am.r20 r20Var22 = this.f188880r.f54990g;
            java.lang.String str52 = r20Var22.f7765a;
            java.lang.String str62 = r20Var22.f7767c;
            java.lang.String str72 = r20Var22.f7768d;
            py5Var.set(7, java.lang.String.format(locale2, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", str52, str62, str72, java.lang.Integer.valueOf(c01.h2.a(str62, str72)), java.lang.Integer.valueOf(this.f188880r.f54990g.f7775k), str2));
        }
        if (a18 == null || v17.f348666i != 33) {
            i17 = 0;
        } else {
            this.f188881s = new com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent();
            int e17 = a18.e("fromScene", 1);
            this.f188881s.f53983g.f8235d = e17;
            a18.e("appservicetype", 0);
            this.f188881s.f53983g.getClass();
            java.lang.String f17 = a18.f("preChatName", "");
            if (2 == e17) {
                java.lang.String f18 = a18.f("preUsername", "");
                this.f188881s.f53983g.f8237f = f17 + ":" + f18;
            } else {
                this.f188881s.f53983g.f8237f = f17;
            }
            java.lang.String Q0 = this.f188876n.Q0();
            i17 = 0;
            boolean d17 = a18.d("moreRetrAction", false);
            if (Q0.endsWith("@chatroom")) {
                this.f188881s.f53983g.f8239h = d17 ? 5 : 2;
            } else {
                this.f188881s.f53983g.f8239h = d17 ? 4 : 1;
            }
            am.w wVar = this.f188881s.f53983g;
            wVar.f8236e = v17.f348737z2 + 1;
            wVar.f8238g = v17.f348669i2;
            wVar.f8232a = v17.f348673j2;
            wVar.f8233b = v17.f348677k2;
            wVar.f8234c = v17.A2;
            wVar.f8241j = com.tencent.mm.sdk.platformtools.t8.i1();
            am.w wVar2 = this.f188881s.f53983g;
            wVar2.f8242k = 1;
            wVar2.f8243l = v17.f348689n2;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.tencent.mm.storage.f9 f9Var = this.f188876n;
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(Di.o2(f9Var, bm5.f0.f22564i, f9Var.z0()));
        if (n07 != null) {
            i18 = n07.outWidth;
            i17 = n07.outHeight;
        } else {
            i18 = i17;
        }
        dn.h hVar = this.f188874i;
        if (hVar.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn app sceneResult crc[%d], safecdn[%b], hitcachetype[%d], aeskey[%s]", java.lang.Integer.valueOf(hVar.field_filecrc), java.lang.Boolean.valueOf(hVar.field_upload_by_safecdn), java.lang.Integer.valueOf(hVar.field_UploadHitCacheType), hVar.field_aesKey);
            hVar.field_aesKey = "";
            py5Var.set(8, 1);
        }
        py5Var.set(9, java.lang.Integer.valueOf(hVar.field_filecrc));
        if (this.f188877o) {
            str = "@cdn_" + hVar.field_fileId + "_" + hVar.field_aesKey + "_1";
        } else {
            str = null;
        }
        b9Var.set(5, ot0.q.t(v17, str, hVar, i18, i17));
        py5Var.set(1, b9Var);
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f188875m;
        if (dVar != null && (v17.f348714u != 0 || v17.f348682m > 26214400)) {
            py5Var.set(6, dVar.field_signature);
            py5Var.set(5, 7);
        }
        py5Var.set(4, v17.f348710t);
        if (com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_filemd5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig sceneResult filemd5 is null use content.filemd5[%s]", v17.f348710t);
        } else {
            py5Var.set(4, hVar.field_filemd5);
        }
        if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(this.f188876n.Q0())) {
            py5Var.set(12, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(this.f188876n.Q0()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig file md5[%s], HitMd5[%d], signature[%s], type[%d], sceneResult[%s], fromScene[%s]", py5Var.getString(4), java.lang.Integer.valueOf(py5Var.getInteger(8)), com.tencent.mm.sdk.platformtools.t8.G1(py5Var.getString(6)), java.lang.Integer.valueOf(py5Var.getInteger(5)), this.f188874i, py5Var.getString(7));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "Req MsgSource %s", ((r45.b9) py5Var.getCustom(1)).getString(11));
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        return w11.c1.a(new com.tencent.mm.plugin.msg.MsgIdTalker(this.f188871f, this.f188872g), this) ? org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT : super.getDispatchInterceptRet(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String r17;
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s], newContent[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(this.f188871f), com.tencent.mm.sdk.platformtools.t8.G1(this.f188876n.j()), ((r45.b9) ((r45.py5) oVar.f70710a.f70684a).getCustom(1)).getString(5));
        r45.qy5 qy5Var = (r45.qy5) oVar.f70711b.f70700a;
        if (qy5Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(qy5Var.getInteger(11));
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f188876n.Q0(), this.f188876n.getMsgId());
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4 && i19 == 102) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn MM_ERR_GET_AESKEY_FAILED");
                this.f188870e.onSceneEnd(i18, i19, str, this);
                this.f188882t.a(i18, i19);
                return;
            }
            Li.r1(5);
            bu.a.e(Li.getMsgId(), bu.a.c(i19, i18, str, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig send app msg failed, err=" + i18 + "," + i19);
            this.f188870e.onSceneEnd(i18, i19, str, this);
            this.f188882t.a(i18, i19);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn svrid[%d]. aeskey[%s], old content[%s]", java.lang.Long.valueOf(qy5Var.getLong(8)), qy5Var.getString(9), com.tencent.mm.sdk.platformtools.t8.G1(Li.j()));
        dn.h hVar = this.f188874i;
        if (hVar != null && hVar.b()) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(qy5Var.getString(9))) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn need aeskey but ret null");
            } else {
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 != null) {
                    v17.T = qy5Var.getString(9);
                    Li.d1(ot0.q.u(v17, null, null));
                    if (v17.f348666i == 5 && v17.f348634J == 0) {
                        Li.d1(com.tencent.mm.pluginsdk.model.app.w0.b(0, Li.Q0(), Li.A0() == 1, Li.j()));
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn aeskey[%s], new content[%s]", qy5Var.getString(9), com.tencent.mm.sdk.platformtools.t8.G1(Li.j()));
            }
        }
        Li.r1(2);
        Li.o1(qy5Var.getLong(8));
        c01.ia.P(Li, qy5Var.getString(10), false);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Ai(Li.getMsgId());
        com.tencent.mm.modelstat.e.f71505a.a(Li, ot0.u.a(Li));
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).pj(Li, true);
        this.f188870e.onSceneEnd(i18, i19, str, this);
        this.f188882t.a(i18, i19);
        if (Li.n2()) {
            e35.g gVar = e35.g.f247590a;
            if (Li.getMsgId() > 0) {
                java.lang.String Q0 = Li.Q0();
                if (!(Q0 == null || r26.n0.N(Q0))) {
                    java.lang.Integer num = (java.lang.Integer) e35.g.f247592c.remove(new com.tencent.mm.plugin.msg.MsgIdTalker(Li.getMsgId(), Li.Q0()));
                    if (num == null) {
                        num = 0;
                    }
                    kotlin.jvm.internal.o.d(num);
                    int intValue = num.intValue();
                    v05.b bVar = new v05.b();
                    java.lang.String j17 = Li.j();
                    java.lang.String str2 = "";
                    if (j17 == null) {
                        j17 = "";
                    }
                    bVar.fromXml(j17);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportSendFinish ");
                    int i27 = bVar.f432315e;
                    int i28 = i27 + 8;
                    v05.a aVar = (v05.a) bVar.getCustom(i28);
                    sb6.append(aVar != null ? aVar.s() : null);
                    sb6.append(' ');
                    sb6.append(bVar.getString(bVar.f368365d + 2));
                    sb6.append(' ');
                    sb6.append(intValue);
                    sb6.append(", ");
                    sb6.append(Li.getMsgId());
                    sb6.append(", ");
                    sb6.append(Li.Q0());
                    sb6.append(", ");
                    sb6.append(Li.I0());
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileSourceReporter", sb6.toString());
                    e35.g.f247591b.clear();
                    com.tencent.mm.autogen.mmdata.rpt.SendFileWithSourceStruct sendFileWithSourceStruct = new com.tencent.mm.autogen.mmdata.rpt.SendFileWithSourceStruct();
                    sendFileWithSourceStruct.f60204d = sendFileWithSourceStruct.b("ToUsername", Li.Q0(), true);
                    v05.a aVar2 = (v05.a) bVar.getCustom(i28);
                    sendFileWithSourceStruct.f60205e = aVar2 != null ? aVar2.getLong(aVar2.f368364d + 0) : 0L;
                    v05.a aVar3 = (v05.a) bVar.getCustom(i28);
                    if (aVar3 != null && (r17 = aVar3.r()) != null) {
                        str2 = r17;
                    }
                    sendFileWithSourceStruct.f60206f = sendFileWithSourceStruct.b("FileExt", str2, true);
                    sendFileWithSourceStruct.f60207g = intValue;
                    sendFileWithSourceStruct.f60208h = sendFileWithSourceStruct.b("FileId", bVar.getString(i27 + 24) + '_' + Li.getCreateTime(), true);
                    sendFileWithSourceStruct.f60209i = sendFileWithSourceStruct.b("MsgSvrId", java.lang.String.valueOf(Li.I0()), true);
                    sendFileWithSourceStruct.k();
                }
            }
        }
        com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = this.f188880r;
        if (webviewReportPublisherIdEvent != null && !com.tencent.mm.sdk.platformtools.t8.K0(webviewReportPublisherIdEvent.f54990g.f7769e)) {
            this.f188880r.f54990g.f7766b = "msg_" + java.lang.Long.toString(qy5Var.getLong(8));
            this.f188880r.e();
        }
        com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent appBrandOuterMenuClickReportEvent = this.f188881s;
        if (appBrandOuterMenuClickReportEvent != null) {
            appBrandOuterMenuClickReportEvent.f53983g.f8240i = "msg_" + Li.I0();
            this.f188881s.e();
        }
        ot0.q v18 = ot0.q.v(Li.j());
        if (v18 != null) {
            if (com.tencent.mm.storage.z3.N4(Li.Q0())) {
                ot0.a aVar4 = (ot0.a) v18.y(ot0.a.class);
                if (aVar4 != null && aVar4.K) {
                    kn.j0.a(Li, v18);
                }
                ((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Zi(Li);
            }
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(v18.f348666i))) {
                ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(v18, Li, 6));
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public e4(java.lang.String str, long j17, boolean z17, dn.h hVar, com.tencent.mm.pluginsdk.model.app.d4 d4Var, java.lang.String str2, com.tencent.mm.pluginsdk.model.app.d dVar, int i17, com.tencent.mm.pluginsdk.model.app.a aVar) {
        this(str, j17, z17, hVar, d4Var, str2, dVar);
        this.f188878p = i17;
        this.f188879q = aVar;
    }
}
