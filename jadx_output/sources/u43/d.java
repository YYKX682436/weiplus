package u43;

/* loaded from: classes8.dex */
public final class d extends l75.n0 implements u43.a {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f424647f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f424648d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f424649e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.getCreateSQLs(u43.b.L, "ApkChannelPatchInfo"));
        java.lang.String[] INDEX_CREATE = dm.q.f239306u;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f424647f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 storage) {
        super(storage, u43.b.L, "ApkChannelPatchInfo", dm.q.f239306u);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f424648d = storage;
        this.f424649e = new u43.c(storage);
    }

    @Override // u43.a
    public void d(java.lang.String pkgName) {
        kotlin.jvm.internal.o.g(pkgName, "pkgName");
        com.tencent.stubs.logger.Log.i("ApkChannelPatchInfoDaoImpl", "delete pkgName = " + pkgName + "  result = " + this.f424648d.delete("ApkChannelPatchInfo", "pkgName = ?", new java.lang.String[]{pkgName}));
    }

    @Override // u43.a
    public u43.b e(java.lang.String pkgName) {
        u43.b bVar;
        kotlin.jvm.internal.o.g(pkgName, "pkgName");
        android.database.Cursor f17 = this.f424648d.f("SELECT * FROM ApkChannelPatchInfo WHERE pkgName = " + d95.b0.O(pkgName), null, 2);
        if (f17 == null) {
            return null;
        }
        try {
            if (f17.moveToFirst()) {
                bVar = new u43.b();
                bVar.convertFrom(f17);
            } else {
                bVar = null;
            }
            vz5.b.a(f17, null);
            return bVar;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(f17, th6);
                throw th7;
            }
        }
    }

    @Override // u43.a
    public void ya(u43.b bVar) {
        if (bVar == null) {
            return;
        }
        l75.k0 k0Var = this.f424648d;
        long b17 = k0Var.b();
        try {
            this.f424649e.d(bVar);
            k0Var.w(java.lang.Long.valueOf(b17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdate patchInfo =");
            sb6.append("pkgName: " + bVar.field_pkgName + "; patchPath: " + bVar.field_patchPath + "newChannelApkPath: " + bVar.field_newChannelApkPath + "; isServerPatch: " + bVar.field_isServerPatch + "; taskStatus: " + bVar.field_taskStatus);
            com.tencent.stubs.logger.Log.i("ApkChannelPatchInfoDaoImpl", sb6.toString());
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }
}
