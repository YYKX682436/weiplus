package rn;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f397595e = {l75.n0.getCreateSQLs(rn.a.f397594p, "GroupBindApp")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f397596f = {"CREATE INDEX IF NOT EXISTS GroupBindAppUserNameIndex ON GroupBindApp ( chatRoomName )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f397597d;

    public b(l75.k0 k0Var) {
        super(k0Var, rn.a.f397594p, "GroupBindApp", f397596f);
        this.f397597d = k0Var;
    }

    public r45.kt5 y0(java.lang.String str) {
        android.database.Cursor E = this.f397597d.E("GroupBindApp", null, "chatRoomName =?", new java.lang.String[]{str}, null, null, null);
        try {
            if (E == null) {
                return null;
            }
            try {
                if (E.moveToNext()) {
                    rn.a aVar = new rn.a();
                    aVar.convertFrom(E);
                    byte[] bArr = aVar.field_BindAppData;
                    if (bArr != null && bArr.length <= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupBindAppStorage", "BindAppData is null");
                        return null;
                    }
                    r45.kt5 kt5Var = new r45.kt5();
                    kt5Var.parseFrom(aVar.field_BindAppData);
                    return kt5Var;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GroupBindAppStorage", e17.getMessage());
            }
            return null;
        } finally {
            E.close();
        }
    }
}
