package yv1;

/* loaded from: classes12.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(java.lang.String str) {
        super(0);
        this.f466121d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d95.b0 b0Var = mt1.b0.f331191a.n().f348849d;
        java.lang.String str = this.f466121d;
        java.lang.String[] strArr = {str};
        try {
            try {
                b0Var.b();
                b0Var.H("WxFileIndexRefresh", "INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE username = ?)", strArr);
                b0Var.H("WxFileIndexRefresh", "DELETE FROM WxFileIndexRefresh WHERE indexRowId IN (SELECT rowId FROM WxFileIndex3 WHERE username = ?)", strArr);
                b0Var.H("WxFileIndex3", "DELETE FROM WxFileIndex3 WHERE username = ?", strArr);
            } catch (com.tencent.wcdb.database.SQLiteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e17, "Cannot delete WxFileIndex of user: " + str, new java.lang.Object[0]);
            }
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused) {
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused2) {
            }
            throw th6;
        }
    }
}
