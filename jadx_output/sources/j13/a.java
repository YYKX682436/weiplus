package j13;

/* loaded from: classes8.dex */
public final class a extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j13.a f297177d = new j13.a();

    /* renamed from: e, reason: collision with root package name */
    public static final l75.k0 f297178e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f297179f;

    static {
        l75.k0 k0Var = gm0.j1.u().f273153f;
        kotlin.jvm.internal.o.d(k0Var);
        f297178e = k0Var;
        f297179f = new java.util.concurrent.ConcurrentHashMap();
    }

    public a() {
        super(gm0.j1.u().f273153f, i13.j.D, "ForceNotifyData", new java.lang.String[]{"DROP INDEX IF EXISTS statusIndex", "CREATE INDEX IF NOT EXISTS userNameIndex ON ForceNotifyData(UserName)", "CREATE INDEX IF NOT EXISTS forcePushIdIndex ON ForceNotifyData(ForcePushId)", "CREATE INDEX IF NOT EXISTS ForceNotifyData_statusIndex ON ForceNotifyData(Status)", "CREATE INDEX IF NOT EXISTS expireTimeIndex ON ForceNotifyData(ExpiredTime)"});
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean replace(i13.j info) {
        kotlin.jvm.internal.o.g(info, "info");
        boolean replace = super.replace(info);
        if (replace) {
            java.lang.String field_ForcePushId = info.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
            bn0.g.f22779a.k(field_ForcePushId, new bn0.b(field_ForcePushId, info.field_CreateTime, info.field_ExpiredTime, info.field_Status, info.field_Type));
        }
        return replace;
    }

    public final void J0(java.lang.String forcePushId, int i17) {
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "updateStatus(" + forcePushId + ", " + i17 + ')');
        i13.j jVar = new i13.j();
        jVar.field_ForcePushId = forcePushId;
        if (get(jVar, new java.lang.String[0])) {
            jVar.field_Status = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "[updateStatus] ret:%s %s", java.lang.Long.valueOf(f297178e.m("ForceNotifyData", "ForcePushId", jVar.convertTo())), jVar);
            f297179f.put(forcePushId, jVar);
            doNotify();
            java.lang.String field_ForcePushId = jVar.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
            bn0.g.f22779a.k(field_ForcePushId, new bn0.b(field_ForcePushId, jVar.field_CreateTime, jVar.field_ExpiredTime, jVar.field_Status, jVar.field_Type));
        }
    }

    public final boolean d(java.lang.String forcePushId) {
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "delete(" + forcePushId + ')');
        if (f297178e.delete("ForceNotifyData", "ForcePushId=?", new java.lang.String[]{forcePushId}) < 0) {
            return false;
        }
        f297179f.remove(forcePushId);
        doNotify();
        com.tencent.mm.sdk.platformtools.o4 a17 = bn0.g.f22779a.e().a();
        if (a17 != null) {
            a17.remove(forcePushId);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "deleteLightPushForceNotifyData forcePushId = %s", forcePushId);
        return true;
    }

    public final void y0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "deleteExpireInfo()");
        if (!gm0.j1.a() || i95.n0.c(i50.q.class) == null) {
            return;
        }
        android.database.Cursor D = f297178e.D("ForceNotifyData", new java.lang.String[]{"*"}, "ExpiredTime<=?", new java.lang.String[]{java.lang.String.valueOf(c01.id.c())}, null, null, null, 2);
        if (D != null) {
            try {
                D.moveToFirst();
                while (!D.isAfterLast()) {
                    i13.j jVar = new i13.j();
                    jVar.convertFrom(D);
                    ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(jVar.field_ForcePushId, 5, c01.id.c() / 1000);
                    D.moveToNext();
                }
                vz5.b.a(D, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(D, th6);
                    throw th7;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "[deleteExpireInfo] ret:%s", java.lang.Integer.valueOf(f297178e.delete("ForceNotifyData", "ExpiredTime<=?", new java.lang.String[]{java.lang.String.valueOf(c01.id.c())})));
    }

    public final i13.j z0(java.lang.String forcePushId) {
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "getById(" + forcePushId + ')');
        android.database.Cursor D = f297178e.D("ForceNotifyData", new java.lang.String[]{"*"}, "ForcePushId=?", new java.lang.String[]{forcePushId}, null, null, "ExpiredTime Desc", 2);
        i13.j jVar = new i13.j();
        if (D == null) {
            return null;
        }
        try {
            D.moveToFirst();
            if (D.isAfterLast()) {
                vz5.b.a(D, null);
                return null;
            }
            jVar.convertFrom(D);
            vz5.b.a(D, null);
            return jVar;
        } finally {
        }
    }
}
