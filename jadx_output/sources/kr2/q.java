package kr2;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: h, reason: collision with root package name */
    public static final kr2.m f311317h = new kr2.m(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f311318i = jz5.h.b(kr2.l.f311313d);

    /* renamed from: b, reason: collision with root package name */
    public boolean f311320b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f311319a = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f311321c = kz5.c0.i(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f311322d = kz5.c0.i(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f311323e = kz5.c0.i(1, 2);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f311324f = kz5.b0.c(1);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f311325g = jz5.h.b(new kr2.p(this));

    public static final int a(kr2.q qVar, java.util.List list) {
        qVar.getClass();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 |= ((java.lang.Number) it.next()).intValue();
        }
        return i17;
    }

    public final void b() {
        java.util.List list = this.f311319a;
        try {
            if (this.f311320b) {
                return;
            }
            list.clear();
            java.util.Iterator it = e().iterator();
            while (it.hasNext()) {
                kr2.w d17 = d((kr2.x) it.next());
                r45.al2 al2Var = d17.f311333a;
                if ((c01.id.c() / 1000) - al2Var.getLong(4) > 2592000) {
                    f(al2Var.getLong(0));
                } else {
                    list.add(d17);
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.NpsSurveyConfMgr", "checkLoadFromDb load config from db, size = " + list.size());
            this.f311320b = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.NpsSurveyConfMgr", "checkLoadFromDb failed, message = " + e17.getMessage());
        }
    }

    public final void c(r45.al2 config, boolean z17, long j17) {
        java.lang.Object obj;
        boolean add;
        kotlin.jvm.internal.o.g(config, "config");
        kr2.w wVar = new kr2.w(config, z17, j17);
        r45.al2 al2Var = wVar.f311333a;
        g(al2Var.getLong(0));
        b();
        java.util.List list = this.f311319a;
        int size = list.size();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kr2.w) obj).f311333a.getLong(4) > al2Var.getLong(4)) {
                    break;
                }
            }
        }
        kr2.w wVar2 = (kr2.w) obj;
        if (wVar2 != null) {
            size = list.indexOf(wVar2);
        }
        if (size < 0 || size > list.size()) {
            add = list.add(wVar);
        } else {
            list.add(size, wVar);
            add = true;
        }
        kr2.x xVar = new kr2.x();
        xVar.field_taskId = al2Var.getLong(0);
        xVar.field_conditions = al2Var.getInteger(1);
        java.util.LinkedList list2 = al2Var.getList(2);
        kotlin.jvm.internal.o.f(list2, "getFeed_pos(...)");
        xVar.field_feedPos = kz5.n0.g0(list2, ",", null, null, 0, null, kr2.n.f311314d, 30, null);
        xVar.field_deliverScenes = al2Var.getInteger(3);
        xVar.field_startTime = al2Var.getLong(4);
        xVar.field_expireTime = al2Var.getLong(5);
        xVar.field_excludeDays = al2Var.getInteger(6);
        xVar.field_isPreview = al2Var.getBoolean(7);
        xVar.field_delayAppearTime = al2Var.getFloat(8);
        xVar.field_autoDisappearTime = al2Var.getFloat(9);
        xVar.field_feedMediaTypes = al2Var.getLong(10);
        xVar.field_isFromJumper = wVar.f311334b;
        xVar.field_bindFeedId = wVar.f311335c;
        boolean insert = ((kr2.r) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f39136y).getValue()).insert(xVar);
        com.tencent.mars.xlog.Log.i("Finder.NpsSurveyConfMgr", "insert conf = " + xVar + " success = " + insert);
        com.tencent.mars.xlog.Log.i("Finder.NpsSurveyConfMgr", "insertConfig taskId = " + al2Var.getLong(0) + " memoryAdded = " + add + " dbAdded = " + insert);
    }

    public final kr2.w d(kr2.x xVar) {
        java.util.LinkedList linkedList;
        r45.al2 al2Var = new r45.al2();
        al2Var.set(0, java.lang.Long.valueOf(xVar.field_taskId));
        al2Var.set(1, java.lang.Integer.valueOf(xVar.field_conditions));
        if (com.tencent.mm.sdk.platformtools.t8.K0(xVar.field_feedPos)) {
            linkedList = new java.util.LinkedList();
        } else {
            java.lang.String field_feedPos = xVar.field_feedPos;
            kotlin.jvm.internal.o.f(field_feedPos, "field_feedPos");
            java.util.List f07 = r26.n0.f0(field_feedPos, new java.lang.String[]{","}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) it.next(), -1)));
            }
            linkedList = new java.util.LinkedList(arrayList);
        }
        al2Var.set(2, linkedList);
        al2Var.set(3, java.lang.Integer.valueOf(xVar.field_deliverScenes));
        al2Var.set(4, java.lang.Long.valueOf(xVar.field_startTime));
        al2Var.set(5, java.lang.Long.valueOf(xVar.field_expireTime));
        al2Var.set(6, java.lang.Integer.valueOf(xVar.field_excludeDays));
        al2Var.set(7, java.lang.Boolean.valueOf(xVar.field_isPreview));
        al2Var.set(8, java.lang.Float.valueOf(xVar.field_delayAppearTime));
        al2Var.set(9, java.lang.Float.valueOf(xVar.field_autoDisappearTime));
        al2Var.set(10, java.lang.Long.valueOf(xVar.field_feedMediaTypes));
        return new kr2.w(al2Var, xVar.field_isFromJumper, xVar.field_bindFeedId);
    }

    public final java.util.List e() {
        java.util.LinkedList linkedList;
        kr2.r rVar = (kr2.r) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f39136y).getValue();
        java.lang.String str = "SELECT * FROM " + rVar.getTableName() + " ORDER BY startTime ASC";
        android.database.Cursor rawQuery = rVar.rawQuery(str, new java.lang.String[0]);
        if (rawQuery != null) {
            linkedList = new java.util.LinkedList();
            while (rawQuery.moveToNext()) {
                try {
                    l75.f0 f0Var = (l75.f0) kr2.x.class.newInstance();
                    f0Var.convertFrom(rawQuery);
                    linkedList.add(f0Var);
                } finally {
                }
            }
            vz5.b.a(rawQuery, null);
        } else {
            linkedList = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("Finder.NpsSurveyConfMgr", "queryAll sql: " + str + ", size: " + linkedList.size());
        return linkedList;
    }

    public final boolean f(long j17) {
        kr2.r rVar = (kr2.r) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f39136y).getValue();
        java.lang.String str = "DELETE FROM " + rVar.getTableName() + " WHERE taskId = " + j17;
        boolean execSQL = rVar.execSQL(rVar.getTableName(), str);
        com.tencent.mars.xlog.Log.i("Finder.NpsSurveyConfMgr", "removeById sql: " + str + ", success: " + execSQL);
        return execSQL;
    }

    public final void g(long j17) {
        boolean f17 = f(j17);
        b();
        java.util.List configList = this.f311319a;
        kotlin.jvm.internal.o.f(configList, "configList");
        com.tencent.mars.xlog.Log.i("Finder.NpsSurveyConfMgr", "removeConfig taskId = " + j17 + " memoryRemoved = " + kz5.h0.B(configList, new kr2.o(j17)) + " dbRemoved = " + f17);
    }
}
