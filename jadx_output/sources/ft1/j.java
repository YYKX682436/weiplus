package ft1;

@j95.b
/* loaded from: classes11.dex */
public final class j extends i95.w implements xg3.u {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f266494d = jz5.h.b(ft1.i.f266493d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f266495e = jz5.h.b(ft1.h.f266492d);

    public static final void Ai(ft1.j jVar, byte[] bArr) {
        jVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("trySaveRspSyncKeyBuf, buf isNull=");
        sb6.append(bArr == null);
        sb6.append(", buf size=");
        sb6.append(bArr != null ? bArr.length : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", sb6.toString());
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "trySaveRspSyncKeyBuf, saving syncKey, buf hex=" + com.tencent.mm.sdk.platformtools.t8.l(bArr));
                jz5.g gVar = kt1.u.f311958a;
                java.lang.String valueOf = java.lang.String.valueOf(29);
                java.lang.Object value = ((jz5.n) kt1.u.f311958a).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((com.tencent.mm.sdk.platformtools.o4) value).H(valueOf, bArr);
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "trySaveRspSyncKeyBuf, save success");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AddFriendVerifyRecordService", "trySaveRspSyncKeyBuf, buf is null or empty, skip saving");
    }

    public static final void wi(ft1.j jVar, r45.yx6 yx6Var) {
        jVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.mx6> linkedList = yx6Var.f391483f;
        if (linkedList != null) {
            for (r45.mx6 mx6Var : linkedList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createVerifyRecordMsgInfo: ");
                kotlin.jvm.internal.o.d(mx6Var);
                sb6.append(ft1.k.a(mx6Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", sb6.toString());
                com.tencent.mm.storage.ib ibVar = new com.tencent.mm.storage.ib();
                ibVar.field_msgSvrId = mx6Var.f380901e;
                ibVar.field_direction = mx6Var.f380900d;
                ibVar.field_createTime = mx6Var.f380903g * 1 * 1000;
                ibVar.field_status = yx6Var.f391482e;
                ibVar.field_version = yx6Var.f391484g;
                ibVar.field_encryptTalker = yx6Var.f391481d;
                java.lang.String content = mx6Var.f380902f;
                ibVar.field_content = content;
                kotlin.jvm.internal.o.f(content, "content");
                java.lang.String username = yx6Var.f391481d;
                kotlin.jvm.internal.o.f(username, "username");
                ibVar.field_talker = com.tencent.mm.storage.hb.a(content, username, "MicroMsg.AddFriendVerifyRecordService");
                arrayList.add(ibVar);
            }
        }
        r45.mx6 mx6Var2 = yx6Var.f391485h;
        if (mx6Var2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "createVerifyRecordMsgInfo lastRecvMsg: " + ft1.k.a(mx6Var2));
            com.tencent.mm.storage.ib ibVar2 = new com.tencent.mm.storage.ib();
            ibVar2.field_msgSvrId = mx6Var2.f380901e;
            ibVar2.field_direction = mx6Var2.f380900d;
            ibVar2.field_createTime = mx6Var2.f380903g * 1 * 1000;
            ibVar2.field_status = yx6Var.f391482e;
            ibVar2.field_version = yx6Var.f391484g;
            ibVar2.field_encryptTalker = yx6Var.f391481d;
            java.lang.String content2 = mx6Var2.f380902f;
            ibVar2.field_content = content2;
            kotlin.jvm.internal.o.f(content2, "content");
            java.lang.String username2 = yx6Var.f391481d;
            kotlin.jvm.internal.o.f(username2, "username");
            ibVar2.field_talker = com.tencent.mm.storage.hb.a(content2, username2, "MicroMsg.AddFriendVerifyRecordService");
            arrayList.add(ibVar2);
        }
        java.lang.String username3 = yx6Var.f391481d;
        kotlin.jvm.internal.o.f(username3, "username");
        jVar.Ri(username3, yx6Var.f391482e, arrayList, yx6Var.f391484g);
    }

    public final void Bi(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker, encryptTalker: " + str);
        try {
            if (!gm0.j1.b().m()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker: account not initialized, skip");
                return;
            }
            com.tencent.mm.plugin.messenger.foundation.h2 h2Var = (com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class));
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker, delete fconversation, ret = " + ((com.tencent.mm.storage.o7) h2Var.Ri()).z0(str));
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker, delete fmsginfo, ret = " + ((com.tencent.mm.storage.q7) h2Var.Ui()).z0(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddFriendVerifyRecordService", e17, "clearFMsgAndFConvByEncryptTalker error: " + str, new java.lang.Object[0]);
        }
    }

    public java.lang.Object Di(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        try {
            ((com.tencent.mm.storage.jb) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj()).y0(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "deleteLocalVerifyRecord new data success: ".concat(str));
            Bi(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddFriendVerifyRecordService", e17, "deleteLocalVerifyRecord error: encryptUsername=" + str, new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }

    public void Ni(long j17, xg3.t tVar) {
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f266494d).getValue(), null, new ft1.g(j17, this, tVar, null), 1, null);
    }

    public void Ri(java.lang.String encryptUsername, int i17, java.util.List msgInfoList, long j17) {
        kotlin.jvm.internal.o.g(encryptUsername, "encryptUsername");
        kotlin.jvm.internal.o.g(msgInfoList, "msgInfoList");
        xg3.x0 oj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj();
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "updateLocalVerifyRecord: status is Deleted, delete records for: ".concat(encryptUsername));
            ((com.tencent.mm.storage.jb) oj6).J0(encryptUsername, kz5.p0.f313996d);
        } else {
            ((com.tencent.mm.storage.jb) oj6).J0(encryptUsername, msgInfoList);
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "updateLocalVerifyRecord: updated " + msgInfoList.size() + " records for " + encryptUsername);
        }
    }
}
