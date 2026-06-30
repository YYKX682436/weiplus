package zv;

@j95.b
/* loaded from: classes11.dex */
public final class o0 extends i95.w implements bw.j {
    public com.tencent.wechat.mm.brand_service.j Ai(com.tencent.mm.storage.f9 info, boolean z17, boolean z18, int i17, int i18, boolean z19, java.lang.String rankSessionId) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(rankSessionId, "rankSessionId");
        com.tencent.wechat.mm.brand_service.j jVar = new com.tencent.wechat.mm.brand_service.j();
        jVar.f218975f = info.y0();
        jVar.f218976g = info.I0();
        jVar.f218977h = info.getCreateTime();
        jVar.f218978i = 0;
        jVar.f218979m = 0;
        jVar.f218980n = z19;
        jVar.f218981o = z18;
        jVar.f218982p = i17 != 1 && z17;
        jVar.f218983q = z17;
        jVar.F = info.getMsgId();
        jVar.f218984r = rankSessionId;
        jVar.A = i18;
        com.tencent.wechat.mm.brand_service.m mVar = new com.tencent.wechat.mm.brand_service.m();
        java.util.LinkedList<ot0.s0> linkedList = ((ot0.r0) ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(info.getMsgId(), info.j())).f348581i;
        if (linkedList != null) {
            for (ot0.s0 s0Var : linkedList) {
                kotlin.jvm.internal.o.d(s0Var);
                com.tencent.wechat.mm.brand_service.l lVar = new com.tencent.wechat.mm.brand_service.l();
                java.lang.String str = s0Var.f348761d;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                lVar.f219016d = str;
                java.lang.String str3 = s0Var.f348762e;
                if (str3 == null) {
                    str3 = "";
                }
                lVar.f219017e = str3;
                lVar.f219018f = s0Var.f348765h;
                java.lang.String str4 = s0Var.f348766i;
                if (str4 == null) {
                    str4 = "";
                }
                lVar.f219019g = str4;
                java.lang.String str5 = s0Var.D;
                if (str5 == null) {
                    str5 = "";
                }
                lVar.f219020h = str5;
                java.lang.String str6 = s0Var.f348769n;
                if (str6 == null) {
                    str6 = "";
                }
                lVar.f219021i = str6;
                lVar.f219022m = s0Var.f348770o;
                lVar.f219023n = s0Var.f348774q;
                java.lang.String str7 = s0Var.f348785z;
                if (str7 == null) {
                    str7 = "";
                }
                lVar.f219024o = str7;
                lVar.f219026q = s0Var.C;
                lVar.f219027r = s0Var.I == 1;
                java.lang.String str8 = s0Var.G;
                if (str8 == null) {
                    str8 = "";
                }
                lVar.f219028s = str8;
                lVar.f219029t = s0Var.E;
                lVar.f219030u = s0Var.F;
                java.lang.String str9 = s0Var.P;
                if (str9 == null) {
                    str9 = "";
                }
                lVar.f219031v = str9;
                java.lang.String str10 = s0Var.Q;
                if (str10 == null) {
                    str10 = "";
                }
                lVar.f219032w = str10;
                java.lang.String str11 = s0Var.R;
                if (str11 == null) {
                    str11 = "";
                }
                lVar.f219033x = str11;
                lVar.f219034y = s0Var.S;
                java.util.AbstractCollection abstractCollection = s0Var.f348767l1;
                if (abstractCollection == null) {
                    abstractCollection = new java.util.ArrayList();
                }
                lVar.f219035z.addAll(abstractCollection);
                lVar.A = s0Var.f348773p1;
                java.lang.String str12 = s0Var.T;
                if (str12 == null) {
                    str12 = "";
                }
                lVar.B = str12;
                lVar.C = s0Var.U == 1;
                java.util.AbstractCollection abstractCollection2 = s0Var.H;
                if (abstractCollection2 == null) {
                    abstractCollection2 = new java.util.ArrayList();
                }
                lVar.D.addAll(abstractCollection2);
                eq1.h hVar = eq1.h.f255812a;
                java.lang.String semiXmlContent = s0Var.M;
                kotlin.jvm.internal.o.f(semiXmlContent, "semiXmlContent");
                ot0.q0 e17 = hVar.e(semiXmlContent, 0);
                com.tencent.wechat.mm.brand_service.h hVar2 = new com.tencent.wechat.mm.brand_service.h();
                hVar2.f218931d = e17.f348738d;
                hVar2.f218932e = e17.f348739e;
                hVar2.f218933f = e17.f348740f;
                hVar2.f218934g = e17.f348741g;
                hVar2.f218935h = e17.f348742h;
                hVar2.f218936i = e17.f348743i;
                hVar2.f218937m = e17.f348744m;
                hVar2.f218938n = e17.f348745n;
                hVar2.f218939o = e17.f348746o;
                hVar2.f218940p = e17.f348747p;
                hVar2.f218941q = e17.f348748q;
                hVar2.f218942r = e17.f348749r;
                hVar2.f218943s = e17.f348750s;
                hVar2.f218944t = e17.f348751t;
                hVar2.f218945u = e17.f348752u;
                lVar.E = hVar2;
                ot0.m3 m3Var = s0Var.V;
                lVar.F = m3Var.f348590d;
                java.lang.String str13 = m3Var.f348591e;
                if (str13 == null) {
                    str13 = "";
                }
                lVar.G = str13;
                java.lang.String str14 = m3Var.f348592f;
                if (str14 == null) {
                    str14 = "";
                }
                lVar.H = str14;
                java.lang.String str15 = s0Var.X;
                if (str15 != null) {
                    str2 = str15;
                }
                lVar.I = str2;
                mVar.f219042d.add(lVar);
            }
        }
        jVar.f218974e = mVar;
        return jVar;
    }

    public int Bi() {
        if (!zv.q.f476079a.g()) {
            return 0;
        }
        com.tencent.wechat.mm.brand_service.g0 c17 = yw.a3.f466266a.c();
        return (int) (c17 != null ? c17.d() : 199L);
    }

    public bw.i Di(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        java.lang.Integer h17;
        bw.i iVar = bw.i.none;
        if (f9Var == null || (str = f9Var.G) == null) {
            return iVar;
        }
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null);
            if (d17 == null) {
                return iVar;
            }
            java.lang.String str2 = (java.lang.String) d17.get(".msgsource.notify_option.biz_serivce_tmpl_status");
            int intValue = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 0 : h17.intValue();
            return intValue != 1 ? intValue != 2 ? iVar : bw.i.accepted : bw.i.denied;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsMsgService", "parse msgSource error: " + e17.getMessage(), e17);
            return iVar;
        }
    }

    public int Ni() {
        if (!zv.q.f476079a.g()) {
            return 0;
        }
        uw.a aVar = uw.a.f431476a;
        if (uw.a.f431479d < 0) {
            aVar.getClass();
            f06.v[] vVarArr = uw.a.f431477b;
            f06.v vVar = vVarArr[0];
            b30.c cVar = uw.a.f431478c;
            uw.a.f431479d = ((java.lang.Number) cVar.b(aVar, vVar)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsCachedGetter", "getCachedUnReadArticleMsgCnt load from mmkv persistenceCacheUnReadArticleMsgCnt:" + ((java.lang.Number) cVar.b(aVar, vVarArr[0])).intValue());
        } else {
            aVar.getClass();
        }
        int i17 = uw.a.f431479d;
        if (i17 >= 0) {
            return i17;
        }
        com.tencent.wechat.mm.brand_service.i a17 = yw.a3.f466266a.a();
        int i18 = a17 != null ? a17.f218954g : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsCachedGetter", "getCachedUnReadArticleMsgCnt load from aff db cnt:" + i18);
        aVar.a(i18);
        return i18;
    }

    public boolean Ri(java.lang.String str) {
        com.tencent.mm.storage.z3 n17;
        if (!zv.q.f476079a.g() || str == null || yo.a.b(qw.a.f367052b, str) || (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null || !n17.r2() || n17.w2()) {
            return false;
        }
        return n17.m2();
    }

    public void wi(long j17) {
        if (zv.q.f476079a.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "batchExposedTmplMsg");
            com.tencent.wechat.mm.brand_service.g0 c17 = yw.a3.f466266a.c();
            if (c17 != null) {
                c17.g(j17, ow.d.f349247a);
            }
        }
    }
}
