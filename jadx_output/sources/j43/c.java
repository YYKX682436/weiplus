package j43;

/* loaded from: classes4.dex */
public class c extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f297671d = {l75.n0.getCreateSQLs(j43.b.f297670p, "PBCache")};

    public c(l75.k0 k0Var) {
        super(k0Var, j43.b.f297670p, "PBCache", null);
    }

    public boolean D0(java.lang.String str, byte[] bArr) {
        boolean insert;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        j43.b bVar = new j43.b();
        bVar.field_key = str;
        if (super.get(bVar, new java.lang.String[0])) {
            bVar.field_value = bArr;
            insert = super.update(bVar, new java.lang.String[0]);
        } else {
            bVar.field_value = bArr;
            insert = super.insert(bVar);
        }
        if (!insert) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PBCacheStorage", "Saving cache failed (update or insert)");
        }
        return insert;
    }

    public void y0(java.lang.String str) {
        j43.b bVar = new j43.b();
        bVar.field_key = str;
        super.delete(bVar, new java.lang.String[0]);
    }

    public byte[] z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        j43.b bVar = new j43.b();
        bVar.field_key = str;
        if (super.get(bVar, new java.lang.String[0])) {
            return bVar.field_value;
        }
        return null;
    }
}
