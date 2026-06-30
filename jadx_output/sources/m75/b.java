package m75;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f324518a;

    /* renamed from: b, reason: collision with root package name */
    public final o75.c f324519b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.e f324520c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324521d;

    public b(l75.f0 item, o75.c cVar, o75.e eVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f324518a = item;
        this.f324519b = cVar;
        this.f324520c = eVar;
        this.f324521d = str;
    }

    public final int a(l75.k0 k0Var) {
        o75.e eVar;
        o75.c cVar;
        l75.f0 f0Var = this.f324518a;
        l75.e0 dBInfo = f0Var.getDBInfo();
        java.lang.Object primaryKeyValue = f0Var.getPrimaryKeyValue();
        java.lang.String str = this.f324521d;
        if (k0Var == null || primaryKeyValue == null) {
            com.tencent.mars.xlog.Log.i(str != null ? str : "MicroMsg.Mvvm.DeleteExecutor", "delete table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + primaryKeyValue);
            return -1;
        }
        int delete = k0Var.delete(f0Var.getTableName(), dBInfo.f316953b + " = ?", new java.lang.String[]{primaryKeyValue.toString()});
        if (delete > 0 && (eVar = this.f324520c) != null && (cVar = this.f324519b) != null) {
            eVar.notifyAny(cVar);
        }
        if (delete > 0) {
            if (!(str == null || r26.n0.N(str))) {
                com.tencent.mars.xlog.Log.i(str, "delete table:" + f0Var.getTableName() + " success primaryKey:" + dBInfo.f316953b + " value:" + primaryKeyValue);
            }
        }
        if (delete <= 0) {
            com.tencent.mars.xlog.Log.e(str != null ? str : "MicroMsg.Mvvm.DeleteExecutor", "delete effectRow:" + delete + " table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + primaryKeyValue);
        }
        return delete;
    }
}
