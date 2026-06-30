package ji4;

/* loaded from: classes11.dex */
public final class g0 extends et1.e implements ct1.x {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f299931m = "MicroMsg.TextStatus.TextStatusMsgSyncHandler";

    public g0() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // ct1.c
    public int h() {
        return 9;
    }

    @Override // ct1.c
    public int i() {
        return 9;
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ni4.x.f337776d.m().y0(sessionId);
    }

    @Override // et1.e
    public java.lang.String t() {
        return this.f299931m;
    }

    @Override // et1.e
    public boolean u(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        r45.j4 j4Var = rawBypMsg.f388826d;
        int i17 = j4Var.f377560g;
        if (j4Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FromUserName=");
            sb6.append(j4Var.f377558e);
            sb6.append(" ToUserName=");
            sb6.append(j4Var.f377559f);
            sb6.append(" MsgType=");
            sb6.append(j4Var.f377560g);
            sb6.append(" NewMsgId=");
            sb6.append(j4Var.f377568r);
            sb6.append(" content=");
            sb6.append(x51.j1.g(j4Var.f377561h));
        }
        r45.j4 j4Var2 = rawBypMsg.f388826d;
        if (j4Var2.f377560g != 10002) {
            return false;
        }
        r45.du5 du5Var = j4Var2.f377561h;
        java.lang.String str = du5Var != null ? du5Var.f372756d : null;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
        com.tencent.mars.xlog.Log.i(this.f299931m, "processMsg: type：%s", str2);
        boolean z17 = true;
        if (bi4.v1.e(str2, true) == 0) {
            return true;
        }
        di4.i iVar = di4.i.f232782a;
        if (ai4.b0.f5126d) {
            com.tencent.mm.repairer.config.textstatus.multiple.RepairerConfigTextStatusMsgParseByAff repairerConfigTextStatusMsgParseByAff = new com.tencent.mm.repairer.config.textstatus.multiple.RepairerConfigTextStatusMsgParseByAff();
            int h17 = bm5.o1.f22719a.h(repairerConfigTextStatusMsgParseByAff);
            if (h17 != 2 && (h17 == 3 || 1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(repairerConfigTextStatusMsgParseByAff))) {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "canParseMsgByAff: " + z17);
        } else {
            z17 = false;
        }
        if (!z17) {
            if (str2 == null) {
                return false;
            }
            int hashCode = str2.hashCode();
            if (hashCode == -1813338250) {
                if (!str2.equals("textstatuslike")) {
                    return false;
                }
                ai4.m0.f5173a.z(d17);
                return false;
            }
            if (hashCode == -1306850335) {
                if (!str2.equals("modtextstatus")) {
                    return false;
                }
                ni4.x.f337776d.b(d17);
                return false;
            }
            if (hashCode != 1667082797 || !str2.equals("statuscomment")) {
                return false;
            }
            ni4.x.f337776d.c(d17);
            return false;
        }
        if (str2 == null) {
            return false;
        }
        switch (str2.hashCode()) {
            case -1813338250:
                if (!str2.equals("textstatuslike")) {
                    return false;
                }
                ai4.m0.f5173a.z(d17);
                return false;
            case -1461318868:
                if (!str2.equals("statusmodify")) {
                    return false;
                }
                com.tencent.wechat.aff.status.StatusXmlParseManager statusXmlParseManager = com.tencent.wechat.aff.status.StatusXmlParseManager.getInstance();
                if (str == null) {
                    str = "";
                }
                y(statusXmlParseManager.dealNewModifyStatusXml(str));
                return false;
            case -1306850335:
                if (!str2.equals("modtextstatus")) {
                    return false;
                }
                com.tencent.wechat.aff.status.StatusXmlParseManager statusXmlParseManager2 = com.tencent.wechat.aff.status.StatusXmlParseManager.getInstance();
                if (str == null) {
                    str = "";
                }
                y(statusXmlParseManager2.dealModTextXml(str));
                return false;
            case 1667082797:
                if (!str2.equals("statuscomment")) {
                    return false;
                }
                ni4.x.f337776d.c(d17);
                return false;
            default:
                return false;
        }
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        hi4.n session = (hi4.n) obj;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        li4.d m17 = ni4.x.f337776d.m();
        java.lang.String field_talker = session.field_talker;
        kotlin.jvm.internal.o.f(field_talker, "field_talker");
        int i17 = session.field_type;
        int i18 = session.field_actionPermission;
        int i19 = session.field_rejectMsg;
        int i27 = session.field_disableSendMsg;
        java.lang.String field_senderUserName = session.field_senderUserName;
        kotlin.jvm.internal.o.f(field_senderUserName, "field_senderUserName");
        m17.z0(sessionId, field_talker, i17, i18, i19, i27, field_senderUserName);
    }

    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        hi4.n localSessionInfo = (hi4.n) obj;
        kotlin.jvm.internal.o.g(localSessionInfo, "localSessionInfo");
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String str = localSessionInfo.field_senderUserName;
        boolean z17 = str == null || str.length() == 0;
        boolean z18 = localSessionInfo.systemRowid > 0;
        int i17 = localSessionInfo.field_rejectMsg;
        java.lang.String r17 = r(rawBypMsg);
        java.lang.String s17 = s(rawBypMsg);
        boolean z19 = !kotlin.jvm.internal.o.b(s17, localSessionInfo.field_talker) || z17;
        localSessionInfo.field_talker = s17;
        localSessionInfo.field_rejectMsg = i17;
        localSessionInfo.field_senderUserName = r17;
        com.tencent.mars.xlog.Log.i(this.f299931m, "[beforeProcessAddMsg] isNeedReplaceSession=" + z19 + " svrMsgId=" + rawBypMsg.f388826d.f377568r + " isSender=" + rawBypMsg + ".isSender msgType=" + rawBypMsg.f388826d.f377560g + " createTime=" + rawBypMsg.f388826d.f377565o + " isExitSessionInfo=" + z18 + " fromUser=" + rawBypMsg.f388826d.f377558e + " toUser=" + rawBypMsg.f388826d.f377559f + " sessionId=" + rawBypMsg.f388827e + " myUserName:" + r17 + " isSenderUserNameEmpty:" + z17);
        return z19;
    }

    public final void y(bw5.hn0 hn0Var) {
        if (hn0Var == null) {
            return;
        }
        boolean[] zArr = hn0Var.f28291i;
        bw5.sm0 sm0Var = zArr[5] ? hn0Var.f28290h : new bw5.sm0();
        java.lang.String statusId = sm0Var != null ? sm0Var.getStatusId() : null;
        if (statusId == null) {
            statusId = "";
        }
        java.lang.String e17 = sm0Var != null ? sm0Var.e() : null;
        java.lang.String str = e17 != null ? e17 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleStatusXmlParseResponse: ");
        sb6.append(statusId);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", ");
        boolean z17 = zArr[4];
        bw5.ks0 ks0Var = bw5.ks0.StatusXmlUpdateNone;
        sb6.append((z17 ? hn0Var.f28289g : ks0Var).name());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f299931m;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (zArr[4]) {
            ks0Var = hn0Var.f28289g;
        }
        int i17 = ks0Var == null ? -1 : ji4.f0.f299930a[ks0Var.ordinal()];
        if (i17 == 1) {
            qi4.p pVar = qi4.p.f363776a;
            si4.a d17 = pVar.d(false);
            si4.f fVar = d17 instanceof si4.f ? (si4.f) d17 : null;
            if (fVar != null) {
                fVar.u(str, statusId);
            }
            si4.a d18 = pVar.d(true);
            si4.c cVar = d18 instanceof si4.c ? (si4.c) d18 : null;
            if (cVar != null) {
                cVar.u(str, statusId);
            }
            qi4.v.f363788a.a(str, statusId);
            bk4.n.f21513a.a(statusId, 7);
            return;
        }
        if (i17 != 2) {
            return;
        }
        ai4.f fVar2 = ai4.f.f5139a;
        kotlin.jvm.internal.o.d(sm0Var);
        mj4.h e18 = ai4.f.e(fVar2, sm0Var, null, 2, null);
        com.tencent.mars.xlog.Log.i(str2, "StatusXmlUpdateExtInfo: result=" + hn0Var.f28286d + ", " + e18);
        qi4.p pVar2 = qi4.p.f363776a;
        si4.a d19 = pVar2.d(true);
        si4.c cVar2 = d19 instanceof si4.c ? (si4.c) d19 : null;
        si4.a d27 = pVar2.d(false);
        si4.f fVar3 = d27 instanceof si4.f ? (si4.f) d27 : null;
        mj4.h x17 = cVar2 != null ? cVar2.x(e18) : null;
        mj4.k kVar = (mj4.k) e18;
        mj4.j jVar = new mj4.j(kVar);
        if (x17 != null) {
            jVar.f327066b.put("systemRowid", java.lang.Long.valueOf(((mj4.k) x17).f327067b.systemRowid));
        }
        mj4.h a17 = jVar.a();
        if (fVar3 != null) {
            fVar3.s(a17);
        }
        qi4.v.f363788a.f(sm0Var, e18);
        if (hn0Var.f28286d) {
            com.tencent.mars.xlog.Log.i(str2, "handleStatusXmlParseResponse: desc:" + kVar.g() + ", user:" + sm0Var.e());
            dj4.u uVar = dj4.u.f233049a;
            java.lang.String e19 = sm0Var.e();
            kotlin.jvm.internal.o.f(e19, "getUserName(...)");
            uVar.j(e19, a17);
            if (cVar2 != null) {
                java.lang.String statusId2 = sm0Var.getStatusId();
                kotlin.jvm.internal.o.f(statusId2, "getStatusId(...)");
                java.lang.String e27 = sm0Var.e();
                kotlin.jvm.internal.o.f(e27, "getUserName(...)");
                cVar2.y(4, statusId2, e27);
            }
        }
    }
}
