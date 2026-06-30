package com.tencent.mm.plugin.multitalk.model;

@j95.b
/* loaded from: classes14.dex */
public class d2 extends i95.w implements com.tencent.mm.plugin.multitalk.model.y {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.model.y f149907e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f149908f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f149909g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f149910h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f149911i = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149906d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public d2() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar == null || !oVar.ib()) {
            return;
        }
        if (com.tencent.mm.plugin.multitalk.model.u3.f150156g == null) {
            synchronized (com.tencent.mm.plugin.multitalk.model.u3.class) {
                if (com.tencent.mm.plugin.multitalk.model.u3.f150156g == null) {
                    com.tencent.mm.plugin.multitalk.model.u3.f150156g = new com.tencent.mm.plugin.multitalk.model.u3();
                }
            }
        }
        this.f149907e = com.tencent.mm.plugin.multitalk.model.u3.f150156g;
    }

    public java.util.LinkedList Ai() {
        if (this.f149911i == null) {
            this.f149911i = new java.util.LinkedList();
        }
        return this.f149911i;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void B2(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            yVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = this.f149910h;
        if (linkedList != null) {
            if (linkedList.contains(str)) {
                return;
            }
            this.f149910h.add(str);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            this.f149910h = linkedList2;
            if (linkedList2.contains(str)) {
                return;
            }
            this.f149910h.add(str);
        }
    }

    public final boolean Bi(java.lang.String str, r45.k07 k07Var) {
        boolean z17;
        java.lang.String[] strArr;
        if (k07Var == null) {
            return false;
        }
        p21.j jVar = new p21.j();
        jVar.field_wxGroupId = str;
        jVar.field_groupId = k07Var.f378278f;
        long j17 = k07Var.f378277e;
        jVar.field_roomId = (int) j17;
        jVar.field_roomKey = 0L;
        jVar.field_routeId = 0;
        jVar.field_inviteUserName = k07Var.f378282m;
        jVar.field_ilinkRoomId = j17;
        java.util.LinkedList linkedList = k07Var.f378279g;
        jVar.field_memberCount = linkedList.size() > 0 ? linkedList.size() : 0;
        jVar.field_createTime = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.plugin.multitalk.model.e3.Ni().y0(str) == null) {
            pj3.b Ni = com.tencent.mm.plugin.multitalk.model.e3.Ni();
            Ni.getClass();
            java.lang.String str2 = jVar.field_wxGroupId;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. multiTalkInfo wxGroupId is empty!");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d, ilinkroomid=%d", str2, jVar.field_groupId, java.lang.Integer.valueOf(jVar.field_roomId), java.lang.Long.valueOf(jVar.field_roomKey), java.lang.Integer.valueOf(jVar.field_routeId), jVar.field_inviteUserName, java.lang.Integer.valueOf(jVar.field_memberCount), java.lang.Long.valueOf(jVar.field_createTime), java.lang.Long.valueOf(jVar.field_ilinkRoomId));
            try {
                boolean insert = Ni.insert(jVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "insert ret " + insert + " for id=%s" + str2);
                return insert;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + e17.toString());
                return false;
            }
        }
        pj3.b Ni2 = com.tencent.mm.plugin.multitalk.model.e3.Ni();
        Ni2.getClass();
        java.lang.String str3 = jVar.field_wxGroupId;
        if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. multiTalkInfo wxGroupId is empty!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d,state=%d,ilinkroomid=%d", str3, jVar.field_groupId, java.lang.Integer.valueOf(jVar.field_roomId), java.lang.Long.valueOf(jVar.field_roomKey), java.lang.Integer.valueOf(jVar.field_routeId), jVar.field_inviteUserName, java.lang.Integer.valueOf(jVar.field_memberCount), java.lang.Long.valueOf(jVar.field_createTime), java.lang.Integer.valueOf(jVar.field_state), java.lang.Long.valueOf(jVar.field_ilinkRoomId));
        try {
            strArr = new java.lang.String[1];
            z17 = false;
        } catch (java.lang.Exception e18) {
            e = e18;
            z17 = false;
        }
        try {
            strArr[0] = "wxGroupId";
            boolean update = Ni2.update(jVar, strArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update ret " + update + " for id=%s" + str3);
            return update;
        } catch (java.lang.Exception e19) {
            e = e19;
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + e.toString());
            return z17;
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public java.lang.String De(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return ((com.tencent.mm.plugin.multitalk.model.u3) yVar).De(str, str2);
        }
        pj3.c z07 = com.tencent.mm.plugin.multitalk.model.e3.Ui().z0(str, str2);
        if (z07 != null) {
            return z07.field_inviteUserName;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di() {
        /*
            r15 = this;
            pj3.b r0 = com.tencent.mm.plugin.multitalk.model.e3.Ni()
            java.lang.String r1 = "MicroMsg.MultiTalk.storage.MultiTalkInfoStorage"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "select wxGroupId, groupId, roomId, roomKey, routeId, createTime, ilinkRoomId from MultiTalkInfo"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L14:
            r4 = 1
            if (r0 == 0) goto L99
            boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            if (r5 == 0) goto L99
            p21.j r5 = new p21.j     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.<init>()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r6 = r0.getString(r2)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_wxGroupId = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r6 = r0.getString(r4)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_groupId = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r6 = 2
            int r7 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_roomId = r7     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r7 = 3
            long r8 = r0.getLong(r7)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_roomKey = r8     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r8 = 4
            int r9 = r0.getInt(r8)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_routeId = r9     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r9 = 5
            long r10 = r0.getLong(r9)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_createTime = r10     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r10 = 6
            long r11 = r0.getLong(r10)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.field_ilinkRoomId = r11     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r11 = "getMultiTalkInfoList got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d, createTime=%d, ilinkroomid = %d"
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r13 = r5.field_wxGroupId     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r2] = r13     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r13 = r5.field_groupId     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r4] = r13     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            int r13 = r5.field_roomId     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r6] = r13     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            long r13 = r5.field_roomKey     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r7] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            int r6 = r5.field_routeId     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r8] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            long r6 = r5.field_createTime     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r9] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            long r6 = r5.field_ilinkRoomId     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r10] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            com.tencent.mars.xlog.Log.i(r1, r11, r12)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r3.add(r5)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            goto L14
        L8d:
            r1 = move-exception
            goto L95
        L8f:
            java.lang.String r5 = "getMultiTalkInfoList error!"
            com.tencent.mars.xlog.Log.e(r1, r5)     // Catch: java.lang.Throwable -> L8d
            goto L9b
        L95:
            r0.close()
            throw r1
        L99:
            if (r0 == 0) goto L9e
        L9b:
            r0.close()
        L9e:
            java.lang.String r0 = "MicroMsg.MultiTalkRoomListMsg"
            java.lang.String r1 = "setMultitalkingwxGroupIdMap reset!"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        Lae:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc0
            java.lang.Object r3 = r1.next()
            p21.j r3 = (p21.j) r3
            java.lang.String r3 = r3.field_wxGroupId
            r0.add(r3)
            goto Lae
        Lc0:
            java.util.HashSet r1 = r15.f149909g
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Ld2
            java.util.HashSet r1 = r15.f149909g
            if (r1 != 0) goto Ld3
            int r1 = r0.size()
            if (r1 != 0) goto Ld3
        Ld2:
            r2 = r4
        Ld3:
            r15.f149909g = r0
            if (r2 != 0) goto Le3
            com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent r0 = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent
            r0.<init>()
            am.mq r1 = r0.f54671g
            r1.f7358a = r4
            r0.e()
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.d2.Di():void");
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean Gf(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.u3) yVar).getClass();
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void I9(java.util.List list, java.util.List list2) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.u3) yVar).I9(list, list2);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void J4(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            yVar.J4(str);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomListMsg", "cleanBanner failure ! wxGroupId is null or empty!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "cleanBanner  wxGroupId = %s", str);
        d(str);
        com.tencent.mm.plugin.multitalk.model.e3.Ui().d(str);
        wi(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void Ji(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.u3) yVar).Ji(str);
            return;
        }
        if (com.tencent.mm.storage.z3.R4(str) && zc(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "isKicked! now clean banner and check if i am in multitalk.");
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null && com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71608f.equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "yes i am now in multitalk so i exit now!");
                com.tencent.mm.plugin.multitalk.model.e3.Ri().f(false, false);
            }
            this.f149906d.postDelayed(new com.tencent.mm.plugin.multitalk.model.b2(this, str), 2000L);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void Ld(java.lang.String str, er4.e eVar) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.u3) yVar).Ld(str, eVar);
        }
    }

    public void Ni(java.lang.String str, r45.k07 k07Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", str);
        if (k07Var != null && (linkedList = k07Var.f378279g) != null && linkedList.size() > 0) {
            com.tencent.mm.plugin.multitalk.model.e3.Ui().d(str);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.z07 z07Var = (r45.z07) it.next();
                pj3.c cVar = new pj3.c();
                cVar.field_wxGroupId = str;
                cVar.field_inviteUserName = k07Var.f378282m;
                cVar.field_memberUuid = 0L;
                cVar.field_userName = z07Var.f391576d.f390689d;
                int i17 = z07Var.f391577e;
                cVar.field_status = 20;
                if (i17 == 1) {
                    cVar.field_status = 10;
                }
                if (i17 == 2 || i17 == 3) {
                    cVar.field_status = 1;
                }
                if (!com.tencent.mm.plugin.multitalk.model.e3.Ui().J0(cVar)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, z07Var.f391576d.f390689d, java.lang.Long.valueOf(cVar.field_memberUuid), cVar.field_inviteUserName);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, z07Var.f391576d.f390689d, java.lang.Long.valueOf(cVar.field_memberUuid), cVar.field_inviteUserName, java.lang.Integer.valueOf(cVar.field_status));
            }
        }
        if (Bi(str, k07Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "addwxGroupIdInMap:" + str);
            java.util.HashSet hashSet = this.f149909g;
            if (hashSet != null) {
                hashSet.add(str);
            } else {
                Di();
                java.util.HashSet hashSet2 = this.f149909g;
                if (hashSet2 != null) {
                    hashSet2.add(str);
                }
            }
        }
        wi(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public dm.f8 O7(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        return yVar != null ? ((com.tencent.mm.plugin.multitalk.model.u3) yVar).O7(str) : com.tencent.mm.plugin.multitalk.model.e3.Ni().y0(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public int Og(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return ((com.tencent.mm.plugin.multitalk.model.u3) yVar).Og(str, str2);
        }
        pj3.c z07 = com.tencent.mm.plugin.multitalk.model.e3.Ui().z0(str, str2);
        if (z07 != null) {
            return z07.field_status;
        }
        return 30;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public java.util.List P6(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return yVar.P6(str);
        }
        java.util.LinkedList D0 = com.tencent.mm.plugin.multitalk.model.e3.Ui().D0(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = D0.iterator();
        while (it.hasNext()) {
            linkedList.add(((pj3.c) it.next()).field_userName);
        }
        return linkedList;
    }

    public void Ri(java.lang.String str, r45.k07 k07Var) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateBanner  wxGroupId = %s", str);
        p21.j y07 = com.tencent.mm.plugin.multitalk.model.e3.Ni().y0(str);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "change,still show banner.");
            Ni(str, k07Var);
            return;
        }
        if (y07.field_ilinkRoomId != k07Var.f378277e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "roomid has changed! now return!multiTalkInfo.field_roomId:" + y07.field_roomId + "bannerinfo.roomid:" + k07Var.f378277e);
            return;
        }
        java.util.LinkedList linkedList = k07Var.f378279g;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((r45.z07) it.next()).f391576d.f390689d);
        }
        int i18 = 2;
        pj3.c cVar = null;
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
        int i19 = 1;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "myUserName is null , go save delete all logic.");
            Bi(str, k07Var);
        } else {
            java.util.LinkedList<pj3.c> D0 = com.tencent.mm.plugin.multitalk.model.e3.Ui().D0(str);
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            for (pj3.c cVar2 : D0) {
                linkedList3.add(cVar2.field_userName);
                if (cVar2.field_userName.equals(str2)) {
                    cVar = cVar2;
                }
            }
            long j17 = 0;
            int i27 = 3;
            if (cVar == null || !linkedList2.contains(str2)) {
                i17 = 1;
            } else {
                java.util.Iterator it6 = linkedList.iterator();
                i17 = 1;
                while (it6.hasNext()) {
                    r45.z07 z07Var = (r45.z07) it6.next();
                    int i28 = z07Var.f391577e;
                    int i29 = (i28 == i18 || i28 == i27) ? 1 : i28 == 1 ? 10 : 20;
                    java.lang.String str3 = z07Var.f391576d.f390689d;
                    if (str3 != null && str3.equals(str2) && z07Var.f391577e != cVar.field_status) {
                        pj3.c cVar3 = new pj3.c();
                        cVar3.field_wxGroupId = str;
                        cVar3.field_inviteUserName = k07Var.f378282m;
                        cVar3.field_memberUuid = j17;
                        cVar3.field_userName = z07Var.f391576d.f390689d;
                        cVar3.field_status = i29;
                        if (!com.tencent.mm.plugin.multitalk.model.e3.Ui().J0(cVar3)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, z07Var.f391576d.f390689d, java.lang.Long.valueOf(cVar3.field_memberUuid), cVar3.field_inviteUserName);
                            i17 = 0;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, z07Var.f391576d.f390689d, java.lang.Long.valueOf(cVar3.field_memberUuid), cVar3.field_inviteUserName, java.lang.Integer.valueOf(cVar3.field_status));
                    }
                    i18 = 2;
                    j17 = 0;
                    i27 = 3;
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                r45.z07 z07Var2 = (r45.z07) it7.next();
                if (!linkedList3.contains(z07Var2.f391576d.f390689d)) {
                    pj3.c cVar4 = new pj3.c();
                    cVar4.field_wxGroupId = str;
                    cVar4.field_inviteUserName = k07Var.f378282m;
                    cVar4.field_memberUuid = 0L;
                    cVar4.field_userName = z07Var2.f391576d.f390689d;
                    cVar4.field_status = 20;
                    int i37 = z07Var2.f391577e;
                    if (i37 == i19) {
                        cVar4.field_status = 10;
                    }
                    if (i37 == 2 || i37 == 3) {
                        cVar4.field_status = i19;
                    }
                    if (!com.tencent.mm.plugin.multitalk.model.e3.Ui().J0(cVar4)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, z07Var2.f391576d.f390689d, java.lang.Long.valueOf(cVar4.field_memberUuid), cVar4.field_inviteUserName);
                        i17 = 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, z07Var2.f391576d.f390689d, java.lang.Long.valueOf(cVar4.field_memberUuid), cVar4.field_inviteUserName, java.lang.Integer.valueOf(cVar4.field_status));
                    i19 = 1;
                }
            }
            java.util.Iterator it8 = linkedList3.iterator();
            i19 = i17;
            while (it8.hasNext()) {
                java.lang.String str4 = (java.lang.String) it8.next();
                if (!linkedList2.contains(str4)) {
                    if (com.tencent.mm.plugin.multitalk.model.e3.Ui().y0(str, str4)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete success for wxGroupId = " + str + ", username = " + str4);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete fail for wxGroupId = " + str + ", username = " + str4);
                        i19 = 0;
                    }
                }
            }
        }
        if (i19 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomListMsg", "update multiTalkMember failure!");
        } else {
            wi(str);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean Si() {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        return yVar != null ? ((com.tencent.mm.plugin.multitalk.model.u3) yVar).Si() : com.tencent.mm.plugin.multitalk.model.e3.Ri().z();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean Th(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        return yVar != null ? ((com.tencent.mm.plugin.multitalk.model.u3) yVar).Th(str, str2) : com.tencent.mm.plugin.multitalk.model.e3.Ui().z0(str, str2) != null;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public synchronized void Ud(com.tencent.mm.plugin.multitalk.model.x xVar) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.u3) yVar).Ud(xVar);
        } else {
            ((java.util.ArrayList) this.f149908f).add(xVar);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean d(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return yVar.d(str);
        }
        if (this.f149909g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "removewxGroupIdInMap:" + str);
            this.f149909g.remove(str);
        } else {
            Di();
        }
        return com.tencent.mm.plugin.multitalk.model.e3.Ni().d(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean e5() {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        return yVar != null ? ((com.tencent.mm.plugin.multitalk.model.u3) yVar).e5() : com.tencent.mm.plugin.multitalk.model.e3.Ri().x() && (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Starting || com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Creating);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean ff() {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        return yVar != null ? ((com.tencent.mm.plugin.multitalk.model.u3) yVar).ff() : vq4.p0.d() || com.tencent.mm.plugin.multitalk.model.e3.Ri().z() || com.tencent.mm.plugin.multitalk.model.e3.Ri().x() || com.tencent.mm.plugin.multitalk.model.e3.Ri().y();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public java.lang.String getDisplayName(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return ((com.tencent.mm.plugin.multitalk.model.u3) yVar).getDisplayName(str);
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean kb(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return ((com.tencent.mm.plugin.multitalk.model.u3) yVar).kb(str);
        }
        sj3.d4 Zi = com.tencent.mm.plugin.multitalk.model.e3.Zi();
        if (str != null) {
            android.content.Intent intent = Zi.f408477f;
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("enterMainUiWxGroupId");
                sj3.q3 q3Var = Zi.f408475d;
                if (!android.text.TextUtils.isEmpty(stringExtra) && kotlin.jvm.internal.o.b(str, stringExtra) && q3Var != null && q3Var.getVisibility() == 0) {
                    return true;
                }
            }
        } else {
            sj3.q3 q3Var2 = Zi.f408475d;
            if (q3Var2 != null) {
                if (q3Var2.getVisibility() == 0) {
                    sj3.q3 q3Var3 = Zi.f408475d;
                    if (q3Var3 != null && q3Var3.isShown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean mh(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return ((com.tencent.mm.plugin.multitalk.model.u3) yVar).mh(str);
        }
        p21.j jVar = (p21.j) O7(str);
        if (jVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk, roomid:" + jVar.field_roomId + " ilinkroomid:" + jVar.field_ilinkRoomId + " wxgroupid:" + str + " wifigateway:" + com.tencent.mm.plugin.voip.model.v2protocal.w());
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk:groupid:%s", jVar.field_groupId);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.N((long) com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(1)), c01.z1.r());
        com.tencent.mm.plugin.multitalk.model.e3.Ri().O(str, 2);
        java.lang.String str2 = jVar.field_groupId;
        i4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve:  enter newMultiTalkJoinRoom. %s, %s", str2, str);
        i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.d2(i4Var, str, str2));
        return true;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public synchronized void p2(com.tencent.mm.plugin.multitalk.model.x xVar) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.u3) yVar).p2(xVar);
        } else {
            ((java.util.ArrayList) this.f149908f).remove(xVar);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean q4(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            return yVar.q4(str);
        }
        p21.j y07 = com.tencent.mm.plugin.multitalk.model.e3.Ni().y0(str);
        if (y07 == null || (str2 = y07.field_wxGroupId) == null || !str2.equals(str)) {
            return false;
        }
        if (java.lang.System.currentTimeMillis() - y07.field_createTime <= 21600000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomListMsg", "wxGroupId:" + str + ",is out of time 6 hours..");
        J4(str);
        return false;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean s4(android.content.Context context) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar == null) {
            return iq.b.C(context);
        }
        ((com.tencent.mm.plugin.multitalk.model.u3) yVar).getClass();
        return iq.b.C(context);
    }

    public final void wi(java.lang.String str) {
        java.util.Iterator it = this.f149908f.iterator();
        while (it.hasNext()) {
            this.f149906d.post(new com.tencent.mm.plugin.multitalk.model.c2(this, (com.tencent.mm.plugin.multitalk.model.x) it.next(), str));
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean y8() {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        return yVar != null ? ((com.tencent.mm.plugin.multitalk.model.u3) yVar).y8() : com.tencent.mm.plugin.multitalk.model.e3.Ri().x();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean zc(java.lang.String str) {
        com.tencent.mm.plugin.multitalk.model.y yVar = this.f149907e;
        if (yVar != null) {
            com.tencent.mm.plugin.multitalk.model.u3 u3Var = (com.tencent.mm.plugin.multitalk.model.u3) yVar;
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            return u3Var.f150157d.containsKey(str);
        }
        if (this.f149909g == null) {
            Di();
        }
        java.util.HashSet hashSet = this.f149909g;
        return hashSet != null && hashSet.contains(str);
    }
}
