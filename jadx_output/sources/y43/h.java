package y43;

/* loaded from: classes8.dex */
public final class h extends l75.n0 implements y43.f {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f459348f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f459349d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f459350e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.getCreateSQLs(y43.e.B, "LocalLiteAppConf"));
        java.lang.String[] INDEX_CREATE = dm.r7.f239654p;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f459348f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 storage) {
        super(storage, y43.e.B, "LocalLiteAppConf", dm.r7.f239654p);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f459349d = storage;
        this.f459350e = new y43.g(storage);
    }

    @Override // y43.f
    public void d(java.lang.String hostPath) {
        kotlin.jvm.internal.o.g(hostPath, "hostPath");
        com.tencent.stubs.logger.Log.i("GameLocalLiteAppConfDaoImpl", "delete hostPath = " + hostPath + "  result = " + this.f459349d.delete("LocalLiteAppConf", "url = ?", new java.lang.String[]{hostPath}));
    }

    @Override // y43.f
    public y43.e e(java.lang.String hostPath) {
        y43.e eVar;
        kotlin.jvm.internal.o.g(hostPath, "hostPath");
        android.database.Cursor f17 = this.f459349d.f("SELECT * FROM LocalLiteAppConf WHERE url = " + d95.b0.O(hostPath), null, 2);
        if (f17 == null) {
            return null;
        }
        try {
            if (f17.moveToFirst()) {
                eVar = new y43.e();
                eVar.convertFrom(f17);
            } else {
                eVar = null;
            }
            vz5.b.a(f17, null);
            return eVar;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(f17, th6);
                throw th7;
            }
        }
    }

    @Override // y43.f
    public void i5(y43.e eVar) {
        if (eVar == null) {
            return;
        }
        l75.k0 k0Var = this.f459349d;
        long b17 = k0Var.b();
        try {
            this.f459350e.d(eVar);
            k0Var.w(java.lang.Long.valueOf(b17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdate liteAppConf =");
            sb6.append("url: " + eVar.field_url + "; appId: " + eVar.field_appid + "path: " + eVar.field_path + "; wepkg_id: " + eVar.field_wepkg_id + "; expire_duration: " + eVar.field_expire_duration + "; refresh_duration: " + eVar.field_refresh_duration);
            com.tencent.stubs.logger.Log.i("GameLocalLiteAppConfDaoImpl", sb6.toString());
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }
}
