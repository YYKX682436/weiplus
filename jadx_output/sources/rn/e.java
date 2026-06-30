package rn;

/* loaded from: classes13.dex */
public class e extends l75.n0 implements l75.z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Long f397599e = 604800000L;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f397600f = {l75.n0.getCreateSQLs(rn.c.T, "GroupTodo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f397601g = {"DROP INDEX IF EXISTS todoIdIndex", "DROP INDEX IF EXISTS roomNameIndex", "CREATE INDEX IF NOT EXISTS todoIdRoomNameIndex ON GroupTodo ( todoid,roomname )", "CREATE INDEX IF NOT EXISTS roomNameCreateTimeIndex ON GroupTodo ( roomname,createtime )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f397602d;

    public e(l75.k0 k0Var) {
        super(k0Var, rn.c.T, "GroupTodo", f397601g);
        this.f397602d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean insert(rn.c cVar) {
        if (cVar == null) {
            return false;
        }
        return super.insert(cVar);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (i17 == 5 && (a1Var instanceof com.tencent.mm.storage.l8)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoStorage", "delete, username %s", java.lang.Integer.valueOf(i17), str);
            ((ku5.t0) ku5.t0.f312615d).g(new rn.d(this, str));
        }
    }

    public boolean y0(rn.c cVar) {
        if (cVar == null) {
            return true;
        }
        if (cVar.systemRowid == -1) {
            rn.c z07 = z0(cVar.field_roomname, cVar.field_todoid);
            if (z07 == null) {
                return true;
            }
            cVar.systemRowid = z07.systemRowid;
        }
        return delete(cVar.systemRowid);
    }

    public rn.c z0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor E;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || (E = this.f397602d.E("GroupTodo", rn.c.T.f316954c, "roomname=? and todoid=?", new java.lang.String[]{str, str2}, null, null, null)) == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (E.moveToNext()) {
                rn.c cVar = new rn.c();
                cVar.convertFrom(E);
                arrayList.add(cVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (rn.c) arrayList.get(0);
        } finally {
            E.close();
        }
    }
}
