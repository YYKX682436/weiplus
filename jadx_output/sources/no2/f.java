package no2;

/* loaded from: classes10.dex */
public abstract class f extends et1.e {

    /* renamed from: m, reason: collision with root package name */
    public final int f338747m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f338748n = jz5.h.b(no2.d.f338745d);

    public f(int i17) {
        this.f338747m = i17;
    }

    @Override // ct1.c
    public int h() {
        return this.f338747m;
    }

    @Override // ct1.c
    public int i() {
        return 4;
    }

    @Override // ct1.c
    public boolean o(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        pm0.z.b(xy2.b.f458155b, this.f256567h, false, null, null, false, false, new no2.e(e17), 60, null);
        return false;
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((com.tencent.mm.plugin.finder.storage.dj0) ((jz5.n) this.f338748n).getValue()).J0(sessionId);
    }

    @Override // et1.e
    public java.lang.String r(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String g17 = x51.j1.g(rawBypMsg.f388826d.f377558e);
        java.lang.String g18 = x51.j1.g(rawBypMsg.f388826d.f377559f);
        if (!rawBypMsg.f388830h) {
            g17 = g18;
        }
        if (!com.tencent.mm.storage.z3.U3(g17)) {
            kotlin.jvm.internal.o.d(g17);
            return g17;
        }
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.d(r17);
        return r17;
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        qb2.x1 session = (qb2.x1) obj;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mm.plugin.finder.storage.dj0 dj0Var = (com.tencent.mm.plugin.finder.storage.dj0) ((jz5.n) this.f338748n).getValue();
        java.lang.String field_talker = session.field_talker;
        kotlin.jvm.internal.o.f(field_talker, "field_talker");
        int i17 = session.field_type;
        int i18 = session.field_actionPermission;
        zy2.bb bbVar = zy2.bb.f477354d;
        int i19 = session.field_rejectMsg;
        int i27 = session.field_disableSendMsg;
        java.lang.String field_senderUserName = session.field_senderUserName;
        kotlin.jvm.internal.o.f(field_senderUserName, "field_senderUserName");
        dj0Var.L0(sessionId, field_talker, i17, i18, bbVar, i19, i27, field_senderUserName, session.field_followFlag, session.field_disableSendmsgNeedFollow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        int i17;
        int i18;
        qb2.x1 localSessionInfo = (qb2.x1) obj;
        kotlin.jvm.internal.o.g(localSessionInfo, "localSessionInfo");
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String str = rawBypMsg.f388827e;
        r45.lo2 lo2Var = new r45.lo2();
        com.tencent.mm.protobuf.g gVar = rawBypMsg.f388829g;
        java.lang.String str2 = this.f256567h;
        if (gVar == null || lo2Var.parseFrom(gVar.g()) == null) {
            com.tencent.mars.xlog.Log.e(str2, "extInfo is null! fromUser=" + rawBypMsg.f388826d.f377558e + " toUser=" + rawBypMsg.f388826d.f377559f + " sessionId=" + rawBypMsg.f388827e);
        }
        java.lang.String str3 = localSessionInfo.field_senderUserName;
        boolean z17 = str3 == null || str3.length() == 0;
        boolean z18 = localSessionInfo.systemRowid > 0;
        ?? r122 = (lo2Var.getInteger(1) & 1) > 0 ? 1 : 0;
        int i19 = localSessionInfo.field_rejectMsg;
        java.lang.String r17 = r(rawBypMsg);
        java.lang.String s17 = s(rawBypMsg);
        if (com.tencent.mm.storage.z3.T3(r17)) {
            i17 = 3;
            i18 = 1;
        } else if ((lo2Var.getInteger(1) & 2) > 0) {
            i18 = 1;
            i17 = 2;
        } else if (z18) {
            com.tencent.mars.xlog.Log.e(str2, "this sessionId[" + str + "] has exist, but it will be move to hi holder. just return");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(20492, 4L, 1L, str);
            g0Var.C(1473L, 4L, 1L);
            i17 = localSessionInfo.field_type;
            i18 = 1;
        } else {
            i18 = 1;
            i17 = 1;
        }
        int i27 = (lo2Var.getInteger(i18) & 4) > 0 ? 1 : 0;
        if (!com.tencent.mm.storage.z3.U3(s17) && !com.tencent.mm.storage.z3.S3(s17)) {
            com.tencent.mars.xlog.Log.e(str2, "[beforeProcessAddMsg] talker[" + s17 + "] is invalid.");
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(20492, 3L, 1L, s17);
            g0Var2.C(1473L, 3L, 1L);
            return false;
        }
        boolean z19 = (localSessionInfo.field_type == i17 && r122 == localSessionInfo.field_actionPermission && i27 == localSessionInfo.field_disableSendMsg && kotlin.jvm.internal.o.b(s17, localSessionInfo.field_talker) && !z17) ? false : true;
        localSessionInfo.field_type = i17;
        localSessionInfo.field_actionPermission = r122;
        localSessionInfo.field_disableSendMsg = i27;
        localSessionInfo.field_talker = s17;
        localSessionInfo.field_rejectMsg = i19;
        localSessionInfo.field_senderUserName = r17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[beforeProcessAddMsg] isNeedReplaceSession=");
        sb6.append(z19);
        sb6.append(" svrMsgId=");
        boolean z27 = z19;
        sb6.append(rawBypMsg.f388826d.f377568r);
        sb6.append(" isSender=");
        sb6.append(rawBypMsg);
        sb6.append(".isSender msgType=");
        sb6.append(rawBypMsg.f388826d.f377560g);
        sb6.append(" createTime=");
        sb6.append(rawBypMsg.f388826d.f377565o);
        sb6.append(" isExitSessionInfo=");
        sb6.append(z18);
        sb6.append(" isSupportSendMedia=");
        sb6.append((boolean) r122);
        sb6.append(" convType=");
        sb6.append(i17);
        sb6.append(" fromUser=");
        sb6.append(rawBypMsg.f388826d.f377558e);
        sb6.append(" toUser=");
        sb6.append(rawBypMsg.f388826d.f377559f);
        sb6.append(" sessionId=");
        sb6.append(rawBypMsg.f388827e);
        sb6.append(" actionPermission=");
        sb6.append((int) r122);
        sb6.append(" extInfo=");
        sb6.append(lo2Var.getInteger(1));
        sb6.append(" myUserName:");
        sb6.append(r17);
        sb6.append(" isSenderUserNameEmpty:");
        sb6.append(z17);
        sb6.append(", followFlag:");
        sb6.append(localSessionInfo.field_followFlag);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        return z27;
    }
}
