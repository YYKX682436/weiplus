package z72;

/* loaded from: classes12.dex */
public class a extends l75.s0 implements o72.y3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f470547d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f470548e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f470549f = new java.util.concurrent.CopyOnWriteArrayList();

    public a(com.tencent.wcdb.core.Database database) {
        this.f470547d = database;
        this.f470548e = database.getTable("FavCdnInfo", up5.b.f429892b);
    }

    public static java.util.List m0(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(n0((up5.p) it.next()));
        }
        return arrayList;
    }

    public static o72.e2 n0(up5.p pVar) {
        if (pVar == null) {
            return null;
        }
        o72.e2 e2Var = new o72.e2();
        e2Var.field_dataId = pVar.f430029a;
        e2Var.field_favLocalId = pVar.f430030b;
        e2Var.field_type = pVar.f430031c;
        e2Var.field_cdnUrl = pVar.f430032d;
        e2Var.field_cdnKey = pVar.f430033e;
        e2Var.field_totalLen = pVar.f430034f;
        e2Var.field_offset = pVar.f430035g;
        e2Var.field_status = pVar.f430036h;
        e2Var.field_path = pVar.f430037i;
        e2Var.field_dataType = pVar.f430038j;
        e2Var.field_modifyTime = pVar.f430039k;
        e2Var.field_extFlag = pVar.f430040l;
        e2Var.field_attrFlag = pVar.f430041m;
        e2Var.field_retryTime = pVar.f430042n;
        return e2Var;
    }

    public static up5.p s0(o72.e2 e2Var) {
        if (e2Var == null) {
            return null;
        }
        up5.p pVar = new up5.p();
        pVar.f430029a = e2Var.field_dataId;
        pVar.f430030b = e2Var.field_favLocalId;
        pVar.f430031c = e2Var.field_type;
        pVar.f430032d = e2Var.field_cdnUrl;
        pVar.f430033e = e2Var.field_cdnKey;
        pVar.f430034f = e2Var.field_totalLen;
        pVar.f430035g = e2Var.field_offset;
        pVar.f430036h = e2Var.field_status;
        pVar.f430037i = e2Var.field_path;
        pVar.f430038j = e2Var.field_dataType;
        pVar.f430039k = e2Var.field_modifyTime;
        pVar.f430040l = e2Var.field_extFlag;
        pVar.f430041m = e2Var.field_attrFlag;
        pVar.f430042n = e2Var.field_retryTime;
        return pVar;
    }

    @Override // o72.y3
    /* renamed from: A5 */
    public boolean update(o72.e2 e2Var, java.lang.String... strArr) {
        try {
            tp5.a.i(s0(e2Var), this.f470548e, strArr);
            doNotify(e2Var.field_dataId, 3, e2Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f470549f).iterator();
            while (it.hasNext()) {
                o72.x3 x3Var = (o72.x3) it.next();
                if (x3Var != null) {
                    x3Var.R4(e2Var);
                }
            }
            java.util.Iterator it6 = ((fs.c) fs.g.f(o72.g5.class)).all().iterator();
            while (it6.hasNext()) {
                ((bz4.n0) ((o72.g5) ((fs.q) it6.next()).get())).c(e2Var);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.y3
    public void Ia(o72.x3 x3Var) {
        if (x3Var != null) {
            java.util.List list = this.f470549f;
            if (((java.util.concurrent.CopyOnWriteArrayList) list).contains(x3Var)) {
                return;
            }
            ((java.util.concurrent.CopyOnWriteArrayList) list).add(x3Var);
        }
    }

    @Override // o72.y3
    public void Ke(o72.r2 r2Var) {
        up5.p pVar = new up5.p();
        pVar.f430036h = 1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        pVar.f430039k = java.lang.System.currentTimeMillis();
        try {
            com.tencent.wcdb.core.Table table = this.f470548e;
            com.tencent.wcdb.orm.Field field = up5.b.f429900j;
            table.updateObject((com.tencent.wcdb.core.Table) pVar, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.Table>[]) new com.tencent.wcdb.orm.Field[]{field, up5.b.f429903m}, up5.b.f429894d.eq(r2Var.field_localId).and(up5.b.f429895e.eq(0)).and(field.notEq(3)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
        }
    }

    @Override // o72.y3
    public int Nd(long j17, int i17) {
        try {
            java.util.List<java.lang.Integer> oneColumnInt = this.f470548e.getOneColumnInt(up5.b.f429900j, up5.b.f429894d.eq(j17).and(up5.b.f429895e.eq(i17)));
            if (oneColumnInt.isEmpty()) {
                return 3;
            }
            java.util.Iterator<java.lang.Integer> it = oneColumnInt.iterator();
            boolean z17 = true;
            boolean z18 = true;
            boolean z19 = true;
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue == 1) {
                    return 1;
                }
                if (intValue != 4) {
                    z18 = false;
                }
                if (intValue != 2) {
                    z17 = false;
                }
                if (intValue != 3) {
                    z19 = false;
                }
            }
            if (z17) {
                return 2;
            }
            if (z18) {
                return 4;
            }
            return z19 ? 3 : 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return 3;
        }
    }

    @Override // o72.y3
    /* renamed from: R0 */
    public boolean delete(o72.e2 e2Var, java.lang.String... strArr) {
        try {
            tp5.a.b(s0(e2Var), this.f470548e, strArr);
            doNotify(e2Var.field_dataId, 5, e2Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f470549f).iterator();
            while (it.hasNext()) {
                o72.x3 x3Var = (o72.x3) it.next();
                if (x3Var != null) {
                    x3Var.R4(e2Var);
                }
            }
            java.util.Iterator it6 = ((fs.c) fs.g.f(o72.g5.class)).all().iterator();
            while (it6.hasNext()) {
                ((bz4.n0) ((o72.g5) ((fs.q) it6.next()).get())).c(e2Var);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.y3
    public o72.e2 Xf(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "md5 null");
            return null;
        }
        try {
            return n0((up5.p) this.f470548e.getFirstObject(up5.b.f429893c.eq(str)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return null;
        }
    }

    @Override // o72.y3
    public void Y(o72.x3 x3Var) {
        if (x3Var != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f470549f).remove(x3Var);
        }
    }

    @Override // o72.y3
    public java.util.List d3(long j17) {
        try {
            return m0(this.f470548e.getAllObjects(up5.b.f429894d.eq(j17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.y3
    public void fb(long j17) {
        try {
            this.f470548e.deleteObjects(up5.b.f429894d.eq(j17).and(up5.b.f429895e.eq(0)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
        }
    }

    @Override // o72.y3
    public boolean fg(long j17) {
        try {
            this.f470548e.deleteObjects(up5.b.f429894d.eq(j17));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.y3
    public java.util.List ng(long j17) {
        try {
            return m0(this.f470548e.getAllObjects(up5.b.f429894d.eq(j17).and(up5.b.f429895e.eq(0)).and(up5.b.f429900j.eq(3))));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.y3
    /* renamed from: rg */
    public boolean insert(o72.e2 e2Var) {
        if (e2Var == null) {
            return false;
        }
        try {
            this.f470548e.insertObject(s0(e2Var));
            doNotify(e2Var.field_dataId, 2, e2Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f470549f).iterator();
            while (it.hasNext()) {
                o72.x3 x3Var = (o72.x3) it.next();
                if (x3Var != null) {
                    x3Var.R4(e2Var);
                }
            }
            java.util.Iterator it6 = ((fs.c) fs.g.f(o72.g5.class)).all().iterator();
            while (it6.hasNext()) {
                ((bz4.n0) ((o72.g5) ((fs.q) it6.next()).get())).c(e2Var);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }
}
