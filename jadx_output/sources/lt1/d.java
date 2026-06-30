package lt1;

/* loaded from: classes11.dex */
public final class d extends lt1.e {
    @Override // lt1.e
    public int b() {
        return 29;
    }

    @Override // lt1.e
    public int c() {
        return 12789;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.AddFriendVerifyRecordSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/verifyrecordsync";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // lt1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(r45.jo5 r5, boolean r6, yz5.l r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r5 = r8 instanceof lt1.a
            if (r5 == 0) goto L13
            r5 = r8
            lt1.a r5 = (lt1.a) r5
            int r7 = r5.f321182f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r7 & r0
            if (r1 == 0) goto L13
            int r7 = r7 - r0
            r5.f321182f = r7
            goto L18
        L13:
            lt1.a r5 = new lt1.a
            r5.<init>(r4, r8)
        L18:
            java.lang.Object r7 = r5.f321180d
            pz5.a r8 = pz5.a.f359186d
            int r0 = r5.f321182f
            r1 = 1
            java.lang.String r2 = "MicroMsg.AddFriendVerifyRecordSyncProcessor"
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L91
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            if (r6 == 0) goto L96
            java.lang.String r6 = "handleContinue: need continue, re-fetch all data from cloud"
            com.tencent.mars.xlog.Log.i(r2, r6)
            java.lang.String r6 = "handleContinue: delete all local verify record cache"
            com.tencent.mars.xlog.Log.i(r2, r6)
            java.lang.Class<vg3.x3> r6 = vg3.x3.class
            lm0.a r6 = gm0.j1.s(r6)
            vg3.x3 r6 = (vg3.x3) r6
            com.tencent.mm.plugin.messenger.foundation.h2 r6 = (com.tencent.mm.plugin.messenger.foundation.h2) r6
            xg3.x0 r6 = r6.oj()
            com.tencent.mm.storage.jb r6 = (com.tencent.mm.storage.jb) r6
            l75.k0 r7 = r6.f195062d
            java.lang.String r0 = "VerifyRecordMsgInfo"
            r3 = 0
            if (r7 == 0) goto L5a
            r7.delete(r0, r3, r3)
        L5a:
            r7 = 5
            r6.doNotify(r0, r7, r3)
            java.lang.String r6 = "handleContinue: request verify record history from cloud"
            com.tencent.mars.xlog.Log.i(r2, r6)
            r5.f321182f = r1
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r5)
            r6.<init>(r5, r1)
            r6.k()
            lt1.b r5 = lt1.b.f321183d
            r6.m(r5)
            java.lang.Class<xg3.u> r5 = xg3.u.class
            i95.m r5 = i95.n0.c(r5)
            xg3.u r5 = (xg3.u) r5
            lt1.c r7 = new lt1.c
            r7.<init>(r6)
            ft1.j r5 = (ft1.j) r5
            r0 = 0
            r5.Ni(r0, r7)
            java.lang.Object r5 = r6.j()
            if (r5 != r8) goto L91
            return r8
        L91:
            java.lang.String r5 = "handleContinue: re-fetch completed"
            com.tencent.mars.xlog.Log.i(r2, r5)
        L96:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lt1.d.f(r45.jo5, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        kotlin.jvm.internal.o.g(syncItems, "syncItems");
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "process() called with: syncItems = " + syncItems.size());
        if (syncItems.isEmpty()) {
            return;
        }
        xg3.u uVar = (xg3.u) i95.n0.c(xg3.u.class);
        java.util.Iterator it = syncItems.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.yx6 yx6Var = new r45.yx6();
            yx6Var.parseFrom(((r45.go5) next).f375397e.g());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VerifyRecord: status: ");
            sb6.append(yx6Var.f391482e);
            sb6.append(", version: ");
            sb6.append(yx6Var.f391484g);
            sb6.append(", msgSize: ");
            java.util.LinkedList linkedList = yx6Var.f391483f;
            sb6.append(linkedList.size());
            sb6.append(", username: ");
            sb6.append(yx6Var.f391481d);
            sb6.append(" lastRecvMsg:");
            sb6.append(yx6Var.f391485h);
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", sb6.toString());
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.mx6 mx6Var = (r45.mx6) it6.next();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("VerifyMsg: direction:");
                    sb7.append(mx6Var.f380900d);
                    sb7.append(" msgid:");
                    int i19 = i18;
                    sb7.append(mx6Var.f380901e);
                    sb7.append(" create_time:");
                    sb7.append(mx6Var.f380903g);
                    sb7.append(" content:");
                    sb7.append(mx6Var.f380902f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", sb7.toString());
                    com.tencent.mm.storage.ib ibVar = new com.tencent.mm.storage.ib();
                    ibVar.field_msgSvrId = mx6Var.f380901e;
                    ibVar.field_direction = mx6Var.f380900d;
                    xg3.u uVar2 = uVar;
                    java.util.Iterator it7 = it;
                    ibVar.field_createTime = mx6Var.f380903g * 1 * 1000;
                    ibVar.field_status = yx6Var.f391482e;
                    ibVar.field_version = yx6Var.f391484g;
                    ibVar.field_encryptTalker = yx6Var.f391481d;
                    java.lang.String content = mx6Var.f380902f;
                    ibVar.field_content = content;
                    kotlin.jvm.internal.o.f(content, "content");
                    java.lang.String username = yx6Var.f391481d;
                    kotlin.jvm.internal.o.f(username, "username");
                    ibVar.field_talker = com.tencent.mm.storage.hb.a(content, username, "MicroMsg.AddFriendVerifyRecordSyncProcessor");
                    arrayList.add(ibVar);
                    i18 = i19;
                    it6 = it6;
                    uVar = uVar2;
                    it = it7;
                }
            }
            xg3.u uVar3 = uVar;
            java.util.Iterator it8 = it;
            int i27 = i18;
            r45.mx6 mx6Var2 = yx6Var.f391485h;
            if (mx6Var2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "lastRecvMsg: direction:" + mx6Var2.f380900d + " msgid:" + mx6Var2.f380901e + " create_time:" + mx6Var2.f380903g + " content:" + mx6Var2.f380902f);
                com.tencent.mm.storage.ib ibVar2 = new com.tencent.mm.storage.ib();
                ibVar2.field_msgSvrId = mx6Var2.f380901e;
                ibVar2.field_direction = mx6Var2.f380900d;
                ibVar2.field_createTime = ((long) mx6Var2.f380903g) * ((long) 1) * 1000;
                ibVar2.field_status = yx6Var.f391482e;
                ibVar2.field_version = yx6Var.f391484g;
                ibVar2.field_encryptTalker = yx6Var.f391481d;
                java.lang.String content2 = mx6Var2.f380902f;
                ibVar2.field_content = content2;
                kotlin.jvm.internal.o.f(content2, "content");
                java.lang.String username2 = yx6Var.f391481d;
                kotlin.jvm.internal.o.f(username2, "username");
                ibVar2.field_talker = com.tencent.mm.storage.hb.a(content2, username2, "MicroMsg.AddFriendVerifyRecordSyncProcessor");
                arrayList.add(ibVar2);
            }
            java.lang.String username3 = yx6Var.f391481d;
            kotlin.jvm.internal.o.f(username3, "username");
            ((ft1.j) uVar3).Ri(username3, yx6Var.f391482e, arrayList, yx6Var.f391484g);
            i17 = i27;
            uVar = uVar3;
            it = it8;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "process() end called");
    }
}
