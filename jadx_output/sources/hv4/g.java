package hv4;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f285292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f285293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f285294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hv4.l lVar, r45.sn3 sn3Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        super(0);
        this.f285292d = lVar;
        this.f285293e = sn3Var;
        this.f285294f = bitmap;
        this.f285295g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2 = this.f285295g;
        hv4.l lVar = this.f285292d;
        lVar.getClass();
        r45.sn3 shareContent = this.f285293e;
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        r45.pw5 pw5Var = shareContent.f385862m;
        int i17 = 1;
        r45.ck6 ck6Var = lVar.f285308f;
        if (pw5Var != null) {
            ot0.q qVar = new ot0.q();
            zy2.i iVar = new zy2.i();
            r45.pw5 pw5Var2 = shareContent.f385862m;
            r45.kv2 kv2Var = new r45.kv2();
            kv2Var.set(0, pw5Var2.f383433e);
            kv2Var.set(8, pw5Var2.f383437i);
            kv2Var.set(5, java.lang.Integer.valueOf(pw5Var2.f383434f));
            kv2Var.set(3, pw5Var2.f383436h);
            kv2Var.set(2, pw5Var2.f383435g);
            kv2Var.set(4, pw5Var2.f383432d);
            java.util.LinkedList<r45.qw5> linkedList = pw5Var2.f383439n;
            kv2Var.set(6, java.lang.Integer.valueOf(linkedList.size()));
            java.util.LinkedList list = kv2Var.getList(7);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.qw5 qw5Var : linkedList) {
                r45.iv2 iv2Var = new r45.iv2();
                iv2Var.set(0, java.lang.Integer.valueOf(qw5Var.f384317d));
                iv2Var.set(i17, java.lang.String.valueOf(qw5Var.f384318e));
                iv2Var.set(2, qw5Var.f384321h);
                iv2Var.set(3, java.lang.Float.valueOf(qw5Var.f384319f));
                iv2Var.set(4, java.lang.Float.valueOf(qw5Var.f384320g));
                iv2Var.set(5, java.lang.Integer.valueOf(qw5Var.f384322i));
                arrayList.add(iv2Var);
                i17 = 1;
            }
            list.addAll(arrayList);
            iVar.f477411b = kv2Var;
            qVar.f(iVar);
            qVar.f348666i = 51;
            qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
            qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
            ot0.k1 a17 = ot0.j1.a();
            java.lang.String str3 = ck6Var.f371630o;
            ((ez.w0) a17).getClass();
            com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str3, "", null);
            lVar.E(shareContent, str2);
        } else {
            str = "";
            if (shareContent.f385861i != null) {
                ot0.q qVar2 = new ot0.q();
                zy2.h hVar = new zy2.h();
                java.lang.String str4 = shareContent.f385861i.f382582e;
                if (str4 == null) {
                    str4 = "";
                }
                hVar.m(str4);
                java.lang.String str5 = shareContent.f385861i.f382581d;
                if (str5 == null) {
                    str5 = "";
                }
                hVar.l(str5);
                r45.ow5 ow5Var = shareContent.f385861i;
                java.lang.String str6 = ow5Var.f382586i;
                if (str6 == null) {
                    str6 = "";
                }
                hVar.f477397h = str6;
                java.lang.String str7 = ow5Var.f382585h;
                if (str7 == null) {
                    str7 = "";
                }
                hVar.i(str7);
                java.lang.String str8 = shareContent.f385861i.f382583f;
                hVar.j(str8 != null ? str8 : "");
                qVar2.f(hVar);
                qVar2.f348666i = 50;
                qVar2.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
                qVar2.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
                ot0.k1 a18 = ot0.j1.a();
                java.lang.String str9 = ck6Var.f371630o;
                ((ez.w0) a18).getClass();
                com.tencent.mm.pluginsdk.model.app.k0.I(qVar2, "", "", str9, "", null);
                lVar.E(shareContent, str2);
            } else if (shareContent.f385857e != null) {
                ot0.q qVar3 = new ot0.q();
                r45.bw5 bw5Var = shareContent.f385857e;
                qVar3.f348654f = bw5Var.f371099d;
                qVar3.f348734z = bw5Var.f371101f;
                qVar3.f348674k = bw5Var.f371102g;
                qVar3.f348658g = bw5Var.f371100e;
                qVar3.f348662h = "view";
                qVar3.f348706s = 3;
                qVar3.f348722w = bw5Var.f371104i;
                qVar3.f348726x = bw5Var.f371105m;
                qVar3.f348666i = 5;
                ot0.f fVar = new ot0.f();
                fVar.f348455b = 0;
                qVar3.f(fVar);
                ot0.k1 a19 = ot0.j1.a();
                java.lang.String str10 = ck6Var.f371630o;
                ((ez.w0) a19).getClass();
                com.tencent.mm.pluginsdk.model.app.k0.I(qVar3, "", "", str10, "", null);
                lVar.E(shareContent, str2);
            } else {
                r45.aw5 aw5Var = shareContent.f385858f;
                if (aw5Var != null) {
                    java.lang.String format = java.lang.String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370300d), com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370301e), com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370303g), com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370302f), com.tencent.mm.sdk.platformtools.t8.p(""), 0, com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370305i), com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370306m), com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370307n), 0, java.lang.Integer.valueOf(aw5Var.f370308o), java.lang.Integer.valueOf(aw5Var.f370309p), "", aw5Var.f370315v, com.tencent.mm.sdk.platformtools.t8.p(aw5Var.f370304h)}, 15));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    tg3.a1 a27 = tg3.t1.a();
                    java.lang.String str11 = shareContent.f385858f.f370300d;
                    java.lang.String str12 = ck6Var.f371630o;
                    boolean R4 = com.tencent.mm.storage.z3.R4(str12);
                    dk5.s5 s5Var = (dk5.s5) a27;
                    s5Var.getClass();
                    ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.p0.a();
                    if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendContactCard()) != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMgr", "Send ContactCard with custom xml through new method");
                        try {
                            iz.e eVar = (iz.e) i95.n0.c(iz.e.class);
                            if (eVar == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.SendMsgMgr", "IContactCardMsgFeatureService is NULL! Service not registered, fallback to legacy");
                                s5Var.Ri(str11, str12, format, R4);
                            } else if (R4) {
                                if (str12 != null) {
                                    str = str12;
                                }
                                hz.m mVar = new hz.m(str, str11);
                                mVar.f286237e = format;
                                hz.d dVar = (hz.d) eVar;
                                dVar.aj(dVar.Zi(mVar));
                            } else {
                                if (str12 != null) {
                                    str = str12;
                                }
                                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
                                for (int i18 = 0; i18 < P1.size(); i18++) {
                                    hz.m mVar2 = new hz.m((java.lang.String) P1.get(i18), str11);
                                    mVar2.f286237e = format;
                                    hz.d dVar2 = (hz.d) eVar;
                                    dVar2.aj(dVar2.Zi(mVar2));
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.SendMsgMgr", "New method Contactcard with custom xml Exception: %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMgr", "Send ContactCard (custom xml) through legacy method");
                        s5Var.Ri(str11, str12, format, R4);
                    }
                    lVar.E(shareContent, str2);
                } else {
                    r45.qx5 qx5Var = shareContent.f385859g;
                    if (qx5Var != null) {
                        ot0.q qVar4 = new ot0.q();
                        qVar4.f348654f = qx5Var.f384339e;
                        qVar4.f348673j2 = qx5Var.f384342h;
                        qVar4.f348669i2 = qx5Var.f384343i;
                        qVar4.f348677k2 = qx5Var.f384341g;
                        qVar4.f348737z2 = 0;
                        qVar4.A2 = qx5Var.f384345n;
                        qVar4.f348681l2 = 2;
                        qVar4.f348674k = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).l2(qx5Var.f384341g);
                        qVar4.B2 = qx5Var.f384344m;
                        qVar4.L1 = "wxapp_" + qx5Var.f384341g + qx5Var.f384343i;
                        qVar4.f348722w = qx5Var.f384342h;
                        qVar4.f348726x = qx5Var.f384338d;
                        qVar4.f(new ot0.a());
                        qVar4.f348666i = 33;
                        if (android.text.TextUtils.isEmpty(qx5Var.f384340f)) {
                            byte[] a28 = com.tencent.mm.sdk.platformtools.x.a(this.f285294f);
                            ot0.k1 a29 = ot0.j1.a();
                            java.lang.String str13 = qx5Var.f384341g;
                            java.lang.String str14 = ck6Var.f371630o;
                            ((ez.w0) a29).getClass();
                            com.tencent.mm.pluginsdk.model.app.k0.I(qVar4, str13, "", str14, "", a28);
                            lVar.E(shareContent, str2);
                        } else {
                            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(qx5Var.f384340f, new hv4.i(qVar4, qx5Var, lVar, shareContent, str2));
                        }
                    } else if (shareContent.f385860h != null) {
                        ot0.q qVar5 = new ot0.q();
                        r45.rx5 rx5Var = shareContent.f385860h;
                        qVar5.f348654f = rx5Var.f385275e;
                        qVar5.f348666i = 33;
                        qVar5.f348673j2 = rx5Var.f385274d;
                        qVar5.f348677k2 = rx5Var.f385277g;
                        qVar5.f348681l2 = 1;
                        qVar5.L1 = "wxapp_" + shareContent.f385860h.f385277g;
                        r45.rx5 rx5Var2 = shareContent.f385860h;
                        qVar5.f348734z = rx5Var2.f385276f;
                        java.lang.String format2 = java.lang.String.format(java.util.Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", java.util.Arrays.copyOf(new java.lang.Object[]{rx5Var2.f385277g, 3}, 2));
                        kotlin.jvm.internal.o.f(format2, "format(...)");
                        qVar5.f348674k = format2;
                        r45.rx5 rx5Var3 = shareContent.f385860h;
                        qVar5.f348722w = rx5Var3.f385274d;
                        qVar5.f348726x = rx5Var3.f385275e;
                        ot0.a aVar = new ot0.a();
                        aVar.f348360p = 0;
                        qVar5.f(aVar);
                        ot0.k1 a37 = ot0.j1.a();
                        r45.rx5 rx5Var4 = shareContent.f385860h;
                        java.lang.String str15 = rx5Var4.f385277g;
                        java.lang.String str16 = rx5Var4.f385275e;
                        java.lang.String str17 = ck6Var.f371630o;
                        ((ez.w0) a37).getClass();
                        com.tencent.mm.pluginsdk.model.app.k0.I(qVar5, str15, str16, str17, null, null);
                        lVar.E(shareContent, str2);
                    } else if (shareContent.f385863n != null) {
                        ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Bi(lVar.getContext(), ck6Var.f371630o, shareContent.f385863n.toByteArray(), null, 0, 0L, null, null);
                        lVar.E(shareContent, str2);
                    } else if (shareContent.f385864o != null) {
                        ot0.q qVar6 = new ot0.q();
                        qVar6.f348666i = 68;
                        qVar6.I = c01.z1.r();
                        r45.zw5 zw5Var = shareContent.f385864o;
                        qVar6.f348654f = zw5Var.f392440i;
                        qVar6.f348658g = zw5Var.f392441m;
                        qVar6.f348646d = zw5Var.f392443o;
                        java.lang.String str18 = zw5Var.f392444p;
                        qVar6.f348674k = str18;
                        qVar6.I1 = str18;
                        qVar6.J1 = str18;
                        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = new com.tencent.mm.pluginsdk.ui.tools.h0();
                        h0Var.f191665b = zw5Var.f392435d;
                        h0Var.f191666c = zw5Var.f392436e;
                        h0Var.f191667d = zw5Var.f392437f;
                        h0Var.f191668e = zw5Var.f392438g;
                        h0Var.f191669f = zw5Var.f392439h;
                        qVar6.f(h0Var);
                        if (android.text.TextUtils.isEmpty(shareContent.f385864o.f392442n)) {
                            ot0.k1 a38 = ot0.j1.a();
                            java.lang.String str19 = ck6Var.f371630o;
                            ((ez.w0) a38).getClass();
                            com.tencent.mm.pluginsdk.model.app.k0.I(qVar6, "", "", str19, "", null);
                            lVar.E(shareContent, str2);
                        } else {
                            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(shareContent.f385864o.f392442n, new hv4.j(qVar6, lVar, shareContent, str2));
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
