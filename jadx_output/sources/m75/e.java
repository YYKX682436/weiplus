package m75;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f324531a;

    /* renamed from: b, reason: collision with root package name */
    public final o75.c f324532b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.e f324533c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324534d;

    public e(l75.f0 item, o75.c cVar, o75.e eVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f324531a = item;
        this.f324532b = cVar;
        this.f324533c = eVar;
        this.f324534d = str;
    }

    public final int a(l75.k0 k0Var) {
        o75.e eVar;
        o75.c cVar;
        l75.f0 f0Var = this.f324531a;
        l75.e0 dBInfo = f0Var.getDBInfo();
        android.content.ContentValues convertTo = f0Var.convertTo();
        boolean z17 = true;
        if (!(convertTo.size() > 0)) {
            convertTo = null;
        }
        java.lang.Object obj = convertTo != null ? convertTo.get(dBInfo.f316953b) : null;
        java.lang.String str = this.f324534d;
        if (k0Var == null || convertTo == null || obj == null) {
            com.tencent.mars.xlog.Log.i(str != null ? str : "MicroMsg.Mvvm.UpdateExecutor", "update table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + obj);
            return 0;
        }
        int p17 = k0Var.p(f0Var.getTableName(), convertTo, dBInfo.f316953b + " = ?", new java.lang.String[]{obj.toString()});
        if (p17 > 0 && (eVar = this.f324533c) != null && (cVar = this.f324532b) != null) {
            eVar.notifyAny(cVar);
        }
        if (p17 > 0) {
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i(str, "update table:" + f0Var.getTableName() + " success primaryKey:" + dBInfo.f316953b + " value:" + obj);
            }
        }
        if (p17 <= 0) {
            com.tencent.mars.xlog.Log.e(str != null ? str : "MicroMsg.Mvvm.UpdateExecutor", "update effectRow:" + p17 + " table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + obj);
        }
        return p17;
    }
}
