package dh3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static int f232492d;

    /* renamed from: a, reason: collision with root package name */
    public static final dh3.c f232489a = new dh3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f232490b = com.tencent.mm.sdk.platformtools.o4.J("message_batch_revoke", gm0.j1.b().h(), 1);

    /* renamed from: c, reason: collision with root package name */
    public static final int f232491c = 7200;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f232493e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c0 f232494f = new com.tencent.mm.sdk.platformtools.c0(1000);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f232495g = new java.util.concurrent.ConcurrentHashMap();

    public final boolean a(java.lang.String str, long j17, long j18, java.lang.String str2) {
        dh3.e eVar = new dh3.e();
        com.tencent.mm.sdk.platformtools.o4 o4Var = f232490b;
        java.lang.String t17 = o4Var.t(str2);
        if (t17 != null) {
            eVar.fromXml(t17);
        }
        if (eVar.j().contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgBatchRevokeMgr", "addBatchSendForUser already exist: revokeBatchId: " + str2 + ", talker: " + str + ", msgId: " + j17);
            return false;
        }
        eVar.j().add(java.lang.Long.valueOf(j17));
        java.lang.String xml = eVar.toXml();
        int i17 = f232491c;
        o4Var.E(str2, xml, i17);
        java.lang.String i18 = i(str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        f232494f.d(i18, str2);
        o4Var.E(i18, str2, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgBatchRevokeMgr", "addBatchSendForUser: revokeBatchId: " + str2 + ", talker: " + str + ", msgId: " + j17);
        return true;
    }

    public final boolean b(java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.lang.String revokeBatchId) {
        kotlin.jvm.internal.o.g(revokeBatchId, "revokeBatchId");
        if (!(str == null || str.length() == 0) && f9Var != null && f9Var.getMsgId() > 0) {
            return a(str, f9Var.getMsgId(), f9Var.getCreateTime(), revokeBatchId);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addBatchSendForUser: talker[");
        sb6.append(str);
        sb6.append("] is empty or recordMsg is null or recordMsg.msgId <= 0L[");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", sb6.toString());
        return false;
    }

    public final boolean c(java.lang.String str, oi3.g gVar, java.lang.String revokeBatchId) {
        kotlin.jvm.internal.o.g(revokeBatchId, "revokeBatchId");
        if (!(str == null || str.length() == 0) && gVar != null) {
            int i17 = gVar.f345617d;
            if (gVar.getLong(i17 + 0) > 0) {
                return a(str, gVar.getLong(i17 + 0), gVar.getLong(i17 + 2), revokeBatchId);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addBatchSendForUser: talker[");
        sb6.append(str);
        sb6.append("] is empty or recordMsg is null or recordMsg.localId <= 0L[");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.getLong(gVar.f345617d + 0)) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", sb6.toString());
        return false;
    }

    public final void d(com.tencent.mm.storage.f9 targetMsg, com.tencent.mm.plugin.msg.MsgIdTalker forwardMsgIdTalker) {
        kotlin.jvm.internal.o.g(targetMsg, "targetMsg");
        kotlin.jvm.internal.o.g(forwardMsgIdTalker, "forwardMsgIdTalker");
        java.lang.String Q0 = targetMsg.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        dh3.a aVar = new dh3.a(forwardMsgIdTalker, Q0);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f232495g;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(aVar);
        if (str == null || str.length() == 0) {
            return;
        }
        if (!b(targetMsg.Q0(), targetMsg, str)) {
            targetMsg.f193934n2 = str;
        }
        concurrentHashMap.remove(aVar);
    }

    public final void e(oi3.g targetSimpleMsg, com.tencent.mm.plugin.msg.MsgIdTalker forwardMsgIdTalker) {
        kotlin.jvm.internal.o.g(targetSimpleMsg, "targetSimpleMsg");
        kotlin.jvm.internal.o.g(forwardMsgIdTalker, "forwardMsgIdTalker");
        int i17 = targetSimpleMsg.f345617d;
        dh3.a aVar = new dh3.a(forwardMsgIdTalker, targetSimpleMsg.getString(i17 + 3));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f232495g;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(aVar);
        if ((str == null || str.length() == 0) || !c(targetSimpleMsg.getString(i17 + 3), targetSimpleMsg, str)) {
            return;
        }
        concurrentHashMap.remove(aVar);
    }

    public final java.lang.String f(java.lang.String str, dh3.d scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: talker is empty or recordMsg is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append(c01.id.c());
        synchronized (f232493e) {
            int i17 = f232492d + 1;
            f232492d = i17;
            sb6.append(java.lang.String.valueOf(i17));
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        byte[] bytes = sb7.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgBatchRevokeMgr", "generated new revoke batch id for user:" + str + ", batchId: " + g17 + ", scene:" + scene);
        dh3.e eVar = new dh3.e();
        eVar.l(scene.f232500d);
        eVar.k(new java.util.LinkedList());
        f232490b.E(g17, eVar.toXml(), f232491c);
        return g17;
    }

    public final java.lang.String g(com.tencent.mm.plugin.msg.MsgIdTalker forwardMsgIdTalker, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(forwardMsgIdTalker, "forwardMsgIdTalker");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        java.lang.String str = (java.lang.String) f232495g.get(new dh3.a(forwardMsgIdTalker, toUser));
        return str == null ? "" : str;
    }

    public final java.lang.String h(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.String Q0 = msgInfo.Q0();
        if (Q0 == null || Q0.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: talker is empty or recordMsg is null");
            return null;
        }
        java.lang.String Q02 = msgInfo.Q0();
        kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
        java.lang.String i17 = i(Q02, java.lang.Long.valueOf(msgInfo.getMsgId()), java.lang.Long.valueOf(msgInfo.getCreateTime()));
        java.lang.String str = (java.lang.String) f232494f.b(i17);
        return str == null ? f232490b.t(i17) : str;
    }

    public final java.lang.String i(java.lang.String str, java.lang.Long l17, java.lang.Long l18) {
        return "Index_" + str + '_' + l17 + '_' + l18;
    }

    public final void j(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, java.lang.String toUser, java.lang.String revokeBatchId) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        kotlin.jvm.internal.o.g(revokeBatchId, "revokeBatchId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgBatchRevokeMgr", "putMsgBatchIdIntoCache: revokeBatchId: " + revokeBatchId + ", msgIdTalker: " + msgIdTalker + ", toUser: " + toUser);
        f232495g.put(new dh3.a(msgIdTalker, toUser), revokeBatchId);
    }

    public final void k(java.lang.String str, long j17, long j18, long j19) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: talker is empty ");
            return;
        }
        java.lang.String i17 = i(str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19));
        com.tencent.mm.sdk.platformtools.o4 o4Var = f232490b;
        java.lang.String t17 = o4Var.t(i17);
        if (t17 == null || t17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: revokeBatchId is null, talker: " + str + ", msgId: " + j17 + ", svrId: " + j18);
            return;
        }
        dh3.e eVar = new dh3.e();
        java.lang.String t18 = o4Var.t(t17);
        if (t18 != null) {
            eVar.fromXml(t18);
        }
        if (eVar.j().isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: record is null, talker: " + str + ", msgId: " + j17 + ", svrId: " + j18);
            return;
        }
        eVar.j().remove(java.lang.Long.valueOf(j17));
        if (eVar.j().isEmpty()) {
            o4Var.remove(t17);
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: remove revokeBatchId kv, talker: " + str + ", msgId: " + j17 + ", svrId: " + j18);
        } else {
            o4Var.E(t17, eVar.toXml(), f232491c);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: revokeBatchId: " + t17 + ", talker: " + str + ", msgId: " + j17);
        }
        o4Var.remove(i17);
        f232494f.e(i17);
    }
}
