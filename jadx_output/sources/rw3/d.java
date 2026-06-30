package rw3;

/* loaded from: classes9.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f400644e = {l75.n0.getCreateSQLs(rw3.c.D, "RemittanceRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f400645f = {"*", "rowid"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f400646g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f400647d;

    public d(l75.k0 k0Var) {
        super(k0Var, rw3.c.D, "RemittanceRecord", dm.u9.f240383q);
        this.f400647d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean replace(rw3.c cVar) {
        if (cVar != null) {
            java.util.Map map = f400646g;
            if (((java.util.HashMap) map).containsKey(cVar.field_transferId)) {
                ((java.util.HashMap) map).put(cVar.field_transferId, cVar);
            }
        }
        return super.replace(cVar);
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] strArr) {
        rw3.c cVar = (rw3.c) f0Var;
        if (cVar != null) {
            java.util.HashMap hashMap = (java.util.HashMap) f400646g;
            if (hashMap.containsKey(cVar.field_transferId)) {
                hashMap.remove(cVar.field_transferId);
            }
        }
        return super.delete(cVar, strArr);
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        rw3.c cVar = (rw3.c) f0Var;
        if (cVar != null) {
            java.util.HashMap hashMap = (java.util.HashMap) f400646g;
            if (hashMap.containsKey(cVar.field_transferId)) {
                hashMap.put(cVar.field_transferId, cVar);
            }
        }
        return super.insert(cVar);
    }

    public rw3.c y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.database.Cursor D = this.f400647d.D("RemittanceRecord", f400645f, "transferId=?", new java.lang.String[]{str}, null, null, null, 2);
        try {
            try {
                if (D.moveToFirst()) {
                    rw3.c cVar = new rw3.c();
                    cVar.convertFrom(D);
                    return cVar;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", e17, "getRecordByTransferId error: %s", e17.getMessage());
            }
            return null;
        } finally {
            D.close();
        }
    }

    public rw3.c z0(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.util.Map map = f400646g;
        if (!K0 && ((java.util.HashMap) map).containsKey(str)) {
            return (rw3.c) ((java.util.HashMap) map).get(str);
        }
        rw3.c y07 = y0(str);
        if (y07 == null) {
            return null;
        }
        ((java.util.HashMap) map).put(str, y07);
        return y07;
    }
}
