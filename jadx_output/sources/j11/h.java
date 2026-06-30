package j11;

/* loaded from: classes11.dex */
public final class h implements c01.p8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f297112a = false;

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f297113b = new jt0.j(200);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f297114c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f297115d = new java.util.ArrayList(512);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f297116e = new java.util.ArrayList(512);

    /* renamed from: f, reason: collision with root package name */
    public long f297117f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297118g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f297119h = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), new com.tencent.mm.sdk.platformtools.a4() { // from class: j11.h$$b
        @Override // com.tencent.mm.sdk.platformtools.a4
        public final boolean onTimerExpired() {
            java.util.LinkedList linkedList;
            j11.h hVar = j11.h.this;
            synchronized (hVar) {
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                if (w11.a1.b()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "tryStartNetscene need init , never get contact");
                } else {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    boolean z18 = true;
                    if (hVar.f297112a) {
                        long j17 = currentTimeMillis - hVar.f297118g;
                        if (j17 > 600000) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "tryStartNetscene Not Callback too long:%d . Force Run Now", java.lang.Long.valueOf(j17));
                            hVar.f297112a = false;
                        }
                    }
                    if (hVar.f297112a) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "tryStartNetscene netSceneRunning: " + hVar.f297112a + " ret");
                    } else {
                        r45.nd3 nd3Var = (r45.nd3) j11.h.n(hVar.f297115d);
                        if (nd3Var == null) {
                            hVar.m();
                            nd3Var = (r45.nd3) j11.h.n(hVar.f297115d);
                        }
                        while (true) {
                            if (nd3Var != null) {
                                java.util.LinkedList linkedList2 = nd3Var.f381263e;
                                if (linkedList2 != null && linkedList2.size() != 0) {
                                    break;
                                }
                            }
                            if (((java.util.ArrayList) hVar.f297115d).size() <= 0) {
                                break;
                            }
                            nd3Var = (r45.nd3) j11.h.n(hVar.f297115d);
                        }
                        if (nd3Var != null && (linkedList = nd3Var.f381263e) != null && linkedList.size() != 0) {
                            hVar.f297118g = currentTimeMillis;
                            hVar.f297112a = true;
                            java.util.LinkedList linkedList3 = new java.util.LinkedList();
                            java.util.LinkedList linkedList4 = new java.util.LinkedList();
                            java.util.Iterator it = nd3Var.f381263e.iterator();
                            while (it.hasNext()) {
                                java.lang.String g17 = x51.j1.g((r45.du5) it.next());
                                if (com.tencent.mm.storage.z3.q4(g17)) {
                                    linkedList3.add(g17);
                                }
                                if (com.tencent.mm.storage.z3.m4(g17)) {
                                    linkedList4.add(g17);
                                }
                            }
                            if (linkedList3.size() > 0) {
                                java.lang.String str = (java.lang.String) linkedList3.get(0);
                                if (com.tencent.mm.storage.z3.q4(str)) {
                                    com.tencent.mm.roomsdk.model.factory.a m17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).m(str);
                                    m17.f192248d = new j11.k(hVar, str);
                                    m17.b();
                                }
                            } else if (linkedList4.size() > 0) {
                                java.lang.String str2 = (java.lang.String) linkedList4.get(0);
                                r45.bk3 bk3Var = new r45.bk3();
                                bk3Var.f370819d = str2;
                                java.lang.String str3 = "";
                                java.util.LinkedList linkedList5 = nd3Var.f381267i;
                                if (linkedList5 != null && linkedList5.size() > 0) {
                                    str3 = x51.j1.g((r45.du5) nd3Var.f381267i.get(0));
                                }
                                bk3Var.f370820e = str3;
                                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                                lVar.f70664a = bk3Var;
                                lVar.f70665b = new r45.ck3();
                                lVar.f70666c = "/cgi-bin/micromsg-bin/getopenimcontact";
                                lVar.f70667d = 881;
                                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "request roomName %s userOpenImname %s", str3, str2);
                                com.tencent.mm.modelbase.z2.d(lVar.a(), new j11.l(hVar, str2), true);
                            } else {
                                com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
                                lVar2.f70664a = nd3Var;
                                lVar2.f70665b = new r45.od3();
                                lVar2.f70666c = "/cgi-bin/micromsg-bin/getcontact";
                                lVar2.f70667d = 182;
                                com.tencent.mm.modelbase.z2.d(lVar2.a(), new j11.m(hVar, nd3Var.f381268m, nd3Var), true);
                            }
                        }
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        if (nd3Var != null) {
                            z18 = false;
                        }
                        objArr[0] = java.lang.Boolean.valueOf(z18);
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetContactService", "tryStartNetscene Not any more contact. req is null? %s", objArr);
                    }
                }
            }
            return false;
        }
    }, false);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f297120i = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new j11.o(this), true);

    public static java.lang.Object n(java.util.List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "dkverify add Contact :" + str + " chatroom: " + str2 + " scene:" + i17);
        if (k(str, str2, i17)) {
            this.f297119h.c(500L, 500L);
        }
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dkverify getNow :");
        sb6.append(str);
        sb6.append(" scene: ");
        sb6.append(i17);
        sb6.append(" stack:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", sb6.toString());
        if (j(str, i17, null)) {
            i(str, o8Var);
            this.f297119h.c(0L, 0L);
        }
    }

    @Override // c01.p8
    public void d() {
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "[checkPendingGetContact] %s", java.lang.Boolean.valueOf(w11.a1.b()));
        this.f297119h.c(500L, 500L);
        if (gm0.j1.u().c().q(92, 0) != 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).k(new j11.h$$a(), 1000L);
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
        gm0.j1.e().j(new j11.i(this, str));
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
        synchronized (this) {
            ((java.util.HashMap) this.f297114c).remove(str);
        }
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "dkverify getNow :" + str + " chatroom: " + str2 + " scene: " + i17);
        if (k(str, str2, i17)) {
            i(str, o8Var);
            this.f297119h.c(0L, 0L);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
        if (j(str, i17, str2)) {
            this.f297119h.c(500L, 500L);
        }
    }

    public final void i(java.lang.String str, c01.o8 o8Var) {
        if (o8Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "addGetContactCallBack %s, addGetContactCallBack is null", objArr);
            return;
        }
        synchronized (this) {
            java.util.LinkedList linkedList = (java.util.LinkedList) ((java.util.HashMap) this.f297114c).get(str);
            if (linkedList == null) {
                java.util.Map map = this.f297114c;
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                ((java.util.HashMap) map).put(str, linkedList2);
                linkedList = linkedList2;
            }
            if (linkedList.contains(o8Var)) {
                return;
            }
            linkedList.add(o8Var);
        }
    }

    public final boolean j(java.lang.String str, int i17, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        java.lang.String c17 = c01.z1.c();
        if (!str.equals(r17) && !str.equals(c17)) {
            j11.f fVar = new j11.f();
            fVar.f297101a = str;
            if (str2 == null) {
                str2 = "";
            }
            fVar.f297108h = str2;
            fVar.f297106f = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(i17));
            fVar.f297102b = java.lang.System.currentTimeMillis();
            return j11.q.Ai().n0(fVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "addToStg username: " + str + " equal to user: " + r17 + " alias: " + c17 + " ret");
        return false;
    }

    public final boolean k(java.lang.String str, java.lang.String str2, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        java.lang.String c17 = c01.z1.c();
        if (!str.equals(r17) && !str.equals(c17)) {
            j11.f fVar = new j11.f();
            fVar.f297101a = str;
            fVar.f297106f = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(i17));
            if (str2 == null) {
                str2 = "";
            }
            fVar.f297107g = str2;
            fVar.f297102b = java.lang.System.currentTimeMillis();
            return j11.q.Ai().n0(fVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "addToStg username: " + str + " equal to user: " + r17 + " alias: " + c17 + " ret");
        return false;
    }

    public final void l(java.lang.String str, boolean z17) {
        com.tencent.mm.sdk.platformtools.u3.h(new j11.j(this, str, z17));
    }

    public final void m() {
        int i17;
        java.util.List list;
        java.util.List list2;
        j11.g Ai = j11.q.Ai();
        long j17 = this.f297117f;
        Ai.getClass();
        android.database.Cursor B = Ai.f297111d.B("select getcontactinfov2.username,getcontactinfov2.inserttime,getcontactinfov2.type,getcontactinfov2.lastgettime,getcontactinfov2.reserved1,getcontactinfov2.reserved2,getcontactinfov2.reserved3,getcontactinfov2.reserved4 from getcontactinfov2 where inserttime> ?  order by inserttime asc limit ?", new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(80)});
        if (B == null) {
            return;
        }
        int count = B.getCount();
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb count:%d", java.lang.Integer.valueOf(count));
        if (count <= 0) {
            B.close();
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        while (true) {
            boolean moveToNext = B.moveToNext();
            i17 = 2;
            list = this.f297115d;
            if (!moveToNext) {
                break;
            }
            java.lang.String string = B.getString(0);
            long j18 = B.getLong(1);
            B.getInt(2);
            B.getInt(3);
            B.getInt(4);
            int i18 = B.getInt(5);
            java.lang.String string2 = B.getString(6);
            java.lang.String string3 = B.getString(7);
            if (string == null) {
                string = "";
            }
            android.database.Cursor cursor = B;
            com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb usr = " + string);
            if (string2 == null) {
                string2 = "";
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            int q17 = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(i18));
            if (string3 == null) {
                string3 = "";
            }
            this.f297117f = j18;
            java.lang.String str = string + "#" + string2;
            kk.j jVar = this.f297113b;
            int j19 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) ((lt0.f) jVar).i(str), 0);
            if (j19 < 3) {
                ((lt0.f) jVar).j(str, java.lang.Integer.valueOf(j19 + 1));
                if (com.tencent.mm.storage.z3.q4(string)) {
                    r45.nd3 nd3Var = new r45.nd3();
                    r45.du5 du5Var = new r45.du5();
                    du5Var.f372756d = string;
                    du5Var.f372757e = true;
                    linkedList.add(du5Var);
                    r45.du5 du5Var2 = new r45.du5();
                    du5Var2.f372756d = string2;
                    du5Var2.f372757e = true;
                    linkedList2.add(du5Var2);
                    nd3Var.f381263e = linkedList;
                    nd3Var.f381267i = linkedList2;
                    ((java.util.ArrayList) list).add(nd3Var);
                    linkedList = new java.util.LinkedList();
                    linkedList2 = new java.util.LinkedList();
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb this is openRoom now reqlist size:%d , this req usr count:%d usr %s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(nd3Var.f381263e.size()), string);
                } else if (com.tencent.mm.storage.z3.m4(string)) {
                    r45.nd3 nd3Var2 = new r45.nd3();
                    r45.du5 du5Var3 = new r45.du5();
                    du5Var3.f372756d = string;
                    du5Var3.f372757e = true;
                    linkedList.add(du5Var3);
                    r45.du5 du5Var4 = new r45.du5();
                    du5Var4.f372756d = string2;
                    du5Var4.f372757e = true;
                    linkedList2.add(du5Var4);
                    nd3Var2.f381263e = linkedList;
                    nd3Var2.f381267i = linkedList2;
                    ((java.util.ArrayList) list).add(nd3Var2);
                    linkedList = new java.util.LinkedList();
                    linkedList2 = new java.util.LinkedList();
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb this is isOpenIM now reqlist size:%d , this req usr count:%d usr %s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(nd3Var2.f381263e.size()), string);
                } else if (q17 == 1) {
                    r45.du5 du5Var5 = new r45.du5();
                    du5Var5.f372756d = string;
                    du5Var5.f372757e = true;
                    r45.du5 du5Var6 = new r45.du5();
                    du5Var6.f372756d = string3;
                    du5Var6.f372757e = true;
                    linkedList3.add(new android.util.Pair(du5Var5, du5Var6));
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb add user:%s scene:%s ticket:%s", string, java.lang.Integer.valueOf(q17), string3);
                } else if (q17 != 0) {
                    if (sparseArray.indexOfKey(q17) < 0) {
                        list2 = new java.util.LinkedList();
                        sparseArray.put(q17, list2);
                    } else {
                        list2 = (java.util.List) sparseArray.get(q17);
                    }
                    list2.add(new j11.a(string, string2));
                } else {
                    r45.du5 du5Var7 = new r45.du5();
                    du5Var7.f372756d = string;
                    du5Var7.f372757e = true;
                    linkedList.add(du5Var7);
                    r45.du5 du5Var8 = new r45.du5();
                    du5Var8.f372756d = string2;
                    du5Var8.f372757e = true;
                    linkedList2.add(du5Var8);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb add user:%s getScene:%s room:%s", string, java.lang.Integer.valueOf(q17), string2);
                }
            } else {
                linkedList4.add(string);
                l(string, false);
            }
            if (linkedList.size() >= 20 || cursor.isLast()) {
                r45.nd3 nd3Var3 = new r45.nd3();
                nd3Var3.f381263e = linkedList;
                nd3Var3.f381262d = linkedList.size();
                nd3Var3.f381267i = linkedList2;
                nd3Var3.f381266h = linkedList2.size();
                ((java.util.ArrayList) list).add(nd3Var3);
                linkedList = new java.util.LinkedList();
                linkedList2 = new java.util.LinkedList();
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getFromDb now reqlist size:%d , this req usr count:%d getScene=%s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(nd3Var3.f381263e.size()), java.lang.Integer.valueOf(q17));
            }
            B = cursor;
        }
        B.close();
        int i19 = 0;
        while (i19 < sparseArray.size()) {
            r45.nd3 nd3Var4 = new r45.nd3();
            int keyAt = sparseArray.keyAt(i19);
            java.util.List<j11.a> list3 = (java.util.List) sparseArray.valueAt(i19);
            java.util.ArrayList arrayList = new java.util.ArrayList(list3.size() + i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list3.size() + i17);
            for (j11.a aVar : list3) {
                r45.du5 du5Var9 = new r45.du5();
                du5Var9.f372756d = aVar.f297096a;
                du5Var9.f372757e = true;
                arrayList.add(du5Var9);
                r45.du5 du5Var10 = new r45.du5();
                du5Var10.f372756d = aVar.f297097b;
                du5Var10.f372757e = true;
                arrayList2.add(du5Var10);
            }
            nd3Var4.f381263e.addAll(arrayList);
            nd3Var4.f381262d = nd3Var4.f381263e.size();
            nd3Var4.f381268m = keyAt;
            nd3Var4.f381267i.addAll(arrayList2);
            nd3Var4.f381266h = nd3Var4.f381267i.size();
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            arrayList3.add(nd3Var4);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "[buildSceneReqList] scene=%s count=%s req size=%s", java.lang.Integer.valueOf(nd3Var4.f381268m), java.lang.Integer.valueOf(nd3Var4.f381262d), java.lang.Integer.valueOf(arrayList3.size()));
            i19++;
            i17 = 2;
        }
        sparseArray.clear();
        java.util.Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            r45.nd3 nd3Var5 = new r45.nd3();
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            linkedList5.add(pair.first);
            nd3Var5.f381263e = linkedList5;
            nd3Var5.f381262d = linkedList5.size();
            nd3Var5.f381268m = 1;
            nd3Var5.f381269n = (r45.du5) pair.second;
            ((java.util.ArrayList) list).add(nd3Var5);
        }
        linkedList3.clear();
        for (int i27 = 0; i27 < linkedList4.size(); i27++) {
            java.lang.String str2 = (java.lang.String) linkedList4.get(i27);
            boolean R4 = com.tencent.mm.storage.z3.R4(str2);
            com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "getFromDb try getContact Too much room usr:%s; remove from table:%s ", str2, java.lang.Boolean.valueOf(R4));
            if (R4) {
                j11.q.Ai().m0(str2);
            }
            boolean endsWith = (str2 == null || str2.length() <= 0) ? false : str2.endsWith("@qy_u");
            com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "getFromDb try getContact Too much biz usr:%s; remove from table:%s ", str2, java.lang.Boolean.valueOf(R4));
            if (endsWith) {
                j11.q.Ai().m0(str2);
                jx3.f.INSTANCE.idkeyStat(832L, 3L, 1L, false);
            }
        }
    }
}
