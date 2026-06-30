package vn3;

/* loaded from: classes13.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Long f438427e = 1209600L;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f438428f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.newtips.model.k.f152378y0, "NewTipsInfo2")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f438429g = {"CREATE INDEX IF NOT EXISTS uniqueIdIndex ON NewTipsInfo2 ( uniqueId )", "CREATE INDEX IF NOT EXISTS pathQueryIndex ON NewTipsInfo2 ( path,state,beginShowTime,disappearTime )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f438430d;

    public b(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.newtips.model.k.f152378y0, "NewTipsInfo2", f438429g);
        this.f438430d = k0Var;
    }

    public java.util.List D0(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return arrayList;
        }
        android.database.Cursor E = this.f438430d.E("NewTipsInfo2", com.tencent.mm.plugin.newtips.model.k.f152378y0.f316954c, "uniqueId=?", new java.lang.String[]{str + ""}, null, null, null);
        if (E == null) {
            return arrayList;
        }
        while (E.moveToNext()) {
            com.tencent.mm.plugin.newtips.model.k kVar = new com.tencent.mm.plugin.newtips.model.k();
            kVar.convertFrom(E);
            arrayList.add(kVar);
        }
        return arrayList;
    }

    public java.util.List J0(vn3.c cVar) {
        if (cVar == null) {
            return new java.util.ArrayList();
        }
        if (cVar.f438433c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = cVar.f438431a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                long a17 = c01.id.a() / 1000;
                android.database.Cursor E = this.f438430d.E("NewTipsInfo2", com.tencent.mm.plugin.newtips.model.k.f152378y0.f316954c, "dynamicPath=? and state=? and beginShowTime<=? and maxClientVersion>=? and minClientVersion<=?", new java.lang.String[]{str, "0", a17 + "", o45.wf.f343029g + "", o45.wf.f343029g + ""}, null, null, null);
                if (E != null) {
                    while (E.moveToNext()) {
                        com.tencent.mm.plugin.newtips.model.k kVar = new com.tencent.mm.plugin.newtips.model.k();
                        kVar.convertFrom(E);
                        if (y0(a17, kVar)) {
                            arrayList.add(kVar);
                        }
                    }
                }
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = cVar.f438432b;
        if (i17 != 0) {
            long a18 = c01.id.a() / 1000;
            android.database.Cursor E2 = this.f438430d.E("NewTipsInfo2", com.tencent.mm.plugin.newtips.model.k.f152378y0.f316954c, "path=? and state=? and beginShowTime<=? and maxClientVersion>=? and minClientVersion<=?", new java.lang.String[]{i17 + "", "0", a18 + "", o45.wf.f343029g + "", o45.wf.f343029g + ""}, null, null, null);
            if (E2 != null) {
                while (E2.moveToNext()) {
                    com.tencent.mm.plugin.newtips.model.k kVar2 = new com.tencent.mm.plugin.newtips.model.k();
                    kVar2.convertFrom(E2);
                    if (y0(a18, kVar2)) {
                        arrayList2.add(kVar2);
                    }
                }
                E2.close();
            }
        }
        return arrayList2;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.plugin.newtips.model.k kVar) {
        if (kVar == null) {
            return false;
        }
        return super.insert(kVar);
    }

    public int P0(java.util.List list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        l75.k0 k0Var = this.f438430d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        try {
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) it.next();
                if (kVar == null ? false : update(kVar.systemRowid, kVar)) {
                    i17++;
                }
            }
            return i17;
        } finally {
            if (k0Var != null) {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
        }
    }

    public final boolean y0(long j17, com.tencent.mm.plugin.newtips.model.k kVar) {
        long j18 = kVar.field_exposureTime;
        if (j18 != 0 && j17 - j18 > f438427e.longValue()) {
            return false;
        }
        long j19 = kVar.field_overdueTime;
        if (j19 == 0) {
            return j17 < kVar.field_disappearTime;
        }
        long j27 = kVar.field_exposureTime == 0 ? j19 + j17 : kVar.field_exposureDisappearTime;
        long j28 = kVar.field_disappearTime;
        if (j28 != 0) {
            j27 = java.lang.Math.min(j27, j28);
        }
        return j17 < j27;
    }

    public boolean z0() {
        int i17;
        try {
            i17 = this.f438430d.delete("NewTipsInfo2", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteAllData exception:%s", e17.toString());
            i17 = 0;
        }
        return i17 > 0;
    }
}
