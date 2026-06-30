package z72;

/* loaded from: classes12.dex */
public class e extends l75.s0 implements o72.d4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f470553d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f470554e;

    public e(com.tencent.wcdb.core.Database database) {
        this.f470553d = database;
        this.f470554e = database.getTable("FavEditInfo", up5.e.f429925b);
    }

    public static o72.m2 m0(z72.d dVar) {
        r45.kp0 kp0Var;
        if (dVar == null) {
            return null;
        }
        o72.m2 m2Var = new o72.m2();
        m2Var.field_localId = dVar.f430054a;
        if (dVar.f470552f == null) {
            byte[] bArr = dVar.f430055b;
            if (bArr == null) {
                kp0Var = new r45.kp0();
                m2Var.field_modItem = kp0Var;
                m2Var.field_time = dVar.f430056c;
                m2Var.field_type = dVar.f430057d;
                m2Var.field_scene = dVar.f430058e;
                return m2Var;
            }
            dVar.f470552f = (r45.kp0) tp5.a.e(bArr, r45.kp0.class);
        }
        kp0Var = dVar.f470552f;
        m2Var.field_modItem = kp0Var;
        m2Var.field_time = dVar.f430056c;
        m2Var.field_type = dVar.f430057d;
        m2Var.field_scene = dVar.f430058e;
        return m2Var;
    }

    public static z72.d n0(o72.m2 m2Var) {
        if (m2Var == null) {
            return null;
        }
        z72.d dVar = new z72.d(null);
        dVar.f430054a = m2Var.field_localId;
        dVar.f430055b = tp5.a.h(m2Var.field_modItem);
        dVar.f430056c = m2Var.field_time;
        dVar.f430057d = m2Var.field_type;
        dVar.f430058e = m2Var.field_scene;
        return dVar;
    }

    @Override // o72.d4
    public java.util.List E5() {
        try {
            java.util.List<R> allObjects = this.f470554e.getAllObjects(z72.d.class);
            if (allObjects == 0) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(allObjects.size());
            java.util.Iterator it = allObjects.iterator();
            while (it.hasNext()) {
                arrayList.add(m0((z72.d) it.next()));
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.d4
    public boolean M1(o72.m2 m2Var) {
        try {
            long lastInsertRowId = this.f470554e.prepareInsert().value(n0(m2Var)).onFields(up5.e.f429926c, up5.e.f429927d, up5.e.f429928e, up5.e.f429929f, up5.e.f429930g).execute().getLastInsertRowId();
            m2Var.systemRowid = lastInsertRowId;
            doNotify(java.lang.Long.toString(lastInsertRowId), 2, m2Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.d4
    public o72.m2 c1(long j17, int i17) {
        try {
            return m0((z72.d) this.f470554e.getFirstObject(up5.e.f429926c.eq(j17).and(up5.e.f429929f.eq(i17)), z72.d.class));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return null;
        }
    }

    @Override // o72.d4
    public boolean i7(o72.m2 m2Var, java.lang.String... strArr) {
        try {
            tp5.a.i(n0(m2Var), this.f470554e, strArr);
            doNotify(java.lang.Long.toString(m2Var.systemRowid), 2, m2Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.d4
    public void j1(long j17, int i17) {
        try {
            this.f470554e.deleteObjects(up5.e.f429926c.eq(j17).and(up5.e.f429929f.eq(i17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
        }
    }
}
