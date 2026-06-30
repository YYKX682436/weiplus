package kc5;

@j95.b
/* loaded from: classes9.dex */
public final class x extends i95.w implements wg3.j {

    /* renamed from: d, reason: collision with root package name */
    public final r26.t f306588d = new r26.t("<extcommoninfo\\b[^>]*>[\\s\\S]*?</extcommoninfo>");

    /* renamed from: e, reason: collision with root package name */
    public final r26.t f306589e = new r26.t("\\s*<groupinfo\\b[^>]*>[\\s\\S]*?</groupinfo>\\s*");

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f306590f = new java.util.LinkedHashMap();

    public static final void wi(kc5.x xVar, com.tencent.mm.storage.f9 f9Var) {
        xVar.getClass();
        java.lang.String a17 = ic5.f.f290437c.a(f9Var);
        c95.d dVar = c95.d.f39747a;
        up5.x a18 = dVar.a(a17);
        if (a18 == null) {
            a18 = new up5.x();
            a18.f430115a = a17;
            a18.f430117c = f9Var.getMsgId();
            a18.f430118d = f9Var.T1();
            a18.f430119e = 0;
            a18.f430120f = 0;
        }
        if (a18.f430120f == 1) {
            a18.f430120f = 0;
            a18.f430117c = f9Var.getMsgId();
            a18.f430118d = f9Var.T1();
            a18.f430119e = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "refresh hasShowTongue[" + a17 + "] - firstMsgId:" + f9Var.getMsgId() + " - firstMsgCreateTime:" + f9Var.getCreateTime());
        }
        a18.f430116b = f9Var.Q0();
        a18.f430119e++;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "recordUnreadInfo[" + a17 + "] - talker:" + f9Var.Q0() + " - msgId:" + a18.f430117c + " - unreadCount:" + a18.f430119e + " - hasShowTongue:" + a18.f430120f);
        dVar.e(a18);
    }

    public void Ai(com.tencent.mm.storage.f9 f9Var) {
        if (Di() && f9Var != null) {
            java.lang.String groupId = ic5.f.f290437c.a(f9Var);
            c95.d dVar = c95.d.f39747a;
            if (dVar.a(groupId) != null) {
                kotlin.jvm.internal.o.g(groupId, "groupId");
                try {
                    dVar.c().deleteObjects(up5.j.f429997c.eq(groupId));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgGroupDBProvider", "[deleteMsgGroupExtInfo] groupId=" + groupId + ", error: " + e17.getMessage());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "clearUnreadGroupInfo[" + groupId + ']');
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long Bi(java.lang.String talker, r45.j4 cmdAM, java.lang.String str) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(cmdAM, "cmdAM");
        l15.c cVar = new l15.c();
        boolean z17 = true;
        cVar.set__useLruCache(true);
        if (str == null) {
            str = "";
        }
        cVar.fromXml(str);
        r15.b l17 = cVar.l();
        up5.y yVar = null;
        r15.d j17 = l17 != null ? l17.j() : null;
        java.lang.String groupId = j17 != null ? j17.getId() : null;
        if (groupId != null && groupId.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return c01.w9.m(talker, cmdAM.f377565o);
        }
        c95.d dVar = c95.d.f39747a;
        kotlin.jvm.internal.o.g(groupId, "groupId");
        try {
            yVar = (up5.y) ((com.tencent.wcdb.core.Table) ((jz5.n) c95.d.f39750d).getValue()).getFirstObject(up5.k.f430005c.eq(groupId));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgGroupDBProvider", "[getMsgGroupInfo] groupId=" + groupId + ", error: " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "fixRecvMediaGroupTime[" + groupId + ']');
        if (yVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "fixRecvMediaGroupTime first time[" + groupId + ']');
            long m17 = c01.w9.m(talker, (long) cmdAM.f377565o);
            int count = j17.getCount();
            java.util.HashMap hashMap = (java.util.HashMap) c01.w9.f37539b;
            if (hashMap.containsKey(talker)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "[reservedRecvMsgCreateTime] reserved recv msg create time, talker:%s, reservedCount:%s", talker, java.lang.Integer.valueOf(count));
                hashMap.put(talker, java.lang.Long.valueOf(((java.lang.Long) hashMap.get(talker)).longValue() + count));
            }
            return m17;
        }
        long j18 = yVar.f430123c;
        long j19 = 1 + j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "fixRecvMediaGroupTime[" + groupId + "] - talker:" + talker + " - lastTimeInGroup:" + j18 + " - thisTime:" + j19);
        return j19;
    }

    public boolean Di() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupUiVisibility()) >= 1;
    }

    public boolean Ni() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupRevokeEnable()) == 1;
    }

    public boolean Ri() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupUiVisibility()) >= 2;
    }

    public void Ui(com.tencent.mm.storage.f9 f9Var, y15.d dVar) {
        r15.d j17;
        r15.d j18;
        if (!Di() || f9Var == null || dVar == null) {
            return;
        }
        r15.b j19 = dVar.j();
        java.lang.String str = null;
        java.lang.String id6 = (j19 == null || (j18 = j19.j()) == null) ? null : j18.getId();
        if (id6 == null || r26.n0.N(id6)) {
            return;
        }
        r15.b j27 = dVar.j();
        if (j27 != null && (j17 = j27.j()) != null) {
            str = j17.getId();
        }
        Vi(f9Var, str);
        ((ku5.t0) ku5.t0.f312615d).h(new kc5.v(this, f9Var), "MicroMsg.MediaGroupService");
    }

    public final void Vi(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        up5.y yVar = new up5.y();
        yVar.f430121a = str;
        yVar.f430122b = f9Var.Q0();
        yVar.f430123c = f9Var.getCreateTime();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupService", "recordMediaGroupInfo[" + str + "] - createTime:" + f9Var.getCreateTime());
        c95.d.f39747a.f(yVar);
    }

    public java.lang.String Zi(java.lang.String str) {
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupRemoveGroupInfo()) == 1)) {
            return str;
        }
        if (str != null) {
            return this.f306588d.f(str, new kc5.w(this));
        }
        return null;
    }
}
