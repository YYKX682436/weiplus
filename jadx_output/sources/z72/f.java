package z72;

/* loaded from: classes12.dex */
public class f extends l75.s0 implements o72.k4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f470555d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f470556e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f470557f;

    public f(com.tencent.wcdb.core.Database database) {
        this.f470555d = database;
        d95.v vVar = d95.q.f227701a;
        this.f470556e = new d95.z(database, true);
        this.f470557f = database.getTable("FavItemInfo", up5.f.f429932b);
    }

    public static java.util.List m0(java.lang.Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        java.util.ArrayList arrayList = iterable instanceof java.util.Collection ? new java.util.ArrayList(((java.util.Collection) iterable).size()) : new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(n0((up5.t) it.next()));
        }
        return arrayList;
    }

    public static o72.r2 n0(up5.t tVar) {
        if (tVar == null) {
            return null;
        }
        o72.r2 r2Var = new o72.r2();
        r2Var.field_localId = tVar.f430059a;
        r2Var.field_id = tVar.f430060b;
        r2Var.field_type = tVar.f430061c;
        r2Var.field_localSeq = tVar.f430062d;
        r2Var.field_updateSeq = tVar.f430063e;
        r2Var.field_flag = tVar.f430064f;
        r2Var.field_sourceId = tVar.f430065g;
        r2Var.field_itemStatus = tVar.f430066h;
        r2Var.field_sourceType = tVar.f430067i;
        r2Var.field_sourceCreateTime = tVar.f430068j;
        r2Var.field_updateTime = tVar.f430069k;
        r2Var.field_fromUser = tVar.f430070l;
        r2Var.field_toUser = tVar.f430071m;
        r2Var.field_realChatName = tVar.f430072n;
        r2Var.field_favProto = (r45.bq0) tp5.a.e(tVar.f430073o, r45.bq0.class);
        r2Var.field_xml = tVar.f430074p;
        r2Var.field_ext = tVar.f430075q;
        r2Var.field_edittime = tVar.f430076r;
        r2Var.field_tagProto = (r45.rq0) tp5.a.e(tVar.f430077s, r45.rq0.class);
        r2Var.field_sessionId = tVar.f430078t;
        r2Var.field_datatotalsize = tVar.f430079u;
        r2Var.field_transferCtx = tVar.f430080v;
        r2Var.field_targetID = tVar.f430081w;
        r2Var.field_subType = tVar.f430082x;
        byte[] bArr = tVar.f430073o;
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo_ to FavItemInfo, favProto size:%s", java.lang.Integer.valueOf(bArr.length));
        }
        byte[] bArr2 = tVar.f430077s;
        if (bArr2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo_ to FavItemInfo, tagProto size:%s", java.lang.Integer.valueOf(bArr2.length));
        }
        java.lang.String str = tVar.f430074p;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo_ to FavItemInfo, xml size:%s", java.lang.Integer.valueOf(str.length()));
        }
        return r2Var;
    }

    public static up5.t s0(o72.r2 r2Var) {
        if (r2Var == null) {
            return null;
        }
        up5.t tVar = new up5.t();
        tVar.f430059a = r2Var.field_localId;
        tVar.f430060b = r2Var.field_id;
        tVar.f430061c = r2Var.field_type;
        tVar.f430062d = r2Var.field_localSeq;
        tVar.f430063e = r2Var.field_updateSeq;
        tVar.f430064f = r2Var.field_flag;
        tVar.f430065g = r2Var.field_sourceId;
        tVar.f430066h = r2Var.field_itemStatus;
        tVar.f430067i = r2Var.field_sourceType;
        tVar.f430068j = r2Var.field_sourceCreateTime;
        tVar.f430069k = r2Var.field_updateTime;
        tVar.f430070l = r2Var.field_fromUser;
        tVar.f430071m = r2Var.field_toUser;
        tVar.f430072n = r2Var.field_realChatName;
        tVar.f430073o = tp5.a.h(r2Var.field_favProto);
        tVar.f430074p = r2Var.field_xml;
        tVar.f430075q = r2Var.field_ext;
        tVar.f430076r = r2Var.field_edittime;
        tVar.f430077s = tp5.a.h(r2Var.field_tagProto);
        tVar.f430078t = r2Var.field_sessionId;
        tVar.f430079u = r2Var.field_datatotalsize;
        tVar.f430080v = r2Var.field_transferCtx;
        tVar.f430081w = r2Var.field_targetID;
        tVar.f430082x = r2Var.field_subType;
        byte[] bArr = tVar.f430073o;
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo to FavItemInfo_, favProto size:%s", java.lang.Integer.valueOf(bArr.length));
        }
        byte[] bArr2 = tVar.f430077s;
        if (bArr2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo to FavItemInfo_, tagProto size:%s", java.lang.Integer.valueOf(bArr2.length));
        }
        java.lang.String str = tVar.f430074p;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "convert FavItemInfo to FavItemInfo_, xml size:%s", java.lang.Integer.valueOf(str.length()));
        }
        return tVar;
    }

    @Override // o72.k4
    public java.util.List A0() {
        try {
            return m0(this.f470557f.getAllObjects(up5.f.f429938h.eq(-1).and(up5.f.f429940j.eq(0))));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public int Ah(int i17) {
        try {
            return this.f470557f.getValue(com.tencent.wcdb.winq.Column.all().count(), up5.f.f429934d.gt(i17)).getInt();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getFavHomePosition failed with exception: " + th6.getMessage());
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.k4
    public o72.r2 F(long j17) {
        try {
            return n0((up5.t) this.f470557f.getFirstObject(up5.f.f429933c.eq(j17)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public java.util.List I0(int i17) {
        com.tencent.wcdb.chaincall.Select where = this.f470557f.prepareSelect().select(up5.f.a()).where(up5.f.f429940j.eq(1));
        if (i17 > 0) {
            where.limit(i17);
        }
        try {
            return m0(where.allObjects());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public java.util.List Oc(int i17, int i18) {
        try {
            return m0(this.f470557f.getAllObjects(up5.f.f429940j.gt(0).and(up5.f.f429935e.in(8, 14, 18)), up5.f.f429943m.order(com.tencent.wcdb.winq.Order.Desc), i18, i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public void Re(dm.n3 n3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "deleteItem itemLocalId:%s itemFavId:%s", java.lang.Long.valueOf(n3Var.field_localId), java.lang.Integer.valueOf(n3Var.field_id));
        try {
            this.f470557f.deleteObjects(up5.f.f429933c.eq(n3Var.field_localId));
            doNotify(n3Var.field_localId + "", 5, java.lang.Long.valueOf(n3Var.field_localId));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
        }
    }

    @Override // o72.k4
    public java.util.List V1(int i17, int i18, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (i18 == 0) {
            return null;
        }
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getFirstPageList::block set contains target type, error, do return null");
            return null;
        }
        com.tencent.wcdb.winq.Expression gt6 = up5.f.f429940j.gt(0);
        if (i17 != -1) {
            gt6 = gt6.and(up5.f.f429935e.eq(i17));
        } else if (set != null) {
            gt6 = gt6.and(up5.f.f429935e.notIn(set));
        }
        try {
            java.util.List<T> allObjects = this.f470557f.getAllObjects(gt6, up5.f.f429943m.order(com.tencent.wcdb.winq.Order.Desc), i18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = allObjects.iterator();
            while (it.hasNext()) {
                o72.r2 n07 = n0((up5.t) it.next());
                if (i4Var == null || !((o72.b3) i4Var).c(n07, false, false)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "[getFirstPageList] id[%d] type[%d] match filter", java.lang.Integer.valueOf(n07.field_id), java.lang.Integer.valueOf(n07.field_type));
                    arrayList.add(n07);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "id[%d] type[%d] match filter", java.lang.Integer.valueOf(n07.field_id), java.lang.Integer.valueOf(n07.field_type));
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public java.util.List Wh(o72.j2 j2Var, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.wcdb.winq.Expression in6 = up5.f.f429940j.in(o72.a.f343303b);
        com.tencent.wcdb.orm.Field field = up5.f.f429953w;
        com.tencent.wcdb.winq.Expression and = in6.and(field.gt(0));
        com.tencent.wcdb.orm.Field field2 = up5.f.f429935e;
        com.tencent.wcdb.winq.Expression and2 = and.and(field2.in(o72.a.f343302a));
        if (j2Var != null) {
            java.util.List list = j2Var.f343370a;
            if (!list.isEmpty()) {
                and2 = and2.and(field2.in(list));
            }
        }
        try {
            com.tencent.wcdb.winq.OrderingTerm order = field.order(com.tencent.wcdb.winq.Order.Desc);
            if (i17 == 1) {
                order = up5.f.f429943m.order(com.tencent.wcdb.winq.Order.Asc);
            }
            java.util.List<java.lang.Long> oneColumnLong = this.f470557f.getOneColumnLong(up5.f.f429933c, and2, order);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = j2Var != null ? j2Var.f343370a.toString() : "null";
            objArr[1] = java.lang.Integer.valueOf(oneColumnLong.size());
            objArr[2] = java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "getCleanListByCondition types = %s, cu.getCount() = %d,used %dms", objArr);
            return oneColumnLong;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public long X(long j17, int i17, int i18) {
        com.tencent.wcdb.core.Database database = this.f470555d;
        if (database == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "getNextUpdateTime, but db is null, return");
            return 0L;
        }
        com.tencent.wcdb.winq.Expression gt6 = up5.f.f429940j.gt(0);
        if (j17 > 0) {
            gt6 = gt6.and(up5.f.f429943m.lt(j17));
        }
        if (i18 != -1) {
            gt6 = gt6.and(up5.f.f429935e.eq(i18));
        }
        com.tencent.wcdb.chaincall.Select<T> prepareSelect = this.f470557f.prepareSelect();
        com.tencent.wcdb.orm.Field field = up5.f.f429943m;
        try {
            tp5.c c17 = tp5.a.c(database, prepareSelect.select(field).where(gt6).orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(i17).getStatement(), null, null, new z72.f$$d());
            try {
                java.util.Iterator it = c17.iterator();
                long j18 = j17;
                while (true) {
                    tp5.e eVar = (tp5.e) it;
                    if (!eVar.hasNext()) {
                        c17.close();
                        return j18;
                    }
                    j18 = ((java.lang.Long) eVar.next()).longValue();
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return j17;
        }
    }

    @Override // o72.k4
    public boolean Xc() {
        return (re(0L) == null && re(-1L) == null) ? false : true;
    }

    @Override // o72.k4
    public java.lang.Long Y6() {
        try {
            return java.lang.Long.valueOf(this.f470557f.getValue(up5.f.f429933c.max()).getLong());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getMaxLocalId failed with exception: " + th6.getMessage());
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }

    @Override // o72.k4
    public long Z0(long j17, int i17, int i18) {
        if (this.f470555d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "getMinBatchGetUpdateTime, but db is null, return");
            return 0L;
        }
        if (j17 <= 0) {
            j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        com.tencent.wcdb.orm.Field field = up5.f.f429943m;
        com.tencent.wcdb.winq.Expression and = field.lt(j17).and(up5.f.f429937g.gt(up5.f.f429936f));
        if (i18 != -1) {
            and = and.and(up5.f.f429935e.eq(i18));
        }
        try {
            com.tencent.wcdb.base.Value value = this.f470557f.getValue(field, and, field.order(com.tencent.wcdb.winq.Order.Asc));
            if (value == null) {
                return 0L;
            }
            return value.getLong();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return 0L;
        }
    }

    @Override // o72.k4
    public boolean a3(long j17, int i17) {
        com.tencent.wcdb.orm.Field field = up5.f.f429943m;
        com.tencent.wcdb.winq.Expression lt6 = field.lt(j17);
        if (i17 != -1) {
            lt6 = lt6.and(up5.f.f429935e.eq(i17));
        }
        try {
            return this.f470557f.getValue(field.count(), lt6).getInt() == 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return true;
        }
    }

    @Override // o72.k4
    public boolean b6(o72.j4 j4Var) {
        boolean[] zArr = {false};
        try {
            this.f470555d.runTransaction(new z72.g(this, zArr, j4Var));
            return zArr[0];
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "runTransaction failed with exception: " + th6.getMessage() + "thread id:" + java.lang.Thread.currentThread().getId());
            return false;
        }
    }

    @Override // o72.k4
    /* renamed from: c4 */
    public boolean insert(o72.r2 r2Var) {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
            long j17 = r2Var.field_localId;
        }
        iz5.a.g(null, r2Var.field_localId > 0);
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            int i17 = jq0Var.f378034d;
            if (i17 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "insert::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(jq0Var.f378034d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i17);
            }
        }
        o72.x1.b(r2Var);
        try {
            this.f470557f.insertObject(s0(r2Var));
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Long.valueOf(r2Var.field_localId);
            objArr[1] = java.lang.Integer.valueOf(r2Var.field_id);
            objArr[2] = java.lang.Long.valueOf(r2Var.field_updateTime);
            r45.bq0 bq0Var = r2Var.field_favProto;
            objArr[3] = java.lang.Integer.valueOf(bq0Var != null ? bq0Var.f370964f.size() : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "insert favItem localId:%s, favId:%s, update time:%s, favDataCount:%d", objArr);
            doNotify(java.lang.Long.toString(r2Var.field_localId), 2, java.lang.Long.valueOf(r2Var.field_localId));
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return false;
        }
    }

    @Override // o72.k4
    public void d5(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "setStatus status:%d localId:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        try {
            this.f470557f.updateValue(i17, (com.tencent.wcdb.winq.Column) up5.f.f429940j, up5.f.f429933c.eq(j17));
            doNotify(j17 + "");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
        }
    }

    @Override // o72.k4
    public void di() {
        final java.util.List<T> allObjects;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "calDataBaseDataTotalLength");
        try {
            com.tencent.wcdb.orm.Field field = up5.f.f429940j;
            allObjects = this.f470557f.getAllObjects(new com.tencent.wcdb.orm.Field[]{up5.f.f429933c, field, up5.f.f429947q, up5.f.f429953w}, field.in(o72.a.f343303b).and(up5.f.f429935e.in(o72.a.f343302a)));
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "calDataBaseDataTotalLength cu.getCount() = " + allObjects.size());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
        }
        if (allObjects.isEmpty()) {
            return;
        }
        this.f470555d.runTransaction(new com.tencent.wcdb.core.Transaction() { // from class: z72.f$$c
            @Override // com.tencent.wcdb.core.Transaction
            public final boolean insideTransaction(com.tencent.wcdb.core.Handle handle) {
                com.tencent.wcdb.core.Table table = handle.getTable("FavItemInfo", up5.f.f429932b);
                java.util.Iterator it = allObjects.iterator();
                while (true) {
                    boolean z17 = true;
                    if (!it.hasNext()) {
                        return true;
                    }
                    up5.t tVar = (up5.t) it.next();
                    int i17 = tVar.f430066h;
                    int[] iArr = o72.a.f343303b;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= 3) {
                            z17 = false;
                            break;
                        }
                        if (iArr[i18] == i17) {
                            break;
                        }
                        i18++;
                    }
                    if (z17) {
                        r45.bq0 bq0Var = (r45.bq0) tp5.a.e(tVar.f430073o, r45.bq0.class);
                        long j17 = 0;
                        if (bq0Var != null) {
                            java.util.Iterator it6 = bq0Var.f370964f.iterator();
                            while (it6.hasNext()) {
                                j17 += ((r45.gp0) it6.next()).R;
                            }
                        }
                        table.updateValue(j17, (com.tencent.wcdb.winq.Column) up5.f.f429953w, up5.f.f429933c.eq(tVar.f430059a));
                    }
                }
            }
        });
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "calDataBaseDataTotalLength end");
    }

    @Override // o72.k4
    public int getCount() {
        try {
            return this.f470557f.getValue(com.tencent.wcdb.winq.Column.all().count()).getInt();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoNewStorage", th6, "Cannot get count", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // o72.k4
    public java.util.List j6() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.wcdb.winq.Expression in6 = up5.f.f429940j.in(o72.a.f343303b);
        com.tencent.wcdb.orm.Field field = up5.f.f429953w;
        try {
            java.util.List<java.lang.Long> oneColumnLong = this.f470557f.getOneColumnLong(up5.f.f429933c, in6.and(field.gt(0)).and(up5.f.f429935e.in(o72.a.f343302a)), field.order(com.tencent.wcdb.winq.Order.Desc));
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "getCleanList cu.getCount() = %d,used %dms", java.lang.Integer.valueOf(oneColumnLong.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return oneColumnLong;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public java.util.List ke() {
        try {
            com.tencent.wcdb.core.Table table = this.f470557f;
            com.tencent.wcdb.orm.Field field = up5.f.f429940j;
            return m0(table.getAllObjects(field.eq(9).or(field.eq(12))));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    /* renamed from: lf */
    public boolean update(final o72.r2 r2Var, java.lang.String... strArr) {
        r45.jq0 jq0Var;
        int i17;
        o72.d3 d3Var = o72.d3.f343321a;
        if (o72.d3.f343325e) {
            final o72.r2 F = F(r2Var.field_localId);
            if (F != null && F.field_updateSeq > r2Var.field_updateSeq) {
                java.lang.Object[] objArr = new java.lang.Object[6];
                objArr[0] = java.lang.Integer.valueOf(r2Var.field_id);
                objArr[1] = java.lang.Long.valueOf(r2Var.field_localId);
                objArr[2] = java.lang.Integer.valueOf(r2Var.field_type);
                objArr[3] = java.lang.Integer.valueOf(r2Var.field_updateSeq);
                objArr[4] = java.lang.Integer.valueOf(F.field_updateSeq);
                r45.bq0 bq0Var = r2Var.field_favProto;
                objArr[5] = java.lang.Integer.valueOf(bq0Var != null ? bq0Var.E : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "update: favId=%d favLocalId=%d type=%d, updateSeq=%d, oldUpdateSeq=%d, version=%d", objArr);
                com.tencent.mm.plugin.report.service.d1.f158158b.d("update_fav_item_db_seq_error", true, pm0.w.f356804e, null, true, false, new yz5.a() { // from class: z72.f$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.Object[] objArr2 = new java.lang.Object[7];
                        o72.r2 r2Var2 = o72.r2.this;
                        objArr2[0] = java.lang.Integer.valueOf(r2Var2.field_id);
                        objArr2[1] = java.lang.Long.valueOf(r2Var2.field_localId);
                        objArr2[2] = java.lang.Integer.valueOf(r2Var2.field_type);
                        objArr2[3] = java.lang.Integer.valueOf(r2Var2.field_updateSeq);
                        objArr2[4] = java.lang.Integer.valueOf(F.field_updateSeq);
                        r45.bq0 bq0Var2 = r2Var2.field_favProto;
                        objArr2[5] = java.lang.Integer.valueOf(bq0Var2 != null ? bq0Var2.E : -1);
                        objArr2[6] = java.lang.Boolean.TRUE;
                        return java.lang.String.format("favId=%d;favLocalId=%d;type=%d;updateSeq=%d;oldUpdateSeq=%d;version=%d;isNewDb=%b", objArr2);
                    }
                });
                return false;
            }
            if (F != null && (i17 = F.field_id) > 0 && i17 != r2Var.field_id) {
                java.lang.Object[] objArr2 = new java.lang.Object[7];
                objArr2[0] = java.lang.Integer.valueOf(i17);
                objArr2[1] = java.lang.Integer.valueOf(r2Var.field_id);
                objArr2[2] = java.lang.Long.valueOf(r2Var.field_localId);
                objArr2[3] = java.lang.Integer.valueOf(r2Var.field_type);
                objArr2[4] = java.lang.Integer.valueOf(r2Var.field_updateSeq);
                objArr2[5] = java.lang.Integer.valueOf(F.field_updateSeq);
                r45.bq0 bq0Var2 = r2Var.field_favProto;
                objArr2[6] = java.lang.Integer.valueOf(bq0Var2 != null ? bq0Var2.E : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "update: error fav id, oldFavId=%d, newFavId=%d favLocalId=%d type=%d, updateSeq=%d, oldUpdateSeq=%d, version=%d", objArr2);
                r2Var.field_id = F.field_id;
                com.tencent.mm.plugin.report.service.d1.f158158b.d("update_fav_item_db_error_fav_id", true, pm0.w.f356804e, null, true, false, new yz5.a() { // from class: z72.f$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.Object[] objArr3 = new java.lang.Object[6];
                        o72.r2 r2Var2 = o72.r2.this;
                        objArr3[0] = java.lang.Integer.valueOf(r2Var2.field_id);
                        objArr3[1] = java.lang.Integer.valueOf(F.field_id);
                        objArr3[2] = java.lang.Long.valueOf(r2Var2.field_localId);
                        objArr3[3] = java.lang.Integer.valueOf(r2Var2.field_type);
                        r45.bq0 bq0Var3 = r2Var2.field_favProto;
                        objArr3[4] = java.lang.Integer.valueOf(bq0Var3 != null ? bq0Var3.E : -1);
                        objArr3[5] = java.lang.Boolean.TRUE;
                        return java.lang.String.format("newFavId=%d;oldFavId=%d;favLocalId=%d;type=%d;version=%d;isNewDb=%b", objArr3);
                    }
                });
            }
        }
        r45.bq0 bq0Var3 = r2Var.field_favProto;
        if (bq0Var3 != null && (jq0Var = bq0Var3.f370962d) != null) {
            int i18 = jq0Var.f378034d;
            if (i18 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(jq0Var.f378034d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i18);
            }
        }
        if (r2Var.field_favProto == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "FavProtoItem null, info localid:" + r2Var.field_localId + ", type:" + r2Var.field_type);
            jx3.f.INSTANCE.d(22021, 20251031, java.lang.Integer.valueOf(r2Var.field_type), "FavProtoItem null");
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Fav.FavItemInfoNewStorage", "FavProtoItem null", new java.lang.Object[0]);
        }
        try {
            o72.x1.b(r2Var);
            tp5.a.i(s0(r2Var), this.f470557f, strArr);
            doNotify(java.lang.Long.toString(r2Var.field_localId), 3, java.lang.Long.valueOf(r2Var.field_localId));
            com.tencent.mm.sdk.platformtools.z3.b(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "update favItem localId:%s favId:%s update time:%s xml:%s ret:%s", java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_updateTime), r2Var.field_xml, java.lang.Boolean.TRUE);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "update favItem failed: " + th6.getMessage());
            return false;
        }
    }

    @Override // o72.k4
    public boolean ma(long j17, int i17, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "hasShowAllValidItem::block set contains target type, error, do return true");
            return true;
        }
        com.tencent.wcdb.orm.Field field = up5.f.f429943m;
        com.tencent.wcdb.winq.Expression lt6 = field.lt(j17);
        if (i17 != -1) {
            lt6 = lt6.and(up5.f.f429935e.eq(i17));
        } else if (set != null) {
            lt6 = lt6.and(up5.f.f429935e.notIn(set));
        }
        try {
            return this.f470557f.getValue(field.count(), lt6.and(up5.f.f429940j.gt(0))).getInt() == 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return true;
        }
    }

    @Override // o72.k4
    public java.util.List o4() {
        try {
            return m0(this.f470557f.getAllObjects(up5.f.f429940j.in(3, 6, 11, 14, 16, 18)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return new java.util.ArrayList();
        }
    }

    @Override // o72.k4
    public java.util.List qh() {
        try {
            return m0(this.f470557f.getAllObjects(up5.f.f429940j.eq(17)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.k4
    public o72.r2 rc(java.lang.String str) {
        try {
            return n0((up5.t) this.f470557f.getFirstObject(up5.f.f429939i.eq(str)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.k4
    public o72.r2 re(long j17) {
        try {
            return n0((up5.t) this.f470557f.getFirstObject(up5.f.f429934d.eq(j17)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public l75.k0 u2() {
        return this.f470556e;
    }

    @Override // o72.k4
    public java.util.List v0() {
        try {
            return this.f470557f.getOneColumnLong(up5.f.f429933c, up5.f.f429943m.order(com.tencent.wcdb.winq.Order.Desc));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.k4
    public java.util.LinkedList vh(long j17, int i17) {
        com.tencent.wcdb.orm.Field field = up5.f.f429943m;
        com.tencent.wcdb.winq.Expression gt6 = field.gt(j17);
        if (i17 != -1) {
            gt6 = gt6.and(up5.f.f429935e.eq(i17));
        }
        try {
            return new java.util.LinkedList(this.f470557f.getOneColumnInt(up5.f.f429934d, gt6.and(up5.f.f429937g.gt(up5.f.f429936f)), field.order(com.tencent.wcdb.winq.Order.Desc)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th6.getMessage());
            return null;
        }
    }

    @Override // o72.k4
    public java.util.ArrayList wa(java.util.List list, java.util.List list2, java.util.Set set, o72.i4 i4Var, boolean z17) {
        com.tencent.wcdb.winq.OrderingTerm order;
        if (list == null || list.size() == 0 || list.size() > 20) {
            return null;
        }
        com.tencent.wcdb.orm.Field field = up5.f.f429933c;
        com.tencent.wcdb.winq.Expression in6 = field.in(list);
        if (set != null && set.size() > 0) {
            in6 = in6.and(up5.f.f429935e.notIn(set));
        }
        if (z17) {
            com.tencent.wcdb.winq.Expression case_ = com.tencent.wcdb.winq.Expression.case_(field);
            for (int i17 = 0; i17 < list.size(); i17++) {
                case_.when(((java.lang.Long) list.get(i17)).longValue()).then(i17);
            }
            order = new com.tencent.wcdb.winq.OrderingTerm(case_);
        } else {
            order = up5.f.f429943m.order(com.tencent.wcdb.winq.Order.Desc);
        }
        com.tencent.wcdb.chaincall.Select orderBy = this.f470557f.prepareSelect().select(up5.f.a()).where(in6).orderBy(order);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "[getListByIdList] id cnt: " + list.size() + "stmt = " + orderBy.getStatement().getDescription());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            tp5.c c17 = tp5.a.c(this.f470555d, orderBy.getStatement(), null, null, tp5.a.f421155a);
            try {
                java.util.Iterator it = c17.iterator();
                while (true) {
                    tp5.e eVar = (tp5.e) it;
                    if (!eVar.hasNext()) {
                        c17.close();
                        return arrayList;
                    }
                    try {
                        o72.r2 n07 = n0(up5.f.f429932b.extractObject(up5.f.a(), (com.tencent.wcdb.core.PreparedStatement) eVar.next(), up5.t.class));
                        if (i4Var == null || !((o72.b3) i4Var).c(n07, false, false)) {
                            arrayList.add(n07);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "id[%d] type[%d] match filter", java.lang.Integer.valueOf(n07.field_id), java.lang.Integer.valueOf(n07.field_type));
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Cannot get FavItemInfo: " + th6.getMessage());
                        c17.close();
                        return arrayList;
                    }
                }
            } finally {
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th7.getMessage());
            return arrayList;
        }
    }

    @Override // o72.k4
    public boolean xb(o72.r2 r2Var, java.lang.String... strArr) {
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            int i17 = jq0Var.f378034d;
            if (i17 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(jq0Var.f378034d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i17);
            }
        }
        try {
            tp5.a.i(s0(r2Var), this.f470557f, strArr);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WCDBHelper", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.k4
    public java.util.List z4(long j17, int i17, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoNewStorage", "getList::block set contains target type, error, do return null");
            return null;
        }
        com.tencent.wcdb.orm.Field field = up5.f.f429943m;
        com.tencent.wcdb.winq.Expression ge6 = field.ge(j17);
        if (i17 != -1) {
            ge6 = ge6.and(up5.f.f429935e.eq(i17));
        } else if (set != null && !set.isEmpty()) {
            ge6 = ge6.and(up5.f.f429935e.notIn(set));
        }
        com.tencent.wcdb.chaincall.Select orderBy = this.f470557f.prepareSelect().select(up5.f.a()).where(ge6.and(up5.f.f429940j.gt(0))).orderBy(field.order(com.tencent.wcdb.winq.Order.Desc));
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "[getList] updateTime = " + j17 + ", stmt = " + orderBy.getStatement().getDescription());
        try {
            tp5.c c17 = tp5.a.c(this.f470555d, orderBy.getStatement(), null, null, tp5.a.f421155a);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = c17.iterator();
                while (true) {
                    tp5.e eVar = (tp5.e) it;
                    if (!eVar.hasNext()) {
                        break;
                    }
                    try {
                        o72.r2 n07 = n0(up5.f.f429932b.extractObject(up5.f.a(), (com.tencent.wcdb.core.PreparedStatement) eVar.next(), up5.t.class));
                        if (i4Var == null || !((o72.b3) i4Var).c(n07, false, false)) {
                            arrayList.add(n07);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Cannot get FavItemInfo: " + th6.getMessage());
                    }
                }
                c17.close();
                return arrayList;
            } finally {
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoNewStorage", "Operation failed: " + th7.getMessage());
            return java.util.Collections.emptyList();
        }
    }
}
