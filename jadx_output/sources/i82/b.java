package i82;

/* loaded from: classes8.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f289630e = {l75.n0.getCreateSQLs(i82.a.G, "FavOffline")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f289631f = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f289632d;

    public b(l75.k0 k0Var) {
        super(k0Var, i82.a.G, "FavOffline", f289631f);
        this.f289632d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean insert(i82.a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.insert(aVar);
    }

    public boolean J0(i82.a aVar) {
        if (aVar != null) {
            return update(aVar.systemRowid, aVar);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.offline.FavOfflineStorage", "update() item is null");
        return false;
    }

    public java.util.List y0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor E = this.f289632d.E("FavOffline", i82.a.G.f316954c, "status!=?", new java.lang.String[]{"0"}, null, null, "updateTime asc");
        while (E.moveToNext()) {
            i82.a aVar = new i82.a();
            aVar.convertFrom(E);
            arrayList.add(aVar);
        }
        arrayList.size();
        return arrayList;
    }

    public i82.a z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.database.Cursor E = this.f289632d.E("FavOffline", i82.a.G.f316954c, "url=?", new java.lang.String[]{str}, null, null, "rowid");
        if (!E.moveToNext()) {
            return null;
        }
        i82.a aVar = new i82.a();
        aVar.convertFrom(E);
        return aVar;
    }
}
